public class Main {
    
    public static void main(String [] args)
    {
        AddBetween addBetween = (int a, int b) -> {
            
            int sum = 0;
            for(int i = a; i <= b; i++)
            {
                sum += i;
            }

            return sum;

        };
    }
}