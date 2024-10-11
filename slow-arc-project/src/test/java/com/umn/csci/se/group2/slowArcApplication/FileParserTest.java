package com.umn.csci.se.group2.slowArcApplication;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

/**
 * This class contains unit tests for the FileParser class.
 */
public class FileParserTest {

	private FileParser fileParser;

	/**
	 * Tests the readPlateCoordinates method of the FileParser class.
	 *
	 * @throws IOException if an I/O error occurs.
	 */
	@Test
	public void testReadPlateCoordinates() throws IOException {
		// Provide necessary input
		String input = "310,349\n333,349\n348,345\n330,340\n311,340";
		BufferedReader mockReader = new BufferedReader(new StringReader(input));

		// Execute the method to test
		fileParser = new FileParser(); // Initialize without a file name
		StrikeZone plateCoordinates = fileParser.readPlateCoordinates(mockReader);

		// Verify the expected coordinates
		assertArrayEquals(new double[] { 310.0, 349.0 }, plateCoordinates.getFrontCloseCoordinate());
		assertArrayEquals(new double[] { 333.0, 349.0 }, plateCoordinates.getBackCloseCoordinate());
		assertArrayEquals(new double[] { 348.0, 345.0 }, plateCoordinates.getEdgeCoordinate());
		assertArrayEquals(new double[] { 330.0, 340.0 }, plateCoordinates.getBackFarCoordinate());
		assertArrayEquals(new double[] { 311.0, 340.0 }, plateCoordinates.getFrontFarCoordinate());
	}

	/**
	 * Tests the readBatterCoordinates method of the FileParser class.
	 *
	 * @throws IOException if an I/O error occurs.
	 */
	@Test
	public void testReadBatterCoordinates() throws IOException {
		// Provide necessary input
		String input = "1.0,2.0\n3.0,4.0\n5.0,6.0\n7.0,8.0";
		BufferedReader mockReader = new BufferedReader(new StringReader(input));

		// Execute the method to test
		fileParser = new FileParser(); // Initialize without a file name
		StrikeZone plateCoordinates = new StrikeZone();
		fileParser.readBatterCoordinates(mockReader, plateCoordinates);

		// Verify the expected coordinates
		assertArrayEquals(new double[] { 1.0, 2.0 }, plateCoordinates.getShoulder1Coordinate());
		assertArrayEquals(new double[] { 3.0, 4.0 }, plateCoordinates.getShoulder2Coordinate());
		assertArrayEquals(new double[] { 5.0, 6.0 }, plateCoordinates.getKnee1Coordinate());
		assertArrayEquals(new double[] { 7.0, 8.0 }, plateCoordinates.getKnee2Coordinate());
	}

	/**
	 * Tests the readPitchCoordinatesAndAnalyze method of the FileParser class.
	 *
	 * @throws IOException            if an I/O error occurs.
	 * @throws NoSuchFieldException   if a field is not found.
	 * @throws IllegalAccessException if access to a field is illegal.
	 */
	@Test
	public void testReadPitchCoordinatesAndAnalyze() throws IOException, NoSuchFieldException, IllegalAccessException {
		// Provide necessary input with comma-separated values
		String input = "10691,6,126,3,126,10,126\n" + "10692,34,138,31,138,38,138\n" + "10693,63,152,59,152,67,152\n"
				+ "10694,93,168,89,168,97,168\n" + "10695,121,185,116,185,125,185\n";
		BufferedReader mockReader = new BufferedReader(new StringReader(input));

		// Mock PitchAnalyzer
		PitchAnalyzer mockAnalyzer = mock(PitchAnalyzer.class);
		when(mockAnalyzer.determinePitchOutcome(any(StrikeZone.class), any(Pitch.class))).thenReturn(true);

		assertFalse(mockAnalyzer.determinePitchOutcome(any(StrikeZone.class), any(Pitch.class)));
	}
}
