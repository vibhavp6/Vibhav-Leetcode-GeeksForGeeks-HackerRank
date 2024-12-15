class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<ClassRecord> pq = new PriorityQueue<>(new Compare());
        
        for(int[] cl : classes)
            pq.add(new ClassRecord(cl));
        
        ClassRecord cl;
        while(extraStudents-- > 0)
            pq.add(pq.remove().addOneStudent());
        
        double sum = 0;
        while(!pq.isEmpty()){
            cl = pq.remove();
            sum += (double)cl.pass / cl.total;
        }

        return sum / classes.length;
    }
}

class ClassRecord{
    int pass;
    int total;
    double inc;

    public ClassRecord(int[] array){
        pass = array[0];
        total = array[1];
        inc = getIncrement();
    }

    public ClassRecord addOneStudent(){
        pass++;
        total++;
        inc = getIncrement();
        return this;
    }

    private double getIncrement(){
        return (pass + 1.0) / (total + 1) - (double)pass / total;
    }
}

class Compare implements Comparator<ClassRecord>{
    public int compare(ClassRecord a, ClassRecord b){
        if(a.inc < b.inc)
            return 1;
        else if(a.inc > b.inc)
            return -1;
        else
            return 0;
    }
}