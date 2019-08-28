
package JSONResponse;

import java.util.List;

public class Forecastday {

    private String date;
    private Astro astro;
    private int dateEpoch;
    private List<Hour> hour = null;
    private Day day;

    public Forecastday() {
    }

    public Forecastday(String date, Astro astro, int dateEpoch, List<Hour> hour, Day day) {
        super();
        this.date = date;
        this.astro = astro;
        this.dateEpoch = dateEpoch;
        this.hour = hour;
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public int getDateEpoch() {
        return dateEpoch;
    }

    public void setDateEpoch(int dateEpoch) {
        this.dateEpoch = dateEpoch;
    }

    public List<Hour> getHour() {
        return hour;
    }

    public void setHour(List<Hour> hour) {
        this.hour = hour;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

}
