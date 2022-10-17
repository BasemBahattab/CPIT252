package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class App {
    public static void main(String[] args) {
        // Jeddah => 21.543333, 39.172778
        space();//just to make output more clear
        GeoLocation location = new GeoLocation();
        WeatherGeo adapter = new LocationAdapter(location);
        String city = adapter.getWeatherInfo(21.543333, 39.172778);

        System.out.println(city);

        WeatherDBI DBI = new WeatherDBI();

        String Info = DBI.getWeatherInfo(city);

        System.out.println(Info);
        space();
    }

    public static void space(){
        System.out.println("\n\n");
    }
}
