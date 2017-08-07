package prob2C.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import prob2C.Section;
import prob2C.StudentSection;
import prob2C.StudentSectionFactory;

public class Main {
	
	public static void main(String[] args) {
		Collection<DataRecord> data = Database.h.values();
		
		List<Section> section = new ArrayList<>();
		
		for (DataRecord dataRecord : data) {
			
			StudentSection studentSection = StudentSectionFactory.createStudentSection(dataRecord.getName(), dataRecord.getId(), dataRecord.getSectionNum());
			
			section.add(studentSection.section);
		}
		
		Iterator<Section> it = section.iterator();

		while (it.hasNext()) {
			System.out.println(it.next().getStudent());
		}
	}

}
