package longestIncreasingSubsequence;

import java.util.ArrayList;

public class Application {
	public static void main(String args[])
	{
		int len;
		if(args.length >0)
			len = Integer.parseInt(args[0]);
		else
			len = 100;
		SequenceGen gen = new SequenceGen(len);
		ArrayList<Integer> seq = gen.GenerateSequence();
		
		SequenceFinder finder = new SequenceFinder();
		
		ArrayList<Integer> longest = finder.longestSequence(seq);
		System.out.println("Sequence: " + seq.toString());
		System.out.println("Longest Subsequence: " + longest.toString());
	}
}
