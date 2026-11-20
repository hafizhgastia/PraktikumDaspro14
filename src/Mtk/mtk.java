package Mtk;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mtk {
      static BigInteger factorial(int n) {
        BigInteger r = BigInteger.ONE;
        for (int i = 2; i <= n; i++) r = r.multiply(BigInteger.valueOf(i));
        return r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String s = input.nextLine().trim();

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) freq.merge(c, 1, Integer::sum);

        BigInteger result = factorial(s.length());
        for (int f : freq.values()) result = result.divide(factorial(f));

        System.out.println("Jumlah string berbeda: " + result);

        input.close();
    }
}
