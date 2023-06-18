import java.util.*;

public class MemoSample{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Memo contents = new Memo();

    while (true){
      System.out.println("番号1. メモの登録");
      System.out.println("番号2. メモの表示");
      System.out.println("番号9. アプリケーションの終了");
      System.out.print("番号を入力してください(1,2,9)：");
      int num = scanner.nextInt();

      if(num == 1){
      contents.setMemo();
      } else if(num == 2){
      contents.display();
      } else if(num == 9){
      break;
      }
    }
  }
}
