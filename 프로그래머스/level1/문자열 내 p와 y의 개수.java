class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'p' || c == 'P') p++;
            else if(c == 'y' || c == 'Y') y++;
        }
        
        return p == y;
    }
}
