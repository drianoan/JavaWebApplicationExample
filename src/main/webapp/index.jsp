<%@ page language='java' contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Ejemplo JSP desde Servlet</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Oswald">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open Sans">
    <style>
        h1,
        h2,
        h3,
        h4,
        h5,
        h6 {
            font-family: "Oswald"
        }

        body {
            font-family: "Open Sans"
        }
    </style>
</head>

<body>
    <h1>Actividad 2 Servlet</h1>
    <p>Este es un ejemplo en el curso de Java para generar HTML desde un Servlet con JSP</p>

    <p>Formulario para enviar información al siguiente servlet</p>
    <form action="/myServlet2">
        <label for="fname">Nombre:</label><br>
        <input type="text" id="fname" name="fname" value="Pepe"><br>
        <label for="lname">Apellido:</label><br>
        <input type="text" id="lname" name="lname" value="Perez"><br><br>
        <input type="submit" value="Submit">
    </form>

</body>

</html>