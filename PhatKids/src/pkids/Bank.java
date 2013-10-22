package pkids;

public class Bank {
	// mvc = model view controller
	private int currentValue;
	
	public Bank() {
		this(500);
	}

	public Bank(int initialValue) {	
		// establish value for getters-setters
		currentValue = initialValue;
		// Create getters and setters to establish value for turret

	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

}
