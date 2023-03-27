package cogent_batch65;

public class BankAccount {
	
	int accNo;
	String custName;
	String accType;
	float balance;
	
	public BankAccount(int accno,String custname,String acctype,float initbalance) throws LowBalance,NegativeAmount{
		if(initbalance<0) {
			throw new NegativeAmount("You can't start with a negative amount.");
		}
		if(acctype=="Savings"&&initbalance<1000f) {
			throw new LowBalance("You can't start with insufficient funds.");
		}
		if(acctype=="Current"&&initbalance<5000f) {
			throw new LowBalance("You can't start with insufficient funds.");
		}
		
		this.accNo=accno;
		this.custName=custname;
		this.accType=acctype;
		this.balance=initbalance;
	}
	
	public void deposit(float amt) throws NegativeAmount{
		if(amt<0) {
			throw new NegativeAmount("You can't deposit a negative amount");
		}
		this.balance+=amt;
	}
	
	public void withdraw(float amt) throws NegativeAmount, InsufficientFunds{
		if(amt<0) {
			throw new NegativeAmount("You can't withdraw a negative amount");
		}
		if(this.accType=="Savings"&&(this.balance-amt)<1000) {
			throw new InsufficientFunds("Insufficient Funds");
		}
		if(this.accType=="Current"&&(this.balance-amt)<5000) {
			throw new InsufficientFunds("Insufficient Funds");
		}
		this.balance-=amt;
	}
	
	public float getBalance() throws LowBalance{
		if(this.accType=="Savings"&&this.balance<1000f) {
			throw new LowBalance("This account has a low balance.");
		}
		if(this.accType=="Current"&&this.balance<5000f) {
			throw new LowBalance("This account has a low balance.");
		}
		return this.balance;
	}
	
	public static void main(String args[]) throws LowBalance,NegativeAmount,InsufficientFunds{
		try {
		BankAccount b=new BankAccount(1,"mybank","Current",5000);
		float f=b.getBalance();
		System.out.println(f);
		b.deposit(75);
		b.withdraw(50);
		}catch (LowBalance l) {
			System.out.println(l.getMessage());
		}catch (NegativeAmount n) {
			System.out.println(n.getMessage());
		}catch (InsufficientFunds f) {
			System.out.println(f.getMessage());
		}
		
	}

}
