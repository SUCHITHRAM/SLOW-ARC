package com.umn.csci.se.group2.slowArcApplication;

import java.io.IOException;

/**
 * The App class serves as the entry point for the SLOWARC application,
 * processing a CSV file that contains pitch and strike zone data. It conducts
 * checks for consistent pitch and strike zone data, and if found, proceeds to
 * read and process coordinates from the file. In the event of inconsistencies,
 * the application displays appropriate error messages. If the data is deemed
 * valid, this class further determines whether the pitch is a strike or a ball.
 */

public class App {

	/**
	 * The main method of the application.
	 *
	 * @param args Command-line arguments. Expects a single argument - the path to
	 *             the input CSV file.
	 */
	public static void main(String[] args) {
		// Check if the correct number of command-line arguments is provided
		if (args.length != 1) {
			System.out.println("Usage: java App <csvFilePath>");
			return;
		}

		// Provide the path to the input CSV file
		String csvFilePath = args[0];

		// Create a FileParser instance with the specified CSV file path
		FileParser file = new FileParser(csvFilePath);
		file.readCoordinates();
	}
}
