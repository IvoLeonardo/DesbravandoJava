package br.com.casadocodigo.livraria.teste;


public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        
        /*
        double soma = 0;
        int contador = 0;
        while(contador < 35){
            double livro = 59.90;
            soma += livro;
            contador ++;
        }*/
                
        double soma = 0;
        double livros = 59.90;
        
        for(int contador = 0; contador < 35; contador ++){
            soma += livros;
        }
        
        System.out.println("O total do estoque está no valor de R$ "+soma);
        
        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if(soma > 2000){
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom!");
        }
    }
    
}
