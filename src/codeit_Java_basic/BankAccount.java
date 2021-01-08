package codeit_Java_basic;

public class BankAccount {
	public int balance;
	public Person owner;

	    // 파라미터 : 입금할 액수(정수)
	    // 리턴 : 성공여부(불린)
	    boolean deposit(int amount) {
	        // 1. write code here
	        if(amount<0 || owner.getCashAmount()<amount) {
	        	 System.out.println("입금실패입니다. 잔고: " + balance + "원, 현금 : " + owner.getCashAmount()+ "원");
//	        	System.out.println("false");
	        	 return(false);
	        }
	        else {
	        	owner.account.balance = owner.account.balance + amount;
//	        	owner.cashAmount = owner.cashAmount - amount;
	        	owner.setCashAmount(owner.getCashAmount() - amount);

	        	System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금 : " + owner.getCashAmount() + "원");
//	        	System.out.println("true");
	        	return(true);
	        }
	    }

	    // 파라미터 : 출금할 액수(정수)
	    // 리턴 : 성공여부(불린)
	    boolean withdraw(int amount) {
	        // 2. write code here
	    	if(amount<0 || owner.account.balance<amount) {
	        	 System.out.println("출금실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
//	        	 System.out.println("false");
	        	 return(false);
	        }
	        else {
	        	owner.account.balance = owner.account.balance - amount;
//	        	owner.cashAmount = owner.cashAmount + amount;
	        	owner.setCashAmount(owner.getCashAmount() + amount);
	        	
	        	System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
//	        	System.out.println("true");
	        	return(true);
	        }
	    }

	    // 첫 번째 파라미터 : 받는 사람(Person)
	    // 두 번째 파라미터 : 이체할 금액(정수)
	    // 리턴 : 성공여부(불린)
	    // boolean transfer(Person to, int amount) {
	    // (다음 과제에서 사용하므로, 우선 skip합니다.)
	    // }
}
