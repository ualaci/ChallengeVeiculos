package classes;

import java.util.Objects;

public class Caminhao extends Veiculo {
    private int quantidadeDeEixos;

    public Caminhao(String nome, int quantidadeDePassageiros, int quantidadeDePortas, int quantidadeDeRodas, boolean ehDeCarga,
                    float capacidadeDeCarga, Combustivel combustivel, int quantidadeDeEixos) {
        super(nome,true, true, quantidadeDePassageiros, quantidadeDePortas,
                quantidadeDeRodas, ehDeCarga, capacidadeDeCarga, combustivel);
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    public Caminhao() {
        super("Caminhão",true, true, 2, 2, 4, true,
                10000,new Combustivel(true, true, true, false, false, false));
        this.quantidadeDeEixos = 3;
    }


    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    public void setQuantidadeDeEixos(int quantidadeDeEixos) {
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (this == o) return true;
        if (!(o instanceof Caminhao caminhao)) return false;
        if (!super.equals(o)) return false;
        return quantidadeDeEixos == caminhao.quantidadeDeEixos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantidadeDeEixos);
    }

    @Override
    public String toString() {
        return super.toString() + ", quantidadeDeEixos=" + quantidadeDeEixos;
    }
}
