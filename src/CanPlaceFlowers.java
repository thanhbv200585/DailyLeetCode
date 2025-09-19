public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                i++;
                continue;
            } else if ((flowerbed[i] == 0 && i == flowerbed.length - 1) || (i < flowerbed.length - 1 && flowerbed[i+1] == 0)){
                n--;
                i++;
            }
        }

        if (n <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
