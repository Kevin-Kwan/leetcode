class Solution {
    public int maximum69Number (int num) {
       char[] charArr=String.valueOf(num).toCharArray();
       for(int i=0;i<charArr.length;i++){
           if(charArr[i]=='6'){
               charArr[i]='9';
               break;
           }
       }
        
        return Integer.valueOf(String.valueOf(charArr));
    }
}
