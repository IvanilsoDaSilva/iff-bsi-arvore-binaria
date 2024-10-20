package br.com.arvorebinaria;

class ArvoreBinaria {
    No raiz;

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.esquerda = inserirRecursivo(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = inserirRecursivo(raiz.direita, valor);
        }

        return raiz;
    }

    public void percursoEmOrdem(No raiz) {
        if (raiz != null) {
            percursoEmOrdem(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            percursoEmOrdem(raiz.direita);
        }
    }
}
