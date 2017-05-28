//CURSO: CIÊNCIA DA COMPUTAÇÃO
//DISCIPLINA: ESTRUTURA DE DADOS
//ALUNO: MATHEUS RODRIGUES
//Estruturas de Dados e Algoritmos Em Java Robert Lafore 

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void Menu() {
        System.out.println("MENU");
        System.out.println("0 - Sair");
        System.out.println("1 - Inserir no inicio");
        System.out.println("2 - Inserir no final");
        System.out.println("3 - Inserir ordenado");
        System.out.println("4 - Remover no inicio");
        System.out.println("5 - Remover no final");
        System.out.println("6 - Remover um dado elemento");
        System.out.println("7 - Exibir lista");
        System.out.print("Opção: ");
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Lista obj = new Lista();
        int opcao = 0;
        char dado;
        System.out.println("MATHEUS RODRIGUES FERNANDES ARCELINO");
        System.out.println("LISTA ENCADEADA");

        do {
            try {
                Menu();
                opcao = leia.nextInt();
                switch (opcao) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        System.out.print("Entre, com o dado: ");
                        dado = leia.next().charAt(0);
                        obj.inserirPrimeiro(dado);
                        break;
                    case 2:
                        System.out.print("Entre, com o dado: ");
                        dado = leia.next().charAt(0);
                        obj.inserirFinal(dado);
                        break;
                    case 3:
                        System.out.print("Entre, com o dado: ");
                        dado = leia.next().charAt(0);
                        obj.insereOrdenado(dado);
                        break;
                    case 4:
                        obj.deletaPrimeiro();
                        break;
                    case 5:
                        obj.removeFinal();
                        break;
                    case 6:
                        System.out.print("Informe o dado, que deseja remover: ");
                        dado = leia.next().charAt(0);
                        obj.delete(dado);
                        break;
                    case 7:
                        obj.exibir();
                        break;
                    default:
                        System.out.println("Opção invalida");
                }

            } catch (Exception e) {
                System.out.println("Ocoreu a seguinte exceção " + e);
            }
        } while (opcao != 0);

    }//Fim do metodo main

}//Fim da classe
