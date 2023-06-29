class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
    return countVowels(s.substring(0,n/2)) == countVowels(s.substring(n/2));
    }

    public int countVowels(String s) {
        int count = 0;
        for (int i = 0; i<s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count ++;
            }
                
        }
        return count;
    }
}
