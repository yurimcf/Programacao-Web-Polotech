package br.ada.americanas.programacaoweb;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String cpfCli = request.getParameter("cpf");

        Cliente cliente = new Cliente(name,cpfCli);

        var clientes = recuperaCliente(request); // pegando uma List
        clientes.add(cliente);
        request.setAttribute("name", name);
        request.setAttribute("cpf", cpfCli);
        request.getSession().setAttribute("historico_cadastro", clientes);
//        request.getRequestDispatcher("/historico.jsp").forward(request, response);
        request.getRequestDispatcher("/resultCadastro.jsp").forward(request, response);
    }

    private List<Cliente> recuperaCliente(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        List<Cliente> clientes = (List<Cliente>) session.getAttribute("historico_cadastro");
        if (clientes == null) {
            clientes = new ArrayList<>();
            session.setAttribute("historico_cadastro", clientes);
        }
        return clientes;
    }
}
