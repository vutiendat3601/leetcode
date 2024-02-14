package tech.datvu.leetcode.general;

public class Leetcode_00355DesignTwitter {
    public static void main(String[] args) {
        String[] cmds = { "Twitter", "postTweet", "getNewsFeed", "follow", "postTweet", "getNewsFeed", "unfollow",
                "getNewsFeed" };
        int[][] arguments = { {}, { 1, 5 }, { 1 }, { 1, 2 }, { 2, 6 }, { 1 }, { 1, 2 }, { 1 } };
        Twitter twitter = null;
        for (int i = 0; i < cmds.length; i++) {
            String cmd = cmds[i].toLowerCase();
            switch (cmd) {
                case "twitter": {
                    twitter = new Twitter();
                    break;
                }
                case "posttweet": {
                    twitter.postTweet(arguments[i][0], arguments[i][1]);
                    break;
                }
                case "getnewsfeed": {
                    twitter.getNewsFeed(arguments[i][0]);
                    break;

                }
                case "follow": {
                    twitter.follow(arguments[i][0], arguments[i][1]);
                    break;
                }
                case "unfollow": {
                    twitter.unfollow(arguments[i][0], arguments[i][1]);
                    break;
                }
            }
        }
    }
}
