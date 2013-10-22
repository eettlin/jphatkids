package pkids.areas;

import pkids.Bank;
import pkids.turrets.Turret;
import pkids.turrets.TurretFive;
import pkids.turrets.TurretFour;
import pkids.turrets.TurretOne;
import pkids.turrets.TurretThree;
import pkids.turrets.TurretTwo;

//**********************************************************
class IndexedTurretRecipe implements TurretRecipe {

	private final int index;
	private final Bank bank;
	private int cost;

	public IndexedTurretRecipe(int index, Bank b, int cost) {
		super();
		this.index = index;
		bank = b;
		this.cost = cost;
	}

	@Override
	public boolean canPurchase() {
		if (bank.getCurrentValue() < this.cost) {
			return false;
		}
		return true;
	}

	@Override
	public void purchaseTurret() {
		bank.setCurrentValue(bank.getCurrentValue()-cost);
	}

	@Override
	// We should use this whenever we are trying to override or implement a
	// method
	public Turret createTurret() {
		switch (index) {
		case 0:
			return new TurretOne();
		case 1:
			return new TurretTwo();
		case 2:
			return new TurretThree();
		case 3:
			return new TurretFour();
		case 4:
			return new TurretFive();

		default:
			return null;
		}
	}

}// ***********************************************************************