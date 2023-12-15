package Model;

public class Capacitor extends ElectronicDevice{
	private double capacitanceValue;

	public Capacitor(String name, String manufacturer, int id, int quantity, String description,
			String datasheetURL, double cost, double voltage, double current, double capacitanceValue) {
		super(name, manufacturer, id, quantity, "Capacitor", description, datasheetURL, cost, voltage, current);
		this.capacitanceValue = capacitanceValue;
	}

	public double getCapacitanceValue() {
		return capacitanceValue;
	}

	public void setCapacitanceValue(double capacitanceValue) {
		this.capacitanceValue = capacitanceValue;
	}

	@Override
	public void getDetails() {
		System.out.println("Capacitor " + this.getName() + " capacitanceValue " + this.getCapacitanceValue());
	}
}
