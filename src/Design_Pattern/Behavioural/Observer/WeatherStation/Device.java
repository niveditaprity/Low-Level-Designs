package Design_Pattern.Behavioural.Observer.WeatherStation;

public interface Device {
    public  void subscribe();
    public void unsubscribe();
    public void  update(String temp,String pressure, String humidity);
}
