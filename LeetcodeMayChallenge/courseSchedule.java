package LeetcodeMayChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class courseSchedule {
	class Solution {
	    public boolean canFinish(int numCourses, int[][] prerequisites) {
		
			// adjency list based graph initalization
	        ArrayList<Integer>[] graph = new ArrayList[numCourses];
	        for(int i = 0; i < numCourses; i++) {
	            graph[i] = new ArrayList();
	        }
	        
	        int[] indegree = new int[numCourses];
	        for(int[] e: prerequisites) {
	            graph[e[0]].add(e[1]); // adding directed edge
	            indegree[e[1]]++; // indegree update for courses
	        }
	        
			// queue intilalization and fill all courses having 0 indegree or no prerequisites
	        Queue<Integer> queue = new LinkedList();
	        for(int i = 0; i < numCourses; i++) {
	            if(indegree[i] == 0)
	                queue.add(i);
	        }
	        
			// BFS traversal until finish all course or can't take more courses
	        while(!queue.isEmpty()) {
	            int current = queue.poll();
	            for(int c : graph[current]) {
	                indegree[c]--;
	                if(indegree[c] == 0)
	                    queue.add(c);
	            }
	            numCourses--;
	        }
	        
	        return numCourses == 0; // check if all courses taken
	    }
	}
}
