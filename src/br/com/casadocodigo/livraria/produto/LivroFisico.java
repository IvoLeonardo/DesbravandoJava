package br.com.casadocodigo.livraria.produto;

import br.com.casadocodigo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {
    
    
    public LivroFisico(Autor autor){
        super(autor);
    }
    
    @Override
    public boolean aplicaDesconto(double porcentagem){
        if(porcentagem > 0.30){
            return false;
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        System.out.println("aplicando desconto no livro impresso");
        return true;
    }
    public double taxaDeImpressao(){
        return this.getValor() * 0.05;
    }
    
}
