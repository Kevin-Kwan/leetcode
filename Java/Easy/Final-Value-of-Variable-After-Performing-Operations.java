class Solution {
  public int finalValueAfterOperations(String[] operations) {
    int X = 0;
    for (int i = 0; i < operations.length; i++) {
      X += theOps(operations[i]);
    }
    return X;
  }

  public int theOps(String operation) {
    if (operation.equals("++X") || operation.equals("X++")) {
      return 1;
    } else {
      return -1;
    }
  }
}
