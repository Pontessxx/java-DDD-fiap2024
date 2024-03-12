package br.com.fiap;
//RM 98036 Henrique Pontes Oliveira
//RM 99679 Gustavo Kawamura Christofani
import java.util.Scanner;
 
public class UsaGeometria {
    public static void main(String[] args) {
    	Scanner menu = new Scanner(System.in);
        System.out.print("##--------------- MENU -------------##\n\n");
        System.out.print("|-----------------------------------|\n");
        System.out.print("|                                   |\n");
        System.out.print("| Opção 1 - Calcular Area Quadrado  |\n");
        System.out.print("|                                   |\n");
        System.out.print("| Opção 2 - Calcular Area Retangulo |\n");
        System.out.print("|                                   |\n");
        System.out.print("| Opção 3 - Calcular Area Circulo   |\n");
        System.out.print("|                                   |\n");
        System.out.print("| Opção 4 - Calcular Area Triangulo |\n");
        System.out.print("|                                   |\n");
        System.out.print("|-----------------------------------|");
        System.out.print("\n|                DUPLA              |\n");
        System.out.print("|RM 98036 Henrique Pontes Oliveira  |\n"
        				+"|RM 99679 Gustavo Kawamura Christofani|\n");
        System.out.print("|-----------------------------------|\n\n");
        System.out.print("Digite uma opção: ");
        int opcao = menu.nextInt();
        
        Geometria geo = new Geometria(); // Instantiate Geometria
        
        if (opcao == 1) {
        	
            System.out.println("Digite o valor do lado: ");
            double lado = menu.nextDouble(); // Read the value for the side
            geo.calcularAreaQuadrado((float) lado);
            
            System.out.println("\n\n | --------- FIM DO CODIGO --------- | ");
        } else if (opcao == 2) {
        	
            System.out.println("Digite o valor da base: ");
            float base = menu.nextFloat();
            System.out.println("Digite o valor da altura: ");
            float altura = menu.nextFloat();
            geo.calcularAreaRetangulo(base, altura);
            
            System.out.println("\n\n | --------- FIM DO CODIGO --------- | ");
        } else if (opcao == 3) {
        	
            System.out.println("Digite o valor do raio: ");
            float raio = menu.nextFloat(); // Read the value for the radius
            geo.calcularAreaCirculo(Geometria._PI, raio); // Pass the PI value as well
            
            System.out.println("\n\n | --------- FIM DO CODIGO --------- | ");
        } else if (opcao == 4) {
        	
            System.out.println("Digite o valor da base: ");
            float base = menu.nextFloat();
            System.out.println("Digite o valor da altura: ");
            float altura = menu.nextFloat();
            geo.calcularAreaTriangulo(base, altura);
            
            System.out.println("\n\n | --------- FIM DO CODIGO --------- | ");
        } else {
            System.out.println("Opção inválida!");
            System.out.println("\n\n | --------- FIM DO CODIGO --------- | ");
        }
    }
}