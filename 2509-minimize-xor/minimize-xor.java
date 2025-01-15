class Solution {
    public int minimizeXor(int num1, int num2) {
        int[] bit1=new int[31];
        int[] bit2=new int[31];
        int num=0;

        // Convert num1 and num2 to binary and count their set bits
        int cnt1=decimalToBinary(num1, bit1);
        int cnt2=decimalToBinary(num2, bit2);

        
        int cnt=cnt2;
        if(cnt1>=cnt2){
            // If num1 has more or equal set bits than num2
            for(int i=30; i>=0; i--){
                if(bit1[i]==1 && cnt>0){ 
                    cnt--;
                    num+=Math.pow(2,i);
                }
            }
        }
        else{
            cnt=cnt1;
            // If num1 has fewer set bits than num2
            // First, set all bits that are set in num1
            for(int i=30; i>=0; i--){
                if(bit1[i]==1 && cnt>0){ 
                    cnt--;
                    num+=Math.pow(2,i);
                }
            }

            cnt=cnt2-cnt1;
            // Then, set additional least significant bits
            for(int i=0; i<31; i++){
                if(bit1[i]==0 && cnt>0){
                    cnt--;
                    num+=Math.pow(2,i);
                }
            }
        }


        return num;            
    }


    // Helper method to convert decimal to binary and count set bits
    int decimalToBinary(int num, int[] arr)
    {
        int cnt=0;
        int id = 0;
        while (num > 0) {            
            int bit=num % 2;

            cnt+=(bit==1)?1:0;
            arr[id++]=bit;

            num = num / 2;            
        }

        return cnt;
    }
}