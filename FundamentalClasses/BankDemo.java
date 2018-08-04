public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount chk = new CheckingAccount(101);
		System.out.println("Depositing 500$....");
		chk.deposit(500);
		System.out.println("your account balance is:"+chk.getBalance());
		try{
			System.out.println("Withdrawing 100$....");
			chk.withDraw(100.00);
			System.out.println("your account balance is:"+chk.getBalance());
			System.out.println("Withdrawing 500$....");
			chk.withDraw(500.00);
			System.out.println("your account balance is:"+chk.getBalance());
		}catch(InsufficientFundsException ie){
			System.out.println("You are short with $"+ie.getAmount());
			ie.printStackTrace();
		}
	}

}
