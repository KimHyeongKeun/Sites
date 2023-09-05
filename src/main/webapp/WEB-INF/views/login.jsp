<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Font online-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">

    <!--        Animate.css-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">

    <link rel="stylesheet" href="/resources/static/style.css" type="text/css">
<%--    <link rel="stylesheet" href="text/style.css" >--%>
    <link rel="stylesheet" href="${path}/resources/static/css/style.css">

    <!-- Google JQuery CDN -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <script src="${path}/resources/static/js/login.js"></script>
    <script src="${path}/resources/static"></script>


</head>
<body>
<div>
    <div class="panel shadow1">
        <li class="nav-item"><a class="nav-link" href="/site/login">로그인</a></li>

        <form class="login-form">
            <div class="panel-switch animated fadeIn">
                <button type="button" id="sign_up" class="active-button">Sign Up</button>
                <button type="button" id="log_in" class="" disabled>Log in</button>
            </div>
            <h1 class="animated fadeInUp animate1" id="title-login">Welcome Back !</h1>
            <h1 class="animated fadeInUp animate1 hidden" id="title-signup">Welcome !</h1>
            <fieldset id="login-fieldset">
                <input class="login animated fadeInUp animate2" name="username" type="textbox"  required   placeholder="Username" value="" >
                <input class="login animated fadeInUp animate3" name="password" type="password" required placeholder="Password" value="">
            </fieldset>
            <fieldset id="signup-fieldset" class="hidden">
                <input class="login animated fadeInUp animate2" name="username" type="textbox"  required   placeholder="Username" value="" >
                <input class="login animated fadeInUp animate3" name="password" type="password" placeholder="Choose password"  required  value="">
            </fieldset>
            <input type="submit" id="login-form-submit" class="login_form button animated fadeInUp animate4" value="Log in">
            <input type="submit" id="signup-form-submit" class="login_form button animated fadeInUp animate4 hidden" value="Sign up">
            <p><a id="lost-password-link" href="" class="animated fadeIn animate5">I forgot my  login or password (!)</a></p>
        </form>
    </div>
</div>
<script src="form.js"></script>
</body>
</html>

