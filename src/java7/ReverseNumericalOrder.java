package java7;

import java.util.Comparator;

public class ReverseNumericalOrder implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return arg1-arg0;
	}


}
