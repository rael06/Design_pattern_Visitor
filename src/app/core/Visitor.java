package app.model.core;

import app.model.ToVisit1;
import app.model.ToVisit2;
import app.model.ToVisit3;

public interface Visitor {
	void visit(ToVisit1 toVisit);
	void visit(ToVisit2 toVisit);
	void visit(ToVisit3 toVisit);
}
