<%@ page language='java' contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <title>Ejemplo JSP desde Servlet</title>
    <html>

    <head>
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
    <h1>Bienvenido <%= request.getParameter("fname") + " " + request.getParameter("lname")%>!!</h1>
    Esta es nuestra segunda actividad
</body>

</html>