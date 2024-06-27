public class Main {
    public static void main(String[] args) {
        // instancia de WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // instancias de los observadores
        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        // observadores a la estación meteorológica
        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(weatherWarning);

        // la temperatura de la estación dos veces
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(35);
    }
}
