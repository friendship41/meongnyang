<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-23
  Time: 오후 6:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script type="text/javascript">
    function goToMom() {
        alert('${message}');
        history.back();
    }
</script>
<body onload="goToMom()">
</body>
</html>