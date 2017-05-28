//CURSO: CIÊNCIA DA COMPUTAÇÃO
//DISCIPLINA: ESTRUTURA DE DADOS
//ALUNO: MATHEUS RODRIGUES
//Estruturas de Dados e Algoritmos Em Java Robert Lafore 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public class Lista {

    Link primeiro;

    public Lista() {
        primeiro = null;
    }

    public boolean ListaVazia() {

        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }// Fim do metodo.
//Este metodo insere elementos no inicio.

    public void inserirPrimeiro(char dado) {
        Link L1 = new Link(dado);
        L1.next = primeiro;
        primeiro = L1;
    }//(A).
//Este metodo insere um elemento no final da lista.

    public void inserirFinal(char dado) {
        Link fimL = primeiro;
        Link inicio = primeiro;
        if (ListaVazia()) {
            inserirFinal(dado);
        } else if (fimL == null) {

            fimL.dado = dado;
            inicio = fimL;

        } else {
            fimL.next = fimL.next;
            fimL.dado = dado;
        }
    }//(B).
//Este metodo insere elementos de forma que mantem a lista ordenada.

    public void insereOrdenado(char valor) {
        if (ListaVazia()) {
            inserirPrimeiro(valor);
        } else {

            Link aux = this.primeiro;
            while ((aux.next != null) && (aux.next.dado < valor)) {
                aux = aux.next;
                if (aux.next == null) {
                    break;
                }
            }
            Link prox = aux.next;
            aux.next = new Link(valor);
            aux = aux.next;
            aux.dado = valor;
            aux.next = prox;

        }
    }//(D).

//Este metodo eliminar o primeiro elemento da lista.
    public Link deletaPrimeiro() {
        Link referencia = primeiro;
        primeiro = primeiro.next;
        return referencia;
    }//(F).
//Este metodo eliminar um determinado elemento da lista.

    public Link delete(char dado) {
        Link current = primeiro;
        Link previous = primeiro;
        while (current.dado != dado) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == primeiro) {
            primeiro = primeiro.next;
        } else {
            previous.next = current.next;
        }

        return current;

    }//(E).
//Este metodo exibir os elementos que estão armazenado na lista.

    public void exibir() {
        Link var = primeiro;
        while (var != null) {
            var.DisplayLink();
            var = var.next;
        }
        System.out.println(" ");
    }//(C).

    public Link removeFinal() {
        Link aux = this.primeiro;
        Link fimL = primeiro;
        if (fimL != null) {
            fimL = fimL.next;
            aux.next = aux.next;
        }
        return aux;
    }//(G).

}//Fim da classe.
