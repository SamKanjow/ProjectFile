
package JSONResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Day implements Serializable {

    @SerializedName("maxtemp_c")
    public double maxtempC;
    @SerializedName("mintemp_c")
    public double mintempC;

    private double avgvisKm;
    private int uv;
    private double avgtempF;
    private int avgtempC;
  //  private   maxtempC;
    private double maxtempF;
  //  private double mintempC;
    private int avgvisMiles;
    private double mintempF;
    private double totalprecipIn;
    private int avghumidity;
    private Condition_ condition;
    private int maxwindKph;
    private double maxwindMph;
    private double totalprecipMm;

    public Day() {
    }
    public Day(double avgvisKm, int uv, double avgtempF, int avgtempC, double maxtempC, double maxtempF, double mintempC, int avgvisMiles, double mintempF, double totalprecipIn, int avghumidity, Condition_ condition, int maxwindKph, double maxwindMph, double totalprecipMm) {
        super();
        this.avgvisKm = avgvisKm;
        this.uv = uv;
        this.avgtempF = avgtempF;
        this.avgtempC = avgtempC;
        this.maxtempC = maxtempC;
        this.maxtempF = maxtempF;
        this.mintempC = mintempC;
        this.avgvisMiles = avgvisMiles;
        this.mintempF = mintempF;
        this.totalprecipIn = totalprecipIn;
        this.avghumidity = avghumidity;
        this.condition = condition;
        this.maxwindKph = maxwindKph;
        this.maxwindMph = maxwindMph;
        this.totalprecipMm = totalprecipMm;
    }

    public double getAvgvisKm() {
        return avgvisKm;
    }

    public void setAvgvisKm(double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public double getAvgtempF() {
        return avgtempF;
    }

    public void setAvgtempF(double avgtempF) {
        this.avgtempF = avgtempF;
    }

    public int getAvgtempC() {
        return avgtempC;
    }

    public void setAvgtempC(int avgtempC) {
        this.avgtempC = avgtempC;
    }

    public double getMaxtempC() {
        return maxtempC;
    }

    public void setMaxtempC(double maxtempC) {
        this.maxtempC = maxtempC;
    }

    public double getMaxtempF() {
        return maxtempF;
    }

    public void setMaxtempF(double maxtempF) {
        this.maxtempF = maxtempF;
    }

    public double getMintempC() {
        return mintempC;
    }

    public void setMintempC(double mintempC) {
        this.mintempC = mintempC;
    }

    public int getAvgvisMiles() {
        return avgvisMiles;
    }

    public void setAvgvisMiles(int avgvisMiles) {
        this.avgvisMiles = avgvisMiles;
    }

    public double getMintempF() {
        return mintempF;
    }

    public void setMintempF(double mintempF) {
        this.mintempF = mintempF;
    }

    public double getTotalprecipIn() {
        return totalprecipIn;
    }

    public void setTotalprecipIn(double totalprecipIn) {
        this.totalprecipIn = totalprecipIn;
    }

    public int getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(int avghumidity) {
        this.avghumidity = avghumidity;
    }

    public Condition_ getCondition() {
        return condition;
    }

    public void setCondition(Condition_ condition) {
        this.condition = condition;
    }

    public int getMaxwindKph() {
        return maxwindKph;
    }

    public void setMaxwindKph(int maxwindKph) {
        this.maxwindKph = maxwindKph;
    }

    public double getMaxwindMph() {
        return maxwindMph;
    }

    public void setMaxwindMph(double maxwindMph) {
        this.maxwindMph = maxwindMph;
    }

    public double getTotalprecipMm() {
        return totalprecipMm;
    }

    public void setTotalprecipMm(double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }

}
