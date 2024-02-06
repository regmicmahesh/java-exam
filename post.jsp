<!-- <h1> -->
<!--   Your full name  is -->
<!--   <%= request.getParameter("firstName") %> -->
<!--   <%= request.getParameter("lastName") %> -->
<!-- </h1> -->
<!---->
<!-- <% if (false) { %> -->
<!-- <h1>hi</h1> -->
<!-- <%  } %> -->


<% 
  String username = request.getParameter("username");

  if (username != null) {
    session.setAttribute("username", username);
    response.sendRedirect("/home.jsp");
    } else {
    response.sendRedirect("/index.jsp");
    }   
%>


