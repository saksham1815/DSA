class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0); // Fibonacci(0)
        ans.add(1); // Fibonacci(1)

        for (int i = 2; i <= n; i++) {
            ans.add(ans.get(i - 1) + ans.get(i - 2));
        }

        return ans.get(n);
    }
}