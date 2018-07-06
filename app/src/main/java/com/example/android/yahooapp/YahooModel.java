package com.example.android.yahooapp;

public class YahooModel {

    private String conversations;
    private String sites;
    private String time;

    public YahooModel(String conversations, String sites, String time) {
        this.conversations = conversations;
        this.sites = sites;
        this.time = time;
    }

    public String getConversations() {
        return conversations;
    }

    public void setConversations(String conversations) {
        this.conversations = conversations;
    }

    public String getSites() {
        return sites;
    }

    public void setSites(String sites) {
        this.sites = sites;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
