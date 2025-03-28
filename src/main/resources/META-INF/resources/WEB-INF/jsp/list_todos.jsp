<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title> ToDoList </title>
    <link href = "/webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet"> </link>
</head>
<body>
    <div class="container mt-3">
        <h1>Your Todos</h1>
        <div>
            <table class="table mt-3 w-75">
                <thead>
                    <tr>
                        <th scope = "col"> Id </th>
                        <th scope = "col"> Description </th>
                        <th scope = "col"> Target Date</th>
                        <th scope = "col"> Is Done? </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="todo" items="${todo_list}">
                        <tr>
                            <th scope = "row">${todo.id}</th>
                            <td>${todo.description} </td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.done}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div>
            <button type = "submit" class = "btn btn-outline-primary"><a href="add_todo">Add todo</a></button>
        </div>


    </div>

    <script src="/webjars/bootstrap/5.3.3/js/bootstrap.min.js"> </script>
    <script src="/webjars/jquery/3.7.1/jquery.min.js"> </script>

</body>
</html>