import modelo.Moto;
import modelo.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // Veiculo carro = new Carro("Toyota", "Corolla", 4);
        Veiculo moto = new Moto("Honda", "CB 500", true);

        List<Veiculo> veiculos = new ArrayList<>();
       // veiculos.add(carro);
       veiculos.add(moto);

        for (Veiculo v : veiculos) {
            System.out.println(v.exibirInformacoes());
        }
    }
}