
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
  <title>DVD Listing</title>
</head>
<body>

<p>Below is a list of the DVDs in the system</p>

<table>
  <tbody>
    <!-- todo iterate though the model element (catalog) using the forEach JSTL tag -->
    <c:forEach items="${catalog}" var="dvdinfo">
      <tr>
        <td>
          <!-- todo for each dvdinfo add a link to details.view?dvdID= with the value of the id, and display the title. -->
          <a href="details.view?dvdID=${dvdinfo.id}">${dvdinfo.title}</a>
        </td>
      </tr>
    </c:forEach>
  </tbody>
</table>

</body>
</html>