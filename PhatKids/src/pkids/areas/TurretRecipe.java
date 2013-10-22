package pkids.areas;

import pkids.turrets.Turret;

public interface TurretRecipe {

	public Turret createTurret();
	public boolean canPurchase();
	public void purchaseTurret();
	
}

