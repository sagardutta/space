<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<spring:url var="logoutURL" value="/account/logout" />
<spring:url var="registerURL" value="/account/register" />
<spring:url var="loginURL" value="/account/login" />

<header>
    <hgroup>
        <nav id=global>
            <ul>
                <c:set var="isAuthenticated" value="${false}"/>
                <security:authorize access="isAuthenticated()">
                    <c:set var="isAuthenticated" value="${true}"/>
                </security:authorize>
                <c:choose>
                    <c:when test="${isAuthenticated}">
                        <li><a href=#><a href="${logoutURL}">Log Out</a></a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="${loginURL}">Log In</a></li>
                        <li><a href=#><a href="${registerURL}">Register</a></a></li>
                    </c:otherwise>
                </c:choose>
             </ul>
        </nav>
    </hgroup>
</header>