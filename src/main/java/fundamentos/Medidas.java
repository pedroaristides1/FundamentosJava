// 1 - Pacote
package fundamentos;
// 2 - Bibliotecas
import java.util.Scanner;


// 3 - Classes
public class Medidas {
    // 3.1 - Atributos
        static Scanner entrada = new Scanner(System.in); //criando objeto para ler uma entrada no console

    // 3.2 - Métodos e Funções - Função tem retorno
    public static void main(String[] args) {
        String opcao;
        double area = 0;

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine(); // leitura da opção

        switch (opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            case "3":
                area = calcularAreaDoTriangulo();
                break;
            case "4":
                area = calcularAreaDoCirculo();
                break;
            default:
                System.out.println("Opção Inválida: " + opcao);
        }
        if (area > 0) {
            System.out.println("A área é de " + area + " m²");
        }
    }

    public static int calcularAreaDoQuadrado() {

        int lado; //tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado:");
        lado = entrada.nextInt(); //leitura do tamanho do lado
        return lado * lado; //retorna a área do quadrado
    }
    public static double calcularAreaDoRetangulo(){

        double base, altura;

        System.out.println("Digite o valor da base:");
        base = entrada.nextInt();
        System.out.println("Digite o valor da altura");
        altura = entrada.nextInt();

        return base * altura;
    }
    public static double calcularAreaDoTriangulo(){

        double base, altura;

        System.out.println("Digite o valor da base:");
        base = entrada.nextInt();
        System.out.println("Digite o valor da altura");
        altura = entrada.nextInt();

        return (base * altura)/2;
    }
    public static double calcularAreaDoCirculo(){

        double raio;

        System.out.println("Digite o valor do raio:");
        raio = entrada.nextDouble();

        return 3.1416 * (Math.pow(raio, 2));
    }
}