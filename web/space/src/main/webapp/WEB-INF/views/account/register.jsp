<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<spring:url  var="accountCreateURL" value="/account/create" />
<!doctype html>
<html lang=en>
    <jsp:include page="../common/head.jsp"/>
    <body>
        <div id="header">
            <%--
            <jsp:include page="../common/header.jsp"/>
            --%>
        </div>
        <div id="content">
            <section class="ui-widget ui-corner-all">
                <header class="ui-widget-header ui-corner-top">Register</header>
                <div class="ui-widget-content ui-corner-bottom">
                    <form method="post" enctype="application/x-www-form-urlencoded" action="${accountCreateURL}">
                        <p><label>User Name: <input name="username" required></label></p>
                        <p><label>Password: <input name="password" type="password" required> </label></p>
                        <p><button>Register</button><p>
                    </form>
                </div>
            </section>
        </div>
        <div id="footer">
            <jsp:include page="../common/footer.jsp"/>
        </div>
    </body>
</html>