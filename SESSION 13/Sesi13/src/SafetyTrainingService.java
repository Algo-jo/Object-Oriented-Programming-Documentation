
public class SafetyTrainingService {
	
	public void doSafetyTraining(Student s) {
		if(s.isHasSafetyTraining()) {
			System.out.printf("Student has already attempted safety training");
		}
		else {
			s.attemptSafetyTraining();
			System.out.println("Student has succesfully safety training");
		}
	}

}
