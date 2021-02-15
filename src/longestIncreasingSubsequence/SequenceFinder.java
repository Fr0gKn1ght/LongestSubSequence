package longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

public class SequenceFinder {

	public ArrayList<Integer> longestSequence(int[] array)
	{
		List<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int longest = 0;
		//int idx = 0;
		for(int i:array)
		{
			if(!tmp.isEmpty() && i > tmp.get(tmp.size()-1))
				tmp.add(i);
			else
			{
				sequences.add(tmp);
				if(tmp.size() > sequences.get(longest).size())
					longest = sequences.size()-1;
				tmp = new ArrayList<Integer>();
				
			}
		}
		return sequences.get(longest);
	}
}
