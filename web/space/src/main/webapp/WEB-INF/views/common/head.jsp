<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<spring:url var="themeURL" value="/cdn/css/redmond/jquery-ui-1.8.16.custom.css"/>
<spring:url var="jqueryURL" value="/cdn/js/jquery-1.6.2.min.js"/>
<spring:url var="jqueryCustomURL" value="/cdn/js/jquery-ui-1.8.16.custom.min.js"/>
<head>
    <meta charset=UTF-8>
    <title>Space</title>
    <link type="text/css" href="${themeURL}" rel="stylesheet" />
    <script type="text/javascript" src="${jqueryURL}"></script>
	<script type="text/javascript" src="${jqueryCustomURL}"></script>
</head>