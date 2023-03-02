package br.ada.americanas.programacaoweb;

public class Cliente {
    private String nome;
    private String cpfCli;

    public Cliente(String nome, String cpfCli){
        this.nome = nome;
        this.cpfCli = cpfCli;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(String cpfCli) {
        this.cpfCli = cpfCli;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", CPF: " + cpfCli;
    }
}
