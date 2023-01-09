/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

package primeiroProjeto;

import java.util.Scanner;

public class java8 {
    public static void main(String[] args) {

        double custoFabricacao, percentagemDistribuidor, percentagemImpostos, custoConsumidor;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor de custo de fábrica: \n");
        custoFabricacao = ler.nextDouble();

        percentagemDistribuidor = 0.28;
        percentagemImpostos = 0.45;

        custoConsumidor = custoFabricacao + (custoFabricacao * percentagemDistribuidor) + (custoFabricacao * percentagemImpostos);

        System.out.println("O custo do consumidor é :\n" + custoConsumidor);
    }
}
