class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int n1 = s1.length();
    int n2 = s2.length();
   
    if(n1>n2)
    return false;
    if(n1==0)
    return true;

    int a[] = new int[26];
    int b[] = new int[26];


    for(int i=0; i<n1; i++)
    {
     a[s1.charAt(i)-'a']++;
     b[s2.charAt(i)-'a']++;   
    }
    
    int freq = 0;
    for(int i=0; i<26; i++)
    if(a[i]==b[i])
    freq++;

    for(int i=0; i<n2-n1; i++)
    {
      if(freq==26)
      return true;

      int left = s2.charAt(i)-'a';
      int right = s2.charAt(i+n1)-'a';
      b[right]++;
      if(a[right]==b[right])
      freq++;
      else if(a[right]+1==b[right])
      freq--;

      b[left]--;
      if(a[left]==b[left])
      freq++;
      else if(a[left]-1==b[left])
      freq--;

    }
      return freq==26;
    
    }

}