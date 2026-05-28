class Solution {

    public int getValue(char ch) {

        if(ch == 'I') return 1;
        else if(ch == 'V') return 5;
        else if(ch == 'X') return 10;
        else if(ch == 'L') return 50;
        else if(ch == 'C') return 100;
        else if(ch == 'D') return 500;
        else if(ch == 'M') return 1000;

        return 0;
    }

    public int romanToInt(String s) {

        int result = 0;

        for(int i = 0; i < s.length(); i++) {

            int value = getValue(s.charAt(i));

            // next value only if next character exists
            if(i < s.length() - 1) {

                int nextValue = getValue(s.charAt(i + 1));

                // subtraction case
                if(nextValue > value) {
                    result -= value;
                }
                else {
                    result += value;
                }

            }
            else {
                result += value;
            }
        }

        return result;
    }
}