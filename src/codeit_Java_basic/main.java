package codeit_Java_basic;

public class main {
	public static void main(String[] args) {
        // »ç¶÷ ¼±¾ð
        Person p1 = new Person();
        p1.setName("±è½ÅÀÇ");
        p1.setAge(28);
        p1.setCashAmount(30000);
        
        Person p2 = new Person();
        p2.setName("±è±è±è");
        p2.setAge(28);
        p2.setCashAmount(100000);


        // ÀºÇà °èÁÂ »ý¼º
        BankAccount a1 = new BankAccount();
        a1.balance = 100000;

        p1.setAccount(a1);
        a1.owner = p1;
        
        // 3 - 4. write code here
        BankAccount a2 = new BankAccount();
        a2.balance = 500000;

        p2.setAccount(a2);
        a2.owner = p2;
        
//        a2.deposit(30000);
        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));
        
        
    }
}
