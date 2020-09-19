package app.model;

import app.model.core.Visitor;

public class TheVisitor implements Visitor {

	@Override
	public void visit(ToVisit1 toVisit) {
		System.out.println("Le visité est : " + toVisit.getClass().getSimpleName());
		
	}

	@Override
	public void visit(ToVisit2 toVisit) {
		System.out.println("Le visité est : " + toVisit.getClass().getSimpleName());
		
	}

	@Override
	public void visit(ToVisit3 toVisit) {
		System.out.println("Le visité est : " + toVisit.getClass().getSimpleName());
		
	}

}
