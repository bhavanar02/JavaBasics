class Test {
    static int arr[] = { 1, 2, 3, 4 };

    static int sum()
    {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
 
        return sum;
    }
 
    public static void main(String[] args)
    {
        System.out.println("Sum of array is: " + sum());
    }
}