package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import util.DBManager;

public class userDAO {
/*
	private static final String TBL_NAME = "user_table";
	private static final String USER_ID = "user_id";
	private static final String PASSWORD = "user_pass";
	private static final String USER_NAME = "user_nickname";
	private static final String ADDRESS_ID = "address_id";
	private static final String INCOME_ID = "income_id";
	private static final String EDUCATION_ID = "education_id";
	private static final String GENDER_ID = "gender_id";
	private static final String AGE_ID = "age_id";
	private static final String HEIGHT_ID = "height_id";
	private static final String BODY_ID = "body_id";
	private static final String JOB_ID = "job_id";
	private static final String HOLIDAY_ID = "holiday_id";
	private static final String SMOKING_ID = "smoking_id";
	private static final String CHILDREN_ID = "children_id";
	//private static final String USER_FREE = "user_free";
	private static final String PIC_ID = "pic_id";
	*/

	/** DBコネクション */
	public Connection con;
	/** DBステートメント */
	PreparedStatement stmt;
	/** 検索結果 */
	ResultSet rs;

	String sql = "SELECT user_id, user_pass, user_nickname, address_table.address, income_table.income, education_table.education, gender_table.gender, \r\n" +
			"age_table.age, height_table.height, body_table.body, job_table.job, holiday_table.holiday, smoking_table.smoking, children_table.children, \r\n" +
			"picture_table.pic_name \r\n" +
			"FROM user_table\r\n" +
			"INNER JOIN address_table ON address_table.address_id = address_id\r\n" +
			"INNER JOIN income_table ON income_table.income_id = income_id\r\n" +
			"INNER JOIN education_table ON education_table.education_id = education_id\r\n" +
			"INNER JOIN gender_table ON gender_table.gender_id = gender_id\r\n" +
			"INNER JOIN age_table ON age_table.age_id = age_id\r\n" +
			"INNER JOIN height_table ON height_table.height_id = height_id\r\n" +
			"INNER JOIN body_table ON body_table.body_id = body_id\r\n" +
			"INNER JOIN job_table ON job_table.job_id = job_id\r\n" +
			"INNER JOIN holiday_table ON holiday_table.holiday_id = holiday_id\r\n" +
			"INNER JOIN smoking_table ON smoking_table.smoking_id = smoking_id\r\n" +
			"INNER JOIN children_table ON children_table.children_id = children_id\r\n" +
			"INNER JOIN picture_table ON picture_table.pic_id = pic_id ";

	AddressDTO adDto;
	IncomeDTO inDto;
	EducationDTO edDto;
	GenderDTO genDto;
	AgeDTO ageDto;
	HeightDTO heiDto;
	BodyDTO bodyDto;
	JobDTO jobDto;
	HolidayDTO holDto;
	SmokingDTO smoDto;
	ChildrenDTO chiDto;

	public userDAO(Connection con) {
		this.con = con;
	}

	//ログインチェック　userIdとpasswordに基づくユーザー情報を取り出す
	public userDTO loginCheck(int userId,String password)
			throws SQLException, ClassNotFoundException, NumberFormatException {

		userDTO userData = null;

		try {
			con = DBManager.getConnection();
			sql = this.sql + "WHERE user_id = ? AND user_pass = ?;";
			this.stmt = con.prepareStatement(sql);
			stmt.setInt(1, userId);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				userId = rs.getInt("user_id");
				password = rs.getString("user_pass");
				String name = rs.getString("user_nickname");
				String address = rs.getString("address");
				String income = rs.getString("income");
				String school = rs.getString("education");
				String gender = rs.getString("gender");
				String age = rs.getString("age");
				String height = rs.getString("height");
				String body = rs.getString("body");
				String job = rs.getString("job");
				String holiday = rs.getString("holiday");
				String smoking = rs.getString("smoking");
				String child = rs.getString("children");
				String picName = rs.getString("pic_name");
	//			String free = rs.getString("user_free");

				return userData = new userDTO(userId,password,name,address,
						income,school,gender,age,height,body,job,
						holiday,smoking,child,picName);
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
		try {
			con = DBManager.getConnection();
			this.stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				userDTO user = new userDTO();
				user.setUserId(rs.getInt("user_id"));
				user.setPassword(rs.getString("user_pass"));
				user.setName(rs.getString("user_nickname"));
				user.adDto.setAddress(rs.getString("address"));
				user.inDto.setIncome(rs.getString("income"));
				user.edDto.setEducation(rs.getString("education"));
				user.genDto.setGender(rs.getString("gender"));
				user.ageDto.setAge(rs.getString("age"));
				user.heiDto.setHeight(rs.getString("height"));
				user.bodyDto.setBody(rs.getString("body"));
				user.jobDto.setJob(rs.getString("job"));
				user.holDto.setHoliday(rs.getString("holiday"));
				user.smoDto.setSmoking(rs.getString("smoking"));
				user.chiDto.setChildren(rs.getString("children"));
				//user.setFree(rs.getString("user_free"));
				user.picDto.setPicName(rs.getString("pic_name"));
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

		sql = sql  + " WHERE user_id = "+ userId + ";" ;
		userDTO userData = null;

		try {
			con = DBManager.getConnection();
			this.stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next()) {
				userId = rs.getInt("user_id");
				String password = rs.getString("user_pass");
				String name = rs.getString("user_nickname");
				String address = rs.getString("address");
				String income = rs.getString("income");
				String school = rs.getString("education");
				String gender = rs.getString("gender");
				String age = rs.getString("age");
				String height = rs.getString("height");
				String body = rs.getString("body");
				String job = rs.getString("job");
				String holiday = rs.getString("holiday");
				String smoking = rs.getString("smoking");
				String child = rs.getString("children");
				String picName = rs.getString("pic_name");
	//			String free = rs.getString("user_free");

				return userData = new userDTO(userId,password,name,address,
						income,school,gender,age,height,body,job,
						holiday,smoking,child,picName);
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

	//String age, String address, String income, String height,String body, String education, String job, String holiday, String smoking, String children
	public List<userDTO> selectBySearch(HashMap<String, String> pull)
	{
		//SQL文作成
				//StringBuilder使用
				int index = 1;
				StringBuilder sqlSearch = new StringBuilder();
				//Initial SQL query
				sqlSearch.append(sql);
				sqlSearch.append(" WHERE 'X' = 'X'");

				//TRY-CATCH文　try 開始
				try {
				//for each文でHashMap内のkeyを取り出していく
				for(String key : pull.keySet())
				{//START for文
					//値がnullで無ければSQL文にappendして足していく
					if(pull.get(key) != null || pull.get(key) != "")
					{
						sqlSearch.append("AND " + key + " = ?");
						//PreparedStatementのsetIntで該当するid番号を設定していく
						stmt.setInt(index, Integer.parseInt(pull.get(key)));
						//ループするためinteger型変数indexをインクレメントしていく
						index++;
					}
				}//END FOR文

					//Connection作成
					Connection con = DBManager.getConnection();
					//ConnectionのprepareStatement()でSQL文をセット、StringBuilderの為 toString()メソッドでStringに変更
					this.stmt = con.prepareStatement(sql.toString());
					//ResultSet作成、SQL文を実行
					ResultSet rs = stmt.executeQuery();
					//<userDTO>型のリストを作成：userSearchList
					List<userDTO> userSearchList = new ArrayList<userDTO>();

					//該当するプロフィールを全件表示する
					while(rs.next())
					{
						
					}


				} 
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}

		return userList;
	}

/*	//IDを引数に、Myページを更新

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
		sql.append("   ," + ADDRESS_ID + " = " + "?");
		sql.append("   ," + INCOME_ID + " = " + "?");
		sql.append("   ," + EDUCATION_ID + " = " + "?");
		sql.append("   ," + GENDER_ID + " = " + "?");
		sql.append("   ," + AGE_ID + " = " + "?");
		sql.append("   ," + HEIGHT_ID + " = " + "?");
		sql.append("   ," + BODY_ID + " = " + "?");
		sql.append("   ," + JOB_ID + " = " + "?");
		sql.append("   ," + HOLIDAY_ID + " = " + "?");
		sql.append("   ," + SMOKING_ID + " = " + "?");
		sql.append("   ," + CHILDREN_ID + " = " + "?");
//		sql.append("   ," + USER_FREE + " = " + "?");
		sql.append("   ," + PIC_ID + " = " + "?");
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
				user.setAreaId(rs.getString("address"));
				user.setIncome(rs.getString("income"));
				user.setEducationId(rs.getString("education"));
				user.setGenderId(rs.getString("gender"));
				user.setAge(rs.getString("age"));
				user.setHeight(rs.getString("height"));
				user.setBody(rs.getString("body"));
				user.setJob(rs.getString("job"));
				user.setHoliday(rs.getString("holiday"));
				user.setCigar(rs.getString("smoking"));
				user.setChild(rs.getString("children"));
				//user.setFree(rs.getString("user_free"));
				user.setPicName(rs.getString("pic_name"));
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
*/





}
