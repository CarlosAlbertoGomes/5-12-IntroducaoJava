/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

package primeiroProjeto;

import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        ///declaração de variáveis
        int ano, mes, dia, somadias;
        Scanner entrada = new Scanner(System.in); ///recuperar dados de entrada

        ///interação com o usuário
        System.out.println("Anos de vida: ");
        ano = entrada.nextInt();

        System.out.println("Mês de nascimento: ");
        mes = entrada.nextInt();

        System.out.println("Dia de nascimento: ");
        dia = entrada.nextInt();

        somadias = (((mes*31) + dia) + (ano*365));
        System.out.println("Seus anos de vida: " + ano + "seu mês de nascimento: " + mes + "e a sua idade em dias é: " + somadias);

    }
}
