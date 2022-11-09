public class Principal {

    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Zelda";
        meuCachorro.idade = 10;
        meuCachorro.raca = "Rottweiller";
        meuCachorro.sexo = "Femea";

        Cachorro seuCachorro = new Cachorro();
        seuCachorro.nome = "Duron";
        seuCachorro.idade = 4;
        seuCachorro.raca = "Rotweiller";
        seuCachorro.sexo = "Macho";

        System.out.printf("Nome: %s%n", meuCachorro.nome);
        System.out.printf("Idade: %d%n", meuCachorro.idade);
        System.out.printf("Raça: %s%n", meuCachorro.raca);
        System.out.printf("Sexo: %s%n", meuCachorro.sexo);
        System.out.println("");
        System.out.printf("Nome: %s%n", seuCachorro.nome);
        System.out.printf("Idade: %d%n", seuCachorro.idade);
        System.out.printf("Raça: %s%n", seuCachorro.raca);
        System.out.printf("Sexo: %s%n", seuCachorro.sexo);

    }
}
