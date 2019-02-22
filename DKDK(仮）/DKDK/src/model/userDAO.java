package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class userDAO {



	/** DBコネクション */
	public Connection con;
	/** DBステートメント */
	PreparedStatement stmt;
	/** 検索結果 */
	ResultSet rs;


	/**
	 * ユーザーテーブルの情報を全件取得する
	 *
	 * @return 検索結果
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public List<userDTO> selectAll() throws SQLException, ClassNotFoundException {
		List<userDTO> userAllList = new ArrayList<>();
		String sql = "SELECT * FROM user_table";
		try {
			con = DBManager.getConnection();
			this.stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				userDTO user = new userDTO();
				user.setUserId(rs.getInt("user_id"));
				user.setPassword(rs.getString("user_pass"));
				user.setName(rs.getString("user_nickname"));
				user.setArea(rs.getString("user_area"));
				user.setIncome(rs.getInt("user_income"));
				user.setSchool(rs.getString("user_school"));
				user.setGender(rs.getString("user_gender"));
				user.setAge(rs.getInt("user_age"));
				user.setHeight(rs.getInt("user_height"));
				user.setBody(rs.getString("user_body"));
				user.setJob(rs.getString("user_job"));
				user.setHoliday(rs.getString("user_holiday"));
				user.setCigar(rs.getString("user_cigar"));
				user.setChild(rs.getString("user_child"));
				user.setUserfree(rs.getString("user_free"));
				user.setPicId(rs.getInt("user_pic"));
				userAllList.add(user);
			}
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		} finally {
			stmt.close();
			con.close();
		}
		return userAllList;
	}


	//IDを引数に、一件分検索

	public List<userDTO> selectById(int userId)
			throws SQLException, ClassNotFoundException, NumberFormatException {
		List<userDTO> userList = new ArrayList<>();
		String sql = "SELECT * FROM user_table WHERE user_id = "+ userId + ";" ;

		try {
			con = DBManager.getConnection();
 			this.stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				userDTO user = new userDTO();
				user.setUserId(rs.getInt("user_id"));
				user.setPassword(rs.getString("user_pass"));
				user.setName(rs.getString("user_nickname"));
				user.setArea(rs.getString("user_area"));
				user.setIncome(rs.getInt("user_income"));
				user.setSchool(rs.getString("user_school"));
				user.setGender(rs.getString("user_gender"));
				user.setAge(rs.getInt("user_age"));
				user.setHeight(rs.getInt("user_height"));
				user.setBody(rs.getString("user_body"));
				user.setJob(rs.getString("user_job"));
				user.setHoliday(rs.getString("user_holiday"));
				user.setCigar(rs.getString("user_cigar"));
				user.setChild(rs.getString("user_child"));
				user.setUserfree(rs.getString("user_free"));
				user.setPicId(rs.getInt("user_pic"));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			con.close();
		}
		return userList;
	}





}
