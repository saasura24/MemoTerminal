import java.util.*;

public class Memo{
  Scanner scanner = new Scanner(System.in);
  ArrayList<String> content = new ArrayList<String>();

  void display(){
    System.out.println("������\�����܂�");
    for(int i = 0; i < content.size(); i++){
      System.out.println("�����F" + content.get(i));
      System.out.println("-------------");
    }
  }
  void setMemo(){
    System.out.println("������o�^���Ă�������");
    System.out.print("�����F");
    content.add(scanner.nextLine());
    System.out.println("�o�^���������܂���");
    System.out.println("");
  }
}
