public class TesteInicializacao {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        meuCarro.fabricante = "Toyota";
        meuCarro.anoFabricacao = 2018;
        meuCarro.proprietario.nome = "Daniel";

        Pessoa proprietarioAntigo = meuCarro.proprietario;
        meuCarro.proprietario = new Pessoa();


        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFabricacao);
        System.out.println(meuCarro.proprietario.nome);
    }
}
