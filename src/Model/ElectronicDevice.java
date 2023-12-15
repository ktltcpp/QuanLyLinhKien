package Model;

public abstract class ElectronicDevice {
	private String name,manufacturer;
	private int id, quantity;
	private String type,description;
	private String datasheetURL;
	double cost, voltage, current;
	
	public ElectronicDevice(String name, String manufacturer, int id, int quantity, String type, String description,
			String datasheetURL, double cost, double voltage, double current) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.id = id;
		this.quantity = quantity;
		this.type = type;
		this.description = description;
		this.datasheetURL = datasheetURL;
		this.cost = cost;
		this.voltage = voltage;
		this.current = current;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDatasheetURL() {
		return datasheetURL;
	}

	public void setDatasheetURL(String datasheetURL) {
		this.datasheetURL = datasheetURL;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public double getCurrent() {
		return current;
	}

	public void setCurrent(double current) {
		this.current = current;
	}
	
	public abstract void getDetails();
}
