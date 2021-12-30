class Solution {
    public int minPartitions(String n) {
        if(n.contains("9")){
            return 9;
        }
        if(n.contains("8")){
            return 8;
        }
        if(n.contains("7")){
            return 7;
        }
        if(n.contains("6")){
            return 6;
        }
        if(n.contains("5")){
            return 5;
        }
        if(n.contains("4")){
            return 4;
        }
        if(n.contains("3")){
            return 3;
        }
        if(n.contains("2")){
            return 2;
        }
        if(n.contains("1")){
            return 1;
        }
        return 0;
        
    }
}
// this is the brutforce way to do this problem
// has to do with something about maximums
