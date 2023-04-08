public class ForwardNumberStepJava 
{

    int cnt = 1; 
    while(cnt <= numOfSteps)
    {

        int numOfSpace = cnt * 5;
        int spaceCnt = 1;

        while(spaceCnt <= numOfSpace)
        {
            System.out,print(" ", end="");
            spaceCnt+=1;
        }

        System.out.print(cnt);  
        cnt+=1;
    }
    
}
