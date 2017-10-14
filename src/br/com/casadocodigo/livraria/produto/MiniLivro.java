package br.com.casadocodigo.livraria.produto;

import br.com.casadocodigo.livraria.Autor;

public class MiniLivro extends Livro {
    
    public MiniLivro(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDesconto(double porcentagem) {
        return false;
    }
}
