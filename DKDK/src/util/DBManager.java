package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	private static final String DB_HOST = "127.0.0.1";
	private static final String DB_NAME = "dkdk";
	private static final String DB_USER = "rezouser";
	private static final String DB_PASS = "Rezo_0000";

	private static final String DBMS ="mysql";
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_PORT = "3306";
	private static final String DB_URL = "jdbc:" + DBMS + "://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?serverTimezone=JST";

	private DBManager() {}

	private static Connection con;

	//DB接続メソッド
	public static Connection getConnection()
			throws ClassNotFoundException,SQLException{
		if(con == null || con.isClosed()) {
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			//自動コミットなし
			con.setAutoCommit(false);
		}
		return con;
	}

	//DB切断メソッド
	public static void closeConnection(Connection con)
	throws SQLException{
		if(con != null && con.isClosed() != false)
		{
			con.close();
		}

	}



}
