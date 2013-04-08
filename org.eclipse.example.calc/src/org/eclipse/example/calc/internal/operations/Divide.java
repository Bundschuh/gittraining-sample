package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;
import org.eclipse.example.calc.internal.exceptions.ZeroDivisionException;

public class Divide extends AbstractOperation implements BinaryOperation {

	@Override
	public String getName() {
		return "/";
	}

	@Override
	public float perform(float arg1, float arg2) throws ZeroDivisionException {

		if (arg1 == 0) throw new ZeroDivisionException();
		return arg1 / arg2;
	}

}
