package visitorpattern;
/**
 * ²Ù×÷Êý¾Ý
 * @author Administion
 *
 */
public class CEOVisitor implements Visitor{

	@Override
	public void visit(Engineer engineer) {
		System.out.println("Engineer: "+engineer.getCodeLines()+"---KPI : "+engineer.kpi);
		
	}

	@Override
	public void visit(Manager manager) {
		System.out.println("Manager: "+manager.getProducts()+"---KPI : "+manager.kpi);
		
	}

}
