package model;

import java.util.ArrayList;
import java.util.List;

import util.UtilFile;

public enum PersonModelProvider {
	INSTANCE(getFilePath());

	private List<Person> persons;

	private PersonModelProvider() {
		persons = new ArrayList<Person>();
	}

	
	private PersonModelProvider(String inputdata) {
		List<String> contents = UtilFile.readFile(inputdata);
		List<List<String>> tableContents = UtilFile.convertTableContents(contents);

		persons = new ArrayList<Person>();
		for (List<String> iList : tableContents) {                        
			persons.add(new Person(iList.get(0), iList.get(1), iList.get(2),iList.get(3)));
		}
	}
	
	

	public static String getFilePath() {
		return "C:/Users/Rajasree/eclipse-workspace/project0920-add-delete-Balakrishnan/src/inputdata.txt";
	}

	public List<Person> getPersons() {
		return persons;
	}
	public static String putFilePath() {
		return "C:/Users/Rajasree/eclipse-workspace/project0920-add-delete-Balakrishnan/src/outputdata.csv";
	}

	
}
