class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i< nums.length;i++) arr.add(nums[i]);
        while(true){
            boolean ischange = false;
            int sz = arr.size();
            for (int i = 1; i < sz; i++) {
                int gcd = gcd(arr.get(i - 1), arr.get(i));
                if (gcd == 1) continue;
                int num = arr.get(i - 1) / gcd * arr.get(i);
                arr.set(i, num);
                arr.remove(i - 1);
                i--;
                sz--;
                ischange = true;
            }
            sz = arr.size();
            for (int i = sz - 2; i >= 0; i--) {
                int gcd = gcd(arr.get(i + 1), arr.get(i));
                if (gcd == 1) continue;
                int num = arr.get(i + 1) / gcd * arr.get(i);
                arr.set(i, num);
                arr.remove(i + 1);
                ischange = true;
            }
            if (!ischange) break;
        }
        return arr;
    }
    
    private static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}
