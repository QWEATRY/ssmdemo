<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/2/6
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">

<%--        隐藏域--%>
        <input type="hidden" name="bookId" value="${books.bookId}">

        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" name="bookName" class="form-control" value="${books.bookName}" required>
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" name="bookCount" class="form-control" placeholder="bookCount" required>
        </div>
        <div class="form-group">
            <label>书籍详情</label>
            <input type="text" name="detail" class="form-control" placeholder="detail" required>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
        <%--        <div class="form-group">--%>
        <%--            <input type="submit" class="form-control" value="添加">--%>
        <%--        </div>--%>
    </form>

</div>

</body>
</html>
