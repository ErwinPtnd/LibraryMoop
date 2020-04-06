import java.util.*;
public class TheMain {

	public static void printer(Object xt){
		System.out.println(xt);
	}
	public static void space(){
		System.out.println("");
		System.out.println("");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Vector<TheMember> VecOfMember = new Vector<>();
		Vector<TheBook>  VecOfBook = new Vector<>();
		
		String LocVarTitle = "";
		String LocVarName = "";
		String LocVarMemberStatus ="";
		int LocVarQuotaVIP =0;
		int LocVarBookID = 0;
		int LocVarMemberID =0;
		int UserInput = 0;
		
		
		do{
			do{
		printer("XYZ Library");
		printer("===================");
		printer("Member ");
		printer("=========");
		if(VecOfMember.size()==0){
			printer("Empty");
		}else{
			for(int i = 0; i<VecOfMember.size(); i++){
				TheMember newMember = VecOfMember.get(i);
				printer(newMember.idnyaMember+"."+newMember.nameMember + " -- Borrowed Books : ");
				space();
			}
			
		}
		
		
		printer("Books");
		printer("=============");
		
		if(VecOfBook.size() == 0){
			printer("Empty");
		}else {	
			for(int i = 0; i<VecOfBook.size(); i++){
				TheBook newBook = VecOfBook.get(i);
				printer(newBook.idnyaBook+"."+newBook.titleBook);
			//	printer((VecOfBook.size())+1+"."+newBook.titleBook);
			
			}
		}
		
		space();
		printer("1.add Book");
		printer("2.add Member");
		printer("3.borrow Book");
		printer("4.Return Book");
		printer("5.Exit");
		UserInput = scan.nextInt(); scan.nextLine();
			}while(UserInput <1 || UserInput>5);
		
		switch (UserInput) {
		
		case 1 :
			
			do{
			printer("Input Title : [1-100]");
			LocVarTitle = scan.nextLine();
			}while(LocVarTitle.length()<1 || LocVarTitle.length()>100);
			
			VecOfBook.add(new TheBook(LocVarTitle));
			printer("Book Has Been Added !");
			
			break;
		
		case 2 :
			do{
				printer("Status : [ VIP / Reguler}");
				LocVarMemberStatus = scan.nextLine();
			}while(!(LocVarMemberStatus.equals("VIP")|| LocVarMemberStatus.equals("Reguler")));
			if(LocVarMemberStatus.equals("Reguler")){
				do{
				printer("Name [ 1-100 ]");
				LocVarName = scan.nextLine();
				}while(LocVarName.length() <1 || LocVarName.length()>100);
				VecOfMember.add(new TheMember(LocVarName));
			}else if (LocVarMemberStatus.equals("VIP")){
				do{
					printer("Name [ 1-100 ]");
					LocVarName = scan.nextLine();
					}while(LocVarName.length() <1 || LocVarName.length()>100);
				do{
					printer("Quota [1-20]");
					LocVarQuotaVIP = scan.nextInt();
				}while(LocVarQuotaVIP <1 || LocVarQuotaVIP>20);
			
				VecOfMember.add(new TheVIPMember(LocVarName,LocVarQuotaVIP));
			}
				
			break;
			
		case 3 :
			do{
			printer("Member ID: ");
			LocVarMemberID = scan.nextInt(); scan.nextLine();
			}while(!(LocVarMemberID<1 || LocVarMemberID>VecOfMember.size())); // to make sure correct input
			
			do{
				printer("Book ID: ");
				LocVarBookID = scan.nextInt();scan.nextLine();
			}while(!(LocVarBookID<1 || LocVarBookID>VecOfBook.size())); // same here
			for(int i = 0; i<VecOfMember.size();i++){
				
				 //..TheMember.checkBookIDExists(LocVarBookID);
				
			}
			
			
			
			break;
		
			
			}
			
		
		
		
		
		
		
			
			
			
			
			
			
		}while(UserInput != 5);
	}

}
