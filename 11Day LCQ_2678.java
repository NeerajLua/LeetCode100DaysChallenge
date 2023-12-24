class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0; i<details.length; i++){
            String str = details[i];
            int first = str.charAt(11) - '0';
            int sec = str.charAt(12) - '0';
           int sum = first*10+sec;
            if(sum>60){
                count++;
            }
        }
        return count;
    }
}
