package model;

import util.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JobDAO
{
    /** DBコネクション */
    public Connection con;
    /** DBステートメント */
    PreparedStatement stmt;
    ResultSet rs;
    JobDTO dto;

    public List<JobDTO> selectById(int jobId) throws SQLException, ClassNotFoundException, NumberFormatException
    {
        List<JobDTO> jobList = new ArrayList<>();
        String sql = "SELECT * FROM job_table WHERE job_id = "+ jobId + ";" ;

        try {
            con = DBManager.getConnection();
            this.stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                dto = new JobDTO();
                jobList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            stmt.close();
            con.close();
        }
        return jobList;


    }
}
