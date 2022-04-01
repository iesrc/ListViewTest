package com.example.listviewtest;

public class Data {
    private String name;
    private int num;
    private  String index;

    public Data(String name, int num, String index){
        this.name=name;
        this.num=num;
        this.index=index;
    }
    public  String getName() {
        return name;
    }


    public  int getNum() {
        return num;
    }


    public String getIndex() {
        return index;
    }
}
