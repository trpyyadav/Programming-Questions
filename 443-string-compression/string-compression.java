class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while(read<chars.length){
            int count = 0;
            char current = chars[read];

            // Read same characters
            while(read<chars.length && chars[read] == current){
                read++;
                count++;
            }
            // Write the character
            chars[write++] = current;

            // Write the count if greater than one
            if(count > 1){
                String cnt = String.valueOf(count);

                for(char c: cnt.toCharArray()){
                    chars[write++] = c;
                }
            }
        }

        return write;
        
    }
}