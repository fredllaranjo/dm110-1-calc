package br.inatel.fredlaranjo.dm110.calc.vm;

/**
 * VM representation that holds inputed values and operation results.
 * @author fredlaranjo
 *
 */
public class ResultVm {

	private int first;
	private int second;
	private int result;

	public ResultVm() {
	}

	public ResultVm(int first, int second, int result) {
		this.first = first;
		this.second = second;
		this.result = result;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + first;
		result = prime * result + this.result;
		result = prime * result + second;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultVm other = (ResultVm) obj;
		if (first != other.first)
			return false;
		if (result != other.result)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Result [first=" + first + ", second=" + second + ", result=" + result + "]";
	}

}
