package tech.datvu.leetcode.general;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_00231PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        List<Integer> POWER_OF_TWOS = Arrays.asList(new Integer[] {
                -1, -2, -4, -8, -16, -32, -64, -128, -256, -512, -1024, -2048, -4096, -8192, -16384, -32768, -65536,
                -131072, -262144,
                -524288, -1048576, -2097152, -4194304, -8388608, -16777216, -33554432, -67108864, -134217728,
                -268435456,
                -536870912, -1073741824,
                1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768,
                65536, 131072, 262144,
                524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456,
                536870912, 1073741824 });
        Set<Integer> powerOfTwos = new HashSet<>(POWER_OF_TWOS);
        return powerOfTwos.contains(n);
    }

    public static void main(String[] args) {
        int n =16;
        System.out.println(isPowerOfTwo(n));
    }
}
