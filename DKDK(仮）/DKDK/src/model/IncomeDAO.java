package model;

import util.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IncomeDAO
{
    /** DBコネクション */
    public Connection con;
    /** DBステートメント */
    PreparedStatement stmt;
    ResultSet rs;
    IncomeDTO dto;

    public List<IncomeDTO> selectById(int incomeId) throws SQLException, ClassNotFoundException, NumberFormatException
    {
        List<IncomeDTO> incomeList = new ArrayList<>();
        String sql = "SELECT * FROM income_table WHERE income_id = "+ incomeId + ";" ;

        try {
            con = DBManager.getConnection();
            this.stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                dto = new IncomeDTO();
                incomeList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            stmt.close();
            con.close();
        }
        return incomeList;


    }
}
