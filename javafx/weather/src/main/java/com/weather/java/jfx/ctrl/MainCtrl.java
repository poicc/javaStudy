package com.weather.java.jfx.ctrl;

import com.weather.java.jfx.util.ApiConnector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @description: 主界面控制器
 * @author: crq
 * @create: 2021-09-30 22:29
 **/
public class MainCtrl{
    @FXML
    private TextField cityInput;

    @FXML
    private Text weatherText;

    @FXML
    void getWeatherData(ActionEvent event) {
        JSONObject todayWeather = getTodayWeatherInformation(getWoeid());
        System.out.println(todayWeather);
        weatherText.setText(
                "Current Date: " + todayWeather.get("applicable_date") +
                        "\nCurrent city: " + cityInput.getText() +
                        "\nCurrent temperature: " +
                        todayWeather.get("the_temp") +
                        "\nMax temperature: " +
                        todayWeather.get("max_temp") +
                        "\nMin temperature: " +
                        todayWeather.get("min_temp") +
                        "\nWind speed: " + todayWeather.get("wind_speed")
        );
    }

    public String getWoeid() {
        String cityApi = "https://www.metaweather.com/api/location/search/?query=";
        ApiConnector apiConnectorCity = new ApiConnector(cityApi);
        JSONObject jsonData = (JSONObject)
                (apiConnectorCity.getJsonArray(cityInput.getText())).get(0);
        return jsonData.get("woeid").toString();
    }

    public JSONObject getTodayWeatherInformation(String woeid) {
        String weatherApi = "https://www.metaweather.com/api/location/";
        ApiConnector apiConnectorWeather = new ApiConnector(weatherApi);
        JSONObject weatherJsonObject =
                apiConnectorWeather.getJsonObject(woeid + "/");
        JSONArray weatherArray = (JSONArray)
                weatherJsonObject.get("consolidated_weather");
        return (JSONObject) weatherArray.get(0);
    }
}
