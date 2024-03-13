public class RatFood {
    public static void main(String[] args) {
        final int r = 7;
        final int uni = 2;
        final int n = 8;
        final int arr[] = { 2, 8, 3, 5, 7, 4, 1, 2 };
        System.out.println(housesRequired(r, uni, n, arr));
    }
    public static int housesRequired(int rats, int unitsOfFood, int totalHouses, int[] unitsInHouses) {
        int totalFoodRequired = rats * unitsOfFood;
        int sum = 0;
        int requiredHouses = 0;
        if (totalHouses == 0) {
            return -1;
        }
        for (int i = 0; i < totalHouses - 1; i++) {
            if (sum < totalFoodRequired) {
                sum = sum + unitsInHouses[i];
                requiredHouses++;
            }
        }
        if (sum < totalFoodRequired)
            return 0;
        return requiredHouses;
    }
}