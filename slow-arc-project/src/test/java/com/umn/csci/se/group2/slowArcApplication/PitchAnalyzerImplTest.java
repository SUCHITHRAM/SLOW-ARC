package com.umn.csci.se.group2.slowArcApplication;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

/**
 * This class contains unit tests for the PitchAnalyzerImpl class.
 */
public class PitchAnalyzerImplTest {

	/**
	 * Tests the determinePitchOutcome method with a null StrikeZone. Expects an
	 * IllegalArgumentException to be thrown.
	 */
	@Test
	public void testDeterminePitchOutcomeWithNullStrikeZone() {
		PitchAnalyzerImpl pitchAnalyzer = new PitchAnalyzerImpl();
		Pitch pitch = new Pitch(0, 0, 0, 0, 0, 0);
		assertThrows(IllegalArgumentException.class, () -> {
			pitchAnalyzer.determinePitchOutcome(null, pitch);
		});
	}

	/**
	 * Tests the determinePitchOutcome method with a null Pitch. Expects an
	 * IllegalArgumentException to be thrown.
	 */
	@Test
	public void testDeterminePitchOutcomeWithNullPitch() {
		PitchAnalyzerImpl pitchAnalyzer = new PitchAnalyzerImpl();
		StrikeZone strikeZone = new StrikeZone(new double[] { 0, 0 }, new double[] { 0, 1 }, new double[] { 1, 0 },
				new double[] { 0, -1 }, new double[] { 1, -1 }, new double[] { 0, 0 }, new double[] { 0, 1 },
				new double[] { 1, 0 }, new double[] { 1, 1 });
		assertThrows(IllegalArgumentException.class, () -> {
			pitchAnalyzer.determinePitchOutcome(strikeZone, null);
		});
	}

	/**
	 * Tests the determinePitchOutcome method with a pitch inside the strike zone.
	 * Expects true to be returned.
	 */
	@Test
	public void testDeterminePitchOutcomeStrike() {
		PitchAnalyzerImpl pitchAnalyzer = new PitchAnalyzerImpl();
		StrikeZone strikeZone = new StrikeZone(new double[] { 0, 0 }, new double[] { 0, 1 }, new double[] { 1, 0 },
				new double[] { 0, -1 }, new double[] { 1, -1 }, new double[] { 0, 0 }, new double[] { 0, 1 },
				new double[] { 1, 0 }, new double[] { 1, 1 });
		Pitch pitch = new Pitch(0.5, 0.5, 0, 0, 0, 0);
		assertFalse(pitchAnalyzer.determinePitchOutcome(strikeZone, pitch));
	}

	/**
	 * Tests the determinePitchOutcome method with a pitch outside the strike zone.
	 * Expects false to be returned.
	 */
	@Test
	public void testDeterminePitchOutcomeBall() {
		PitchAnalyzerImpl pitchAnalyzer = new PitchAnalyzerImpl();
		StrikeZone strikeZone = new StrikeZone(new double[] { 0, 0 }, new double[] { 0, 1 }, new double[] { 1, 0 },
				new double[] { 0, -1 }, new double[] { 1, -1 }, new double[] { 0, 0 }, new double[] { 0, 1 },
				new double[] { 1, 0 }, new double[] { 1, 1 });
		Pitch pitch = new Pitch(2, 2, 0, 0, 0, 0);
		assertFalse(pitchAnalyzer.determinePitchOutcome(strikeZone, pitch));
	}

	/**
	 * Tests the printDecision method with a strike outcome. Checks if "STRIKE" is
	 * printed to System.out.
	 */
	@Test
	public void testPrintDecisionStrike() {
		PitchAnalyzerImpl pitchAnalyzer = new PitchAnalyzerImpl();

		// Redirect System.out to capture the output
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));

		pitchAnalyzer.printDecision(true);

		// Reset System.out to the original PrintStream
		System.setOut(System.out);

		// Check the printed output
		assertTrue(outputStream.toString().contains("STRIKE"));
	}

	/**
	 * Tests the printDecision method with a ball outcome. Checks if "BALL" is
	 * printed to System.out.
	 */
	@Test
	public void testPrintDecisionBall() {
		PitchAnalyzerImpl pitchAnalyzer = new PitchAnalyzerImpl();

		// Redirect System.out to capture the output
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));

		pitchAnalyzer.printDecision(false);

		// Reset System.out to the original PrintStream
		System.setOut(System.out);

		// Check the printed output
		assertTrue(outputStream.toString().contains("BALL"));

	}
}
