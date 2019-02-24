package model;

import util.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationDAO
{
    /** DBコネクション */
    public Connection con;
    /** DBステートメント */
    PreparedStatement stmt;
    ResultSet rs;
    EducationDTO dto;

    public List<EducationDTO> selectById(int educationId) throws SQLException, ClassNotFoundException, NumberFormatException
    {
        List<EducationDTO> educationList = new ArrayList<>();
        String sql = "SELECT * FROM education_table WHERE education_id = "+ educationId + ";" ;

        try {
            con = DBManager.getConnection();
            this.stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                dto = new EducationDTO();
                educationList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            stmt.close();
            con.close();
        }
        return educationList;


    }
}
