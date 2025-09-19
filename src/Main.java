import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Carro;
import modelo.Caminhao;
import modelo.Moto;
import modelo.Veiculo;
public class Main {
    public static void main(String[] args) {

        
        

        System.out.println("Bem-vindo ao sistema de gerenciamento de veículos!");
        System.out.println("Qual tipo de veículo você deseja consultar?");

        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Caminhão");

        Scanner ler = new Scanner(System.in);
        int tipoVeiculo = ler.nextInt();
        List<Veiculo> veiculos = new ArrayList<>();

        switch (tipoVeiculo) {
            case 1:
                System.out.println("Temos os Seguintes modelos:");

                    Veiculo carro = new Carro("Honda", "Civic", "Automatico");
                    veiculos.add(carro);
                    Veiculo carro1 = new Carro("Toyota", "Corolla", "Automatico");
                    veiculos.add(carro1);
                    Veiculo carro2 = new Carro("Ford", "Mustang", "Manual");
                    veiculos.add(carro2);
                    Veiculo carro3 = new Carro("Chevrolet", "Camaro", "Manual");
                    veiculos.add(carro3);
                    Veiculo carro4 = new Carro("Volkswagen", "Golf", "Automatico");
                    veiculos.add(carro4);

                    for (Veiculo v : veiculos) {
                        System.out.println(v.exibirInformacoes());
                    }
                
                break;
            case 2:
                System.out.println("Temos os Seguintes modelos:");

                    Veiculo moto = new Moto("Honda", "CB 500", true);
                    veiculos.add(moto);
                    Veiculo moto1 = new Moto("Yamaha", "MT-07", false);
                    veiculos.add(moto1);
                    Veiculo moto2 = new Moto("Kawasaki", "Ninja 400", true);
                    veiculos.add(moto2);
                    Veiculo moto3 = new Moto("Suzuki", "GSX-R600", false);
                    veiculos.add(moto3);

                    for (Veiculo v : veiculos) {
                        System.out.println(v.exibirInformacoes());
                    }

                break;
            case 3:
                System.out.println("Temos os Seguintes modelos:");

                    Veiculo caminhao = new modelo.Caminhao("Volvo", "FH16", 4);
                    veiculos.add(caminhao);
                    Veiculo caminhao1 = new modelo.Caminhao("Scania", "R500", 6);
                    veiculos.add(caminhao1);
                    Veiculo caminhao2 = new modelo.Caminhao("Mercedes-Benz", "Actros", 8);
                    veiculos.add(caminhao2);
                    Veiculo caminhao3 = new modelo.Caminhao("MAN", "TGX", 6);
                    veiculos.add(caminhao3);
                    Veiculo caminhao4 = new modelo.Caminhao("Iveco", "Stralis", 4);
                    veiculos.add(caminhao4);

                    for (Veiculo v : veiculos) {
                        System.out.println(v.exibirInformacoes());
                    }
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        ler.close();

    }


}
        
