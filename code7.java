class code7{
    public static int add(int x , int y)
    {
         int ans = x+y;
        return ans;
    }
    public static double add(double x, double y)
    {
        double a =x+y;
        return a;
    }

     public static void main(String[] args) {
        int ans= add(20,30);  
        System.out.println("sum is " +ans);
        double a= add(10.1,20.2);
        System.out.println("Sum is " +a);
    
    }
    }
