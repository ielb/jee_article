package dev.ielb.articleprojetcs.Controller;

import dev.ielb.articleprojetcs.DAO.DaoArticle;
import dev.ielb.articleprojetcs.Model.Article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EditServlet", value = "/EditServlet")
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        Article art = DaoArticle.getArticle(code);
        List<Article> Articles = DaoArticle.getAll();
        request.setAttribute("maList",Articles);
        request.setAttribute("art",art);
        request.getRequestDispatcher("Edit_Article.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
