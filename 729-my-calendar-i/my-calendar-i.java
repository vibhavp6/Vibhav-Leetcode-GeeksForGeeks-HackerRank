class MyCalendar {
    TreeMap<Integer, Integer> calcy;
    public MyCalendar() {
    calcy = new TreeMap();

    }
    
    public boolean book(int start, int end) {
    Integer prevBook = calcy.floorKey(start);
    Integer nextBook = calcy.ceilingKey(start);
    if((prevBook==null || calcy.get(prevBook)<=start) && (nextBook==null || end<=nextBook)) 
    { 
    calcy.put(start, end);
    return true;
    }
    return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */