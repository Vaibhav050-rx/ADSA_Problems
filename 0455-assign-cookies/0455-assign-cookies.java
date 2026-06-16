class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int r = 0; // child pointer
        int l = 0; // cookie pointer
        while (r < g.length && l < s.length) {
            if (g[r] <= s[l]) {
                r++; // child satisfied
            }
            l++; // move to next cookie
        }
        return r;
    }
}