package com.umn.csci.se.group2.slowArcApplication;

import com.umn.csci.se.group2.slowArcApplication.helpers.CheckPointInsidePolygon;
import com.umn.csci.se.group2.slowArcApplication.helpers.Point;

/**
 * Implementation of the PitchAnalyzer abstract class. Determines pitch outcome
 * and prints the decision.
 */
public class PitchAnalyzerImpl extends PitchAnalyzer {

	/**
	 * Default constructor for PitchAnalyzerImpl.
	 */
	public PitchAnalyzerImpl() {
		super();
	}

	/**
	 * Determines the outcome of a pitch based on the given strike zone and pitch
	 * coordinates. Checks if the pitch is inside the adjusted strike zone polygon
	 * after accounting for horizontal shifts.
	 *
	 * @param strikeZone The StrikeZone object representing the strike zone
	 *                   coordinates.
	 * @param pitch      The Pitch object representing the pitch coordinates.
	 * @return True if the pitch is successful (STRIKE), false otherwise (BALL).
	 * @throws IllegalArgumentException If strikeZone or pitch is null.
	 */
	@Override
	public boolean determinePitchOutcome(StrikeZone strikeZone, Pitch pitch) {
		if (strikeZone == null || pitch == null) {
			throw new IllegalArgumentException("StrikeZone and Pitch must not be null");
		}
		Point pitchPosition = new Point(pitch.getBallCentreX(), pitch.getBallCentreY());
		Point pitchLeftCoordinate = new Point(pitch.getBallLeftX(), pitch.getBallLeftY());
		Point pitchRightCoordinate = new Point(pitch.getBallRightX(), pitch.getBallRightY());

		// Calculate horizontal shifts for Batter standing behind or in front of the
		// plate.
		CheckPointInsidePolygon helperObj = new CheckPointInsidePolygon();
		double shiftedCoordinate = Double.min(strikeZone.getFrontCloseCoordinate()[0],
				strikeZone.getFrontFarCoordinate()[0]);

		// Updated coordinates for the adjusted strike zone polygon for batter standing
		// behind or in front of the plate.

		while (shiftedCoordinate < Double.min(strikeZone.getBackCloseCoordinate()[0],
				strikeZone.getBackFarCoordinate()[0])) {
			Point[] strikeZoneArea = { new Point(shiftedCoordinate, strikeZone.getShoulder1Coordinate()[1]),
					new Point(shiftedCoordinate, strikeZone.getShoulder2Coordinate()[1]),
					new Point(shiftedCoordinate, strikeZone.getKnee1Coordinate()[1]),
					new Point(shiftedCoordinate, strikeZone.getKnee2Coordinate()[1]) };
			// Check if the pitch is inside the adjusted strike zone polygon
			shiftedCoordinate++;
			if (helperObj.checkInside(strikeZoneArea, 4, pitchPosition) == 1
					|| helperObj.checkInside(strikeZoneArea, 4, pitchLeftCoordinate) == 1
					|| helperObj.checkInside(strikeZoneArea, 4, pitchRightCoordinate) == 1) {
				return true; // STRIKE
			}
		}
		return false; // BALL
	}

	/**
	 * Prints the decision based on the outcome of the pitch analysis.
	 *
	 * @param pitchOutcome True if the pitch is successful (STRIKE), false otherwise
	 *                     (BALL).
	 */
	@Override
	public void printDecision(boolean pitchOutcome) {
		String applicationName = "SLOW-ARC";

		if (pitchOutcome) {
			System.out.println("╔════════════════════════════════════╗");
			System.out.println("║    " + applicationName + " - PITCH OUTCOME	     ║");
			System.out.println("╠════════════════════════════════════╣");
			System.out.println("║               STRIKE               ║");
			System.out.println("╚════════════════════════════════════╝");
		} else {
			System.out.println("╔════════════════════════════════════╗");
			System.out.println("║    " + applicationName + " - PITCH OUTCOME	     ║");
			System.out.println("╠════════════════════════════════════╣");
			System.out.println("║               BALL                 ║");
			System.out.println("╚════════════════════════════════════╝");
		}
	}
}
