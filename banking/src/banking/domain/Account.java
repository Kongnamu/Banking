package banking.domain;

import java.io.Serializable;

public class Account implements Serializable{
	
	private static final long serialVersionUID = 11111L;
	
	//필드
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

}
