package com.gabigutu.adapter;

public class AddressUnderstander {

    private GoogleAPI googleAPI;

    public AddressUnderstander() {
        GoogleAPI googleAPI = new GoogleAPI("");
    }

    public Object getDistance() {
        return googleAPI.getDistanceMatrix();
    }

    public Object latLongFromAddress(String address) {
        return googleAPI.geocodeAddress(address);
    }

}
