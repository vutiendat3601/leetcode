package tech.datvu.leetcode.general;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_02073TimeNeededtoBuyTickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }

        int i = 0;
        while (!q.isEmpty()) {
            i = q.poll();
            res++;
            if (i == k && tickets[k] == 1) {
                break;
            }
            tickets[i]--;
            if (tickets[i] != 0) {
                q.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] tickets = {2,3,2 };
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets, k));
    }
}
