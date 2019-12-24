
public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author A = new Author("Duong Kidd", "duongbv98@gmail.com", "Ha Noi");
	      System.out.println(A);
	      Computer C = new Computer("MSI_2019", A,32000000, 30);
	      System.out.println(C);
	      C.setPrice(3100000);
	      C.getAmount();
	      System.out.println(C);
	      System.out.println("Name is: " + C.getName());
	      System.out.println("Price is: " + C.getPrice());
	      System.out.println("Count is: " + C.getAmount());
	      System.out.println("Author is: " + C.getAuthor());
	      System.out.println("Author's name is: " + C.getAuthor().getName());
	      System.out.println("Author's email is: " + C.getAuthor().getEmail());
	      System.out.println("Author's gender is: " + C.getAuthor().getAddress());
	      Computer AddC = new Computer("ROG_2019", new Author("Peter Lee", "peter@nowhere.com", "HaNoi"),3100000,28);
	      System.out.println(AddC);
	}

}
