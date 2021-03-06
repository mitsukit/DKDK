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
import util.DBManager;


@WebServlet(name="login", urlPatterns={"/login"})
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public login() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			userDAO user = new userDAO(DBManager.getConnection());
			List<userDTO> userAllList;
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
		 userDTO loginUser;


		try {

			userDAO userDao = new userDAO(DBManager.getConnection());
			loginUser = userDao.loginCheck(Integer.parseInt(userId),password);

				if(loginUser==null) {
					 error = "ãƒ­ã‚°ã‚¤ãƒ³ã�«å¤±æ•—ã�—ã�¾ã�—ã�Ÿã€‚";
					request.setAttribute(" error", error);
					request.getRequestDispatcher("login.jsp").forward(request, response);
					return;

				}

					//ã‚»ãƒƒã‚·ãƒ§ãƒ³
					HttpSession session = request.getSession();
					session.setAttribute("loginUser",loginUser);

					request.getRequestDispatcher("myPage.jsp").forward(request, response);

					return;


		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return;
		}

	}

}
