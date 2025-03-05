package interviewprograms;

import java.util.Comparator;

public class CricketPlayerRunsComparator implements Comparator<CricketPlayer>{

	@Override
	public int compare(CricketPlayer x,CricketPlayer y) {
		return x.runs-y.runs;
	}
}
