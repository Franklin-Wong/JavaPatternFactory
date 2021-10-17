package visitorpattern;

import java.util.ArrayList;
import java.util.List;

public class BusinessReport {

	private List<Staff> mStaff = new ArrayList<>();

	public BusinessReport( ) {
		mStaff.add(new Engineer("Υ����"));
		mStaff.add(new Engineer("Υ���˹ݺ�"));
		mStaff.add(new Engineer("�건��"));
		mStaff.add(new Manager("δ��ͷ"));
		
	}
	public void showReport(Visitor visitor) {
		for (Staff staff : mStaff) {
			staff.accept(visitor);
		}
	}
	
	
}
