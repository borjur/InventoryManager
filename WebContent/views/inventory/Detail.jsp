
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>DVD Info</title></head>
  <body>
  <p> Information on DVD with id <!-- todo print the id here (using EL) --> ${dvd.id}</p>

    <table>
      <tbody>
        <!-- todo for each property (title,releaseYear, actors) display the value in a row (Using EL)-->
        <tr>
          <td>
            Title
          </td>
          <td>
            ${dvd.title}
          </td>
        </tr>
        <tr>
          <td>
            Released
          </td>
          <td>
            ${dvd.releaseYear}
          </td>
        </tr>
        <tr>
          <td>
            Actors
          </td>
          <td>
            ${dvd.actors}
          </td>
        </tr>
      </tbody>
    </table>



  </body>
</html>