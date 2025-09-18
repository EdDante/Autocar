package modelo;

public class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String marca, String modelo, boolean temPartidaEletrica) {
        super(marca, modelo);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public boolean isTemPartidaEletrica() {return temPartidaEletrica;}
    public void setTemPartidaEletrica(boolean temPartidaEletrica) { this.temPartidaEletrica = temPartidaEletrica;}


    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + ", Partida Eletrica: " + (temPartidaEletrica ? "Sim" : " Não");
    }

}
