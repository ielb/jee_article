package dev.ielb.articleprojetcs.Controller;

import dev.ielb.articleprojetcs.DAO.DaoArticle;
import dev.ielb.articleprojetcs.Model.Article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddServlet", value = "/AddServlet")
public class AddServlet extends HttpServlet {
    Article art = new Article();


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        art.setCode(request.getParameter("code"));
        art.setDesignation(request.getParameter("designation"));
        art.setPrix(Float.parseFloat(request.getParameter("prix")));
        DaoArticle.create(art);
        request.getRequestDispatcher("ArticleServelt").forward(request,response);
    }
}
