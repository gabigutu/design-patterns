package com.gabigutu.adapter;

public class GoogleAPI {

    private String apiKey;

    public GoogleAPI(String apiKey) {
        this.apiKey = apiKey;
    }

    public Object getDistanceMatrix() {
        // send HTTP request to getDistanceMatrix API
        // receive distance object
//        {
//            origins: [origin1, origin2],
//            destinations: [destinationA, destinationB],
//            travelMode: 'DRIVING',
//                    transitOptions: TransitOptions,
//                drivingOptions: DrivingOptions,
//                unitSystem: UnitSystem,
//                avoidHighways: Boolean,
//                avoidTolls: Boolean,
//        }, callback);
        return new Object();
    }

    public LatLong geocodeAddress(String address) {
        // send HTTP request to geocodeAddress API API
        // receive LatLong object
        return new LatLong(Math.random(), Math.random());
    }


}

class LatLong {
    private double latitude;
    private double longitude;

    public LatLong(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

