package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.userDAO;
import model.userDTO;


@WebServlet(name="login", urlPatterns={"/login"})
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;





	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		userDAO user = new userDAO(null);
		List<userDTO> userAllList;
		try {
			userAllList = user.selectAll();
			request.setAttribute("userAllList",userAllList);
			request.getRequestDispatcher("sample.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		 String userId = request.getParameter("userId");
		 String password = request.getParameter("password");

		 String error = null;
		 String dbPass = null;
		 userDTO user = null;


		try {

			userDAO userDao = new userDAO(null);
			List<userDTO> userList = userDao.selectById(Integer.parseInt(userId));

		if(userList.isEmpty()) {
			 error = "IDが見つかりません。";
			request.setAttribute(" error", error);
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}


		user = userList.get(0);
		dbPass = user.getPassword();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return;
		}

		if(user != null &&password.equals(dbPass)){

			request.setAttribute("userId", userId);
			request.setAttribute("password", password);

			//セッション
			HttpSession session = request.getSession();
			session.setAttribute("user",user);

			request.getRequestDispatcher("sample.jsp").forward(request, response);

			return;
		}else
			 error = "値が不正です。";
			request.setAttribute("error", error);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}


}
