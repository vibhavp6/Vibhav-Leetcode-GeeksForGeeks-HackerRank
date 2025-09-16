class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> stack=new Stack<>();
        for(String i:arr){
            if(i.equals("+") ||i.equals("-") || i.equals("*") || i.equals("/") || i.equals("^")){
                if(i.equals("+")){
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a+b);
                }
                else if(i.equals("-")){
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a-b);
                }
                else if(i.equals("*")){
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a*b);
                }
                else if(i.equals("/")){
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(Math.floorDiv(a,b));
                }
                else {
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push((int)Math.pow(a,b));
                }
            }
            else{
                int temp=Integer.parseInt(i);
                stack.push(temp);
            }
        }
        return(stack.pop());
    }
}