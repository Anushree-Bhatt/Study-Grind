<html>
<head>
    <title> study grind login page </title>
    <link href = "/webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet"> </link>
</head>
<body>
    <div class="container">
        Welcome to Login page
        <pre>${error_msg}</pre>
        <form method = "POST">
            <div> name = <input type = "text" name = "name"> </div>
            <div> password = <input type = "password" name = "user_password"> </div>
            <div> <input type = "submit" value = "submit"> </div>
        </form>
    </div>
    <script src="/webjars/bootstrap/5.3.3/js/bootstrap.min.js"> </script>
    <script src="/webjars/jquery/3.7.1/jquery.min.js"> </script>
</body>
</html>