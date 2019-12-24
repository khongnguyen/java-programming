import java.util.Scanner;

public class Book2 extends Book {
	private String publishing;
	private String page;
	
	public Book2() {
		// TODO Auto-generated constructor stub
	}

	public Book2(int bookId, String bookName, String author, String publishing, String page) {
		super(bookId, bookName, author);
		this.publishing = publishing;
		this.page = page;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao publishing:");
		publishing = scanner.nextLine();
		System.out.println("Nhap vao page:");
		page = scanner.nextLine();

		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		super.display();
		System.out.println("publishing:" + publishing);
		System.out.println("page:" + page);
	}

}
