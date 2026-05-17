class Solution {

    public String reverseWords(String s) {

        char[] arr = s.toCharArray();

        // Step 1 : Reverse whole string
        reverse(arr, 0, arr.length - 1);

        int i = 0;

        // l = start of word
        // r = position to place characters
        int l = 0;
        int r = 0;

        int n = arr.length;

        while (i < n) {

            // skip spaces
            while (i < n && arr[i] == ' ') {
                i++;
            }

            // copy word characters
            while (i < n && arr[i] != ' ') {
                arr[r++] = arr[i++];
            }

            // reverse current word
            if (l < r) {

                reverse(arr, l, r - 1);

                // add single space
                if (r < n) {
                    arr[r] = ' ';
                    r++;
                }

                l = r;
            }
        }

        // remove extra ending space
        if (r > 0 && arr[r - 1] == ' ') {
            r--;
        }

        return new String(arr, 0, r);
    }

    public static void reverse(char[] arr, int left, int right) {

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}