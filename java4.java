/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:
D = R+S   onde   R = (A+B)²
     2           s = (B+C)²*/

package primeiroProjeto;

import java.lang.Math;
import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {

        double A, B, C, D, R, S;
        Scanner recebe = new Scanner(System.in);
            System.out.println("Digite 3 valores: \n");
            A = recebe.nextInt();
            B = recebe.nextInt();
            C = recebe.nextInt();

        System.out.println(A +" "+ B+" "+ C);
        R = Math.pow(A + B, 2);
        S = Math.pow(B + C, 2);

        D = (R + S)/2;
        System.out.println("O resultado da expressão é:\n "+ D);
    }
}
