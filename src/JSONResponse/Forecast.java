
package JSONResponse;

import java.util.List;

public class Forecast {

    private List<Forecastday> forecastday = null;

    public Forecast() {
    }

    public Forecast(List<Forecastday> forecastday) {
        super();
        this.forecastday = forecastday;
    }

    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

}
