package com.org.kyro.bookMyShow.dto;

public class SystemMember extends UserDTO{
	private AccountDTO account;
	private String name;
	private String email;
	private AddressDTO address;
	public AccountDTO getAccount() {
		return account;
	}
	public void setAccount(AccountDTO account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "SystemMember [account=" + account + ", name=" + name + ", email=" + email + ", address=" + address
				+ "]";
	}
	
	
}
