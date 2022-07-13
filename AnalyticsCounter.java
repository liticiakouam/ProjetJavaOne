package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;


public class AnalyticsCounter {

	public static void main(String args[]) throws IOException {

		//ecriture dans le fichier de sortie
		ISymptomWrite symptomWrite = new WriteSymptomDataToFile("result.out");
		symptomWrite.writeToFile(symptomsWithOccurrences);

	}
}
