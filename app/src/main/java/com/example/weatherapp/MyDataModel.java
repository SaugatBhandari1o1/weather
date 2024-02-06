package com.example.weatherapp;

public class MyDataModel {
    private String weather;
    private String main;
    private String name;

    public MyDataModel(String weather, String main, String name){
        this.weather = weather;
        this.main = main;
        this.name = name;
    }

    public String getWeather(){return weather;}

    public void setWeather(String Weather){
        this.weather=weather;
    }

    public String getMain(){return main;}

    public void setMain(String main){
        this.main = main;
    }

    public String getName(){return name;}

    public void setName(String name) {
        this.name = name;
    }
}
