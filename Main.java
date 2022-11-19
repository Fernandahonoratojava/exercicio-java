import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    //atividade 1
    String planeta = "Plutão";
    System.out.println(planeta);

    //atividade 2
    String nome;
    
    System.out.println("Digite o seu nome:");
		nome = teclado.nextLine();
     System.out.println ("Olá " + nome);

    //atividade 3
    int idade;
    System.out.println("Digite o seu nome:");
		nome = teclado.nextLine();
     System.out.println ("Qual a sua idade?");
    idade = teclado.nextInt();
    System.out.println ("Olá! " + nome + " sua idade é "+ idade);
    
//atividade 4
float base, altura, area;
 System.out.println ("Digite o valor da base do retângulo:");
 base = teclado.nextFloat();
  System.out.println ("Digite o valor da altura do retângulo");  
 altura = teclado.nextFloat();

 area = base * altura;
 System.out.println("A área do retângulo é "+ area);
 

 // atividade 4.2

     float lado, area;
 System.out.println ("Digite o valor do lado do quadrado:");
 lado = teclado.nextFloat();
  

 area = lado * lado;
 System.out.println("A área do quadrado é "+ area);
  
 
  //atividade 4.3
  float maior, menor, area;
    
    System.out.println ("Digite o valor da diagonal maior do losango:");
    maior = teclado.nextFloat();
    System.out.println("Digite o valor da diagonal menor do losango:");
    menor = teclado.nextFloat();

  area = maior * menor / 2;
  System.out.println("A área do losango é " + area);


// atividade 4.4
 float maior, menor, altura, area;
  System.out.println ("Digite o valor da base maior do trapézio:");
  maior = teclado.nextFloat();
  System.out.println ("Digite o valor da base menor do trapézio:");
  menor = teclado.nextFloat();
  System.out.println ("Digite o valor da altura(h) do trapézio:");
  altura = teclado.nextFloat();

   area = (maior + menor)/2 * altura;
 System.out.println("A área do trapézio é " + area);


    // atividade 4.5
  float base, altura, area;
   System.out.println ("Digite o valor da base do paralelogramo:");
  base = teclado.nextFloat();
    
 System.out.println ("Digite o valor da altura do paralelogramo");
  altura = teclado.nextFloat(); 
  
  area = base*altura;
  System.out.println("A área do paralelogramo é " + area);
    
    //atividade 4.6
    float base, altura, area;
    
 System.out.println("Digite o valor da base do triângulo:");
  base = teclado.nextFloat();
  System.out.println ("Digite o valor da altura do triângulo");
 altura = teclado.nextFloat();

  area = base*altura/2;
 System.out.println("A área do triângulo é " + area);

  // atividade 4.7
double pi = 3.14;
double raio, area;
System.out.println ("O valor do pi é: 3,14 agora digite o valor do raio do círculo");
raio = teclado.nextDouble();

area = pi*raio;

System.out.println("A área do círculo é " + area + "²");
    */
// atividade 5
    int numero;

    System.out.println ("Por favor, digite um número");
     numero = teclado.nextInt();
    
    
if (numero < 0) {
System.out.println("O número informado é negativo" );
}
else if (numero > 0) {
   System.out.println("O número informado é positivo" );
}
else {
  System.out.println ("O número informado é neutro");
}
  
    //atividade 6
    int numero1, numero2, numero3;
System.out.println ("Digite o primeiro número");
     numero1 = teclado.nextInt();
System.out.println ("Digite o segundo número");
     numero2 = teclado.nextInt();
    System.out.println ("Digite o terceiro número");
     numero3 = teclado.nextInt();

     System.out.println("O maior numero é "+ Math.max(numero1, Math.max(numero2, numero3)));
    
    // atividade 7
    int numero1, numero2, numero3;
    
System.out.println ("Digite o primeiro número");
     numero1 = teclado.nextInt();
System.out.println ("Digite o segundo número");
     numero2 = teclado.nextInt();
    System.out.println ("Digite o terceiro número");
     numero3 = teclado.nextInt();
int menor = Math.min(numero1, Math.min(numero2, numero3));
     System.out.println("O menor numero é " + (numero1 + numero2 + numero3 - menor));
    
//atividade 8
    float divisao;
    int numero1, numero2;
    
    System.out.println ("Digite o primeiro número");
     numero1 = teclado.nextInt();
System.out.println ("Digite o segundo número");
     numero2 = teclado.nextInt();
    
 if(numero2 == 0){
  System.out.println("O número não pode ser igual a 0, digite novamente.");
   numero2 = teclado.nextInt();
}
else if (numero2 <0){
  System.out.println("O número não pode ser menor que 0, digite novamente.");
   numero2 = teclado.nextInt();
}
    else {
      divisao = numero1/numero2;
      System.out.println ("O resultado da divisão é: " + divisao);
      
    }

// atividade 9
int[] numeros = new int [10];
int soma;

for (int i = 0; i <10; i++) {
  System.out.println ("Digite os números:");
  numeros[i] = teclado.nextInt();
  soma = numeros [i];
  System.out.println (soma);
}

    //atividade 10
 double media, n1, n2, n3, n4;
    double aprovado = 6.0;
    
System.out.println ("Digite a primeira nota");
     n1 = teclado.nextInt();
System.out.println ("Digite a segunda nota");
     n2 = teclado.nextInt();
System.out.println ("Digite a segunda nota");
     n3 = teclado.nextInt();
  System.out.println ("Digite a segunda nota");
     n4 = teclado.nextInt();
    media = (n1+n2)/2;
  
    if (media>=aprovado){
            System.out.println("Aluno aprovado: " + media);
            
        }
        else {
           System.out.println ("Aluno reprovado: "+ media);
        }

    
 //atividade 11  
int contagem = 30;
String texto;

    while (contagem>0)  {
   texto = "Contagem em "+ contagem;
    System.out.println(texto);
  contagem --;
    }
    System.out.println ("EXPLOSÃO");
      
//atividade 12
int contagem = 10;
String texto;

    while (contagem>0)  {
   texto = "Contagem em "+ contagem;
    System.out.println(texto);
  contagem --;
    }
    
//atividade 13
  int numero1, numero2;
  float media;
    
System.out.println ("Digite o primeiro número");
     numero1 = teclado.nextInt();
System.out.println ("Digite o segundo número");
     numero2 = teclado.nextInt();
    
   media = numero1+numero2/2;
    System.out.println ("A média dos números informados são: "+ media);
    

    // atividade 14
  int num1, num2;
  float media;
    
  System.out.println ("Digite o primeiro número");
     num1 = teclado.nextInt();
System.out.println ("Digite o segundo número");
     num2 = teclado.nextInt();

if (num1 >= num2) {
System.out.println ("O primeiro numero tem que ser menor que o segundo");
 System.out.println("Digite novamente:");
   num1 = teclado.nextInt();
  System.out.println ("Digite o segundo número");
  num2 = teclado.nextInt();
  media = (num1+num2)/2;
  System.out.println ("A média dos dois números é "+ media);
        }
else {
  media = (num1+num2)/2;
  System.out.println ("A média dos dois números é "+ media);
}    

    // atividade 15
    float media, n1, n2;
    double aprovado = 6.5;
    
System.out.println ("Digite a primeira nota");
     n1 = teclado.nextInt();
System.out.println ("Digite a segunda nota");
     n2 = teclado.nextInt();
    media = (n1+n2)/2;
  
    if (media>=aprovado){
            System.out.println("Aluno aprovado: " + media);
            
        }
        else {
           System.out.println ("Aluno reprovado: "+ media);
        }
  


    
  }
    }
