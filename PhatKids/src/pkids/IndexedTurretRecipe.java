package pkids;

//**********************************************************
class IndexedTurretRecipe implements TurretRecipe {

	private final int index;

	public IndexedTurretRecipe(int index) {
		super();
		this.index = index;
	}

	@Override						// We should use this whenever we are trying to override or implement a method
	public Turret createTurret() {
		switch (index) {
		case 0:
			return new TurretOne();
		case 1:
			return new TurretTwo();
		default:
			return null;
		}
	}

}//***********************************************************************