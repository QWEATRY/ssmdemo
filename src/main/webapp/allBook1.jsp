<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

                <table>
                    <thead>
                        <tr>
                            <th>书籍编号</th>
<%--                            <th>书籍名称</th>--%>
<%--                            <th>书籍数量</th>--%>
<%--                            <th>书籍详情</th>--%>
                        </tr>
                    </thead>
                    <tbody>
                        <c:foreach var="book" items="${list}">
                            <tr>
<%--                                <td>${book.bookId}</td>--%>
<%--                                <td>${book.bookName}</td>--%>
<%--                                <td>${book.bookCount}</td>--%>
<%--                                <td>${book.detail}</td>--%>
                                <td>list.</td>
                            </tr>
                        </c:foreach>
                    </tbody>
                </table>

</body>
</html>
