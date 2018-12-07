package nl.capgemini.academy.movies.models;

import org.springframework.data.annotation.Id;

public class Airplane {
    @Id
    private String idAirplane;
    private String airplaneType;
    private boolean flyingToAirport;
    private double currentAmountOfFuel;
    private double addAmountOfFuel;

    public Airplane() {
    }

    public String getIdAirplane() {
        return idAirplane;
    }

    public void setIdAirplane(String idAirplane) {
        this.idAirplane = idAirplane;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public boolean isFlyingToAirport() {
        return flyingToAirport;
    }

    public void setFlyingToAirport(boolean flyingToAirport) {
        this.flyingToAirport = flyingToAirport;
    }

    //Get Current Amount Of Fuel
    public double getCurrentAmountOfFuel() {
        return currentAmountOfFuel;
    }

    public void setCurrentAmountOfFuel(double currentAmountOfFuel) {
        this.currentAmountOfFuel = currentAmountOfFuel;
    }

    public double getAddAmountOfFuel() {
        return addAmountOfFuel;
    }

    public void setAddAmountOfFuel(double addAmountOfFuel) {
        this.addAmountOfFuel = addAmountOfFuel;
    }

    //Fill Fuel Tank
    public void fillFuelTank(double addAmountOfFuel) {
        this.currentAmountOfFuel = this.currentAmountOfFuel + addAmountOfFuel;
    }
}
