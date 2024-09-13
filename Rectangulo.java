public class Rectangulo {
        public double largo;
        public double ancho;

        // Constructor de enteros
        public Rectangulo(int largo, int ancho) {
            this.largo = largo;
            this.ancho = ancho;
        }

        // Constructor de doubles
        public Rectangulo(double largo, double ancho) {
            this.largo = largo;
            this.ancho = ancho;
        }
// Calcular el área enteros
public int calcularArea(int largo, int ancho) {
    return largo * ancho;
}

// Calcular área de doubles
public double calcularArea(double largo, double ancho) {
    return largo * ancho;
}

// Calcular perímetro de enteros
public int calcularPerimetro(int largo, int ancho) {
    return 2 * (largo + ancho);
}
// Calcular el perímetro (doubles)
public double calcularPerimetro(double largo, double ancho) {
    return 2 * (largo + ancho);
}
}

