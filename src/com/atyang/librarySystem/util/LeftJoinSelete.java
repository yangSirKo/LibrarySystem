/**
 * 
 */
package com.atyang.librarySystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.atyang.librarySystem.pojo.Book;

/**
 * @作者 杨金鹏
 * @创建时间：2017-6-23
 * @创建内容：使用原生的jdbc 进行左外连接查询，，根据学生学号在Record表通过左外连接对学生所借的书进行查询
 */
public class LeftJoinSelete {

	public List<Book> getSelelt(Integer stuNo) throws SQLException {

		Connection conn = null;
		List<Book> books = new ArrayList<Book>();

		// MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
		// 避免中文乱码要指定useUnicode和characterEncoding
		// 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定，
		// 下面语句之前就要先创建javademo数据库
		String url = "jdbc:mysql://localhost:3306/librarysystem?"
				+ "user=root&password=root&useUnicode=true&characterEncoding=UTF8";

		try {
			// 之所以要使用下面这条语句，是因为要使用MySQL的驱动，所以我们要把它驱动起来，
			// 可以通过Class.forName把它加载进去，也可以通过初始化来驱动起来，下面三种形式都可以
			Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
			// or:
			// com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
			// or：
			// new com.mysql.jdbc.Driver();

			// 一个Connection代表一个数据库连接
			conn = DriverManager.getConnection(url);
			// Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等
			Statement stmt = conn.createStatement();
			String sql = "SELECT Book.bookNo,Book.bookName,Book.auther,Book.publishing,Book.publishTime,Book.bookState FROM Record LEFT JOIN Book ON Book.bookNo=Record.bookNo AND Record.StuNo = "
					+ stuNo;
			ResultSet rs = stmt.executeQuery(sql);// executeUpdate语句会返回一个受影响的行数，如果返回-1就没有成功
			while (rs.next()) {
				Book book = new Book();
				book.setBookNo(rs.getInt("BookNo"));
				book.setBookName(rs.getString("BookName"));
				book.setAuther(rs.getString("Auther"));
				book.setPublishing(rs.getString("Publishing"));
				book.setPublishTime(rs.getDate("PublishTime"));
				book.setBookState(rs.getString("BookState"));
				// 因为会多输出一个空book，使用 getAuther 做旗标,若已还书，则不用显示
				if (book.getAuther() != null
						&& rs.getString("BookState").equals("已借出")) {
					books.add(book);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		return books;
	}
}
