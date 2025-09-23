package modelo;

public class Caminhao extends Veiculo {
    private int numEixos;

    public Caminhao(String marca, String modelo, int numEixos, Seguro seguro) {
        super(marca, modelo);
        this.numEixos = numEixos;
    }



    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + ", Número de Eixos: " + numEixos;
    }

}
