package br.com.arvorebinaria;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        
        // Inserindo valores na árvore
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(7);

        System.out.println("Percurso em ordem da árvore binária:");
        arvore.percursoEmOrdem(arvore.raiz);
    }
}
