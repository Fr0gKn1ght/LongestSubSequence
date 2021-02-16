package longestIncreasingSubsequence;

import java.util.ArrayList;

public class Application {
	public static void main(String args[])
	{
		SequenceGen gen = new SequenceGen(100);
		ArrayList<Integer> seq = gen.GenerateSequence();
		
		SequenceFinder finder = new SequenceFinder();
		
		finder.longestSequence(seq);
	}
}
