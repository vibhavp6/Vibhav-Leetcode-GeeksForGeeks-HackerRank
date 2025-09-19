class Spreadsheet {
 
    HashMap<String, Integer> map; // cell --> cellvalue

    public Spreadsheet(int rows) {
        map = new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        map.put(cell, value);
    }
    
    public void resetCell(String cell) {
        map.put(cell, 0);
    }
    
    public int getValue(String formula) {
        // "=X+Y"
        String arr[] = formula.substring(1).split("\\+");
        return getCell(arr[0]) + getCell(arr[1]);
    }
 
    public int getCell(String cell) {
        if(cell.charAt(0)>='0' && cell.charAt(0)<='9') {
            return Integer.parseInt(cell);
        }
        else return map.getOrDefault(cell,0);
    }
}
