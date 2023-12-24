class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWord = 0;
        for(int i = 0; i < sentences.length; i++){
            String[] temp = sentences[i].split(" ");
            maxWord = Math.max(maxWord, temp.length);
            }
    return maxWord;
    }
}

ChatGPT
