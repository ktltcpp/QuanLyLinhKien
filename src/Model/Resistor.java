package Model;

public class Resistor extends ElectronicDevice{
	private double resistanceValue;

	public Resistor(String name, String manufacturer, int id, int quantity, String description,
			String datasheetURL, double cost, double voltage, double current, double resistanceValue) {
		super(name, manufacturer, id, quantity, "Resistor", description, datasheetURL, cost, voltage, current);
		this.resistanceValue = resistanceValue;
	}

	public double getResistanceValue() {
		return resistanceValue;
	}

	public void setResistanceValue(double resistanceValue) {
		this.resistanceValue = resistanceValue;
	}

	@Override
	public void getDetails() {
		System.out.println("Resistor " + this.getName() + " resistanceValue " + this.getResistanceValue()); 
	}	
}
