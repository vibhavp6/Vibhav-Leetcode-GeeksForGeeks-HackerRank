class Solution {
    public int addDigits(int num) {
    int new_num = 0;
    while(num>0){
      int temp = num%10;
      new_num += temp;
      num = num/10;
    }
    if(new_num/10 == 0){
      return new_num;
    }else{
      return addDigits(new_num);
    }
}
}