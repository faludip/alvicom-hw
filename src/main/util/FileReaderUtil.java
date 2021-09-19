package main.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReaderUtil {

	public static List<List<String>> csvReader(String fileName) throws IOException {
		List<List<String>> lines = new ArrayList<>();
		BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
		String row;
		while ((row = csvReader.readLine()) != null) {
			List<String> lineData = new ArrayList<>();
			lineData.addAll(Arrays.asList(row.split(",")));
			lines.add(lineData);
		}
		csvReader.close();
		return lines;
	}

}
