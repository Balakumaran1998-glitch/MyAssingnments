package Week1.day2;

public class Library {

	
		// TODO Auto-generated method stub
		public String addBook(String bookTitle){
			String s1=bookTitle;
			return s1;

	}
		 public void issueBook() {
			 System.out.println("Book issued successfully");
			 
		 }

		public static void main(String[] args) {
			Library lb = new Library();
			String bookDetails="Castro";
			String result=lb.addBook("Castro");
					System.out.println(result+" book added successfully");
	lb.issueBook();
	}

}
