<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-21
  Time: 오전 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script type="text/javascript">
    function goToMom() {
        alert('${message}');
        window.opener.location.href = "index.do";
        window.close();
    }
</script>
<body onload="goToMom()">
</body>
</html>
