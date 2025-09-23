package modelo;

public class Seguro {
    private boolean possuiSeguro;

    public Seguro(boolean possuiSeguro) {
        this.possuiSeguro = possuiSeguro;
    }

    public boolean isPossuiSeguro() {
        return possuiSeguro;
    }

    public void setPossuiSeguro(boolean possuiSeguro) {
        this.possuiSeguro = possuiSeguro;
    }

    @Override
    public String toString() {
        return possuiSeguro ? "Possui seguro" : "Não possui seguro";
    }
}