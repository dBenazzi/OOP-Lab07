/**
 * 
 */
package it.unibo.oop.lab.enum2;

import java.util.Map;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(Place.INDOOR, 5, "Basket"), 
	VOLLEY(Place.INDOOR, 6, "Volley"), 
	TENNIS(Place.OUTDOOR, 1, "Tennis"),
	BIKE(Place.OUTDOOR, 1, "Bike"), 
	F1(Place.OUTDOOR, 1, "F1"), 
	MOTOGP(Place.OUTDOOR, 1, "MotoGP"), 
	SOCCER(Place.OUTDOOR, 11, "Soccer");
    /*
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final int membersNum;
	private final Place place;
	private final String sport;
    
	/*
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	/**
	 * 
	 * Builds a new {@link Sport}.
	 * 
	 * @param place
	 * 			records if the sport is indoor or outdoor
	 * @param noTeamMembers
	 * 			number of team members (1 if solo sport)			
	 * @param actualName
	 * 			name of the sport
	 */
	Sport(final Place place, final int noTeamMembers, final String actualName){
		this.place = place;
		this.membersNum = noTeamMembers;
		this.sport = actualName;
	}

    /* 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	/**
	 * checks whether the sport is individual or not
	 * 
	 * @return true if the sport is individual
	 */
	public boolean isIndividualSport() {
		return this.membersNum == 1;
	}
	
	/**
	 * checks whether the sport is indoor or not
	 * 
	 * @return
	 */
	public boolean isIndoorSport() {
		return this.place == Place.INDOOR;
	}
	
	/**
	 * @return whether the sport is indoor or outdoor
	 */
	public Place getPlace() {
		return this.place;
	}
	
	/**
	 * briefly describes the sport
	 */
	public String toString() {
		return this.sport + " is practiced " + this.place + " and " 
				+ (this.membersNum == 1 ? "is" : "is not")
				+ " individual";
	}
}
