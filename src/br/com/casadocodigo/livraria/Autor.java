package br.com.casadocodigo.livraria;

public class Autor {
    
    private String nome;
    private String email;
    private String cpf;
    
    public void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do autor";
        System.out.println(mensagem);
        System.out.println("");
        System.out.println("Autor: "+getNome());
        System.out.println("e-mail: "+getEmail());
        System.out.println("Cpf: "+getCpf());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
