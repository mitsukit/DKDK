package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBManager;

public class MessageDAO {

	/** DBコネクション */
	public Connection con;
	/** DBステートメント */
	PreparedStatement stmt;
	/** 検索結果 */
	ResultSet rs;


		//メッセージ送信時にメッセージ情報をDBに登録する　引数：送信者ID,受信者ID,メッセージ内容

		public void setMessage(int sentId, int receiveId, String message) throws SQLException, ClassNotFoundException {

            try {
                con = DBManager.getConnection();

                String sql = "INSERT INTO message_table(send_user_id,receive_user_id,message,date_time)VALUES(?,?,?,now())";

                this.stmt = con.prepareStatement(sql);
                stmt.setInt(1, sentId);
                stmt.setInt(2, receiveId);
                stmt.setString(3, message);

                stmt.executeUpdate();
                con.commit();

            } catch (SQLException e) {
				e.printStackTrace();
			} finally {
				stmt.close();
				con.close();
			}
    }
}