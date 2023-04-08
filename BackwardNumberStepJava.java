class Test 
{

    public static void main(String[] args)
    {
        int numOfSteps = 5;
        int cnt = 1;
        while(cnt <= numOfSteps)
        
            int numOfSpaces = 0;
            numOfSpaces = numOfSteps * (6 - cnt);
            int spaceCnt = 1;
    
            while(spaceCnt <= numOfSpaces) 
            
                System.out.print(" ", end="");
                spaceCnt+=1;
            
            System.out.print(cnt);
            cnt+=1;
        
    }
    

}