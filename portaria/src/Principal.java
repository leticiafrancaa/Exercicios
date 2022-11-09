public class Principal {

    public static void main(String[] args) {
        var novoVisitante = new Visitante();
        novoVisitante.nome = "Daniel";
        novoVisitante.idade = 15;

        var cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 2);

    }
}
