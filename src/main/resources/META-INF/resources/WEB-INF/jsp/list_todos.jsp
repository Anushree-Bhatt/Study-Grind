<%@ include file = "common/header.jspf" %>
    <%@ include file = "common/navigation.jspf" %>
    <div class = "container mt-2">
        <h1>Your Todos</h1>
        <div>
            <table class="table mt-3 w-75">
                <thead>
                    <tr>
                        <th scope = "col"> Id </th>
                        <th scope = "col"> Description </th>
                        <th scope = "col"> Target Date</th>
                        <th scope = "col"> Is Done? </th>
                        <th scope = "col"></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="todo" items="${todo_list}">
                        <tr>
                            <th scope = "row">${todo.id}</th>
                            <td>${todo.description} </td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.done}</td>
                            <td><a href = "/update_todo?id=${todo.id}" class = "btn btn-warning">UPDATE</a></td>
                            <td><a href = "/delete_todo?id=${todo.id}" class = "btn btn-warning">DELETE</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div>
            <a href="add_todo" class = "btn btn-success">ADD TODO</a>
        </div>

        <%@ include file = "common/footer.jspf" %>
    </div>
 </body>
 </html>

