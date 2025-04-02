<html>
<head>
    <title> welcome page </title>
    <link href = "/webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet"> </link>
</head>

<body>
    <nav class = "navbar navbar-expand-md navbar-light bg-light">
                <span class = "navbar-brand ms-5 mb-0 h1">Study Grind</span>
                <div class = "collapse navbar-collapse">
                    <ul class = "navbar-nav">
                        <li class = "navbar-item"><a href = "#" class = "nav-link">Home</a></li>
                        <li class = "navbar-item"><a href = "#" class = "nav-link">Todos</a></li>
                    </ul>
                </div>
                <ul class = "navbar-nav">
                     <li class = "navbar-item me-5"><a href = "#" class = "nav-link">Logout</a></li>
                </ul>
            </nav>
    <div class = "container mt-2">
        <div>
            <h2>Welcome ${user_name}</h2>
            <a href = "list_todos">Manage</a> your todos
        </div>
    </div>

    <script src="/webjars/bootstrap/5.3.3/js/bootstrap.min.js"> </script>
    <script src="/webjars/jquery/3.7.1/jquery.min.js"> </script>
</body>
</html>