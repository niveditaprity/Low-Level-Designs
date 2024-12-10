package Design_Pattern.Behavioural.Observer.WeatherStation;

public class Client {
        public static void main(String[] args) {
            WeatherStationConcreteSubject weatherStation = new WeatherStationConcreteSubject();

            Device phoneDisplay = new PhoneDisplay(weatherStation);
            Device desktopDisplay = new DesktopDisplay(weatherStation);
            Device ledBoard = new LEDBoard(weatherStation);

            // Subscribe devices
            phoneDisplay.subscribe();
            desktopDisplay.subscribe();
            ledBoard.subscribe();

            // Update weather data
            System.out.println("\n--- Updating Weather Data ---");
            weatherStation.setWeatherData("25°C", "1013 hPa", "60%");

            // Unsubscribe a device
            phoneDisplay.unsubscribe();

            // Update weather data again
            System.out.println("\n--- Updating Weather Data Again ---");
            weatherStation.setWeatherData("28°C", "1008 hPa", "65%");
        }
    }
