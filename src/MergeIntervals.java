import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MergeIntervals {

	
	public class Interval {
	    int start;
	    int end;
	    Interval() { start = 0; end = 0; }
	    Interval(int s, int e) { start = s; end = e; }
	}
	
	public class IntervalComparator implements Comparator<Interval> {

		@Override
		public int compare(Interval o1, Interval o2) {
			if(o1.start == o2.start){
				return o1.end - o2.end;
			} else {
				return o1.start - o2.start;
			}
		}
		
	}
	
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		Collections.sort(intervals, new IntervalComparator());
		ArrayList<Interval> ret = new ArrayList<Interval>();
		if(intervals.size() == 0){
			return ret;
		} else {
			Interval interval = intervals.get(0);
			int start = interval.start;
			int end = interval.end;
			for(int i=1; i<intervals.size(); i++){
				interval = intervals.get(i);
				if(interval.start <= end){
					end = Math.max(end, interval.end);
				} else {
					Interval newInter = new Interval(start, end);
					ret.add(newInter);
					start = interval.start;
					end = interval.end;
				}
			}
			Interval newInter = new Interval(start, end);
			ret.add(newInter);
			return ret;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
