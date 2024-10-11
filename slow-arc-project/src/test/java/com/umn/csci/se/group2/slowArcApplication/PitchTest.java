package com.umn.csci.se.group2.slowArcApplication;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * This class contains unit tests for the Pitch class.
 */
public class PitchTest {

	/**
	 * Tests the default constructor of the Pitch class. Verifies that a non-null
	 * instance of Pitch is created.
	 */
	@Test
	public void testDefaultConstructor() {
		Pitch pitch = new Pitch();
		assertNotNull(pitch);
	}

	/**
	 * Tests the parameterized constructor of the Pitch class. Verifies that the
	 * constructor correctly sets the initial values of Pitch.
	 */
	@Test
	public void testParameterizedConstructor() {
		double ballCentreX = 1.0;
		double ballCentreY = 2.0;
		double ballLeftX = 3.0;
		double ballLeftY = 4.0;
		double ballRightX = 5.0;
		double ballRightY = 6.0;

		Pitch pitch = new Pitch(ballCentreX, ballCentreY, ballLeftX, ballLeftY, ballRightX, ballRightY);

		assertEquals(ballCentreX, pitch.getBallCentreX());
		assertEquals(ballCentreY, pitch.getBallCentreY());
		assertEquals(ballLeftX, pitch.getBallLeftX());
		assertEquals(ballLeftY, pitch.getBallLeftY());
		assertEquals(ballRightX, pitch.getBallRightX());
		assertEquals(ballRightY, pitch.getBallRightY());
	}

	/**
	 * Tests the getters and setters of the Pitch class. Verifies that the values
	 * can be set and retrieved correctly.
	 */
	@Test
	public void testGettersAndSetters() {
		Pitch pitch = new Pitch();

		double ballCentreX = 1.0;
		pitch.setBallCentreX(ballCentreX);
		assertEquals(ballCentreX, pitch.getBallCentreX());

		double ballCentreY = 2.0;
		pitch.setBallCentreY(ballCentreY);
		assertEquals(ballCentreY, pitch.getBallCentreY());

		double ballLeftX = 3.0;
		pitch.setBallLeftX(ballLeftX);
		assertEquals(ballLeftX, pitch.getBallLeftX());

		double ballLeftY = 4.0;
		pitch.setBallLeftY(ballLeftY);
		assertEquals(ballLeftY, pitch.getBallLeftY());

		double ballRightX = 5.0;
		pitch.setBallRightX(ballRightX);
		assertEquals(ballRightX, pitch.getBallRightX());

		double ballRightY = 6.0;
		pitch.setBallRightY(ballRightY);
		assertEquals(ballRightY, pitch.getBallRightY());
	}

	/**
	 * Tests the toString method of the Pitch class. Verifies that the toString
	 * method returns the expected string representation of the Pitch object.
	 */
	@Test
	public void testToString() {
		double ballCentreX = 1.0;
		double ballCentreY = 2.0;
		double ballLeftX = 3.0;
		double ballLeftY = 4.0;
		double ballRightX = 5.0;
		double ballRightY = 6.0;

		Pitch pitch = new Pitch(ballCentreX, ballCentreY, ballLeftX, ballLeftY, ballRightX, ballRightY);

		String expectedToString = "Pitch [ballCentreX=" + ballCentreX + ", ballCentreY=" + ballCentreY + ", ballLeftX="
				+ ballLeftX + ", ballLeftY=" + ballLeftY + ", ballRightX=" + ballRightX + ", ballRightY=" + ballRightY
				+ "]";

		assertEquals(expectedToString, pitch.toString());
	}
}
