import java.util.Scanner;
public class Bank {
	public static void main(String args[]){
		int account;
		int m ;
		//int x ;
		
		String p;
		String address;
		//String location;
		//String account;
		int mobile;
		//String amount;
		int amount;
		//String date;
		Scanner in = new Scanner(System.in);
		
		//for(x=0;x <=4;x++){
			System.out.println("01 For new Account");
			System.out.println("02 Deposit");
			System.out.println("03 For Withdraw");
			System.out.println("04 For EXIT");
			m = in.nextInt();
		//}
			switch(m){
		case 1:
		//details
		System.out.println(":::::::New Account::::::::");
		//account number
		System.out.println("ENTER YOUR ACCOUNT NUMBER");
		account = in.nextInt();
		
		
		//address 
				System.out.println("ENTER YOUR LOCATION ");
				address = in.nextLine();
				
		

		
		
		//mobile		
		System.out.println("ENTER YOUR MOBILE NUMBER");
		mobile = in.nextInt();
		
		//System.out.println("ENTER YOUR FULL NAMES");
		//p = in.nextLine();
		

		break;
		
		case 2:
		
			System.out.println(" ::::::DEPOSIT MENU ::::::::");
			//amount to deposit
			System.out.println("ENTER YOUR FUL NAMES");
			amount = in.nextInt();
			
			
			
			
			//account
			System.out.println("ENTER YOUR ACCOUNT NUMBER");
			account = in.nextInt();
			
			
			//amount to deposit
			System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
			amount= in.nextInt();
			
			break;
		
		case 3:
		System.out.println("::::::::WITHDRAW MENU::::::::");
		System.out.println("ENTER THE ACCOUNT NUMBER");
		
		account = in.nextInt();
			System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
			amount = in.nextInt();
			break;
		case 4:exit();
                       break;	
		
		
		default:
			System.out.println("Wrong entry");
			break;
		
		}
			}

	private static void exit() {
		// TODO Auto-generated method stub
		
	}

}
