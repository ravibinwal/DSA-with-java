class Pattern10 {

    public static void main(String[] args)

    {

        int n = 5;

        for (int i = 1; i <= ((2 * n) - 1); i++)

        {
            int stars = i;

            if (i > n)

                stars = stars - (2 * (i % n));

            for (int j = 1; j <= stars; j++)

            {

                System.out.print("*");

            }

            System.out.print("\n");

        }

    }

}