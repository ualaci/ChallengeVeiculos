package classes;

import java.util.Objects;

public class Bicicleta extends Veiculo {
    private boolean ehEletrica;
    private boolean temBagageiro;

    public Bicicleta(String nome, boolean possuiMotor, boolean possuiVolante, int quantidadeDePassageiros,
                     int quantidadeDePortas, int quantidadeDeRodas, boolean ehDeCarga,
                     float capacidadeDeCarga, Combustivel combustivel,
                     boolean ehEletrica, boolean temBagageiro) {
        super(nome, possuiMotor, false, quantidadeDePassageiros, 0,
                quantidadeDeRodas, ehDeCarga, capacidadeDeCarga, combustivel);
        this.ehEletrica = ehEletrica;
        this.temBagageiro = temBagageiro;
    }

    public Bicicleta() {
        super("Bicicleta",false, false, 1, 0, 2, false, 0
                , new Combustivel(false, false, false, false, true, false));
    }


    public boolean isEhEletrica() {
        return ehEletrica;
    }

    public void setEhEletrica(boolean ehEletrica) {
        this.ehEletrica = ehEletrica;
    }

    public boolean isTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }


    @Override
    public String toString() {
        return super.toString() + ", ehEletrica=" + simOuNao(ehEletrica) + ", temBagageiro=" + simOuNao(temBagageiro);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (this == o) return true;
        if (!(o instanceof Bicicleta bicicleta)) return false;
        if (!super.equals(o)) return false;
        return ehEletrica == bicicleta.ehEletrica && temBagageiro == bicicleta.temBagageiro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ehEletrica, temBagageiro);
    }
}
