package longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

public class SequenceFinder {

	public ArrayList<Integer> longestSequence(ArrayList<Integer> array)
	{
		List<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int longest = 0;
		for(int i:array)
		{
			if(!tmp.isEmpty() && i > tmp.get(tmp.size()-1))
				tmp.add(i);
			else if(tmp.isEmpty())
				tmp.add(i);
			else
			{
				sequences.add(tmp);
				if(tmp.size() > sequences.get(longest).size())
					longest = sequences.size()-1;
				tmp = new ArrayList<Integer>();
				tmp.add(i);
			}
		}
		System.out.println("Sequence: " + array.toString());
		System.out.println("Longest Subsequence: " + sequences.get(longest).toString());
		return sequences.get(longest);
	}
}
