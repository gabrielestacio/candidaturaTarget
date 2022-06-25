import java.util.*;

public class Questao5{
  private Scanner read = new Scanner(System.in);
  private String informado = new String();
  private ArrayList<Character> reverso = new ArrayList<Character>();

  public Questao5(){}
  
  public String reverte(String informado){
    String aux = new String();

    for(int i = informado.length(); i > 0; i--){
      aux += informado.charAt(i - 1);
    }

    return aux;
  }

  public static void main(String[] args){
    Questao5 q = new Questao5();

    System.out.println("Digite uma string: ");
    q.informado = q.read.next();
    
    System.out.println(q.reverte(q.informado));
  }
}