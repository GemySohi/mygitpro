package day1.examples;
/**Bank account has a balance that can be changed by deposits and withdrawls 
 * 
 * @author s1178925
 *
 */
public class bankaccount 
{
private double balance;


/**
 * Constructs a bank account with a zero balance 
 */
public bankaccount()
{
	balance=0;
}

//*Constructs a bank account with a given balance
public bankaccount(double initialBalance)
{
	balance= initialBalance;
}
/**Deposits  money into bank account
*/

public void deposit (double amount)
{
	balance=balance+amount;
	
}
/**
 * Withdraws money from the bank account 
 */
public void withdraw(double amount)
{
	balance = balance - amount;
}

/**
 * Gets the current balance of the bank account 
 */
public double getBalance()
{
	return balance;
}
}





