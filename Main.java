import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in);
  //Variavel
  double  area = 0.0,
          pi = 3.14159,
          raio = 0.0;
  //Entrada
  System.out.println("Digite o valor do raio :");
  raio = leitor.nextDouble();
  //processamento
  area = pi * Math.pow(raio, 2);
  //saida 
 System.out.printf("Area = %.4f\n ", area);

  
  }
}