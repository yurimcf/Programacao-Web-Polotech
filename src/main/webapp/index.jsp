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
        <p>CPF: <input type="text" name="cpf" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"
                       title="Digite um CPF no formato: xxx.xxx.xxx-xx" required></p>
        <p><input type="submit" value="Registrar" ></p>

    </form>
</div>

<!--<a href="hello-servlet">Hello Servlet (Hello world)</a> -->
</body>
</html>