package dev.ielb.articleprojetcs.Controller;

import dev.ielb.articleprojetcs.DAO.DaoArticle;
import dev.ielb.articleprojetcs.Model.Article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ArticleServlet", value = "/ArticleServlet")
public class ArticleServlet extends HttpServlet {
        List <Article> LesArticles;
@Override
public void init() throws ServletException {
    DaoArticle.initialize();
    LesArticles = DaoArticle.getAll();
}
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.setAttribute("maList", LesArticles);
        request.getRequestDispatcher("Article.jsp").forward(request, response);
        }
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    processRequest(request, response);
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        processRequest(request, response);
    }

}
