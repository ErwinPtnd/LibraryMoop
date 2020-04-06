import java.util.Vector;
public class TheMember {

	public static int idMember;
	public int idnyaMember;
	public String nameMember;
	Vector<TheBook> VecPenampungCekBuku = new Vector<>();
	public TheMember(String locVarName) {
		// TODO Auto-generated constructor stub
		
		idnyaMember = ++idMember ;
		this.nameMember = locVarName;
	}
public TheBook  checkBookIDExists(int idBook){
		for(int i = 0; i<VecPenampungCekBuku.size();i++){
			TheBook newBook = VecPenampungCekBuku.get(i);
			if(newBook.idBook == idBook){
				System.out.println("Book Has Already Borrowed");
				
			}
			
		}
		return null;
		
		
	}
}
