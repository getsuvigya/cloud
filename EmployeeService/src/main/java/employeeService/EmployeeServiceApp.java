package employeeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringBootApplication
public class EmployeeServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApp.class);
    }
}