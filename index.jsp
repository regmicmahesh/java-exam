<html>
  <body>

    <%@ include file="navbar.html" %>

    <form action="/post.jsp" method="POST"> 

      Username:
      <input type="text" name="username" /> <br />
      Password:
      <input type="text" name="password" /> <br />
      <input type="submit" value="Login">

    </form>
  </body>

</html>
