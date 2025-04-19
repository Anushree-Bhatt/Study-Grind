<%@ include file = "common/header.jspf" %>
    <%@ include file = "common/navigation.jspf" %>
       <div class = "container mt-2">
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

            <div class = "row mt-2">
                <div class = "col-md-6 border border-dark text-center text-bg-success p-1">
                    <button type = "submit" class = "btn btn-default">submit</button>
                </div>
            </div>
        </form:form>

    </div>

    <%@ include file = "common/footer.jspf" %>

    <script type="text/javascript">
    	$('#targetDate').datetimepicker({
    	    format: 'dd-mm-yyyy',
    	    autoclose: true
    	});
    </script>

    </body>
</html>



