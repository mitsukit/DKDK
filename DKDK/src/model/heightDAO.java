package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class heightDAO
{
	/** DBコネクション */
	public Connection con;
	/** DBステートメント */
	PreparedStatement stmt;
	ResultSet rs;
	heightDTO dto;

public List<heightDTO> selectById(int heightId) throws SQLException, ClassNotFoundException, NumberFormatException
	{
			List<heightDTO> heightList = new ArrayList<>();
			String sql = "SELECT * FROM height_table WHERE address_id = "+ heightId + ";" ;

			try {
				con = DBManager.getConnection();
	 			this.stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();
				while (rs.next()) {
					dto = new heightDTO();
					heightList.add(dto);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				stmt.close();
				con.close();
			}
			return heightList;


	}
}
