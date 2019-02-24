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

    @WebServlet(name="sample", urlPatterns={"/sample"})
    public class sample extends HttpServlet {
        private static final long serialVersionUID = 1L;


        public sample() {
            super();

        }


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        }


        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            request.setCharacterEncoding("UTF-8");

            //IDをjspから受け取る
            String userId = request.getParameter("userId");
            String error = null;
            userDTO user;


            try {
                //userDAOインスタンス作成
                userDAO userDao = new userDAO(DBManager.getConnection());
                //userIdを引数にユーザー情報を取得、userに格納
                user = userDao.selectById(Integer.parseInt(userId));

                //リクエストスコープにuser情報を保存
                request.setAttribute("user",user);
                //プロフィール画面に飛ぶ
                request.getRequestDispatcher("profile.jsp").forward(request, response);

                return;


            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                return;
            }
        }

    }
