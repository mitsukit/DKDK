package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.userDAO;
import model.userDTO;
import util.DBManager;


@WebServlet(name="profile", urlPatterns={"/profile"})
public class profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public profile() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String userId = request.getParameter("userId");


		try {
			userDAO dao = new userDAO(DBManager.getConnection());
			userDTO user;
			user = dao.selectById(Integer.parseInt(userId));
			request.setAttribute("user", user);
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

}
