public class Principal {

    public static void main(String[] args) {
        CalculadoraImc CalculadoraImc = new CalculadoraImc();

        Paciente joao = new Paciente();
        joao.altura = 1.82;
        joao.peso = 175;

        IndiceMassaCorporal imc = CalculadoraImc.calcular(joao);

        if (imc.estaComObesidade()) {
            System.out.printf("CalculadoraImc com altura %.2f e peso %.2f está com obesidade %n", imc.altura, imc.peso);
        }
        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
