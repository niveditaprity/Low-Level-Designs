package Design_Pattern.Behavioural.Observer.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationConcreteSubject implements WeatherStationSubject {
    private final List<Device> deviceList = new ArrayList<>();
    private String temperature;
    private String humidity;
    private String pressure;

    @Override
    public void subscribeDevice(Device device) {
        deviceList.add(device);
    }

    @Override
    public void unsubscribeDevice(Device device) {
        deviceList.remove(device);
    }

    @Override
    public void notifyAllDevice(String temp, String pressure, String humidity) {
        for (Device device : deviceList) {
            device.update(temp, pressure, humidity);
        }
    }

    public void setWeatherData(String temperature, String pressure, String humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyAllDevice(temperature, pressure, humidity);
    }
}
