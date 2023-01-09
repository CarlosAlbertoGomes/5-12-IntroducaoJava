/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package primeiroProjeto;

import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        ///declaração de variáveis
        int t,h,m,s;

        Scanner entrada = new Scanner(System.in); ///recuperar dados de entrada

        ///interação com o usuário
        System.out.println("Digite o tempo de duração de um evento fábrica em segundos: ");
        t = entrada.nextInt();

        h = (t/3600);
        m = ((t%3600)/60);
        s = ((t%3600)%60);

        System.out.println("Isto equivale a: " + h + " hora(s): " + m + " minuto(s): " + s + " segundo(s).");

    }
}
