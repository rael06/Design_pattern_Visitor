package app.model;

import app.model.core.ToVisit;
import app.model.core.Visitor;

public class ToVisit3 implements ToVisit {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
