package com.Task9.capybaralist.entity;

public class Zoo {

    private int zooId;
    private String zooname;
    private String prefecture;

    public Zoo(int zooId, String zooname, String prefecture) {
        this.zooId = zooId;
        this.zooname = zooname;
        this.prefecture = prefecture;
    }

    public int getZooId() {
        return zooId;
    }

    public String getZooname() {
        return zooname;
    }

    public String getPrefecture() {
        return prefecture;
    }
}

