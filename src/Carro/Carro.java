package Carro;

public class Carro {

    String fabricante = "Sem fabricante";
    String modelo;
    String cor = "Sem cor";
    String tipoCombustivel = "";
    int anoFabricacao = 2000;
    double valorMercado = 0;
    Proprietario dono = new Proprietario();

    //Métodos
    void ligar() { //void = não tem retorno
        if (modelo != null) {
            System.out.println("Ligando carro " + modelo);
        }
    }


}