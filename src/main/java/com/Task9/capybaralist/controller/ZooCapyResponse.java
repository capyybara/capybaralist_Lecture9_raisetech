package com.Task9.capybaralist.controller;

import com.Task9.capybaralist.entity.Zoo;




public class ZooCapyResponse {

    private  int zoo_id;
    private  String zooname;
    private  String prefecture;


    public ZooCapyResponse(Zoo zoo){
        this.zoo_id = zoo.getZoo_id();
        this.zooname = zoo.getZooname();
        this.prefecture = zoo.getPrefecture();
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
