class Pattern11 {

    public static void main(String[] args)

    {

        int n = 5;

        for (int i = 1; i <= n; i++)

        { // int bin=(num%2);

            for (int j = 1; j <= i; j++)

            {
                if ((i % 2) == 0)

                {
                    System.out.print(((j - 1) % 2) + " ");
                }

                else

                    System.out.print((j % 2) + " ");

            }

            System.out.print("\n");

        }

    }

}