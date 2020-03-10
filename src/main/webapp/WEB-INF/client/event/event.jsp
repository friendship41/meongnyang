<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-03-10
  Time: 오전 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang=kor>
<head>
    <meta charset=utf-8>
    <meta http-equiv=X-UA-Compatible content="IE=edge">
    <meta name=viewport content="width=device-width,initial-scale=1">
    <title>이벤트 페이지</title>
    <link href=/resources/client/js/event/app.8dcabf2f.js rel=preload as=script>
    <link href=/resources/client/js/event/chunk-vendors.a3589d38.js rel=preload as=script>
</head>
<body>
<noscript>
    <strong>We're sorry but vue-wheel doesn't work properly without JavaScript enabled. Please enable it to continue.</strong>
</noscript>
<div>
    <div><p>${eventInfo.eventMessage}</p></div>
    <div id=app></div>
    <div>이벤트 기간: ${eventInfo.eventStartDate} ~ ${eventInfo.eventEndDate}</div>
</div>
<script src=/resources/client/js/event/chunk-vendors.a3589d38.js></script>
<script src=/resources/client/js/event/app.8dcabf2f.js></script>
</body>
</html>