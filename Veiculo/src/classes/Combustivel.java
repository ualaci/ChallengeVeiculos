package classes;

import java.util.Objects;
import java.util.function.Function;

public class Combustivel {
    private boolean gasolina;
    private boolean alcool;
    private boolean diesel;
    private boolean eletricidade;
    private boolean humano;
    private boolean animal;

    public Combustivel(boolean gasolina, boolean alcool, boolean diesel, boolean eletricidade, boolean humano, boolean animal) {
        this.gasolina = gasolina;
        this.alcool = alcool;
        this.diesel = diesel;
        this.eletricidade = eletricidade;
        this.humano = humano;
        this.animal = animal;
    }

    public Combustivel() {
        this.gasolina = false;
        this.alcool = false;
        this.diesel = false;
        this.eletricidade = false;
        this.humano = false;
        this.animal = false;
    }

    // Getters e Setters

    public boolean hasGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }

    public boolean hasAlcool() {
        return alcool;
    }

    public void setAlcool(boolean alcool) {
        this.alcool = alcool;
    }

    public boolean hasDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public boolean hasEletricidade() {
        return eletricidade;
    }

    public void setEletricidade(boolean eletricidade) {
        this.eletricidade = eletricidade;
    }

    public boolean hasHumano() {
        return humano;
    }

    public void setHumano(boolean humano) {
        this.humano = humano;
    }

    public boolean hasAnimal() {
        return animal;
    }

    public void setAnimal(boolean animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        Function<Boolean, String> simOuNao = is -> (!is) ? "Não" : "Sim";
        return "Combustivel{" +
                "gasolina=" + simOuNao.apply(gasolina) +
                ", alcool=" + simOuNao.apply(alcool) +
                ", diesel=" + simOuNao.apply(diesel) +
                ", eletricidade=" + simOuNao.apply(eletricidade) +
                ", humano=" + simOuNao.apply(humano) +
                ", animal=" + simOuNao.apply(animal) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Combustivel that)) return false;
        return gasolina == that.gasolina && alcool == that.alcool && diesel == that.diesel && eletricidade == that.eletricidade && humano == that.humano && animal == that.animal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gasolina, alcool, diesel, eletricidade, humano, animal);
    }
}
