package padroesestruturais.composite;

public abstract class Carro {

    private String Carro;

    public Automovel(String Carro) {
        this.carro = carro;
    }

    public String getAutomovel() {
        return carro;
    }

    public void setAutomovel(String descricao) {
        this.Automovel =  carro;
    }

    public abstract String getAutomovel();
}