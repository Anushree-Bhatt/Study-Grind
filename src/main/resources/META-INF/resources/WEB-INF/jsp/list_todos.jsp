<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head> <title> welcome page </title> </head>
<body>
    <h2> Welcome ${user_name} </h2>
    <hr>
    <div>
        <h1>Study Grind, your courses is here</h3>
        <table border = "1">
            <thead>
                <th> Id </th>
                <th> Username </th>
                <th> Description </th>
                <th> Target Date</th>
                <th> Is Done? </th>
            </thead>
            <tbody>
                <c:forEach var="todo" items="${todo_list}">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.username} </td>
                        <td>${todo.description} </td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

</body>
</html>