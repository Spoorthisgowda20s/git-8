class BankAccount {
	double balance;

	BankAccount(double b){
		if(b < 0) throw new IllegalArgumentException();
		balance = b;
	}

	void deposit(double a){
		if(a <= 0) throw new IllegalArgumentException();
		balance += a;
	}

	void withdraw(double a){
		if(a<=0 || a > balance) throw new IllegalArgumentException();
		balance -= a;
	}
}

public class BankService{
	public static void main(String[] args){
	BankAccount acc = new BankAccount(100);

	acc.deposit(500);
	acc.withdraw(300);
	System.out.println("Final balance :" + acc.balance);
	}
}