package com.umn.csci.se.group2.slowArcApplication;

/**
 * Represents the coordinates of a strike zone in a baseball game.
 */
public class StrikeZone {
	// Array to store the coordinates of different points in the strike zone
	private double[] frontCloseCoordinate = new double[2];
	private double[] backCloseCoordinate = new double[2];
	private double[] edgeCoordinate = new double[2];
	private double[] backFarCoordinate = new double[2];
	private double[] frontFarCoordinate = new double[2];
	private double[] shoulder1Coordinate = new double[2];
	private double[] shoulder2Coordinate = new double[2];
	private double[] knee1Coordinate = new double[2];
	private double[] knee2Coordinate = new double[2];

	/**
	 * Default constructor for the StrikeZone class.
	 */
	public StrikeZone() {
		super();
	}

	/**
	 * Parameterized constructor for initializing the StrikeZone object with
	 * specific coordinates.
	 *
	 * @param frontCloseCoordinate The coordinates of the front-close point.
	 * @param backCloseCoordinate  The coordinates of the back-close point.
	 * @param edgeCoordinate       The coordinates of the edge point.
	 * @param backFarCoordinate    The coordinates of the back-far point.
	 * @param frontFarCoordinate   The coordinates of the front-far point.
	 * @param shoulder1Coordinate  The coordinates of the first shoulder point.
	 * @param shoulder2Coordinate  The coordinates of the second shoulder point.
	 * @param knee1Coordinate      The coordinates of the first knee point.
	 * @param knee2Coordinate      The coordinates of the second knee point.
	 */
	public StrikeZone(double[] frontCloseCoordinate, double[] backCloseCoordinate, double[] edgeCoordinate,
			double[] backFarCoordinate, double[] frontFarCoordinate, double[] shoulder1Coordinate,
			double[] shoulder2Coordinate, double[] knee1Coordinate, double[] knee2Coordinate) {
		super();
		// Initialize the coordinates using the provided values
		this.frontCloseCoordinate = frontCloseCoordinate.clone();
		this.backCloseCoordinate = backCloseCoordinate.clone();
		this.edgeCoordinate = edgeCoordinate.clone();
		this.backFarCoordinate = backFarCoordinate.clone();
		this.frontFarCoordinate = frontFarCoordinate.clone();
		this.shoulder1Coordinate = shoulder1Coordinate.clone();
		this.shoulder2Coordinate = shoulder2Coordinate.clone();
		this.knee1Coordinate = knee1Coordinate.clone();
		this.knee2Coordinate = knee2Coordinate.clone();
	}

	// Getter and setter methods for each coordinate, following the encapsulation
	// principle

	/**
	 * Getter for the front-close coordinate.
	 *
	 * @return The front-close coordinate.
	 */
	public double[] getFrontCloseCoordinate() {
		return frontCloseCoordinate.clone();
	}

	/**
	 * Setter for the front-close coordinate.
	 *
	 * @param frontCloseCoordinate The front-close coordinate to set.
	 */
	public void setFrontCloseCoordinate(double[] frontCloseCoordinate) {
		this.frontCloseCoordinate = frontCloseCoordinate.clone();
	}

	/**
	 * Getter for the back-close coordinate.
	 *
	 * @return The back-close coordinate.
	 */
	public double[] getBackCloseCoordinate() {
		return backCloseCoordinate.clone();
	}

	/**
	 * Setter for the back-close coordinate.
	 *
	 * @param backCloseCoordinate The back-close coordinate to set.
	 */
	public void setBackCloseCoordinate(double[] backCloseCoordinate) {
		this.backCloseCoordinate = backCloseCoordinate.clone();
	}

	/**
	 * Getter for the edge coordinate.
	 *
	 * @return The edge coordinate.
	 */
	public double[] getEdgeCoordinate() {
		return edgeCoordinate.clone();
	}

	/**
	 * Setter for the edge coordinate.
	 *
	 * @param edgeCoordinate The edge coordinate to set.
	 */
	public void setEdgeCoordinate(double[] edgeCoordinate) {
		this.edgeCoordinate = edgeCoordinate.clone();
	}

	/**
	 * Getter for the back-far coordinate.
	 *
	 * @return The back-far coordinate.
	 */
	public double[] getBackFarCoordinate() {
		return backFarCoordinate.clone();
	}

	/**
	 * Setter for the back-far coordinate.
	 *
	 * @param backFarCoordinate The back-far coordinate to set.
	 */
	public void setBackFarCoordinate(double[] backFarCoordinate) {
		this.backFarCoordinate = backFarCoordinate.clone();
	}

	/**
	 * Getter for the front-far coordinate.
	 *
	 * @return The front-far coordinate.
	 */
	public double[] getFrontFarCoordinate() {
		return frontFarCoordinate.clone();
	}

	/**
	 * Setter for the front-far coordinate.
	 *
	 * @param frontFarCoordinate The front-far coordinate to set.
	 */
	public void setFrontFarCoordinate(double[] frontFarCoordinate) {
		this.frontFarCoordinate = frontFarCoordinate.clone();
	}

	/**
	 * Getter for the first shoulder coordinate.
	 *
	 * @return The first shoulder coordinate.
	 */
	public double[] getShoulder1Coordinate() {
		return shoulder1Coordinate.clone();
	}

	/**
	 * Setter for the first shoulder coordinate.
	 *
	 * @param shoulder1Coordinate The first shoulder coordinate to set.
	 */
	public void setShoulder1Coordinate(double[] shoulder1Coordinate) {
		this.shoulder1Coordinate = shoulder1Coordinate.clone();
	}

	/**
	 * Getter for the second shoulder coordinate.
	 *
	 * @return The second shoulder coordinate.
	 */
	public double[] getShoulder2Coordinate() {
		return shoulder2Coordinate.clone();
	}

	/**
	 * Setter for the second shoulder coordinate.
	 *
	 * @param shoulder2Coordinate The second shoulder coordinate to set.
	 */
	public void setShoulder2Coordinate(double[] shoulder2Coordinate) {
		this.shoulder2Coordinate = shoulder2Coordinate.clone();
	}

	/**
	 * Getter for the first knee coordinate.
	 *
	 * @return The first knee coordinate.
	 */
	public double[] getKnee1Coordinate() {
		return knee1Coordinate.clone();
	}

	/**
	 * Setter for the first knee coordinate.
	 *
	 * @param knee1Coordinate The first knee coordinate to set.
	 */
	public void setKnee1Coordinate(double[] knee1Coordinate) {
		this.knee1Coordinate = knee1Coordinate.clone();
	}

	/**
	 * Getter for the second knee coordinate.
	 *
	 * @return The second knee coordinate.
	 */
	public double[] getKnee2Coordinate() {
		return knee2Coordinate.clone();
	}

	/**
	 * Setter for the second knee coordinate.
	 *
	 * @param knee2Coordinate The second knee coordinate to set.
	 */
	public void setKnee2Coordinate(double[] knee2Coordinate) {
		this.knee2Coordinate = knee2Coordinate.clone();
	}
}
