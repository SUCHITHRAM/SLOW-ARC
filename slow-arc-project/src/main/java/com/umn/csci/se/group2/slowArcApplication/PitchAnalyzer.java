package com.umn.csci.se.group2.slowArcApplication;

/**
 * An abstract class representing a pitch analyzer that determines the outcome
 * of a pitch and prints a decision.
 */
public abstract class PitchAnalyzer {

	/**
	 * Determines the outcome of a pitch based on the given strike zone and pitch
	 * coordinates.
	 *
	 * @param strikeZone The StrikeZone object representing the strike zone
	 *                   coordinates.
	 * @param pitch      The Pitch object representing the pitch coordinates.
	 * @return True if the pitch enters strike zone, false otherwise.
	 */
	public abstract boolean determinePitchOutcome(StrikeZone strikeZone, Pitch pitch);

	/**
	 * Prints the decision based on the outcome of the pitch analysis.
	 *
	 * @param pitchOutcome The outcome of the pitch analysis.
	 */
	public abstract void printDecision(boolean pitchOutcome);

	/**
	 * Default constructor for the PitchAnalyzer class.
	 */
	public PitchAnalyzer() {
	}
}
