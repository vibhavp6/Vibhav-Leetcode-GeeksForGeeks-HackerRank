//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      List<List<String>> accounts=new ArrayList<>();
      for (int i = 0; i < n; i++)
       {
        ArrayList<String> temp=new ArrayList<>();
        int x=sc.nextInt();
        for(int j = 0; j < x; j++)
           {
             String s1=sc.next();
             temp.add(s1);
           }
        accounts.add(temp);
       }
      Solution obj = new Solution();
      List<List<String>> res = obj.accountsMerge(accounts);
      Collections.sort(res, new Comparator<List<String>>() {
                @Override   public int compare(List<String> a,
                                              List<String> b) {
                    int al = a.size();
                    int bl = b.size();
                    int min = Math.min(al, bl);
                    for (int i = 0; i < min; i++) {
                        String xx=a.get(i);
                        String yy=b.get(i);
                        if (xx.compareTo(yy)<0)
                            return -1;
                        else if (xx.compareTo(yy)>0)
                            return 1;
                    }
                    if (al < bl)
                        return -1;
                    else if (al > bl)
                        return 1;
                    return -1;
                }
            });
      System.out.print("[");
      for (int i = 0; i < res.size(); ++i)
        {
          System.out.print("[");
          for (int j = 0; j < res.get(i).size(); j++)
             {
                if (j != res.get(i).size() - 1)
                     System.out.print(res.get(i).get(j)+", ");
                else
                     System.out.print(res.get(i).get(j));
             }
          if (i != res.size() - 1)
             System.out.println("], ");
          else
             System.out.print("]");
        }
       System.out.println("]");
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  static List<List<String>> accountsMerge(List<List<String>> accounts) {
   
    int n = accounts.size();
    DisjointSet ds = new DisjointSet(n);
    
    //Step - 1 create map for mail and its parent
    
    HashMap<String , Integer> mapMailNode = new HashMap<>();
    
    for(int i = 0 ; i<n ; i++){
        for(int j = 1 ; j < accounts.get(i).size() ; j++){
            String mail = accounts.get(i).get(j);
            
            if(mapMailNode.containsKey(mail) == false){
                mapMailNode.put(mail , i);
            }
            else {
                ds.unionBySize(i , mapMailNode.get(mail));
            }
        }
    }
    
    //step - 2 create mergeMails array to store overlapped mailID
    
    ArrayList<String>[] mergeMail = new ArrayList[n];
    
    for(int i = 0 ; i <n ; i++){
        mergeMail[i] = new ArrayList<String>();
    }
    
    for(Map.Entry<String, Integer> it : mapMailNode.entrySet()){
        String mail = it.getKey();
        int node = ds.findParent(it.getValue());
        mergeMail[node].add(mail);
    }
    
    //step - 3 create Ans list with sorted email list
    
    List<List<String>> ans = new ArrayList<>();
    
    for(int i = 0 ; i<n ; i++){
        if(mergeMail[i].size() != 0){
            Collections.sort(mergeMail[i]);
            List<String> temp = new ArrayList<>();
            temp.add(accounts.get(i).get(0));
            for(String s : mergeMail[i]){
                temp.add(s);
            }
        
        ans.add(temp);
        }
    }
    
    return ans;
    
  }
}

 class DisjointSet {
    int[] parent;
    int[] rank;
    int[] size;

    public DisjointSet(int n) {
        parent = new int[n + 1];
        rank = new int[n + 1];
        size = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
            size[i] = 1;
        }
    }

    int findParent(int u) {
        if (u == parent[u]) {
            return u;
        }

        // Path Compression
        int ultP_u = parent[u];
        parent[u] = findParent(ultP_u);
        return parent[u];
    }

    void unionByRank(int u, int v) {
        int ultP_u = findParent(u);
        int ultP_v = findParent(v);

        if (ultP_u == ultP_v) {
            return;
        }

        if (rank[ultP_u] < rank[ultP_v]) {
            parent[u] = ultP_v;
        } else if (rank[ultP_u] > rank[ultP_v]) {
            parent[v] = ultP_u;
        } else {
            parent[ultP_u] = ultP_v;
            int rankV = rank[ultP_v];
            rank[ultP_v] = rankV + 1;
        }
    }

    void unionBySize(int u, int v) {
        int ultP_u = findParent(u);
        int ultP_v = findParent(v);

        if (ultP_u == ultP_v) {
            return;
        }

        if (size[ultP_u] < size[ultP_v]) {
            parent[ultP_u] = ultP_v;
            size[ultP_v] += size[ultP_u];
        } else {
            parent[ultP_v] = ultP_u;
            size[ultP_u] += size[ultP_v];
        }
    }
}
     