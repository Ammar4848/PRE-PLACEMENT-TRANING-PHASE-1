class Char {
    public static void main(String[] args) {
        int k = 1;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print((char)(k + 64) + " ");
                k++;
            }
            System.out.println();

        }
    }
}