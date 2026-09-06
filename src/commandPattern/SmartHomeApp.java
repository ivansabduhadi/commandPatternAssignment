package commandPattern;

public class SmartHomeApp {

    public static void main(String[] args) {

        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command turnOffLight = new TurnOffLightCommand(light);

        Command increaseTemperature =
                new IncreaseTemperatureCommand(thermostat);

        Command decreaseTemperature =
                new DecreaseTemperatureCommand(thermostat);

        Command increaseVolume =
                new IncreaseVolumeCommand(musicPlayer);


        Command decreaseVolume =
                new DecreaseVolumeCommand(musicPlayer);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnLight);
        System.out.println(remoteControl.pressButton());
        System.out.println(remoteControl.pressButton());

        remoteControl.setCommand(turnOffLight);

        remoteControl.setCommand(increaseTemperature);
        System.out.println(remoteControl.pressButton());

        remoteControl.setCommand(decreaseTemperature);
        System.out.println(remoteControl.pressButton());

        remoteControl.setCommand(increaseVolume);
        System.out.println(remoteControl.pressButton());

        remoteControl.setCommand(decreaseVolume);
        System.out.println(remoteControl.pressButton());
    }
}