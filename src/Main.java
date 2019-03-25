import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyDetectiveException, MyTypeException, MyDataMatchException {
        Scanner in = new Scanner(System.in);
        int m, n;
        String str;

        if (in.hasNextInt())
            n = in.nextInt();
        else
            throw new MyDetectiveException("Incorrect mesh size.");

        if (in.hasNextInt())
            m = in.nextInt();
        else
            throw new MyDetectiveException("Incorrect mesh size.");

        if(!(in.nextLine()).equals(""))
            throw new MyDetectiveException("Incorrect mesh size.");

        if (in.hasNextLine())
            str = in.nextLine();
        else
            throw new MyTypeException("Invalid cell type.");

        ArrayList<String> result = getResultMap(n, m, str);
        for(int i = 0; i<n; i++){
            System.out.println(result.get(i));
        }

    }
    private static ArrayList<String> getResultMap(int n, int m, String str) throws MyDataMatchException, MyTypeException, MyDetectiveException {
        if(n>100 || n<=0 || m<=0 || m>100)
            throw new MyDetectiveException("Incorrect mesh size.");

        char[] ch = str.toCharArray();
        if(ch.length!=n*m)
            throw new MyDataMatchException("Data mismatch.");

        String regex = "[RFG]*";
        if(!str.matches(regex))
            throw new MyTypeException("Invalid cell type.");

        ArrayList<String> list = new ArrayList<>();
        int oddOrEven = 0;
        for(int i=0; i<n; i++){
            if(oddOrEven==0) {
                list.add(str.substring(m*i, m*(i+1)));
                oddOrEven = 1;
            }else{
                StringBuilder sb = new StringBuilder(str.substring(m*i, m*(i+1)));
                list.add(sb.reverse().toString());
                oddOrEven = 0;
            }
        }
        return list;
    }
}
