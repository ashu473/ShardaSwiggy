package org.example;

public class Restro {
    int restroId;
    String restroName;
    public Restro(int rstroId, String restroName){
        this.restroId=restroId;
        this.restroName=restroName;
    }

    public int getRestroId() {
        return restroId;
    }

    public void setRestroId(int restroId) {
        this.restroId = restroId;
    }

    public String getRestroName() {
        return restroName;
    }

    public void setRestroName(String restroName) {
        this.restroName = restroName;
    }

    @Override
    public String toString() {
        return "Restro{" +
                "restroId=" + restroId +
                ", restroName='" + restroName + '\'' +
                '}';
    }
}
