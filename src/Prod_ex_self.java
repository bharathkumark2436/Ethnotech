public class Prod_ex_self {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        for(int i=0;i<arr.length;i++)
        {
            float prod=1;

            for(int j=0;j<arr.length;j++){

                if(j==i)
                    continue;
                prod*=arr[j];

            }
            System.out.println(prod);
        }
    }

}
