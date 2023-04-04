import java.util.Scanner;

class Main {
 public static void main(String[] args) {
double nota1;
double nota2;
double nota3;
double nota4;
double media;
double NotaTotal;


    System.out.println("Digite suas 4 notas de avaliação bimestrais:");

    Scanner teclado = new Scanner(System.in);
    nota1 = teclado.nextDouble();
    nota2 = teclado.nextDouble();
    nota3 = teclado.nextDouble();
    nota4 = teclado.nextDouble();
    
media = (nota1 + nota2 + nota3 + nota4) / 4;
NotaTotal = (nota1 + nota2 + nota3 + nota4);

        System.out.println("Sua média foi: " + media);
        System.out.println( "A soma das notas é: " + NotaTotal);



 }
}

//5. Faça um Programa que peça para o usuário digitar 4 notas de
//avaliação bimestrais e mostre a soma total das notas e a sua
//média.
