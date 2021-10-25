package aeronave;

public class Aeronave {

    int totalAssentosNormais;
    int totalAssentosEspeciais;
    int assentosNormaisReservados;
    int assentosEspeciaisReservados;

    //Sobrecarga de métodos permite a criação de vários métodos com o mesmo nome,
    // mas com parâmetros diferentes.
    void reservarAssentos(int assentos) {
        this.assentosNormaisReservados += assentos;
    }

    void reservarAssentos(int assentosNormais, int assentosEspeciais) {
        this.assentosNormaisReservados += assentosNormais;
        this.assentosEspeciaisReservados += assentosEspeciais;
    }

    int calcularAssentosDisponiveis() {
        return totalAssentosNormais - assentosNormaisReservados
                + totalAssentosEspeciais - assentosEspeciaisReservados;
    }
}
