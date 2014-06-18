
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
  <title>Add a new DVD</title>
</head>
<body>
<!-- todo declare a form (action and method parameter) -->
<form action="AddDVD.form" method="post">
  <table>
    <tr>
      <!-- todo for each property on the DVD (id, title, actors and releaseYear)
           add a row with a label and an input field bound to the appropriate command property
      -->
      <td>
        DVD id
      </td>
      <td>
        <spring:bind path="command.id">
          <input name="id" value="${status.value}"/>
          
        </spring:bind>
      </td>
    </tr>
    <tr>
      <td>
        Title
      </td>
      <td>
        <spring:bind path="command.title">
          <input name="title" value="${status.value}"/>
          
        </spring:bind>
      </td>
    </tr>

    <tr>
      <td>
        Actors
      </td>
      <td>
        <spring:bind path="command.actors">
          <input name="actors" value="${status.value}"/>
         
        </spring:bind>
      </td>
    </tr>


    <tr>
      <td>
        Release Year
      </td>
      <td>
        <spring:bind path="command.releaseYear">
          <input name="releaseYear" value="${status.value}"/>
          
        </spring:bind>
      </td>
    </tr>
    <tr>
      <td>
        <input type="submit"/>
      </td>
    </tr>
  </table>
</form>
</body>
</html>