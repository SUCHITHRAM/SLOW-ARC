package com.umn.csci.se.group2.slowArcApplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class contains unit tests for the StrikeZone class.
 */
public class StrikeZoneTest {

	private StrikeZone strikeZone;

	/**
	 * Set up a new StrikeZone object before each test.
	 */
	@BeforeEach
	public void setUp() {
		strikeZone = new StrikeZone();
	}

	/**
	 * Tests the set and get methods for the front close coordinate of the
	 * StrikeZone.
	 */
	@Test
	public void testSetAndGetFrontCloseCoordinate() {
		double[] frontCloseCoordinate = { 1.0, 2.0 };
		strikeZone.setFrontCloseCoordinate(frontCloseCoordinate);
		assertArrayEquals(frontCloseCoordinate, strikeZone.getFrontCloseCoordinate());
	}

	/**
	 * Tests the set and get methods for the back close coordinate of the
	 * StrikeZone.
	 */
	@Test
	public void testSetAndGetBackCloseCoordinate() {
		double[] backCloseCoordinate = { 3.0, 4.0 };
		strikeZone.setBackCloseCoordinate(backCloseCoordinate);
		assertArrayEquals(backCloseCoordinate, strikeZone.getBackCloseCoordinate());
	}

	/**
	 * Tests the set and get methods for the edge coordinate of the StrikeZone.
	 */
	@Test
	public void testSetAndGetEdgeCoordinate() {
		double[] edgeCoordinate = { 5.0, 6.0 };
		strikeZone.setEdgeCoordinate(edgeCoordinate);
		assertArrayEquals(edgeCoordinate, strikeZone.getEdgeCoordinate());
	}

	/**
	 * Tests the set and get methods for the back far coordinate of the StrikeZone.
	 */
	@Test
	public void testSetAndGetBackFarCoordinate() {
		double[] backFarCoordinate = { 7.0, 8.0 };
		strikeZone.setBackFarCoordinate(backFarCoordinate);
		assertArrayEquals(backFarCoordinate, strikeZone.getBackFarCoordinate());
	}

	/**
	 * Tests the set and get methods for the front far coordinate of the StrikeZone.
	 */
	@Test
	public void testSetAndGetFrontFarCoordinate() {
		double[] frontFarCoordinate = { 9.0, 10.0 };
		strikeZone.setFrontFarCoordinate(frontFarCoordinate);
		assertArrayEquals(frontFarCoordinate, strikeZone.getFrontFarCoordinate());
	}

	/**
	 * Tests the set and get methods for the shoulder 1 coordinate of the
	 * StrikeZone.
	 */
	@Test
	public void testSetAndGetShoulder1Coordinate() {
		double[] shoulder1Coordinate = { 11.0, 12.0 };
		strikeZone.setShoulder1Coordinate(shoulder1Coordinate);
		assertArrayEquals(shoulder1Coordinate, strikeZone.getShoulder1Coordinate());
	}

	/**
	 * Tests the set and get methods for the shoulder 2 coordinate of the
	 * StrikeZone.
	 */
	@Test
	public void testSetAndGetShoulder2Coordinate() {
		double[] shoulder2Coordinate = { 13.0, 14.0 };
		strikeZone.setShoulder2Coordinate(shoulder2Coordinate);
		assertArrayEquals(shoulder2Coordinate, strikeZone.getShoulder2Coordinate());
	}

	/**
	 * Tests the set and get methods for the knee 1 coordinate of the StrikeZone.
	 */
	@Test
	public void testSetAndGetKnee1Coordinate() {
		double[] knee1Coordinate = { 15.0, 16.0 };
		strikeZone.setKnee1Coordinate(knee1Coordinate);
		assertArrayEquals(knee1Coordinate, strikeZone.getKnee1Coordinate());
	}

	/**
	 * Tests the set and get methods for the knee 2 coordinate of the StrikeZone.
	 */
	@Test
	public void testSetAndGetKnee2Coordinate() {
		double[] knee2Coordinate = { 17.0, 18.0 };
		strikeZone.setKnee2Coordinate(knee2Coordinate);
		assertArrayEquals(knee2Coordinate, strikeZone.getKnee2Coordinate());
	}
}
