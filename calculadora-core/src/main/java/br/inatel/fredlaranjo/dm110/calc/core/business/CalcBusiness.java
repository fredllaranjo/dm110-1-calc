package br.inatel.fredlaranjo.dm110.calc.core.business;

import br.inatel.fredlaranjo.dm110.calc.vm.ResultVm;

/**
 * Handles the calculator business logic.
 * @author fredlaranjo
 *
 */
public class CalcBusiness {

	public ResultVm sum(int first, int second) {
		int result = first + second;
		return new ResultVm(first, second, result);
	}

	public ResultVm subtract(int first, int second) {
		int result = first - second;
		return new ResultVm(first, second, result);
	}
}
