
public class TheBook {

	
	public static int idBook ; // for the increment function
	public int idnyaBook;
	public String titleBook;
	public TheBook(String locVarTitle ) {
		// TODO Auto-generated constructor stub
		
		this.idnyaBook = ++idBook;  // supaya book id nya nambah satu setiap kali buku baru dibuat di main 
		this.titleBook = locVarTitle;
	}
	
}

