package employeeService.models;

import java.io.Serializable;

public class Employee implements Serializable
{
    private String name;
    private Integer roll;
    private String servicePort;
    private String configMessage;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getRoll() {
        return roll;
    }
    public void setRoll(Integer roll) {
        this.roll = roll;
    }
    public String getServicePort() {
        return servicePort;
    }
    public void setServicePort(String servicePort) {
        this.servicePort = servicePort;
    }
    public String getConfigMessage() {
        return configMessage;
    }
    public void setConfigMessage(String configMessage) {
        this.configMessage = configMessage;
    }
}