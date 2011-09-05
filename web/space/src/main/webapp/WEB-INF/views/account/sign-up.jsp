<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:url  var="accountCreateUrl" value="/account/create" />
<!doctype html>
<html lang=en>
    <jsp:include page="../common/head.jsp"/>
    <body>
        <jsp:include page="../common/header.jsp"/>
        <div>
            <div id=content>

                <article>
                    <header>
                        <h1>Sign Up for Free</h1>
                    </header>                     
                    <form method="post" enctype="application/x-www-form-urlencoded" action="${accountCreateUrl}">
                        <p><label>User Name: <input name="username" required></label></p>
                        <p><label>Password: <input name="password" type="password" required> </label></p>
                        <p><button>Sign Up</button><p>
                    </form>
                </article>

            </div>
        </div>
        <jsp:include page="../common/footer.jsp"/>
    </body>
</html>