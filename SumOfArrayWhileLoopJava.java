class Test {
    static int arr[] = { 1, 2, 3, 4 };

    static int sum()
    {
        int sum = 0;
        int i = 0;
        while (i < arr.length)
            sum += arr[i];
            i += 1;
 
        return sum;
    }
 
    public static void main(String[] args)
    {
        System.out.println("Sum of array is: " + sum());
    }
}