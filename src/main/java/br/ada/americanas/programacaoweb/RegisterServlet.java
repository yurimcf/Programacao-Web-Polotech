package br.ada.americanas.programacaoweb;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    // nome do cliente + foi cadastrado com sucesso
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String cpfCli = request.getParameter("cpf");

        PrintWriter writer = response.getWriter();
        writer.printf("<html> <body> Cliente nome: %s " + "<br/>" +
                "CPF: %s, foi cadastrado com sucesso </body> </html>%n", name, cpfCli);
    }
}
