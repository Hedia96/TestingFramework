package example;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
       // System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
       MessageDigest msgDig= MessageDigest.getInstance("MD5");
       String input = scanner.nextLine();
        msgDig.reset();
        msgDig.update(StandardCharsets.UTF_8.encode(input));
//      System.out.println(Arrays.toString(msgDig.digest()));
        System.out.printf("%032x",new BigInteger(1,msgDig.digest()));
    }
}
