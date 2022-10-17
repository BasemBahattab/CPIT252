package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;

public class LocationAdapter implements WeatherGeo {

    GeoLocation location;

    public LocationAdapter(GeoLocation location){
        this.location = location;
    }

    @Override
    public String getWeatherInfo(double latitude, double longitude) {
        return location.search(latitude, longitude);
    }
    
}
