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

        System.out.println(addBetween.addAll(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}
