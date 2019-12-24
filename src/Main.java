import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Lam Chuot
 *
 */
public class Main {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sach");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap quyen sach so :" + (i + 1));
			Book2 b = new Book3();
			b.input();
			list.add(b);

		}

		System.out.println("Thong tin book");
		for (Book s : list) {
			s.display();
		}

		System.out.println("Nhap id book muon xoa");
		int id = sc.nextInt();

		if (list.size() == 0) {
			System.out.println("khong tim thay id ");
		} else {
			list.remove(id - 1);
			System.out.println("Da xoa");
		}

	}

}
