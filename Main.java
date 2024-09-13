import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enteros
        System.out.println("Ingrese el largo del rectangulo en enteros: ");
        int largo = scanner.nextInt();
        System.out.println("Ingrese el ancho del rectangulo  en enteros: ");
        int ancho = scanner.nextInt();
        if(largo > ancho) {
            System.out.println("El lado largo es: " + largo);
            System.out.println("El lado ancho es: " + ancho);
        } else if(ancho > largo) {
                System.out.println("los datos no son validos :( ");
        }
        System.out.println("Área (int): " + largo*ancho);
        System.out.println("Perímetro (int): " + 2*(largo+ancho));

        // Doubles
        System.out.println("Ingrese el largo del rectangulo con decimales: ");
        double larg = scanner.nextDouble();
        System.out.println("Ingrese el ancho del rectangulo  con decimales: ");
        double anch = scanner.nextDouble();
        if(larg > anch) {
            System.out.println("El lado largo es: " + larg);
            System.out.println("El lado ancho es: " + anch);
        } else if(anch > larg) {
            System.out.println("los datos no son validos :( ");
        }
        System.out.println("Área (Double): " + larg*anch);
        System.out.println("Perímetro (Double): " + 2*(larg+anch));
    }
}
