<%--
  Created by IntelliJ IDEA.
  User: issam
  Date: 5/28/2022
  Time: 1:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dev.ielb.articleprojetcs.Model.Article"%>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>JSP PAGE</title>
</head>
<body>

<center> <h1>Gestion des articles</h1></center>
<% Article art = (Article)request.getAttribute("art") %>
<div style="text-align: center;">
    <fieldset style="width: 50px;height: 150px;">
        <legend>  Update Articel</legend>
        <form action="UpdateServlet" method="post">
            <table width="300px">
                <tr>
                    <td>Code</td>
                    <td>
                        <label>
                            <input type="text" name="code" value="<%=art.getCode()%>">
                        </label>
                    </td>
                </tr>
                <tr>
                    <td>Designation</td>
                    <td>
                        <label>
                            <input type="text" name="designation" value="<%=art.getCode()%>">
                        </label>
                    </td>
                </tr>
                <tr>
                    <td>Prix</td>
                    <td>
                        <label>
                            <input type="number" name="prix" value="<%=art.getCode()%>">
                        </label>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Update">
                    </td>
                </tr>
            </table>        </form>
    </fieldset>
    <%@ include file="List-Articles.jsp"%>>
</div>

</body>
</html>
