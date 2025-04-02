<%@ include file = "common/header.jspf" %>
   <%@ include file = "common/navigation.jspf" %>
    <div class = "container mt-2">
        <div>
            <h2>Welcome ${user_name}</h2>
            <a href = "list_todos">Manage</a> your todos
        </div>
    </div>

<%@ include file = "common/footer.jspf" %>

</body>
</html>