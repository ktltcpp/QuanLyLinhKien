package Model;

public class Customer extends User{
	private Cart cart;
	
	public Customer(Cart cart, String name, String id, String username, String password, String email, String role) {
		super(name, id, username, password, email, role);
		this.cart = cart;
	}

	public boolean login(String username, String password) {
		boolean val = true;
		if (!this.getUsername().equals(username))
			val = false;
		else if (!this.getPassword().equals(password))
			val = false;
		return val;
	}
	
	public void logout() {
		System.out.println("Logged out");
	}
	
	public void addToCart(ElectronicDevice device) {
		this.cart.add(device);
	}
	
	public void deleteFromCart(ElectronicDevice device) {
		this.cart.delete(device);
	}
	
	public void buy() {
		System.out.println("Buy");
	}
}
