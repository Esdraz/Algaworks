package pet.shop;

public class Passeio {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Francisco";

        p1.cachorro = new Cachorro();
        p1.cachorro.nome = "Oliver";
        p1.cachorro.raca = "Border Collie";
        p1.cachorro.sexo = 'M';
        p1.cachorro.idade = 1;

        Caminhada c = new Caminhada();
        c.andar(p1);

    }

}
