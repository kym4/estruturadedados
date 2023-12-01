/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;



public class atividade1 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner scanner = new Scanner(System.in);

        // Preenche o vetor com os nomes das pessoas
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
        }

        
        System.out.println("Digite um nome para buscar:");
        String nomeBuscado = scanner.nextLine();

        // Verifica se o nome buscado está presente no vetor
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBuscado)) {
                encontrado = true;
                break;
            }
        }

        // Exibe a mensagem de acordo com o resultado da busca
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
}
