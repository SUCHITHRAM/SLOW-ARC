package com.umn.csci.se.group2.slowArcApplication;

/**
 * Represents the coordinates of a pitched ball.
 */
public class Pitch {
	private double ballCentreX;
	private double ballCentreY;
	private double ballLeftX;
	private double ballLeftY;
	private double ballRightX;
	private double ballRightY;

	/**
	 * Default constructor for Pitch.
	 */
	public Pitch() {
		super();
	}

	/**
	 * Parameterized constructor for initializing the Pitch object with specific
	 * coordinates.
	 *
	 * @param ballCentreX The X-coordinate of the ball's center.
	 * @param ballCentreY The Y-coordinate of the ball's center.
	 * @param ballLeftX   The X-coordinate of the left point of the ball.
	 * @param ballLeftY   The Y-coordinate of the left point of the ball.
	 * @param ballRightX  The X-coordinate of the right point of the ball.
	 * @param ballRightY  The Y-coordinate of the right point of the ball.
	 */
	public Pitch(double ballCentreX, double ballCentreY, double ballLeftX, double ballLeftY, double ballRightX,
			double ballRightY) {
		super();
		this.ballCentreX = ballCentreX;
		this.ballCentreY = ballCentreY;
		this.ballLeftX = ballLeftX;
		this.ballLeftY = ballLeftY;
		this.ballRightX = ballRightX;
		this.ballRightY = ballRightY;
	}

	/**
	 * Getter for the X-coordinate of the ball's center.
	 *
	 * @return The X-coordinate of the ball's center.
	 */
	public double getBallCentreX() {
		return ballCentreX;
	}

	/**
	 * Setter for the X-coordinate of the ball's center.
	 *
	 * @param ballCentreX The X-coordinate of the ball's center to set.
	 */
	public void setBallCentreX(double ballCentreX) {
		this.ballCentreX = ballCentreX;
	}

	/**
	 * Getter for the Y-coordinate of the ball's center.
	 *
	 * @return The Y-coordinate of the ball's center.
	 */
	public double getBallCentreY() {
		return ballCentreY;
	}

	/**
	 * Setter for the Y-coordinate of the ball's center.
	 *
	 * @param ballCentreY The Y-coordinate of the ball's center to set.
	 */
	public void setBallCentreY(double ballCentreY) {
		this.ballCentreY = ballCentreY;
	}

	/**
	 * Getter for the X-coordinate of the left point of the ball.
	 *
	 * @return The X-coordinate of the left point of the ball.
	 */
	public double getBallLeftX() {
		return ballLeftX;
	}

	/**
	 * Setter for the X-coordinate of the left point of the ball.
	 *
	 * @param ballLeftX The X-coordinate of the left point of the ball to set.
	 */
	public void setBallLeftX(double ballLeftX) {
		this.ballLeftX = ballLeftX;
	}

	/**
	 * Getter for the Y-coordinate of the left point of the ball.
	 *
	 * @return The Y-coordinate of the left point of the ball.
	 */
	public double getBallLeftY() {
		return ballLeftY;
	}

	/**
	 * Setter for the Y-coordinate of the left point of the ball.
	 *
	 * @param ballLeftY The Y-coordinate of the left point of the ball to set.
	 */
	public void setBallLeftY(double ballLeftY) {
		this.ballLeftY = ballLeftY;
	}

	/**
	 * Getter for the X-coordinate of the right point of the ball.
	 *
	 * @return The X-coordinate of the right point of the ball.
	 */
	public double getBallRightX() {
		return ballRightX;
	}

	/**
	 * Setter for the X-coordinate of the right point of the ball.
	 *
	 * @param ballRightX The X-coordinate of the right point of the ball to set.
	 */
	public void setBallRightX(double ballRightX) {
		this.ballRightX = ballRightX;
	}

	/**
	 * Getter for the Y-coordinate of the right point of the ball.
	 *
	 * @return The Y-coordinate of the right point of the ball.
	 */
	public double getBallRightY() {
		return ballRightY;
	}

	/**
	 * Setter for the Y-coordinate of the right point of the ball.
	 *
	 * @param ballRightY The Y-coordinate of the right point of the ball to set.
	 */
	public void setBallRightY(double ballRightY) {
		this.ballRightY = ballRightY;
	}

	/**
	 * Returns a string representation of the Pitch object.
	 *
	 * @return A string representation of the Pitch object.
	 */
	@Override
	public String toString() {
		return "Pitch [ballCentreX=" + ballCentreX + ", ballCentreY=" + ballCentreY + ", ballLeftX=" + ballLeftX
				+ ", ballLeftY=" + ballLeftY + ", ballRightX=" + ballRightX + ", ballRightY=" + ballRightY + "]";
	}
}
