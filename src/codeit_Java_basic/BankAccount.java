package codeit_Java_basic;

public class BankAccount {
	public int balance;
	public Person owner;

	    // �Ķ���� : �Ա��� �׼�(����)
	    // ���� : ��������(�Ҹ�)
	    boolean deposit(int amount) {
	        // 1. write code here
	        if(amount<0 || owner.getCashAmount()<amount) {
	        	 System.out.println("�Աݽ����Դϴ�. �ܰ�: " + balance + "��, ���� : " + owner.getCashAmount()+ "��");
//	        	System.out.println("false");
	        	 return(false);
	        }
	        else {
	        	owner.account.balance = owner.account.balance + amount;
//	        	owner.cashAmount = owner.cashAmount - amount;
	        	owner.setCashAmount(owner.getCashAmount() - amount);

	        	System.out.println(amount + "�� �Ա��Ͽ����ϴ�. �ܰ�: " + balance + "��, ���� : " + owner.getCashAmount() + "��");
//	        	System.out.println("true");
	        	return(true);
	        }
	    }

	    // �Ķ���� : ����� �׼�(����)
	    // ���� : ��������(�Ҹ�)
	    boolean withdraw(int amount) {
	        // 2. write code here
	    	if(amount<0 || owner.account.balance<amount) {
	        	 System.out.println("��ݽ����Դϴ�. �ܰ�: " + balance + "��, ����: " + owner.getCashAmount() + "��");
//	        	 System.out.println("false");
	        	 return(false);
	        }
	        else {
	        	owner.account.balance = owner.account.balance - amount;
//	        	owner.cashAmount = owner.cashAmount + amount;
	        	owner.setCashAmount(owner.getCashAmount() + amount);
	        	
	        	System.out.println(amount + "�� ����Ͽ����ϴ�. �ܰ�: " + balance + "��, ����: " + owner.getCashAmount() + "��");
//	        	System.out.println("true");
	        	return(true);
	        }
	    }

	    // ù ��° �Ķ���� : �޴� ���(Person)
	    // �� ��° �Ķ���� : ��ü�� �ݾ�(����)
	    // ���� : ��������(�Ҹ�)
	    // boolean transfer(Person to, int amount) {
	    // (���� �������� ����ϹǷ�, �켱 skip�մϴ�.)
	    // }
}
