//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int[][] edge = new int[m][2];
            for(int i=0;i<m;i++){
                edge[i][0]=sc.nextInt();
                edge[i][1]=sc.nextInt();
            }
            int src=sc.nextInt();
            Solution obj = new Solution();
            int res[] = obj.shortestPath(edge,n,m,src);
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        boolean vis[]=new boolean[n];
        for(int i=0;i<m;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        int res[]=new int[n];
        Arrays.fill(res,1000000);
        res[src]=0;
        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]){
                continue;
            }
            vis[curr]=true;
            for(int val:list.get(curr)){
                if(res[curr]+1<res[val]){
                    res[val]=res[curr]+1;
                    q.add(val);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(res[i]==1000000){
                res[i]=-1;
            }
        }
        return res;
    }
}