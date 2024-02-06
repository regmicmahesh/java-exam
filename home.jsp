<%
String username = (String) session.getAttribute("username");
if (username == null) {
  response.sendRedirect("/index.jsp");
  return;
}
%>

<h1>
You are logged in as <%= username %> 
</h1>

<a href="/logout.jsp">Logout</a>
