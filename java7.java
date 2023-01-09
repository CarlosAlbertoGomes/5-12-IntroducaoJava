/*7.Um sistema de equações lineares do tipo:

, pode ser resolvido segundo mostrado abaixo :

 

Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/

package primeiroProjeto;

import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {

        double a, b, c, d, e, f, x, y;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor:\n");
        a = ler.nextDouble();
        System.out.println("Digite um valor:\n");
        b = ler.nextDouble();
        System.out.println("Digite um valor:\n");
        c = ler.nextDouble();
        System.out.println("Digite um valor:\n");
        d = ler.nextDouble();
        System.out.println("Digite um valor:\n");
        e = ler.nextDouble();
        System.out.println("Digite um valor:\n");
        f = ler.nextDouble();

        x = (c*e - b*f) / (a*e - b*d);
        y = (a*f - c*d) / (a*e - b*d);

        System.out.println("O valor de x é :\n" + x + " e o valor de y é :\n" + y);
    }
}
