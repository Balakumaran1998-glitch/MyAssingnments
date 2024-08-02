package Week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lb1 = new Library ();
		String bookName = "The Metamorphosis";
		String result=lb1.addBook(bookName);
		System.out.println(result+ " book added successfully");
		lb1.issueBook();
	}

}
