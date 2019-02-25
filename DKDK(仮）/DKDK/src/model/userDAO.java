package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class userDAO {
	private static final String TBL_NAME = "user_table";
	private static final String USER_ID = "user_id";
	private static final String PASSWORD = "user_pass";
	private static final String USER_NAME = "user_nickname";
	private static final String USER_AREA = "user_area";
	private static final String USER_INCOME = "user_income";
	private static final String USER_SCHOOL = "user_school";
	private static final String USER_GENDER = "user_gender";
	private static final String USER_AGE = "user_age";
	private static final String USER_HEIGHT = "user_height";
	private static final String USER_BODY = "user_body";
	private static final String USER_JOB = "user_job";
	private static final String USER_HOLIDAY = "user_holiday";
	private static final String USER_CIGAR = "user_cigar";
	private static final String USER_CHILD = "user_child";
	private static final String USER_FREE = "user_free";
	private static final String USER_PICID = "user_pic";

	/** DBコネクション */
	public Connection con;
	/** DBステートメント */
	PreparedStatement stmt;
	/** 検索結果 */
	ResultSet rs;

	public userDAO(Connection con) {
		this.con = con;
	}

	//ログインチェック　userIdとpasswordに基づくユーザー情報を取り出す
	public userDTO loginCheck(int userId,String password)
			throws SQLException, ClassNotFoundException, NumberFormatException {

		userDTO userData = null;

		try {
			con = DBManager.getConnection();
			String sql = "SELECT * FROM user_table INNER JOIN picture ON user_table.user_id = picture.id "
					+ "WHERE user_id = ? AND user_pass = ?";
			this.stmt = con.prepareStatement(sql);
			stmt.setInt(1, userId);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				userId = rs.getInt("user_id");
				password = rs.getString("user_pass");
				String name = rs.getString("user_nickname");
				String area = rs.getString("user_area");
				String income = rs.getString("user_income");
				String school = rs.getString("user_school");
				String gender = rs.getString("user_gender");
				String age = rs.getString("user_age");
				String height = rs.getString("user_height");
				String body = rs.getString("user_body");
				String job = rs.getString("user_job");
				String holiday = rs.getString("user_holiday");
				String cigar = rs.getString("user_cigar");
				String child = rs.getString("user_child");
				int picId = rs.getInt("user_pic");
				String picName = rs.getString("user_picName");
				String free = rs.getString("user_free");

				return userData = new userDTO(userId,password,name,area,
						income,school,gender,age,height,body,job,
						holiday,cigar,child,picId,picName,free);
			}else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			con.close();
		}
		return userData;
	}

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
				user.setIncome(rs.getString("user_income"));
				user.setSchool(rs.getString("user_school"));
				user.setGender(rs.getString("user_gender"));
				user.setAge(rs.getString("user_age"));
				user.setHeight(rs.getString("user_height"));
				user.setBody(rs.getString("user_body"));
				user.setJob(rs.getString("user_job"));
				user.setHoliday(rs.getString("user_holiday"));
				user.setCigar(rs.getString("user_cigar"));
				user.setChild(rs.getString("user_child"));
				user.setFree(rs.getString("user_free"));
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
	public  userDTO selectById(int userId)
			throws SQLException, ClassNotFoundException, NumberFormatException {

		String sql = "SELECT * FROM user_table INNER JOIN picture ON user_table.user_id = picture.id"
				+ " WHERE user_id = "+ userId + ";" ;
		userDTO userData = null;

		try {
			con = DBManager.getConnection();
			this.stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next()) {
				userDTO user = new userDTO();
				userId = rs.getInt("user_id");
				String password = rs.getString("user_pass");
				String name = rs.getString("user_nickname");
				String area = rs.getString("user_area");
				String income = rs.getString("user_income");
				String school = rs.getString("user_school");
				String gender = rs.getString("user_gender");
				String age = rs.getString("user_age");
				String height = rs.getString("user_height");
				String body = rs.getString("user_body");
				String job = rs.getString("user_job");
				String holiday = rs.getString("user_holiday");
				String cigar = rs.getString("user_cigar");
				String child = rs.getString("user_child");
				int picId = rs.getInt("user_pic");
				String picName = rs.getString("user_picName");
				String free = rs.getString("user_free");

				return userData = new userDTO(userId,password,name,area,
						income,school,gender,age,height,body,job,
						holiday,cigar,child,picId,picName,free);
			}else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			con.close();
		}
		return userData;
	}

	//IDを引数に、Myページを更新

	public int updateMypageDtos(List<Object> paramList, int userId)
			throws SQLException, ClassNotFoundException, NumberFormatException{
		int count = -1;
		List<userDTO> userList = new ArrayList<>();
		StringBuilder sql = new StringBuilder();

		sql.append(" UPDATE ");
		sql.append("    " + TBL_NAME);
		sql.append(" SET ");
		sql.append("    " + USER_ID + " = " + "?");
		sql.append("   ," + PASSWORD + " = " + "?");
		sql.append("   ," + USER_NAME + " = " + "?");
		sql.append("   ," + USER_AREA + " = " + "?");
		sql.append("   ," + USER_INCOME + " = " + "?");
		sql.append("   ," + USER_SCHOOL + " = " + "?");
		sql.append("   ," + USER_GENDER + " = " + "?");
		sql.append("   ," + USER_AGE + " = " + "?");
		sql.append("   ," + USER_HEIGHT + " = " + "?");
		sql.append("   ," + USER_BODY + " = " + "?");
		sql.append("   ," + USER_JOB + " = " + "?");
		sql.append("   ," + USER_HOLIDAY + " = " + "?");
		sql.append("   ," + USER_CIGAR + " = " + "?");
		sql.append("   ," + USER_CHILD + " = " + "?");
		sql.append("   ," + USER_FREE + " = " + "?");
		sql.append("   ," + USER_PICID + " = " + "?");
		sql.append(" WHERE ");
		sql.append("    " + userId + " = " + "?");

		try {
			con = DBManager.getConnection();
//			this.stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				userDTO user = new userDTO();
				user.setUserId(rs.getInt("user_id"));
				user.setPassword(rs.getString("user_pass"));
				user.setName(rs.getString("user_nickname"));
				user.setArea(rs.getString("user_area"));
				user.setIncome(rs.getString("user_income"));
				user.setSchool(rs.getString("user_school"));
				user.setGender(rs.getString("user_gender"));
				user.setAge(rs.getString("user_age"));
				user.setHeight(rs.getString("user_height"));
				user.setBody(rs.getString("user_body"));
				user.setJob(rs.getString("user_job"));
				user.setHoliday(rs.getString("user_holiday"));
				user.setCigar(rs.getString("user_cigar"));
				user.setChild(rs.getString("user_child"));
				user.setFree(rs.getString("user_free"));
				user.setPicId(rs.getInt("user_pic"));
				userList.add(user);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			stmt.close();
			con.close();
		}
		// 登録の実行
		count = this.stmt.executeUpdate();

		return count;
	}





}
