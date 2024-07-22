class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int asciiValue = 64 + j;
                char character = (char) asciiValue;
                System.out.print(character);
            }
            System.out.println("");
        }
    }
}
