public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double adicionalFilhos;

    double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + adicionalFilhos;

    }
    void imprimir() {
        System.out.println("Holerite");
        System.out.println("--------------");
        System.out.printf("Nome do Funcionário: %s%n", funcionario.nome);
        System.out.printf("Valor das Horas Normais: %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor das Horas Extras: %.2f%n", valorTotalHorasExtras);
        System.out.printf("Adicional para filhos: %.2f%n", adicionalFilhos);
        System.out.printf("Valor total: %.2f%n", calcularValorTotal());

    }
}
