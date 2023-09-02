class Solution {
    public int strStr(String haystack, String needle) {
      // Kuch bhi dhundhne se pehle, check karo ki needle khali hai ya nahi.
        if(needle.isEmpty()){
          // Agar needle khali hai, toh 0 return karo.
            return 0;
        }
      // Ab, `haystack` string par loop chalaate hain.
        // Loop ko `haystack` ke length se `needle` ke length tak hi chalate hain.
        for(int i = 0; i <= haystack.length() - needle.length() ; i++){
          // Har iteration mein, `haystack` ke i se shuru hone wala substring extract kiya jata hai.
            // Iska size `needle` ke length ke barabar hota hai.
          // Yahan par dekha ja raha hai ki 'haystack' mein maujood current position 'i' par 'needle' 
          //ke pehle character ke saath match ho raha hai.
            if (haystack.charAt(i)==needle.charAt(0)){
                          // Ab, check karte hain string aur needle match karti hai ya nahi.

          if(haystack.substring(i, needle.length()+i).equals(needle)){
               // Agar match milta hai, toh i ko return karte hain, yani match ki shuruaat index.
              return i;
          }
        }
       // Agar kisi bhi position par match nahi milta, toh -1 return karo.
    }  return -1;
}
}
