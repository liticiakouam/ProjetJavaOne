package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;


public class AnalyticsCounter {

	public static void main(String args[]) throws IOException {

		//lecture des symptomes
		ISymptomReader symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptoms = symptomReader.getSymptoms();

	}
}
