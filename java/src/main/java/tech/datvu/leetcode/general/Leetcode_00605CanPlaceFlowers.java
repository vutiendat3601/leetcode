package tech.datvu.leetcode.general;

public class Leetcode_00605CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
        if(flowerbed.length == 1)
        {
            if(flowerbed[0] == 1) return (n == 0);
            return (n <= 1);
        }
        int count = 0;
        int start = 0;
        if(flowerbed[0] == 1) start = 1;
        for(int i = start; i < flowerbed.length; i++)
        {
            if(canBePlanted(flowerbed, i)) count++;
            if(count == n) return true;
        }
        
        return false;
    }
    
    private static boolean canBePlanted(int[]flowerbed, int j)
    {
        if(j == 0)
        {
            if(flowerbed[j] == 0 && flowerbed[j+1] != 1) 
            {
                flowerbed[j] = 1;
                return true;
            }
            return false;
        }
        
        if(j == flowerbed.length-1)
        {
            if(flowerbed[j] == 0 && flowerbed[j-1] != 1) 
            {
                flowerbed[j] = 1;
                return true;
            }
            return false;
        }
        if(flowerbed[j] == 0 && (flowerbed[j-1] != 1 && flowerbed[j+1] != 1)) 
        {
            flowerbed[j] = 1;
            return true;
        }
        return false;
    }
}