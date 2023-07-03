package classes;

import java.util.Objects;

public class Moto extends Veiculo {
    private boolean possuiPartidaEletrica;

    public Moto(String nome, boolean possuiVolante, int quantidadeDePassageiros, int quantidadeDeRodas, boolean ehDeCarga, float capacidadeDeCarga,
           Combustivel combustivel, boolean possuiPartidaEletrica) {
        super(nome,true, possuiVolante, quantidadeDePassageiros, 0,
                quantidadeDeRodas, ehDeCarga, capacidadeDeCarga, combustivel);
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public Moto() {
        super("Moto",true, false, 2, 0, 2, false,
                0,new Combustivel(true, true, true, false, false, false));
        this.possuiPartidaEletrica = true;
    }

    public boolean possuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", possuiPartidaEletrica=" + simOuNao(possuiPartidaEletrica);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (this == o) return true;
        if (!(o instanceof Moto moto)) return false;
        if (!super.equals(o)) return false;
        return possuiPartidaEletrica == moto.possuiPartidaEletrica;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), possuiPartidaEletrica);
    }
}
