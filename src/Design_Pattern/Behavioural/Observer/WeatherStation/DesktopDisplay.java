package Design_Pattern.Behavioural.Observer.WeatherStation;

public class DesktopDisplay implements  Device{
    public String devicename = "DesktopDisplay";
    public final WeatherStationSubject weatherStationSubject;

    public DesktopDisplay(WeatherStationSubject weatherStationSubject) {
        this.weatherStationSubject = weatherStationSubject;
    }

    @Override
    public void subscribe() {
        System.out.println(devicename + " is subscribing the WeatherStationSubject");
        this.weatherStationSubject.subscribeDevice(this);

    }

    @Override
    public void unsubscribe() {
        System.out.println(devicename + " is unsubscribing the WeatherStationSubject");
        this.weatherStationSubject.unsubscribeDevice(this);


    }

    @Override
    public void update(String temp,String pressure, String humidity) {
        System.out.println("DesktopDisplay: Weather updated! Temp:"+temp+", Humidity:" +humidity +", Pressure:"+ pressure);


    }
}
