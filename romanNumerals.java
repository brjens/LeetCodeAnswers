import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();

        int romanInt=0; 
        
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for (int i=0; i<s.length(); i++) {
            if ( i+1==s.length() )
            {
                romanInt += romanMap.get(s.charAt(i));
            }
            else if ( romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))){
                int temp;
                temp = romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i));
                romanInt += temp;
                i++;
            }
            else{
                romanInt += romanMap.get(s.charAt(i));
            }
        }
        return romanInt;
    }
}

