import java.util.Locale;
import java.util.Scanner;

public class App {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); 
    
            Double valorUm;
            Double valorDois;
            String operacao;
            boolean continuar;
        
            do {
                System.out.println("Escolha uma operacao: ");
                System.out.println("1. Soma (+)");
                System.out.println("2. Subtracao (-)");
                System.out.println("3. Multiplicacao (*)");
                System.out.println("4. Divisao (/)");
                System.out.println("5. Fatorial (fatorial)");
                operacao = scanner.next();  // lê a operação escolhida pelo usuário
                
                if (operacao.equalsIgnoreCase("fatorial")) {
                    System.out.println("Digite o valor para calcular o fatorial: ");
                    valorUm = scanner.nextDouble();  // lê o valor para o fatorial
                    System.out.println("Resultado do fatorial: " + calcularFatorial(valorUm));
                } else {
                    System.out.println("Digite o valor um ");
                    valorUm = scanner.nextDouble();  // lê o primeiro valor
    
                    System.out.println("Digite o valor dois: ");
                    valorDois = scanner.nextDouble();  // lê o segundo valor
                    
                    System.out.println("Resultado: " + realizarCalculo(valorUm, valorDois, operacao));
                }
                
                continuar = verificarNovaOperacao();  // pergunta ao usuário se deseja continuar
            } while (continuar);  // enquanto continuar for verdadeiro, o loop vai se repetir
        }
    
        // Método para verificar se o usuário deseja realizar uma nova operação
        public static boolean verificarNovaOperacao(){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Deseja realizar uma nova operacao? S ou N");
            return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
        }
    
        // Método para realizar o cálculo de soma, subtração, multiplicação ou divisão
        public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao){
            Double respostaCalculo = 0.0;
            
            switch (operacao){
                case "+":
                    respostaCalculo = valorUm + valorDois;  // soma
                    break;
                    
                case "-":
                    respostaCalculo = valorUm - valorDois;  // subtração
                    break;
                
                case "*":
                    respostaCalculo = valorUm * valorDois;  // multiplicação
                    break;
                
                case "/":
                    if (valorDois != 0) {  // verifica divisão por zero
                        respostaCalculo = valorUm / valorDois;  // divisão
                    } else {
                        System.out.println("Erro: divisao por zero nao permitida.");
                        return null;  // retorna null se divisão por zero
                    }
                    break;
                    
                default:
                    System.out.println("Digite uma operacao valida! (+, -, /, *)");
            }
            
            return respostaCalculo;  // retorna o resultado do cálculo
        }
    
        // Método para calcular o fatorial de um número
        public static Double calcularFatorial(Double numero) {
            if (numero < 0) {
                System.out.println("Erro: não é possível calcular o fatorial de um número negativo.");
                return null;
            }
            
            long fatorial = 1;  // inicializa o fatorial com 1
            
            // Calcula o fatorial multiplicando os números de 1 até o número
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;  // fatorial = fatorial * i
            }
            
            return (double) fatorial;  // retorna o fatorial como Double
        }
        
        // ================== CONEXÃO COM P.O.O. ==================
        // 1. Classe:
        // - A classe Main é a base do nosso programa. Em P.O.O., uma classe é um modelo
        //   para criar objetos, contendo atributos (dados) e métodos (ações).
        
        // 2. Objetos:
        // - O Scanner é um exemplo de objeto. A classe Scanner foi instanciada para permitir
        //   que o programa leia a entrada do usuário.
        
        // 3. Métodos:
        // - Os métodos 'verificarNovaOperacao', 'realizarCalculo' e 'calcularFatorial' são exemplos de
        //   métodos em P.O.O. Eles definem comportamentos que os objetos da classe podem realizar.
        // - O método 'main' é um método especial, pois é o ponto de entrada do programa.
        
        // 4. Encapsulamento:
        // - Embora este exemplo não tenha atributos privados ou métodos públicos, o uso de métodos para
        //   realizar ações (como o cálculo) já é uma forma simples de encapsulamento.
        // - O objetivo do encapsulamento é esconder a implementação de detalhes e tornar a interação com
        //   o objeto mais simples e segura.
        
        // 5. Interação entre objetos:
        // - O objeto 'scanner' interage com o usuário para coletar dados de entrada. A interação
        //   é um comportamento do objeto baseado nos métodos definidos na classe Scanner.
        // - O objeto 'scanner' foi criado dentro do método main para lidar com entradas do usuário,
        //   tornando o código modular e reutilizável.
        // ============================================================
    }
    
