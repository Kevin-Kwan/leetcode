class Solution {
  public int bitwiseComplement(int n) {
    String binaryN = Integer.toBinaryString(n);
    String newBinary = "";
    for (int i = 0; i < binaryN.length(); i++) {
      if (binaryN.charAt(i) == '0') {
        newBinary += "1";
      } else {
        newBinary += "0";
      }
    }
    // System.out.println(newBinary);
    return Integer.parseInt(newBinary, 2);
  }
}
