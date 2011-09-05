<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang=en>
    <jsp:include page="common/head.jsp"/>
    <body>
        <div id="header">
            <jsp:include page="common/header.jsp"/>
        </div>

        <div>
            <p>${message}</p>
        </div>

        <div id="footer">
            <jsp:include page="common/footer.jsp"/>
        </div>
    </body>
</html>