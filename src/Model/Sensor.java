package Model;

public class Sensor extends ElectronicDevice{
	private String sensorType;

	public Sensor(String name, String manufacturer, int id, int quantity, String description,
			String datasheetURL, double cost, double voltage, double current, String sensorType) {
		super(name, manufacturer, id, quantity, "Sensor", description, datasheetURL, cost, voltage, current);
		this.sensorType = sensorType;
	}

	public String getSensorType() {
		return sensorType;
	}

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}

	@Override
	public void getDetails() {
		System.out.println("Sensor " + this.getName() + " sensorType " + this.getSensorType());
	}
}
