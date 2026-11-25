public class main {
    public static void main(String[] args) {
        CalculadoraPrecios calculadora = new CalculadoraPrecios(new DescuentoLealtad());
        calculadora.calcular(60000);
        calculadora.setPolitica(new DescuentoEstacional()); calculadora.calcular(60000);
        calculadora.setPolitica(new DescuentoVolumen()); calculadora.calcular(60000);
    }
}
