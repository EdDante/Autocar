package modelo;

public class Carro extends Veiculo {
    private String cambio;

    public Carro(String marca, String modelo, String cambio) {
        super(marca, modelo);
        this.cambio = cambio;
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + ", Tipo de Cambio: " + cambio;
    }
}