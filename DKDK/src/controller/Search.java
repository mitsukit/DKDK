package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.userDAO;
import model.userDTO;

/**
 * Servlet implementation class Search
 */
@WebServlet(name="search", urlPatterns = { "/Search" })
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//placeholder for dropdown key
	String  ageSelect;
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

		//START check pulldown if any is selected
		if(request.getParameter("age") != null)
		{
			ageSelect = request.getParameter("age");
		}
		if(request.getParameter("address") != null)
		{
			 addressSelect = request.getParameter("address");
		}
		if(request.getParameter("income") != null)
		{
			incomeSelect = request.getParameter("income");
		}
		if(request.getParameter("height") != null)
		{
			heightSelect = request.getParameter("age");
		}
		if(request.getParameter("body") != null)
		{
			bodySelect = request.getParameter("body");
		}
		if(request.getParameter("education") != null)
		{
			eduSelect = request.getParameter("education");
		}
		if(request.getParameter("job") != null)
		{
			jobSelect = request.getParameter("job");
		}
		if(request.getParameter("holiday") != null)
		{
			holidaySelect = request.getParameter("holiday");
		}
		if(request.getParameter("smoking") != null)
		{
			smokingSelect =request.getParameter("smoking");
		}
		if(request.getParameter("children") != null)
		{
			childSelect =request.getParameter("children");
		}
		
		//END of  pulldown check
		
		request.getRequestDispatcher("SearchResult.jsp").forward(request, response);








	}

}
