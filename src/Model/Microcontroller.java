package Model;

public class Microcontroller extends ElectronicDevice {
	private double memorySize;
	private double clockSpeed;
	private String architecture;
	
	public Microcontroller(String name, String manufacturer, int id, int quantity, String description,
			String datasheetURL, double cost, double voltage, double current, double memorySize, double clockSpeed,
			String architecture) {
		super(name, manufacturer, id, quantity, "Microcontroller", description, datasheetURL, cost, voltage, current);
		this.memorySize = memorySize;
		this.clockSpeed = clockSpeed;
		this.architecture = architecture;
	}

	public double getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(double memorySize) {
		this.memorySize = memorySize;
	}

	public double getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(double clockSpeed) {
		this.clockSpeed = clockSpeed;
	}

	public String getArchitecture() {
		return architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	@Override
	public void getDetails() {
		System.out.println("Microcontroller " + this.getName() + " architecture + " + this.getArchitecture());
	}

	@Override
	public String toString() {
		return "Microcontroller [architecture=" + architecture + "]";
	}
	
	
}
