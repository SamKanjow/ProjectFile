package JSONResponse;


public  class JSONResponse  {

    private Location location;
    private Forecast forecast;

    public JSONResponse() {
    }

    public JSONResponse(Location location, Forecast forecast) {
        super();
        this.location = location;
        this.forecast = forecast;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

}
