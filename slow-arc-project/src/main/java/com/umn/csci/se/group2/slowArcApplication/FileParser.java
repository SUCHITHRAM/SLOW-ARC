package com.umn.csci.se.group2.slowArcApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.umn.csci.se.group2.slowArcApplication.helpers.CheckPointInsidePolygon;

/**
 * This class represents a file parser for reading and analyzing soft ball pitch
 * data from a CSV file. It follows the Single Responsibility Principle by
 * having separate methods for reading plate coordinates, batter coordinates,
 * and pitch coordinates, and analyzing the pitch. It also utilizes the
 * Dependency Inversion Principle by relying on the abstraction (PitchAnalyzer)
 * instead of concrete implementation.
 */
public class FileParser {

	/** The path of the file to be parsed. */
	private String file;

	/**
	 * Default constructor for FileParser.
	 */
	public FileParser() {
		super();
	}

	/**
	 * Parameterized constructor for FileParser.
	 *
	 * @param file The path of the file to be parsed.
	 */
	public FileParser(String file) {
		super();
		this.file = file;
	}

	/**
	 * Gets the file path.
	 *
	 * @return The file path.
	 */
	public String getFile() {
		return file;
	}

	/**
	 * Sets the file path.
	 *
	 * @param file The file path to set.
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * Reads the coordinates from the file and performs pitch analysis. Follows the
	 * Open/Closed Principle by allowing extension without modification.
	 */
	public void readCoordinates() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(this.file));
			StrikeZone plateCoordinates = readPlateCoordinates(reader);
			readBatterCoordinates(reader, plateCoordinates);
			readPitchCoordinatesAndAnalyze(reader, plateCoordinates);

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reads plate coordinates from the given reader.
	 *
	 * @param reader The BufferedReader to read from.
	 * @return The StrikeZone object with plate coordinates.
	 * @throws IOException if an I/O error occurs.
	 */
	public StrikeZone readPlateCoordinates(BufferedReader reader) throws IOException {
		StrikeZone plateCoordinates = new StrikeZone();
		for (int i = 0; i < 5; i++) {
			String line = reader.readLine();
			String[] coordinates = line.split(",");
			switch (i) {
			case 0:
				plateCoordinates.setFrontCloseCoordinate(
						new double[] { Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]) });
				break;
			case 1:
				plateCoordinates.setBackCloseCoordinate(
						new double[] { Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]) });
				break;
			case 2:
				plateCoordinates.setEdgeCoordinate(
						new double[] { Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]) });
				break;
			case 3:
				plateCoordinates.setBackFarCoordinate(
						new double[] { Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]) });
				break;
			case 4:
				plateCoordinates.setFrontFarCoordinate(
						new double[] { Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]) });
				break;
			}
		}
		return plateCoordinates;
	}

	/**
	 * Reads batter coordinates from the given reader and sets them in the provided
	 * StrikeZone object.
	 *
	 * @param reader           The BufferedReader to read from.
	 * @param plateCoordinates The StrikeZone object to set batter coordinates.
	 * @throws IOException if an I/O error occurs.
	 */
	public void readBatterCoordinates(BufferedReader reader, StrikeZone plateCoordinates) throws IOException {
		for (int i = 0; i < 4; i++) {
			String line = reader.readLine();
			String[] coordinates = line.split(",");
			switch (i) {
			case 0:
				plateCoordinates.setShoulder1Coordinate(
						new double[] { Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]) });
				break;
			case 1:
				plateCoordinates.setShoulder2Coordinate(
						new double[] { Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]) });
				break;
			case 2:
				plateCoordinates.setKnee1Coordinate(
						new double[] { Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]) });
				break;
			case 3:
				plateCoordinates.setKnee2Coordinate(
						new double[] { Double.parseDouble(coordinates[0]), Double.parseDouble(coordinates[1]) });
				break;
			}
		}
	}

	/**
	 * Reads pitch coordinates from the given reader, analyzes the pitch using a
	 * PitchAnalyzer, and prints the decision based on the analysis.
	 *
	 * @param reader           The BufferedReader to read from.
	 * @param plateCoordinates The StrikeZone object for pitch analysis.
	 * @throws IOException if an I/O error occurs.
	 */
	public void readPitchCoordinatesAndAnalyze(BufferedReader reader, StrikeZone plateCoordinates) throws IOException {
		String line;
		boolean pitchOutcome = false;
		CheckPointInsidePolygon checkEdgeCases = new CheckPointInsidePolygon();
		PitchAnalyzer analyzeObj = new PitchAnalyzerImpl();
		while ((line = reader.readLine()) != null) {
			String[] pitchData = line.split(",");
			Pitch pitchCoordinates = new Pitch(Double.parseDouble(pitchData[1]), Double.parseDouble(pitchData[2]),
					Double.parseDouble(pitchData[3]), Double.parseDouble(pitchData[4]),
					Double.parseDouble(pitchData[5]), Double.parseDouble(pitchData[6]));
			if (checkEdgeCases.checkEdgeCaseForShiftX(Double.parseDouble(pitchData[1]),
					Double.parseDouble(pitchData[2]))) {
				break;
			}
			pitchOutcome = analyzeObj.determinePitchOutcome(plateCoordinates, pitchCoordinates);
			if (pitchOutcome) {
				break;
			}
		}
		analyzeObj.printDecision(pitchOutcome);
	}

	/**
	 * Returns a string representation of the FileParser object.
	 *
	 * @return A string representation of the FileParser object.
	 */
	@Override
	public String toString() {
		return "FileParser [file=" + file + "]";
	}
}
