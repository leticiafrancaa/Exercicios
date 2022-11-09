public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Daniel Filho";
        funcionario.filhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 51.8;
        contratoTrabalho.valorHoraExtra = 60.5;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(160, 10, contratoTrabalho);
        holerite.imprimir();

        }
}
