class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new LinkedList<>();
        for (int i = 0; i<operations.length; i++) {
            try {
                record.add(Integer.parseInt(operations[i]));
            } catch (NumberFormatException error) {
                if (operations[i].equals("+")) {
                    record.add(record.get(record.size()-1)+record.get(record.size()-2));
                } else if (operations[i].equals("D")) {
                    record.add(2*record.get(record.size()-1));
                } else if (operations[i].equals("C")){
                    record.remove(record.size()-1);
                }
            }
        }
        if (record.size()==0) {
            return 0;
        } else {
            return record.stream().mapToInt(Integer::intValue).sum();
        }
    }
}
