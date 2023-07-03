package classes;

import java.util.Objects;

public class Veiculo {
    private String nome;
    private boolean possuiMotor;
    private boolean possuiVolante;
    private int quantidadeDePassageiros;
    private int quantidadeDePortas;
    private int quantidadeDeRodas;
    private boolean ehDeCarga;
    private float capacidadeDeCarga;
    private Combustivel combustivel;

    public Veiculo(String nome, boolean possuiMotor, boolean possuiVolante, int quantidadeDePassageiros,
                   int quantidadeDePortas, int quantidadeDeRodas, boolean ehDeCarga, float capacidadeDeCarga,
                   Combustivel combustivel) {
        this.nome = nome;
        this.possuiMotor = possuiMotor;
        this.possuiVolante = possuiVolante;
        this.quantidadeDePassageiros = quantidadeDePassageiros;
        this.quantidadeDePortas = quantidadeDePortas;
        this.quantidadeDeRodas = quantidadeDeRodas;
        this.ehDeCarga = ehDeCarga;
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.combustivel = combustivel;
    }


    // Getters e Setters

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public boolean possuiMotor() {
        return possuiMotor;
    }

    public void setPossuiMotor(boolean possuiMotor) {
        this.possuiMotor = possuiMotor;
    }

    public boolean possuiVolante() {
        return possuiVolante;
    }

    public void setPossuiVolante(boolean possuiVolante) {
        this.possuiVolante = possuiVolante;
    }

    public int getQuantidadeDePassageiros() {
        return quantidadeDePassageiros;
    }

    public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public boolean ehDeCarga() {
        return ehDeCarga;
    }

    public void setEhDeCarga(boolean ehDeCarga) {
        this.ehDeCarga = ehDeCarga;
    }

    public float getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(float capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", possuiMotor=" + possuiMotor +
                ", possuiVolante=" + possuiVolante +
                ", quantidadeDePassageiros=" + quantidadeDePassageiros +
                ", quantidadeDePortas=" + quantidadeDePortas +
                ", quantidadeDeRodas=" + quantidadeDeRodas +
                ", ehDeCarga=" + ehDeCarga +
                ", capacidadeDeCarga=" + capacidadeDeCarga +
                ", combustivel=" + combustivel +
                '}';
    }

    String simOuNao (boolean is) {
        return (!is) ? "Não" : "Sim";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo veiculo)) return false;
        return nome.equals(veiculo.nome) && possuiMotor == veiculo.possuiMotor && possuiVolante == veiculo.possuiVolante && quantidadeDePassageiros == veiculo.quantidadeDePassageiros && quantidadeDePortas == veiculo.quantidadeDePortas && quantidadeDeRodas == veiculo.quantidadeDeRodas && ehDeCarga == veiculo.ehDeCarga && Float.compare(veiculo.capacidadeDeCarga, capacidadeDeCarga) == 0 && Objects.equals(combustivel, veiculo.combustivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(possuiMotor, possuiVolante, quantidadeDePassageiros, quantidadeDePortas, quantidadeDeRodas, ehDeCarga, capacidadeDeCarga, combustivel);
    }


}


