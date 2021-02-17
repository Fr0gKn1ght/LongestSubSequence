package longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

public class SequenceFinder {

	public ArrayList<Integer> longestSequence(ArrayList<Integer> array)
	{
		//Contains all increasing subsequences in the array
		List<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();
		
		//Current sequence being evaluated. Reset once a lower or equal number is found.
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		
		//index of the current longest sequence
		int longest = 0;
		for(int i:array)
		{
			//Adds element to the current subsequence if it is larger than the previous element.
			if(!tmp.isEmpty() && i > tmp.get(tmp.size()-1))
				tmp.add(i);
			//only relevant for the very first subsequence since tmp is empty.
			else if(tmp.isEmpty())
				tmp.add(i);
			//Executes if the current element of the main sequence if found to be less than or equal to the previous element of the current subsequence
			else
			{
				//Current subsequence is added to the sequence list and is compared to the current largest subsequence.
				//If the current subsequence if found to be larger, 'longest' is updated to the index of the current subsequence
				sequences.add(tmp);
				if(tmp.size() > sequences.get(longest).size())
					longest = sequences.size()-1;
				//tmp becomes a fresh array list and adds the current element.
				tmp = new ArrayList<Integer>();
				tmp.add(i);
			}
		}
		return sequences.get(longest);
	}
}
