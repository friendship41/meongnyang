<%--
  Created by IntelliJ IDEA.
  User: stage
  Date: 2020-02-19
  Time: 오전 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    function visitChartAjax() {
        var date1 = $("#뭔가아이디1").val();
        var date2 = $("#뭔가아이디2").val();
        var ajaxUrl = "/ajax매핑.ado?startDate="+date1+"&endDate="+date2;
        $.ajax({
            url: ajaxUrl,
            type: "GET",
            data: {},
            dataType: "json"
        })
            .done(function(json) {
                console.log(json);
                new Chart("~~~")
            })
            .fail(function (xhr, status, errorThrown) {
                alert(errorThrown);
            });
    }


</script>
</body>

</html>
