package com.company;

// import these classes from different package.
import JSONResponse.JSONResponse;
import JSONResponse.Forecastday ;

import com.google.gson.Gson;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class weatherApp {

    private Scanner input = new Scanner(System.in) ;
    private JSonFile JSF = new JSonFile();
    static JSONResponse JSONResObj = null ;
    Gson gson = new Gson();

    private int day = 7 ;
    private  int cityIndex = 0 ;
    private String [] city =  {"Copenhagen" , "Odense" , "Aarhus"} ; // Århus
    HashMap<String , String > map = new HashMap<>();


    public LocalDateTime getCurrentTime(){
        DateTimeFormatter dateTimeForm = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        //now = now.minusDays(1) ; // because it return uncompleted file of current day up to 8:00 o'clock, so we checked the previous one.
       // System.out.println(dateTimeForm.format(now));
        return now ;
    }

    public void initializeData () {
        String APIKey = "794a685acb5a445db51181013191508";
        String baseAPILink = "http://api.apixu.com/v1/history.json?key=";
        LocalDateTime localDateTime = getCurrentTime();
        //String Request = "http://api.apixu.com/v1/history.json?key=794a685acb5a445db51181013191508&q=Copenhagen&dt=2019-08-15&end_dt=2019-08-22" ; // for direct testing.
        map.put(city[0], baseAPILink + APIKey + "&q=" + city[0] + "&dt=" + localDateTime.minusDays(day) + "&end_dt=" + localDateTime);
        map.put(city[1], baseAPILink + APIKey + "&q=" + city[1] + "&dt=" + localDateTime.minusDays(day) + "&end_dt=" + localDateTime);
        map.put(city[2], baseAPILink + APIKey + "&q=" + city[2] + "&dt=" + localDateTime.minusDays(day) + "&end_dt=" + localDateTime);
    }

    public String  requestURL() {
        initializeData();
        String URL = null;
        if(cityIndex < 3){
            URL = map.get(city[cityIndex]);
        } else {
            System.out.println("The input choose out of the rang, please insert a value from 1 to 3.");
        }
        return URL ;
    }

    public JSONResponse receiveInputData() throws IOException, JSONException {
        String tempURL = requestURL() ;
        StringBuilder result = new StringBuilder();
        // System.out.println(tempURL); // For Testing URL value.
        URL url = new URL(tempURL) ;
        URLConnection connection = url.openConnection() ;
        connection.setRequestProperty("Accept-Encoding","identity"); // to avoid receiving GZip Encoding.
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream())) ;

        String line ;
        while((line= reader.readLine()) != null){
            result.append(line) ;
        }
        reader.close();     // write the input buffered data into JSON file with the name of the city.
        //------------------------------------------------------------------------------
        JSONParser parser = new JSONParser();
        try {
            Object obj1 = parser.parse(result.toString());
            org.json.simple.JSONObject jObj = (JSONObject)obj1;
            this.JSONResObj = (JSONResponse)this.gson.fromJson(jObj.toString(), JSONResponse.class);
        } catch (ParseException var11) {
            var11.printStackTrace();
        }
        JSonFile.jsonFileWriter( city[cityIndex] ,JSF.convertStringBuilderToJsonObj(result)) ;
        return this.JSONResObj ;
        //------------------------------------------------------------------------------------------
        //System.out.println(result);
        // return result ;
    }

    /*
    public void mappingJsonDataInToJavaObj() throws IOException, JSONException {
        StringBuilder tempResult = receiveInputData() ;
        ObjectMapper objectMapper = new ObjectMapper() ;
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false ); // to ignore all unmatching data. // Jackson with JSON: Unrecognized field, not marked as ignorable

        try {
            JSONResObj =  objectMapper.readValue(tempResult.toString(), JSONResponse.class);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    */


    public void saveDataInCSVFormat() throws IOException, JSONException {

        CSVFormat CSVObj = new CSVFormat() ;
        List<String[]> InputData = new ArrayList<String[]>();
        String[] inputHeader = {"Date" , "Location" , "Max.temperature in Celsius", "Min.temperature in Celsius", "Sun rise", "Sun set", "Weather conditions"} ;
        //mappingJsonDataInToJavaObj();
        for (int q = 7 ; q > 0; q--) {
            day = q ;
            receiveInputData();
            List<Forecastday> tempForecastday = null;
            tempForecastday = JSONResObj.getForecast().getForecastday();

            for (int i = 0; i < tempForecastday.size(); i++) {
                String date = tempForecastday.get(i).getDate();
                String location = JSONResObj.getLocation().getName();
                String maxTemperatureCelsius = String.valueOf(tempForecastday.get(i).getDay().getMaxtempC());
                String minTemperatureCelsius = String.valueOf(tempForecastday.get(i).getDay().getMintempC());
                String sunRise = tempForecastday.get(i).getAstro().getSunrise();
                String sunSet = tempForecastday.get(i).getAstro().getSunset();
                String weatherConditions = tempForecastday.get(i).getDay().getCondition().getText();
                InputData.add(new String[]{date, location, maxTemperatureCelsius, minTemperatureCelsius, sunRise, sunSet, weatherConditions});
            }
        }
        CSVObj.writeData(city[cityIndex] , inputHeader ,  InputData);

        //...............................................................
        /* For Testing.
        JSONResponse tryWeatherModel = this.receiveInputData();
        System.out.println( tryWeatherModel.getLocation().getName() );
        System.out.println( tryWeatherModel.getForecast().getForecastday().get(0).getDay().maxtempC ); */
        //,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
    }

    public void runMainList() throws IOException, JSONException {
        boolean tempStop = false ;
        System.out.println();
        System.out.println("|_____________Welcome to the Weather App_____________|");
        System.out.println("Please select a city from the following list by entering the same displayed digit beside the city name : ");

        while(tempStop != true){
                for (int i = 0; i < city.length; i++) {
                    System.out.println((i +1) + ". " + city[i]);
                }
                System.out.println("The input digit of selected city is : ");
                cityIndex = input.nextInt();

                if (cityIndex <= 3 && cityIndex > 0){
                    cityIndex--;
                    System.out.println("The selected location is : " + city [cityIndex]);
                    tempStop = true ;
                }else {
                    System.out.println("The input option is invalid !");
                }
        }
        System.out.println(".........................................");
        saveDataInCSVFormat();
        System.out.println("Thank you, Bye!");
    }

    public int runApp()  {
        try {
            runMainList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1 ;
    }


}
