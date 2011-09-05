<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<spring:url var="seucrityCheckURL" value="/j_spring_security_check" />
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
                <header class="ui-widget-header ui-corner-top">Login</header>
                <div class="ui-widget-content ui-corner-bottom">
                     <c:if test="${not empty param.login_error}">
                        <p class="ui-state-error">
                            Login username/password incorrect.
                        </p>
                        <p class="ui-state-error">
                            Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
                        </p>
                    </c:if>
                    <form method="post" action="${seucrityCheckURL}">
                        <p><label>User Name: <input name="j_username" required></label></p>
                        <p><label>Password: <input name="j_password" required type="password"> </label></p>
                        <p><button>Login</button><p>
                    </form>
                </div>
            </section>
        </div>
        <div id="footer">
            <jsp:include page="../common/footer.jsp"/>
        </div>
    </body>
</html>