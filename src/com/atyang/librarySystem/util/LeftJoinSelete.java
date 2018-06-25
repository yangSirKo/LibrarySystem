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
 * @���� �����
 * @����ʱ�䣺2017-6-23
 * @�������ݣ�ʹ��ԭ����jdbc �����������Ӳ�ѯ��������ѧ��ѧ����Record��ͨ���������Ӷ�ѧ�����������в�ѯ
 */
public class LeftJoinSelete {

	public List<Book> getSelelt(Integer stuNo) throws SQLException {

		Connection conn = null;
		List<Book> books = new ArrayList<Book>();

		// MySQL��JDBC URL��д��ʽ��jdbc:mysql://�������ƣ����Ӷ˿�/���ݿ������?����=ֵ
		// ������������Ҫָ��useUnicode��characterEncoding
		// ִ�����ݿ����֮ǰҪ�����ݿ����ϵͳ�ϴ���һ�����ݿ⣬�����Լ�����
		// �������֮ǰ��Ҫ�ȴ���javademo���ݿ�
		String url = "jdbc:mysql://localhost:3306/librarysystem?"
				+ "user=root&password=root&useUnicode=true&characterEncoding=UTF8";

		try {
			// ֮����Ҫʹ������������䣬����ΪҪʹ��MySQL����������������Ҫ��������������
			// ����ͨ��Class.forName�������ؽ�ȥ��Ҳ����ͨ����ʼ������������������������ʽ������
			Class.forName("com.mysql.jdbc.Driver");// ��̬����mysql����
			// or:
			// com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
			// or��
			// new com.mysql.jdbc.Driver();

			// һ��Connection����һ�����ݿ�����
			conn = DriverManager.getConnection(url);
			// Statement������кܶ෽��������executeUpdate����ʵ�ֲ��룬���º�ɾ����
			Statement stmt = conn.createStatement();
			String sql = "SELECT Book.bookNo,Book.bookName,Book.auther,Book.publishing,Book.publishTime,Book.bookState FROM Record LEFT JOIN Book ON Book.bookNo=Record.bookNo AND Record.StuNo = "
					+ stuNo;
			ResultSet rs = stmt.executeQuery(sql);// executeUpdate���᷵��һ����Ӱ����������������-1��û�гɹ�
			while (rs.next()) {
				Book book = new Book();
				book.setBookNo(rs.getInt("BookNo"));
				book.setBookName(rs.getString("BookName"));
				book.setAuther(rs.getString("Auther"));
				book.setPublishing(rs.getString("Publishing"));
				book.setPublishTime(rs.getDate("PublishTime"));
				book.setBookState(rs.getString("BookState"));
				// ��Ϊ������һ����book��ʹ�� getAuther �����,���ѻ��飬������ʾ
				if (book.getAuther() != null
						&& rs.getString("BookState").equals("�ѽ��")) {
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
