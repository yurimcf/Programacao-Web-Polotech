<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastrar Clientes</title>
</head>
<body>
<div align="center">
    <form action="register" method="post">
        <p>Nome: <input type="text" name="name" required></p>
        <p>CPF: <input type="text" name="cpf" required></p>
        <p><input type="submit" value="Registrar" ></p>
    </form>
    <a href="historico.jsp">Histórico</a>
</div>

<!--<a href="hello-servlet">Hello Servlet (Hello world)</a> -->
</body>
</html>