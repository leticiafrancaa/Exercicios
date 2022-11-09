public class Principal {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Daniel Filho";
        eu.cpf = "086.128.804-16";
        eu.anoNascimento = 1990;

        Pessoa voce = new Pessoa();
        voce.nome = "Leticia França";
        voce.cpf = "111.222.333-44";
        voce.anoNascimento = 1999;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2018;
        meuCarro.fabricante = "Toyota";
        meuCarro.modelo = "Etios";
        meuCarro.cor = "Prata";
        meuCarro.precoCompra = 0;
        meuCarro.proprietario = eu;

        Carro seuCarro = new Carro();
        seuCarro.cor = "Branco";
        seuCarro.modelo = "Gol";
        seuCarro.fabricante = "Volkswagen";
        seuCarro.anoFabricacao = 2020;
        seuCarro.precoCompra = 55000;
        seuCarro.proprietario = voce;

//        double ipva = meuCarro.calcularIpva();
//        System.out.println(ipva);
        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();











//        double valorRevendaMeuCarro = meuCarro.calcularValorRevenda();
//        int tempoDeUsoMeuCarro = meuCarro.calcularTempoDeUsoEmAnos();
//
//        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
//        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);

        //seuCarro.calcularValorRevenda();
        //System.out.println(meuCarro.calcularValorRevenda());

//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Cor: %s%n", meuCarro.cor);
//        System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
//        System.out.printf("Proprietario: %s%n\n", meuCarro.proprietario.nome);
//

//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Cor: %s%n", seuCarro.cor);
//        System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
//        System.out.printf("Proprietario: %s%n", seuCarro.proprietario.nome);

    }

}
