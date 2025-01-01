//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public static boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static ArrayList<String> checkAnagrams(String str , String arr[] ){
        ArrayList<String> strList = new ArrayList<>();
        for(String s : arr){
            if(isAnagram(str,s)){
                strList.add(s);
            }
        }
        return strList;
    }
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<String>();
        for(String str : arr){
            if(!set.contains(str)){
            ArrayList<String> group = checkAnagrams(str, arr);
           result.add(group);
           set.addAll(group);
        }
        }
       return result;
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends