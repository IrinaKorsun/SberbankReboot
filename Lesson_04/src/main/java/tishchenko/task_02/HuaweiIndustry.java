package tishchenko.task_02;

public class HuaweiIndustry implements SwitchIndustry{
    @Override
    public Hub createHub() {
        return new HuaweiHub();
    }

    @Override
    public Router createRouter() {
        return new HuaweiRouter();
    }

    @Override
    public Switch createSwitch() {
        return new HuaweiSwitch();
    }
}
