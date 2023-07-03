import classes.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = popularLista();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nome;
        boolean possuiVolante;
        int quantidadeDePassageiros;
        int quantidadeDePortas;
        int quantidadeDeRodas;
        boolean ehDeCarga;
        float capacidadeDeCarga=0;
        int tipoDeCombustivel=0;

        System.out.println("Veiculos em estoque:");
        imprimirListaVeiculos(listaVeiculos);
        System.out.println("\n\n----------------------------------------------------------------------------------------------------------------------------------\n\n");



        do {
            System.out.println("MENU");
            System.out.println("1 - Inserir Carro");
            System.out.println("2 - Inserir Moto");
            System.out.println("3 - Inserir Bicicleta");
            System.out.println("4 - Inserir Charrete");
            System.out.println("5 - Inserir Caminhão");
            System.out.println("6 - Consultar Veículos");
            System.out.println("7 - Remover Veiculo por Nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    boolean possuiRadio;
                    boolean possuiArCondicionado;
                    scanner.nextLine();
                    System.out.println("nome");
                    nome = scanner.nextLine();
                    System.out.println("quantidade de passageiros:");
                    quantidadeDePassageiros = scanner.nextInt();
                    System.out.println("quantidade de portas:");
                    quantidadeDePortas = scanner.nextInt();
                    System.out.println("quantidade de rodas:");
                    quantidadeDeRodas = scanner.nextInt();
                    System.out.println("é de carga?");
                    ehDeCarga = scanner.nextBoolean();
                    System.out.println("possui ar condicionado?");
                    possuiArCondicionado = scanner.nextBoolean();
                    System.out.println("possui radio?");
                    possuiRadio = scanner.nextBoolean();

                    if (ehDeCarga){
                        System.out.println("capacidade de carga:");
                        capacidadeDeCarga = scanner.nextFloat();
                    }
                    Combustivel combustivel = criarCombustivel();
                    int op = 1;
                    while(op!=0){
                        System.out.println("""
                                Tipo de combustível:
                                1 - Gasolina
                                2 - Alcool
                                3 - Diesel
                                4 - Eletricidade
                                5 - Humano
                                6 - Animal""");
                        tipoDeCombustivel = scanner.nextInt();
                        selecionaCombustivel(tipoDeCombustivel);
                        System.out.println("""
                                Deseja adicionar outro combustível?
                                1 - Sim
                                0 - Não""");
                        op = scanner.nextInt();
                    }

                    Carro carro = criarCarro(nome,quantidadeDePassageiros,quantidadeDePortas, quantidadeDeRodas,ehDeCarga,capacidadeDeCarga,
                            combustivel, possuiArCondicionado, possuiRadio);
                    listaVeiculos.add(carro);
                    System.out.println(listaVeiculos);
                    System.out.println("Carro inserido na lista.");
                }
                case 2 -> {
                    boolean possuiPartidaEletrica;
                    scanner.nextLine();
                    System.out.println("nome");
                    nome = scanner.nextLine();
                    System.out.println("quantidade de passageiros:");
                    quantidadeDePassageiros = scanner.nextInt();
                    System.out.println("quantidade de portas:");
                    System.out.println("quantidade de rodas:");
                    quantidadeDeRodas = scanner.nextInt();
                    System.out.println("é de carga?");
                    ehDeCarga = scanner.nextBoolean();

                    if (ehDeCarga){
                        System.out.println("capacidade de carga:");
                        capacidadeDeCarga = scanner.nextFloat();
                    }
                    else capacidadeDeCarga=0;

                    System.out.println("possui partida elétrica?");
                    possuiPartidaEletrica = scanner.nextBoolean();

                    System.out.println("""
                            Tipo de combustível:
                            1 - Gasolina
                            2 - Alcool
                            3 - Diesel
                            4 - Eletricidade
                            5 - Humano
                            6 - Animal""");
                    tipoDeCombustivel = scanner.nextInt();
                    Moto moto = criarMoto(nome,quantidadeDePassageiros,quantidadeDeRodas,ehDeCarga,capacidadeDeCarga,tipoDeCombustivel,possuiPartidaEletrica);

                    listaVeiculos.add(moto);
                    System.out.println("Moto inserida na lista.");
                }
                case 3 -> {
                    boolean ehEletrica;
                    boolean possuiBagageiro;
                    scanner.nextLine();
                    System.out.println("nome");
                    nome = scanner.nextLine();
                    //scanner.nextLine();
                    System.out.println("possui motor?");
                    System.out.println("possui volante?");
                    possuiVolante = scanner.nextBoolean();
                    System.out.println("quantidade de passageiros:");
                    quantidadeDePassageiros = scanner.nextInt();
                    System.out.println("quantidade de portas:");
                    System.out.println("quantidade de rodas:");
                    quantidadeDeRodas = scanner.nextInt();
                    System.out.println("é de carga?");
                    ehDeCarga = scanner.nextBoolean();

                    if (ehDeCarga){
                        System.out.println("capacidade de carga:");
                        capacidadeDeCarga = scanner.nextFloat();
                    }
                    else capacidadeDeCarga=0;

                    System.out.println("é elétrica?");
                    ehEletrica = scanner.nextBoolean();
                    System.out.println("possui bagageiro?");
                    possuiBagageiro = scanner.nextBoolean();
                    Combustivel combustivel = selecionaCombustivel(6);
                    if (ehEletrica) tipoDeCombustivel = 4;
                    combustivel = selecionaCombustivel(tipoDeCombustivel);
                    Bicicleta bicicleta = criarBicicleta(nome, quantidadeDePassageiros, quantidadeDeRodas, ehDeCarga, capacidadeDeCarga
            , combustivel, ehEletrica, possuiBagageiro);
                    listaVeiculos.add(bicicleta);
                    System.out.println("Bicicleta inserida na lista.");
                }
                case 4 -> {
                    int quantidadeDeEixos;
                    scanner.nextLine();
                    System.out.println("nome");
                    nome = scanner.nextLine();
                    System.out.println("possui volante?");
                    possuiVolante = scanner.nextBoolean();
                    System.out.println("quantidade de passageiros:");
                    quantidadeDePassageiros = scanner.nextInt();
                    System.out.println("quantidade de portas:");
                    quantidadeDePortas = scanner.nextInt();
                    System.out.println("quantidade de rodas:");
                    quantidadeDeRodas = scanner.nextInt();
                    System.out.println("é de carga?");
                    ehDeCarga = scanner.nextBoolean();

                    if (ehDeCarga){
                        System.out.println("capacidade de carga:");
                        capacidadeDeCarga = scanner.nextFloat();
                    }
                    else capacidadeDeCarga=0;

                    System.out.println("quantidade de eixos:");
                    quantidadeDeEixos = scanner.nextInt();
                    Charrete charrete = criarCharrete(nome, possuiVolante, quantidadeDePassageiros,quantidadeDePortas, quantidadeDeRodas, ehDeCarga,
                    capacidadeDeCarga, quantidadeDeEixos);
                    listaVeiculos.add(charrete);
                    System.out.println("Charrete inserida na lista.");
                }

                case 5 -> {
                    int quantidadeDeEixos;
                    scanner.nextLine();
                    System.out.println("nome");
                    nome = scanner.nextLine();
                    //scanner.nextLine();
                    System.out.println("possui motor?");
                    System.out.println("possui volante?");
                    possuiVolante = scanner.nextBoolean();
                    System.out.println("quantidade de passageiros:");
                    quantidadeDePassageiros = scanner.nextInt();
                    System.out.println("quantidade de portas:");
                    quantidadeDePortas = scanner.nextInt();
                    System.out.println("quantidade de rodas:");
                    quantidadeDeRodas = scanner.nextInt();
                    System.out.println("é de carga?");
                    ehDeCarga = scanner.nextBoolean();

                    if (ehDeCarga){
                        System.out.println("capacidade de carga:");
                        capacidadeDeCarga = scanner.nextFloat();
                    }

                    else capacidadeDeCarga=0;

                    Combustivel combustivel = criarCombustivel();
                    int op = 1;
                    while(op!=0){
                        System.out.println("""
                                Tipo de combustível:
                                1 - Gasolina
                                2 - Alcool
                                3 - Diesel
                                4 - Eletricidade
                                5 - Humano
                                6 - Animal""");
                        tipoDeCombustivel = scanner.nextInt();
                        selecionaCombustivel(tipoDeCombustivel);
                        System.out.println("""
                                Deseja adicionar outro combustível?
                                1 - Sim
                                0 - Não""");
                        op = scanner.nextInt();
                    }

                    System.out.println("quantidade de eixos:");
                    quantidadeDeEixos = scanner.nextInt();

                    System.out.println("""
                            Tipo de combustível:
                            1 - Gasolina
                            2 - Alcool
                            3 - Diesel
                            4 - Eletricidade
                            5 - Humano
                            6 - Animal""");
                    tipoDeCombustivel = scanner.nextInt();
                    Caminhao caminhao = criarCaminhao(nome, quantidadeDePassageiros, quantidadeDePortas, quantidadeDeRodas, ehDeCarga,
                    capacidadeDeCarga, combustivel,quantidadeDeEixos);
                    listaVeiculos.add(caminhao);
                    System.out.println("Caminhão inserido na lista.");
                }
                case 6 -> imprimirListaVeiculos(listaVeiculos);
                case 7 -> removerVeiculoPorNome(listaVeiculos);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    //Funcoes auxiliares
    private static Carro criarCarro( String nome, int quantidadeDePassageiros,int quantidadeDePortas, int quantidadeDeRodas, boolean ehDeCarga,
                                    float capacidadeDeCarga, Combustivel combustivel, boolean possuiArCondicionado, boolean possuiRadio) {
        return new Carro(nome, quantidadeDePassageiros, quantidadeDePortas, quantidadeDeRodas, ehDeCarga, capacidadeDeCarga, combustivel,
        possuiArCondicionado, possuiRadio);
    }

    private static Moto criarMoto(String nome, int quantidadeDePassageiros, int quantidadeDeRodas, boolean ehDeCarga, float capacidadeDeCarga, int tipoDeCombustivel, boolean possuiPartidaEletrica) {
        Combustivel combustivel = selecionaCombustivel(tipoDeCombustivel);
        combustivel.setHumano(true);
        return new Moto(nome, false, quantidadeDePassageiros, quantidadeDeRodas, ehDeCarga, capacidadeDeCarga, combustivel, possuiPartidaEletrica);
    }

    private static Bicicleta criarBicicleta(String nome,int quantidadeDePassageiros, int quantidadeDeRodas, boolean ehDeCarga,float capacidadeDeCarga
            , Combustivel combustivel, boolean ehEletrica, boolean temBagageiro) {

        return new Bicicleta(nome, false, false, quantidadeDePassageiros, 0, quantidadeDeRodas, ehDeCarga,
        capacidadeDeCarga, combustivel, ehEletrica, temBagageiro);
    }

    private static Charrete criarCharrete(String nome, boolean possuiVolante, int quantidadeDePassageiros,
                                          int quantidadeDePortas, int quantidadeDeRodas, boolean ehDeCarga,
                                          float capacidadeDeCarga, int quantidadeDeEixos) {
        return new Charrete(nome,false, possuiVolante, quantidadeDePassageiros,
        quantidadeDePortas, quantidadeDeRodas, ehDeCarga,capacidadeDeCarga, new Combustivel(false,false,false,false,false,true), quantidadeDeEixos);
    }

    private static Caminhao criarCaminhao(String nome, int quantidadeDePassageiros, int quantidadeDePortas, int quantidadeDeRodas, boolean ehDeCarga,
                                          float capacidadeDeCarga, Combustivel combustivel, int quantidadeDeEixos) {
        return new Caminhao(nome, quantidadeDePassageiros, quantidadeDePortas, quantidadeDeRodas, ehDeCarga,capacidadeDeCarga, combustivel, quantidadeDeEixos);
    }


    public static Combustivel selecionaCombustivel(int tipoDeCombustivel){
        Combustivel combustivel = new Combustivel();
        switch (tipoDeCombustivel) {
            case 1 -> combustivel.setGasolina(true);
            case 2 -> combustivel.setAlcool(true);
            case 3 -> combustivel.setDiesel(true);
            case 4 -> combustivel.setEletricidade(true);
            case 5 -> combustivel.setHumano(true);
            case 6 -> combustivel.setAnimal(true);
        }
        return combustivel;
    }

    public static Combustivel criarCombustivel(){
        return new Combustivel(false,false,false,false,false,false);
    }

    public static List<Veiculo> popularLista(){

        List<Veiculo> listaVeiculos = new ArrayList<>();

        Carro carro1 = criarCarro("fiat Uno 2011",4,4, 4,false,0,
                selecionaCombustivel(1), true, true);
        listaVeiculos.add(carro1);

        Bicicleta bicicleta1 = criarBicicleta("Monark 2005 vermelha", 2, 2, false, 0
                , selecionaCombustivel(5), false, true);
        listaVeiculos.add(bicicleta1);

        Charrete charrete1 = criarCharrete("charrete de Roça", false, 2,0, 2, true,
                200, 2);
        listaVeiculos.add(charrete1);

        Caminhao caminhao1 = criarCaminhao("Mercedes", 4, 2, 6, true,
                2000, selecionaCombustivel(3),3);
        listaVeiculos.add(caminhao1);

        Moto moto1 = criarMoto("Honda Biz 125", 2, 2, false, 0, 1,true);
        listaVeiculos.add(moto1);

        return listaVeiculos;
    }

    private static void removerVeiculoPorNome(List<Veiculo> listaVeiculos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do veículo que deseja remover: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getNome().equalsIgnoreCase(nome)) {
                listaVeiculos.remove(veiculo);
                System.out.println("Veículo removido com sucesso.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Veículo não encontrado.");
        }
    }

    private static void imprimirListaVeiculos(List<Veiculo> listaVeiculos) {
        System.out.println("Lista de Veículos:");
        for (Veiculo veiculo : listaVeiculos) {
            System.out.println(veiculo);
        }
    }
}



