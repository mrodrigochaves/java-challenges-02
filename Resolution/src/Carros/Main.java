package Carros;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int anoVeiculo = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;

        float valorPagar = 0.0f;

        int totalSemiNovos = 0;
        int totalCarros = 0;

        Scanner leitor = new Scanner(System.in);

        char desejaRepetir = 's';

        while(desejaRepetir == 's') {

            System.out.println("Digite o ano de fabricação do veículo: ");
            anoVeiculo = leitor.nextInt();

            System.out.println("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();

            if (anoVeiculo <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalSemiNovos++;
            }

            totalCarros++;

            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPagar = valorVeiculo - valorDesconto;

            System.out.println("Valor do desconto: " + valorDesconto);
            System.out.println("Valor do veículo: " + valorPagar);

            System.out.println("Deseja cadastrar mais? S = sim / N = não ");
            desejaRepetir = leitor.next().charAt(0);
        }

        System.out.println("Total de seminovos: " + totalSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }
}
