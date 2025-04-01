<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title> welcome page </title>
    <link href = "/webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet"> </link>
    <link href = "/webjars/bootstrap-datetimepicker/2.4.4/css/bootstrap-datetimepicker.min.css" rel = "stylesheet"> </link>
</head>
<body>
    <div class="container mt-3">
        <form:form method = "POST" modelAttribute = "todo">
            <div class = "row mt-2">
                <div class = "col-md-2">
                       <form:label path = "description" cssClass ="form-label">description</form:label>
                </div>
                <div class = "col-md-4">
                       <form:input type = "text" path = "description" cssClass = "form-control" />
                </div>
                <div class = "col-md-4">
                    <form:errors path = "description" cssClass = "text-warning" />
                </div>
            </div>

            <div class = "row mt-2">
                 <div class = "col-md-2">
                     <form:label path = "targetDate" cssClass ="form-label">target date</form:label>
                 </div>
                 <div class = "col-md-4">
                     <form:input type = "text" path = "targetDate" cssClass = "form-control" />
                 </div>
                 <div class = "col-md-4">
                      <form:errors path = "targetDate" cssClass = "text-warning" />
                 </div>
            </div>

            <form:input type = "hidden" path = "id" />
            <form:input type = "hidden" path = "username" />
            <form:input type = "hidden" path = "done" />

            <div class = "row mt-2">
                <form:button type = "submit" cssClass = "col-md-4 btn btn-primary">submit</form:button>
            </div>
        </form:form>

    </div>

    <script src = "/webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
    <script src = "/webjars/jquery/3.7.1/jquery.min.js"></script>
    <script src = "/webjars/bootstrap-datetimepicker/2.4.4/js/bootstrap-datetimepicker.min.js"></script>

    <script type="text/javascript">
    	$('#targetDate').datetimepicker({
    	    format: 'dd-mm-yyyy',
    	    autoclose: true
    	});
    </script>

</body>
</html>



