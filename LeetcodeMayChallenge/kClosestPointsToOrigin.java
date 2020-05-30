package LeetcodeMayChallenge;

import java.util.Arrays;

public class kClosestPointsToOrigin {
	public int[][] kClosest(int[][] points, int k) {
        int n=points.length;
        int ans[][]=new int[k][2];
        int dis[]=new int[n];
        for(int i=0;i<n;i++){
            dis[i]=dist(points[i]);
        }
        Arrays.sort(dis);
        int res=dis[k-1];
        int ind=0;
        for(int i=0;i<n;i++){
            if(dist(points[i])<=res){
                ans[ind++]=points[i];
            }
        }
        return ans;
    }
    public int dist(int[] point){
        return point[0]*point[0]+point[1]*point[1];
    }
}
