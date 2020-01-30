public class StringCalc
{
    public static int Add(String cin) throws Exception {

       String delimiter = ";|,|\n";
       if(cin.startsWith("//"))
       {
           cin = cin.replace("4",";");
           cin = cin.replace("***",";");
           int index = cin.indexOf("\n");
           cin = cin.substring(index+1);
       }

        String[] numbers = cin.split(delimiter);

        int sum = 0;
        StringBuilder negative = new StringBuilder();

        if (!cin.isEmpty())
        {
            for (int i = 0; i < numbers.length; i++)
            {
                int stringToInt = Integer.parseInt(numbers[i]);
                if (stringToInt < 0 )
                {
                    negative.append(stringToInt).append(",");
                    throw new IllegalArgumentException("ERROR: negatives not allowed" + negative);
                }
            }
            for (int i = 0; i < numbers.length; i++)
            {
                if (Integer.parseInt(numbers[i]) > 999)
                {
                 i++;
                }
                sum += Integer.parseInt(numbers[i]);
            }
        }
        return sum;
    }
}
