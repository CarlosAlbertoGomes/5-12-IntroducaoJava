/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

package primeiroProjeto;

import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {

        double n1, n2, n3, media;
        Scanner recebe = new Scanner(System.in);
            System.out.println("Informe as 3 notas do aluno:\n");
            n1 = recebe.nextDouble();
            n2 = recebe.nextDouble();
            n3 = recebe.nextDouble();

        media = ((n1*2)+(n2*3)+(n3*5))/ (2 + 3 + 5);

        System.out.println("A média final é:\n"+ media);

        /// resultado errado

    }
}
