class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
       HashSet <Integer> set = new HashSet<>();
       ArrayList<Integer>list = new ArrayList<>();
       for(int num : arr){
           if(set.contains(num)){
               list.add(num);
           }
           else{
               set.add(num);
           }
       }
       return list;
    }
}