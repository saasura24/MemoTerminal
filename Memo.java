import java.util.*;

public class Memo{
  Scanner scanner = new Scanner(System.in);
  ArrayList<String> content = new ArrayList<String>();

  void display(){
    System.out.println("ƒƒ‚‚ğ•\¦‚µ‚Ü‚·");
    for(int i = 0; i < content.size(); i++){
      System.out.println("ƒƒ‚F" + content.get(i));
      System.out.println("-------------");
    }
  }
  void setMemo(){
    System.out.println("ƒƒ‚‚ğ“o˜^‚µ‚Ä‚­‚¾‚³‚¢");
    System.out.print("ƒƒ‚F");
    content.add(scanner.nextLine());
    System.out.println("“o˜^‚ªŠ®—¹‚µ‚Ü‚µ‚½");
    System.out.println("");
  }
}
