package com.Task9.capybaralist.entity;

public class Zoo {

    private int zoo_id;
    private String zooname;
    private String prefecture;

    public Zoo(int zoo_id, String zooname, String prefecture) {
        this.zoo_id = zoo_id;
        this.zooname = zooname;
        this.prefecture = prefecture;
    }

    public int getZoo_id() {
        return zoo_id;
    }

    public String getZooname() {
        return zooname;
    }

    public String getPrefecture() {
        return prefecture;
    }
}

