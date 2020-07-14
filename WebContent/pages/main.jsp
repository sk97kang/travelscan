<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Travel Scan</title>
<link rel="stylesheet" href="../css/styles.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
  <body>
    <header>
      <a href="#" class="logo">여행</a>
      <ul>
        <li><a href="#">여행 게시판</a></li>
        <li><a href="#">여행 메이트</a></li>
        <li><a href="#">마이 페이지</a></li>
        <li><a href="#">문의 사항</a></li>
        <li><a href="#">관리자 페이지</a></li>
      </ul>
    </header>
    <div class="youtube">
      <iframe
        width="560"
        height="315"
        src="https://www.youtube.com/embed/I9O_nSTplZU?controls=0"
        frameborder="0"
        allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      ></iframe>
    </div>
    <script type="text/javascript">
      window.addEventListener("scroll", function () {
        const header = document.querySelector("header");
        header.classList.toggle("sticky", window.scrollY > 0);
      });
    </script>
  </body>
</html>