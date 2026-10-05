package edu.ncsu.monopoly;

public abstract class Cell implements IPoperty {
	private String name;
	protected Player propietary;
	private boolean available = true;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Player getPropietary() {
		return propietary;
	}
	
	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public boolean isAvailable() {
		return available;
	}
	
	@Override
	public abstract void playAction();

	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	@Override
	public void setPropietary(Player owner) {
		this.propietary = owner;
	}
    
    @Override
	public String toString() {
        return name;
    }
}
