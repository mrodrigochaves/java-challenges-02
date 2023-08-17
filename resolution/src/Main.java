
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int anoVeiculo = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;

        Scanner leitor = new Scanner(System.in);

        boolean desejaRepetir = true;

        while (desejaRepetir == true) {
            System.out.println("Digite o ano de fabricação do veículo: ");
            anoVeiculo = leitor.nextInt();

            System.out.println("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();

            if (anoVeiculo <= 2000) {
                porcentagemDesconto = 0.012f;
            } else {
                porcentagemDesconto = 0.007f;
            }

            valorDesconto = valorVeiculo * porcentagemDesconto;

            System.out.println("Deseja cadastrar mais? S = sim / N = não ");
        }
    }
}
