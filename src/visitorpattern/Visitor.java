package visitorpattern;

public interface Visitor {
	void visit(Engineer engineer);
	void visit(Manager manager);

}
