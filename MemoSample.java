import java.util.*;

public class MemoSample{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Memo contents = new Memo();

		while (true){
			System.out.println("�ԍ�1. �����̓o�^");
			System.out.println("�ԍ�2. �����̕\��");
			System.out.println("�ԍ�9. �A�v���P�[�V�����̏I��");
			System.out.print("�ԍ�����͂��Ă�������(1,2,9)�F");
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
