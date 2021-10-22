package pet.shop;

public class PetShop {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Oliver";
        cachorro.raca = "Border Collie";
        cachorro.sexo = 'M';
        cachorro.idade = 1;

        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);
        System.out.println("Idade: " + cachorro.idade);
    }
}
