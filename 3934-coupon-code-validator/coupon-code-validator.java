class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String>res = new ArrayList();

        List<String>e = new ArrayList();
        List<String>g = new ArrayList();
        List<String>p = new ArrayList();
        List<String>r = new ArrayList();
        
        for(int i=0;i<isActive.length;i++){
            if(isActive[i]){
                if(businessLine[i].equals("electronics") 
                    || businessLine[i].equals("grocery")
                  || businessLine[i].equals("pharmacy")
                  || businessLine[i].equals("restaurant")){
                    if(code[i].length() == 0)continue;
                    boolean found = true;
                    for(int j=0;j<code[i].length();j++){
                        char ch = code[i].charAt(j);
                        if (!Character.isLetterOrDigit(ch) && ch != '_') {
                            found = false;
                            break;
                        }
                    }

                    if(found){
                        if(businessLine[i].startsWith("e"))e.add(code[i]);
                        if(businessLine[i].startsWith("g"))g.add(code[i]);
                        if(businessLine[i].startsWith("p"))p.add(code[i]);
                        if(businessLine[i].startsWith("r"))r.add(code[i]);
                    }
                  }
            }
        }
        Collections.sort(e);
        Collections.sort(g);
        Collections.sort(p);
        Collections.sort(r);
        res.addAll(e);
        res.addAll(g);
        res.addAll(p);
        res.addAll(r);
        
        return res;
    }
}
