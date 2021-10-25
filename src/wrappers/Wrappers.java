package wrappers;

public class Wrappers {

    public static void main(String[] args) {

        Integer idade = new Integer(31);
        byte idadeByte = idade.byteValue();
        short idadeShort = idade.shortValue();
        double idadeDouble = idade.doubleValue();

        System.out.println(idade);
        System.out.println(idadeDouble);

        Float precoProduto = new Float(45.25f);
        // converte para short e trunca o valor
        short precoShort = precoProduto.shortValue();

        System.out.println(precoProduto);
        System.out.println(precoShort);

        System.out.println("------------------------");
        System.out.println("------------------------");

        //converter Strings em tipos primitivos
        String numero = "40";
        String valor = "12.34";
        double precoProduto1 = Double.parseDouble(valor);
        int idade1 = Integer.parseInt(numero);

        System.out.println(numero);
        System.out.println(idade1);
        System.out.println(valor);
        System.out.println(precoProduto1);
    }
}
