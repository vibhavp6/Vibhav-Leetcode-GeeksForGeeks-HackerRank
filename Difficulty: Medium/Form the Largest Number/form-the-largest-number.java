class Solution {
    public String findLargest(int[] arr) {
        // code here
        String [] str=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            str[i]=""+arr[i];
        }
        Arrays.sort(str,(a,b)->{
            String s=a+b;
            String m=b+a;
            return m.compareTo(s);
        });
        StringBuilder sb=new StringBuilder();
        for(String item:str) sb.append(item);
         boolean flag=true;
         for(int i=0;i<sb.length();i++){
             char ch=sb.charAt(i);
             if(ch!='0'){
                 flag=false;
                 break;
             }
         }
         if(flag==true) return "0";
        return sb.toString();
    }
}