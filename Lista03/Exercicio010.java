package Lista03;

public class Exercicio010 {
	
	 public double calcularHipotenusa(double cateto1, double cateto2) {
	        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	    }

	    public static void main(String[] args) {
	        CalculadoraTriangulo calculadora = new CalculadoraTriangulo();
	        double hipotenusa = calculadora.calcularHipotenusa(3.0, 4.0);
	        System.out.println("A hipotenusa do triângulo é: " + hipotenusa);
	    }

}
