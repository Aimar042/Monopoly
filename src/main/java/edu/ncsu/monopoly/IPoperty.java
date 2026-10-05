package edu.ncsu.monopoly;

public interface IPoperty {

	String getName();

	Player getPropietary();

	int getPrice();

	boolean isAvailable();

	void playAction();

	void setAvailable(boolean available);

	void setPropietary(Player owner);

	String toString();

}