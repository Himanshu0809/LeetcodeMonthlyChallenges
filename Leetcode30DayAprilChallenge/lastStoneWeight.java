package Leetcode30DayAprilChallenge;
import java.util.Arrays;

public class lastStoneWeight {
	public int lastStoneWeight(int[] stones) {
        for(int i=stones.length-2;i>=0;i--){
            Arrays.sort(stones);
            stones[i]=stones[i+1]-stones[i];
        }
        return stones[0];
    }
}
