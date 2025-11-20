<%@ page import="java.util.List" %>
<%@ page import="com.std.entity.Student" %>

<html>
<head>
    <title>All Students</title>
</head>
<body>

<h2>All Students</h2>

<table border="1" cellpadding="10">
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>City</th>
        </tr>
    </thead>
    <tbody>
        <%
            List<Student> list = (List<Student>) request.getAttribute("data"); // controller attribute
            if(list != null) {
                for(Student stu : list) {
        %>
                    <tr>
                        <td><%= stu.getId() %></td>
                        <td><%= stu.getName() %></td>
                        <td><%= stu.getCity() %></td>
                    </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="3">No students found</td>
            </tr>
        <%
            }
        %>
    </tbody>
</table>

</body>
</html>
