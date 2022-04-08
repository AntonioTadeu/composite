package padroesestruturais.composite;

public class Carro {

    private Conteudo Motor;

    public void setCarro(Conteudo Motor) {
        this.Motor = Motor;
    }

    public String getMotor() {
        if (this.Motor == null) {
            throw new NullPointerException("Carro sem motor");
        }
        return this.Motor.getCarro();
    }
}
