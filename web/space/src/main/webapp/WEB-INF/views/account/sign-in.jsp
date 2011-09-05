<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<spring:url var="seucrityCheckUrl" value="/j_spring_security_check" />
<!doctype html>
<html lang=en>
    <jsp:include page="../common/head.jsp"/>
    <body>
        <jsp:include page="../common/header.jsp"/>
        <div>
            <div id=content>

                <article>
                    <header>
                        <h1>Sign In </h1>
                    </header>
                    <c:if test="${not empty param.login_error}">
                        <p color="red">
                            Your login attempt was not successful, try again.<br/><br/>
                            Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>.
                        </p>
                    </c:if>
                    <form method="post" action="${seucrityCheckUrl}">
                        <p><label>User Name: <input name="j_username" required></label></p>
                        <p><label>Password: <input name="j_password" required type="password"> </label></p>
                        <p><button>Sign In</button><p>
                    </form>
                </article>

            </div>
        </div>
        <jsp:include page="../common/footer.jsp"/>
    </body>
</html>