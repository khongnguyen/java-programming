import java.util.Scanner;

public class Book implements IBook {
	private int bookId;
	private String bookName;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public void display() {
		System.out.println("book id:"+bookId);
		System.out.println("book name:"+bookName);
		System.out.println("book name:"+author);
		
		
	}

	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao book id:");
		int bookId = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap vao book name:");
		bookName = scanner.nextLine();
		System.out.println("Nhap vao author:");
		author = scanner.nextLine();
		// TODO Auto-generated method stub
		
	}
	
	
	

}
