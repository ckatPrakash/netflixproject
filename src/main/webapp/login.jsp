<html>
<head>
    <title>Netflix Login</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <div class="login-container">
        <h1>Netflix Login</h1>
        <form action="LoginServlet" method="post">
            <label for="username">Email/Username:</label>
            <input type="text" id="username" name="username" required>
            <br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <br>
            <input type="checkbox" id="remember" name="remember">
            <label for="remember">Remember Me</label>
            <br>
            <button type="submit">Sign In</button>
        </form>
        <a href="#">Need help?</a>
    </div>
</body>
</html>