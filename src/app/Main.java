package app;

import app.model.TheVisitor;
import app.model.ToVisit1;
import app.model.ToVisit2;
import app.model.ToVisit3;

public class Main {
	public static void main(String[] args) {
		TheVisitor theVisitor = new TheVisitor();
		
		ToVisit1 toVisit1 = new ToVisit1();
		ToVisit2 toVisit2 = new ToVisit2();
		ToVisit3 toVisit3 = new ToVisit3();
		
		theVisitor.visit(toVisit1);
		theVisitor.visit(toVisit2);
		theVisitor.visit(toVisit3);
	}
}
