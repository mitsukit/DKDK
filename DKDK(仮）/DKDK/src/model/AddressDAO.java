package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class AddressDAO
{
	/** DBコネクション */
	public Connection con;
	/** DBステートメント */
	PreparedStatement stmt;
	ResultSet rs;
	AddressDTO dto;

public List<AddressDTO> selectById(int addressId) throws SQLException, ClassNotFoundException, NumberFormatException
	{
			List<AddressDTO> adList = new ArrayList<>();
			String sql = "SELECT * FROM address_table WHERE address_id = "+ addressId + ";" ;

			try {
				con = DBManager.getConnection();
	 			this.stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();
				while (rs.next()) {
					AddressDTO address = new AddressDTO();
					adList.add(address);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				stmt.close();
				con.close();
			}
			return adList;


	}
}
