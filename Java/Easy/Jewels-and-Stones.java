class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int total = 0;
        char toCheck;
        for (int i=0;i<jewels.length();i++)
        {
            toCheck=jewels.charAt(i);
            for (int j=0;j<stones.length();j++)
        {
            if (toCheck==stones.charAt(j))
            {
                total++;
            }
            
        }
        }
        return total;
        
    }
}
