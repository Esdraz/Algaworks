package carro;

public class Principal {

    public static void main(String[] args) {

        Proprietario dono1 = new Proprietario();
        dono1.nome = "Francisco Sousa";
        dono1.CPF = "050.711.533-35";
        dono1.idade = 30;
        dono1.logradouro = "Rua Severina Maria";
        dono1.bairro = "Cuia";
        dono1.cidade = "João Pessoa";

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.cor = "Preto";
        meuCarro.anoFabricacao = 2001;
        meuCarro.tipoCombustivel = "Flex";
        meuCarro.valorMercado = 11000;
        meuCarro.dono = dono1; //Atribuindo o dono do carro


        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Honda";
//        seuCarro.modelo = "Civic";
        seuCarro.cor = "Vermelho";
        seuCarro.anoFabricacao = 2019;
        seuCarro.tipoCombustivel = "Bicombustível";
        seuCarro.valorMercado = 46000;

        //Atribuindo valores as variáveis do dono do seuCarro
        seuCarro.dono = new Proprietario();
//        seuCarro.dono.nome = "Pedro";
        seuCarro.dono.CPF = "999.999.99-99";
        seuCarro.dono.idade = 22;
        seuCarro.dono.logradouro = "Rua Sem saida";
        seuCarro.dono.bairro = "Grotão";
        seuCarro.dono.cidade = "João Pessoa";

        System.out.println("Ações dos Veículos:");
        System.out.println("----------------------");

        //Chamando o método ligar
        seuCarro.ligar();
        meuCarro.ligar();

        System.out.println();
        System.out.println("----------------------");
        System.out.println("Meu Carro.Carro");
        System.out.println("----------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoFabricacao);
        System.out.println("Valor de Mercado: " + meuCarro.valorMercado);
        System.out.println("Dono: " + meuCarro.dono.nome);
        System.out.println();

        System.out.println("----------------------");
        System.out.println("Seu Carro.Carro");
        System.out.println("----------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoFabricacao);
        System.out.println("Valor de Mercado: " + seuCarro.valorMercado);
        System.out.println("Dono: " + seuCarro.dono.nome);


    }
}
