public class Triangulo {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Método para calcular el área
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // Método para dibujar el triángulo (simple texto)
    public void dibujar() {
        System.out.println("Dibujo del triángulo:");
        System.out.println("   /|");
        System.out.println("  / |");
        System.out.println(" /  |");
        System.out.println("/___|");
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5, 10, 5, 6, 7);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        triangulo.dibujar();
    }
}
