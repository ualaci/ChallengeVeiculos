package classes;

import java.util.Objects;

public class Carro extends Veiculo {
    private boolean possuiArCondicionado;
    private boolean possuiRadio;

    public Carro( String nome, int quantidadeDePassageiros,
                 int quantidadeDePortas, int quantidadeDeRodas, boolean ehDeCarga,
                 float capacidadeDeCarga, Combustivel combustivel,
                 boolean possuiArCondicionado, boolean possuiRadio) {
        super(nome ,true, true, quantidadeDePassageiros, quantidadeDePortas,
                quantidadeDeRodas, ehDeCarga, capacidadeDeCarga, combustivel);
        this.possuiArCondicionado = possuiArCondicionado;
        this.possuiRadio = possuiRadio;
    }

    public Carro(){
        super("Carro",true, true, 5, 4,
                4, false, 0, new Combustivel(true, true, false, false, false, false));
    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    public void setPossuiArCondicionado(boolean possuiArCondicionado) {
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public boolean isPossuiRadio() {
        return possuiRadio;
    }

    public void setPossuiRadio(boolean possuiRadio) {
        this.possuiRadio = possuiRadio;
    }

    @Override
    public String toString() {
        return super.toString() + ", possuiArCondicionado=" + simOuNao(possuiArCondicionado) + ", possuiRadio=" + simOuNao(possuiRadio);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return possuiArCondicionado == carro.possuiArCondicionado && possuiRadio == carro.possuiRadio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(possuiArCondicionado, possuiRadio);
    }
}
