class Solution {

    public boolean isHappy(int n) {

        if (n < 1) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        int x = n;
        int z = n;

        while (true) {

            int check1 = 0;
            int check2 = 0;

            
            while (x > 0) {
                int a = x % 10;
                x /= 10;
                check1 += slow1(a);
            }

           
            while (z > 0) {
                int a = z % 10;
                z /= 10;
                check2 += slow1(a);
            }

              check2 = fast1(check2);

            if (check1 == 1 || check2 == 1) {
                return true;
            }

            if (check1 == check2) {
                return false;
            }

            x = check1;
            z = check2;
        }
    }

   
    public int slow1(int a) {
        return a * a;
    }

    
    public int fast1(int n) {

        int sum = 0;

        while (n > 0) {
            int a = n % 10;
            n /= 10;
            sum += slow1(a);
        }

        return sum;
    }
}