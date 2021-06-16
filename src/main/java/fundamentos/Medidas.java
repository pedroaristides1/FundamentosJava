// 1 - Pacote
package fundamentos;
// 2 - Bibliotecas
import java.util.Locale;
import java.util.Scanner;


// 3 - Classes
public class Medidas {
    // 3.1 - Atributos
        static Scanner entrada = new Scanner(System.in); //criando objeto para ler uma entrada no console

    // 3.2 - Métodos e Funções - Função tem retorno
    public static void main(String[] args) {
        String opcao = "";
        double area = 0;

        while (!opcao.toUpperCase().equals("S")) {

            System.out.println("Escolha o Calculo Desejado");
            System.out.println("(1) - Area do Quadrado");
            System.out.println("(2) - Area do Retangulo");
            System.out.println("(3) - Area do Triangulo");
            System.out.println("(4) - Area do Circulo");
            System.out.println("(5) - Area do Tabuada");
            System.out.println("(6) - Area do Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(S) - Sair");

            opcao = entrada.nextLine(); // leitura da opção


            switch (opcao) {
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
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "S":
                case "s":
                    System.out.println("Agradecemos a preferencia");
                    break;
                default:
                    System.out.println("Opção Inválida: " + opcao);
            }
            if (area > 0) {
                System.out.println("A área é de " + area + " m²");
            }
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

    public static void tabuada(){
        System.out.print("Você quer calcular a tabuada de qual numero? ");
        byte numero = entrada.nextByte();

        for (byte i=1;i<=10;i++){
            System.out.println(numero * i);
        }
    }

    public static void fibonacci(){
        System.out.print("Quantos números deseja calcular na sequencia? ");
        byte numero = entrada.nextByte();

        switch(numero){
            case 0:
                System.out.println("A sequencia está vazia.");
                break;
            case 1:
                System.out.println("Sequencia de Fibonacci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;

                System.out.print("Sequencia de Fibonacci: 1 ");
                for(byte i = 2; i <= numero; i++ ){
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;
                }

        }


    }

    public static void contagemRegressiva(){
        System.out.print("Comecar a contagem a partir de qual numero? ");
        int numero = entrada.nextInt();

        for(int i = numero; i >= 1; i--){
            System.out.println(i);
        }
    }


}