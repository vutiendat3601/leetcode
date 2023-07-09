package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Twitter {

    private Map<Integer, Set<Integer>> usersFollowing;
    private Map<Integer, Stack<Integer>> userTweetIds;

    public Twitter() {
        usersFollowing = new HashMap<>();
        userTweetIds = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        if (!userTweetIds.containsKey(userId)) {
            userTweetIds.put(userId, new Stack<>());
        }
        Stack<Integer> userTweet = userTweetIds.get(userId);
        userTweet.add(tweetId);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if (userTweetIds.containsKey(userId)) {
            int cnt = 0;
            Stack<Integer> tweets = new Stack<>();
            tweets.addAll(userTweetIds.get(userId));
            while (!tweets.empty() && cnt < 10) {
                res.add(tweets.pop());
            }
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        if (usersFollowing.containsKey(followerId) && usersFollowing.containsKey(followeeId)) {
            usersFollowing.get(followerId).add(followeeId);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        if (usersFollowing.containsKey(followerId) && usersFollowing.containsKey(followeeId)) {
            usersFollowing.get(followerId).remove(followeeId);
        }
    }
}
