package tishchenko.task_02;

public class Industry {
    public static void main(String[] args) {
        SwitchIndustry switchCisco = new CiscoIndustry();
        SwitchIndustry switchHUawei = new HuaweiIndustry();
        switchCisco.createHub();
        switchCisco.createRouter();
        switchCisco.createSwitch();
        switchHUawei.createSwitch();
        switchHUawei.createRouter();
        switchHUawei.createHub();
    }
}
