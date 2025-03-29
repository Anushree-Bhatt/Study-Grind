<html>
<head>
    <title> study grind login page </title>
    <link href = "/webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet"> </link>
</head>
<body>
    <div class="container mt-5 w-25 border border-dark">
        <h1>Login</h1>
        <pre>${error_msg}</pre>
        <form method = "POST" class = "row g-3">
            <div class = "col-md-12">
              <label class = "form-label">Name</label>
              <input type = "text" name = "name" class = "form-control">
            </div>
            <div class = "col-md-12">
              <label class = "form-label">Password</label>
              <input type = "text" name = "user_password" class = "form-control">
            </div>
            <div class = "col-md-12">
              <button type = "submit" class = "btn btn-primary">submit</button>
            </div>
        </form>
    </div>
    <script src="/webjars/bootstrap/5.3.3/js/bootstrap.min.js"> </script>
    <script src="/webjars/jquery/3.7.1/jquery.min.js"> </script>
</body>
</html>