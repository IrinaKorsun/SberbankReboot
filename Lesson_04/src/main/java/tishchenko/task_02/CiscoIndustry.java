package tishchenko.task_02;

public class CiscoIndustry implements SwitchIndustry{
    @Override
    public Hub createHub() {
        return new CiscoHub();
    }

    @Override
    public Router createRouter() {
        return new CiscoRouter();
    }

    @Override
    public Switch createSwitch() {
        return new CiscoSwitch();
    }
}
