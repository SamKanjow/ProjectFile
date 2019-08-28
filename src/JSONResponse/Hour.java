
package JSONResponse;


public class Hour {

    private double feelslikeC;
    private double feelslikeF;
    private int windDegree;
    private double windchillF;
    private double windchillC;
    private double tempC;
    private double tempF;
    private int cloud;
    private double windKph;
    private double windMph;
    private int humidity;
    private double dewpointF;
    private int willItRain;
    private double heatindexF;
    private double dewpointC;
    private int isDay;
    private int precipIn;
    private double heatindexC;
    private String windDir;
    private int gustMph;
    private double pressureIn;
    private String chanceOfRain;
    private double gustKph;
    private int precipMm;
    private Condition condition;
    private int willItSnow;
    private double visKm;
    private int timeEpoch;
    private String time;
    private String chanceOfSnow;
    private int pressureMb;
    private int visMiles;

    public Hour() {
    }

    public Hour(double feelslikeC, double feelslikeF, int windDegree, double windchillF, double windchillC, double tempC, double tempF, int cloud, double windKph, double windMph, int humidity, double dewpointF, int willItRain, double heatindexF, double dewpointC, int isDay, int precipIn, double heatindexC, String windDir, int gustMph, double pressureIn, String chanceOfRain, double gustKph, int precipMm, Condition condition, int willItSnow, double visKm, int timeEpoch, String time, String chanceOfSnow, int pressureMb, int visMiles) {
        super();
        this.feelslikeC = feelslikeC;
        this.feelslikeF = feelslikeF;
        this.windDegree = windDegree;
        this.windchillF = windchillF;
        this.windchillC = windchillC;
        this.tempC = tempC;
        this.tempF = tempF;
        this.cloud = cloud;
        this.windKph = windKph;
        this.windMph = windMph;
        this.humidity = humidity;
        this.dewpointF = dewpointF;
        this.willItRain = willItRain;
        this.heatindexF = heatindexF;
        this.dewpointC = dewpointC;
        this.isDay = isDay;
        this.precipIn = precipIn;
        this.heatindexC = heatindexC;
        this.windDir = windDir;
        this.gustMph = gustMph;
        this.pressureIn = pressureIn;
        this.chanceOfRain = chanceOfRain;
        this.gustKph = gustKph;
        this.precipMm = precipMm;
        this.condition = condition;
        this.willItSnow = willItSnow;
        this.visKm = visKm;
        this.timeEpoch = timeEpoch;
        this.time = time;
        this.chanceOfSnow = chanceOfSnow;
        this.pressureMb = pressureMb;
        this.visMiles = visMiles;
    }

    public double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public double getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(double windchillF) {
        this.windchillF = windchillF;
    }

    public double getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(double windchillC) {
        this.windchillC = windchillC;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getWindKph() {
        return windKph;
    }

    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    public double getWindMph() {
        return windMph;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public int getWillItRain() {
        return willItRain;
    }

    public void setWillItRain(int willItRain) {
        this.willItRain = willItRain;
    }

    public double getHeatindexF() {
        return heatindexF;
    }

    public void setHeatindexF(double heatindexF) {
        this.heatindexF = heatindexF;
    }

    public double getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public int getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(int precipIn) {
        this.precipIn = precipIn;
    }

    public double getHeatindexC() {
        return heatindexC;
    }

    public void setHeatindexC(double heatindexC) {
        this.heatindexC = heatindexC;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public int getGustMph() {
        return gustMph;
    }

    public void setGustMph(int gustMph) {
        this.gustMph = gustMph;
    }

    public double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public String getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(String chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public double getGustKph() {
        return gustKph;
    }

    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
    }

    public int getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(int precipMm) {
        this.precipMm = precipMm;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public int getWillItSnow() {
        return willItSnow;
    }

    public void setWillItSnow(int willItSnow) {
        this.willItSnow = willItSnow;
    }

    public double getVisKm() {
        return visKm;
    }

    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }

    public int getTimeEpoch() {
        return timeEpoch;
    }

    public void setTimeEpoch(int timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getChanceOfSnow() {
        return chanceOfSnow;
    }

    public void setChanceOfSnow(String chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
    }

    public int getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(int pressureMb) {
        this.pressureMb = pressureMb;
    }

    public int getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(int visMiles) {
        this.visMiles = visMiles;
    }

}
