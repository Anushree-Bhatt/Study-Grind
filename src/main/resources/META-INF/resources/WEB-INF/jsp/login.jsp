<%@ include file = "common/header.jspf" %>
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
    <%@ include file = "common/footer.jspf" %>
</body>
</html>