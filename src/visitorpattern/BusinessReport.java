package visitorpattern;

import java.util.ArrayList;
import java.util.List;

public class BusinessReport {

	private List<Staff> mStaff = new ArrayList<>();

	public BusinessReport( ) {
		mStaff.add(new Engineer("Î¥·¨ºÍ"));
		mStaff.add(new Engineer("Î¥ºìÈË¹ÝºÍ"));
		mStaff.add(new Engineer("¸ê±´¶û"));
		mStaff.add(new Manager("Î´¶îÍ·"));
		
	}
	public void showReport(Visitor visitor) {
		for (Staff staff : mStaff) {
			staff.accept(visitor);
		}
	}
	
	
}
