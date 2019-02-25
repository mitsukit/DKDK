package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddressDTO;
import model.AgeDTO;
import model.BodyDTO;
import model.ChildrenDTO;
import model.EducationDTO;
import model.HeightDTO;
import model.HolidayDTO;
import model.IncomeDTO;
import model.JobDTO;
import model.SmokingDTO;
import model.userDAO;
import model.userDTO;
import util.DBManager;

/**
 * Servlet implementation class Search
 */
@WebServlet(name="search", urlPatterns = { "/Search" })
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//placeholder for dropdown key
	String ageSelect;
	String addressSelect;
	String incomeSelect;
	String heightSelect;
	String bodySelect;
	String eduSelect;
	String jobSelect;
	String holidaySelect;
	String smokingSelect;
	String childSelect;

	//TEMP DAO , DTO instance
	userDAO dao = null;
	userDTO dto = null;

	//Statement
	PreparedStatement ps;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search()
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");

		//START　プルダウンより中身がnullでなければString変数に代入
		if(request.getParameter("age") != null){ageSelect = request.getParameter("age");}
		if(request.getParameter("address") != null){ addressSelect = request.getParameter("address");}
		if(request.getParameter("income") != null){incomeSelect = request.getParameter("income");}
		if(request.getParameter("height") != null){heightSelect = request.getParameter("height");}
		if(request.getParameter("body") != null){bodySelect = request.getParameter("body");}
		if(request.getParameter("education") != null){eduSelect = request.getParameter("education");}
		if(request.getParameter("job") != null){jobSelect = request.getParameter("job");}
		if(request.getParameter("holiday") != null){holidaySelect = request.getParameter("holiday");}
		if(request.getParameter("smoking") != null){smokingSelect =request.getParameter("smoking");}
		if(request.getParameter("children") != null){childSelect =request.getParameter("children");}
		//END プルダウン中身チェック

		//START HashMapにキーとして該当するコラム名、上記でプルダウンよりゲットした変数を入れる
		//Needed variables: age, address, income, height, body, education, job, holiday, smoking, children
		HashMap<String, String> pull = new HashMap<String, String>();
		pull.put("age_id",ageSelect);
		pull.put("address_id", addressSelect);
		pull.put("income_id",incomeSelect);
		pull.put("height_id",heightSelect);
		pull.put("body_id",bodySelect);
		pull.put("education_id",eduSelect);
		pull.put("job_id",jobSelect);
		pull.put("holiday_id",holidaySelect);
		pull.put("smoking_id",smokingSelect);
		pull.put("children_id",childSelect);

		



		request.getRequestDispatcher("SearchResult.jsp").forward(request, response);








	}

}
