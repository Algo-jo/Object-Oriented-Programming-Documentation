package midexercise;

import java.util.ArrayList;

public class Visitor {
	protected String visitorCode, visitorName;
	protected int eMoneyBalance;
	protected ArrayList visitHistory = new ArrayList();
	
	public Visitor(String vc, String vn, int bl) {
		visitorCode = vc;
		visitorName = vn;
		eMoneyBalance = bl;
	}
	public void addVisit(int day) {
		visitHistory.add(day);
	}
	public ArrayList getVisitHistory() {
		return visitHistory;
	}
	public void deductEmoney(int deduction) throws Exception{
		if (eMoneyBalance - deduction < 0) 
			throw new Exception("Insufficient fund for "+visitorName);
		
		eMoneyBalance -= deduction;
	}
}
