package dev.ielb.articleprojetcs.Controller;

import dev.ielb.articleprojetcs.DAO.DaoArticle;
import dev.ielb.articleprojetcs.Model.Article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdateServlet", value = "/UpdateServlet")
public class UpdateServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Article article = new Article();
        article.setCode(request.getParameter("code"));
        article.setDesignation(request.getParameter("designation"));
        article.setPrix(Float.parseFloat(request.getParameter("prix")));
        DaoArticle.updateArticle(article);

    }
}
