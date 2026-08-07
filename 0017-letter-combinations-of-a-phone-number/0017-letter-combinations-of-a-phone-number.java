class Solution {
    // phone keypad mapping — index = digit, value = letters
    static String[] keypad = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result; // edge case
        pad("", digits, result);
        return result;
    }

    static void pad(String p, String up, List<String> result) {
        
        if (up.isEmpty()) {
            result.add(p);
            return;
        }

        
        int digit = up.charAt(0) - '0';        
        String letters = keypad[digit];        

        // try each letter for this digit
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);      
            pad(p + ch, up.substring(1), result); 
        }
    }
}