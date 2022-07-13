package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;


public class AnalyticsCounter {

	public static void main(String args[]) throws IOException {
		
		//comptage du nombre d'occurrences de chaque symptome
		ISymptomsCount counter = new SymptomsCounter();
		Map<String, Integer> symptomsWithOccurrences = counter.countSymptoms(symptoms);
	}
}
