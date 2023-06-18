import java.util.*;

public class Memo{
  Scanner scanner = new Scanner(System.in);
  ArrayList<String> content = new ArrayList<String>();

  void display(){
    System.out.println("メモを表示します");
    for(int i = 0; i < content.size(); i++){
      System.out.println("メモ：" + content.get(i));
      System.out.println("-------------");
    }
  }
  void setMemo(){
    System.out.println("メモを登録してください");
    System.out.print("メモ：");
    content.add(scanner.nextLine());
    System.out.println("登録が完了しました");
    System.out.println("");
  }
}
