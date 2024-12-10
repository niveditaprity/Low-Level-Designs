package Design_Pattern.Behavioural.Observer.WeatherStation;

public interface WeatherStationSubject {
    public void subscribeDevice(Device device);
    public void unsubscribeDevice(Device device);
    public void notifyAllDevice(String temp,String pressure, String humidity);
}
