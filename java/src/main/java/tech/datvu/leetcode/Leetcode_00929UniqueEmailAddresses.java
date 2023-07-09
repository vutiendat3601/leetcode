package tech.datvu.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_00929UniqueEmailAddresses {
    public static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String[] email = emails[i].split("@");
            email[0] = email[0].replace(".", "");
            if (email[0].contains("+")) {
                email[0] = email[0].substring(0, email[0].indexOf("+"));
            }
            uniqueEmails.add(email[0] + "@" + email[1]);
        }
        return uniqueEmails.size();
    }

    public static void main(String[] args) {
        String[] emails = { "test.email+alex@leetcode.com", "test.email.leet+alex@code.com" };
        int res = numUniqueEmails(emails);
        System.out.println(res);
    }
}
