import java.util.ArrayList;
import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints = new ArrayList<Integer>();

	//TODO constructor
	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage() {
		//TODO
		int total = 0;
		for (int point : labPoints) {
			total = total + point;
		}
		double avg = (double) total / labPoints.size();
		return avg;
	}

	public boolean hasSignature() {
		//TODO
		if (labPoints.size() > 8)
			return true;
		else
			return false;
	}
}


class Course {
	List<Student> lista = new ArrayList<Student>();

	public Course(List<Student> lista) {
		this.lista = lista;
	}

	int totalSignatures () {
		int vkupno = 0;
		for (Student s : lista) {
			if (s.hasSignature())
				vkupno ++;
		}
		return vkupno;
	}
	double averagePoints () {
		double totalAvg = 0;
		double result;
		for (Student s : lista) {
			double avgPerStudent = s.getAverage();
			totalAvg += avgPerStudent;
		}
		result = totalAvg / lista.size();
		return result;
	}
}