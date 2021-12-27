class Solution {
   public int findComplement(int num) {
    int cou = num;
    int mask = 1;
    while(cou!=0) {
        num = num^mask;
        mask = mask<<1;
        cou = cou>>1;
    }
    return num;
  }
}
// yoinked from https://leetcode.com/problems/number-complement/discuss/1649400/6-Lines-Easy-Java-Solution-or-100-faster
// just a note here so i can look back and learn wtf is XOR
