<%--
  Created by IntelliJ IDEA.
  User: issam
  Date: 6/4/2022
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dev.ielb.articleprojetcs.DAO.DaoArticle" %>
<%@page import="java.util.List" %>
<%@page import="dev.ielb.articleprojetcs.Model.Article" %>
<html>
<head>
    <title>JSO PAGE</title>
</head>
<body>
<% List<Article> maList = (List<Article>)request.getAttribute("maList"); %>
<fieldset style=" width: 30px; height: 520px">
    <legend> List DES ARTICLES</legend>
    <table border="1" cellpadding="5">
        <tr>
            <th>CODE</th>
            <th>DESIGNATION</th>
            <th>PRIX</th>
            <th colspan="2">ACTION</th>
        </tr>
        <% for (Article article : maList) { %>
        <tr>
            <td><%=article.getCode()%></td>
            <td><%=article.getDesignation()%></td>
            <td><%=article.getPrix()%></td>
            <td>
                <a href="DeleteServlet?code=<%=article.getCode()%>"
                   onclick="return confirm('Etes vous sur de la suppresssion ?')"
                >
                    <img src="img/delete.png" width="40" height="40"/>
                </a>
            </td>
            <td> <a href="EditServlet?code=<%=article.getCode()%>"
                    onclick="return confirm('Etes vous sur de la suppresssion ?')"
            >
                <img src="img/edit.png" width="40" height="40"/>
            </a></td>

        </tr>
        <% } %>
    </table>
</fieldset>
</body>
</html>
