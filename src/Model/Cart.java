package Model;

import java.util.ArrayList;

public class Cart {
	private ArrayList<ElectronicDevice> list = new ArrayList<ElectronicDevice>();

	public Cart() {
	}
	
	public void add(ElectronicDevice device) {
		list.add(device);
	}
	
	public void delete(ElectronicDevice device) {
		list.remove(device);
	}
	
	
}
