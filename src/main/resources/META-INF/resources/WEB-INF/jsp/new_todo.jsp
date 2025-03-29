<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title> welcome page </title>
    <link href = "/webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet"> </link>
</head>
<body>
    <div class="container mt-3">
        <form method = "POST">
            <div class = "row mt-2">
                <div class = "col-md-2">
                       <label for = "description" class ="col-md-2 form-label">description</label>
                </div>
                <div class = "col-md-4">
                       <input type = "text" name = "description" class = "col-md-2 form-control">
                </div>
            </div>
            <div class = "row mt-2">
                <div class = "col-md-2">
                    <label for = "targetDate" class = "form-label">target date</label>
                </div>
                <div class = "col-md-4">
                    <input type = "text" name = "targetDate" class = "form-control">
                </div>
            </div>
            <div class = "row mt-2">
                <div class = "col-md-2">
                    <label class = "form-label">is done?</label>
                </div>
                <div class = "col-md-4">
                    <label>yes</label>
                    <input type = "checkbox" class = "form-check-input" name = "yes" >
                    <label>no</label>
                    <input type = "checkbox" class = "form-check-input" name = "no" >
                </div>
            </div>

            <div class = "row">
                <button type = "submit" class = "col-md-6 btn btn-primary">submit</button>
            </div>
        </form>

    </div>

    <script src="/webjars/bootstrap/5.3.3/js/bootstrap.min.js"> </script>
    <script src="/webjars/jquery/3.7.1/jquery.min.js"> </script>

</body>
</html>
