package dev.ielb.articleprojetcs.Controller;

import dev.ielb.articleprojetcs.DAO.DaoArticle;
import dev.ielb.articleprojetcs.Model.Article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteServlet", value = "/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String code = request.getParameter("code");
        Article article = new Article(code);
        DaoArticle.deleteArticle(article);
        request.getRequestDispatcher("ArticleServlet").forward(request,response);
    }


}
