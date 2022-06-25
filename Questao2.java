import java.util.*;

public class Questao2{
  private Scanner read = new Scanner(System.in);
  private ArrayList<Integer> fib = new ArrayList<Integer>();
  private int informado;

  public Questao2(){}
  
  public boolean calculaFib(int informado){
    int f = 0; /*f é a variável que vai controlar o laço e armazenar o último elemento de Fibonnacci calculado*/

    while(f < informado){
      f = fib.get(fib.size() - 1) + fib.get(fib.size() - 2);
      fib.add(f);
    }

    if(f == informado)
      return true;
    else
      return false;
  }

  public static void main(String[] args){
    Questao2 q = new Questao2();
    //Elementos iniciais da sequência
    q.fib.add(0);
    q.fib.add(1);

    System.out.println("Informe um valor: ");
    q.informado = q.read.nextInt();
    
    if(q.calculaFib(q.informado) == true)
      System.out.println("\n" + q.informado + " pertence à Sequência de Fibonnacci!");
    else
      System.out.println("\n" + q.informado + " não pertence à Sequência de Fibonnacci!");
  } 
}