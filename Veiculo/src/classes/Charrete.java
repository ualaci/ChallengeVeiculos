package classes;

import java.util.Objects;

public class Charrete extends Veiculo {
    private int quantidadeDeEixos;

    public Charrete(String nome,boolean possuiMotor, boolean possuiVolante, int quantidadeDePassageiros,
                    int quantidadeDePortas, int quantidadeDeRodas, boolean ehDeCarga,
                    float capacidadeDeCarga, Combustivel combustivel,
                    int quantidadeDeEixos) {
        super(nome,false, possuiVolante, quantidadeDePassageiros, quantidadeDePortas,
                quantidadeDeRodas, ehDeCarga, capacidadeDeCarga, new Combustivel(false, false, false, false, false, true));
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    public Charrete(){
        super("Charrete",false, false, 2, 0, 4, false,
                0,new Combustivel(false, false, false, false, false, true));
        this.quantidadeDeEixos = 2;
    }

    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    public void setQuantidadeDeEixos(int quantidadeDeEixos) {
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    // Método toString para exibir informações sobre a charrete
    @Override
    public String toString() {
        return super.toString() + ", quantidadeDeEixos=" + quantidadeDeEixos;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (this == o) return true;
        if (!(o instanceof Charrete charrete)) return false;
        if (!super.equals(o)) return false;
        return quantidadeDeEixos == charrete.quantidadeDeEixos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantidadeDeEixos);
    }
}
