package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {
public static void main(String[] args) {

	Autor autor = new Autor();
	autor.setNome("Mauricio Aniche");
	
	LivroFisico fisico = new LivroFisico(autor);
	fisico.setNome("Test-Driven Development");
	fisico.setValor(59.90);
	
	Ebook ebook = new Ebook(autor);
	ebook.setNome("Test-Driven Developement");
	ebook.setValor(29.90);
	
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adiciona(fisico);
	carrinho.adiciona(ebook);
	
	Produto [] produtos=carrinho.getProdutos();
	
	/* for (int i = 0; i < produtos.length; i++) {
		 Produto produto=produtos[i];
		 if (produto!=null) {
			 System.out.println(produto.getValor());
		}}*/
		 
		for (Produto produto:produtos) {
			if (produto!=null) {
				System.out.println(produto.getValor());
			}
			
		}
	
	
		if (fisico.aplicaDescontoDe10PorCentro()){
		System.out.println("O valor agora é: "+fisico.getValor());
	}
	


	
	System.out.println("Total: "+ carrinho.getTotal());
	
}
}
