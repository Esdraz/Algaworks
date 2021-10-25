package aeronave;

public class Principal {

    public static void main(String[] args) {

        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentosNormais = 100;
        aviaoGol.totalAssentosEspeciais = 0;

        Aeronave aviaoTam = new Aeronave();
        aviaoTam.totalAssentosNormais = 130;
        aviaoTam.totalAssentosEspeciais = 15;

        aviaoGol.reservarAssentos(50);
        aviaoTam.reservarAssentos(5, 10);

        int assentosGol = aviaoGol.calcularAssentosDisponiveis();
        int assentosTam = aviaoTam.calcularAssentosDisponiveis();

        System.out.println("Assentos disponíveis GOL: " + assentosGol);
        System.out.println("Assentos disponíveis TAM: " + assentosTam);
    }
}
