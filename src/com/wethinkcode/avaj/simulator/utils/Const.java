package com.wethinkcode.avaj.simulator.utils;

public final class Const {
    private Const() {
    }

//
    public static final int FILE = 0;
    public static final String SPACE = " ";
    public static final int SIMULATION_COUNT = 0;
    public static final int POSITIVE_NUMBER = 1;
    public static final int AIRCRAFT_TYPE = 0;
    public static final int AIRCRAFT_NAME = 1;
    public static final int AIRCRAFT_LONGITUDE = 2;
    public static final int AIRCRAFT_LATITUDE = 3;
    public static final int AIRCRAFT_HEIGHT = 4;

//    Exception Messages
    public static final String FILE_NOT_FOUND = "Path to Scenario file not found ";
    public static final String ERROR_READING_FILE = "Something went wrong reading file ";
    public static final String ERROR_WRITING_FILE = "Something went wrong writing to file: 'simulation.txt' ";
    public static final String NUMBER_FORMAT_ERROR = "A non-integer value was given for number of simulations.";
    public static final String INDEX_ERROR = "Specify scenario file";
    public static final String SIMULATION_COUNT_ERROR = "Invalid simulations count, expected a positive number greater " +
            "than 0";
    public static final String INCORRECT_AIRCRAFT_TYPE = "Incorrect aircraft specified, check scenario file and try again.";
    public static final String INVALID_WEATHER = "The weather condition is not valid";

//    File names
    public static final String SCENARIO_FILE = "scenario.txt";
    public static final String SIMULATION_FILE = "simulation.txt";

//    Aircrafts
    public static final String HELICOPTER = "helicopter";
    public static final String JET_PLANE = "jetplane";
    public static final String BALLON = "baloon";

//    weather
    public static final String SUN = "SUN";
    public static final String RAIN = "RAIN";
    public static final String FOG = "FOG";
    public static final String SNOW = "SNOW";


}
