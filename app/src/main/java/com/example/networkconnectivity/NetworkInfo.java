package com.example.networkconnectivity;

public class NetworkInfo {

    private String typeName;

    public NetworkInfo(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
