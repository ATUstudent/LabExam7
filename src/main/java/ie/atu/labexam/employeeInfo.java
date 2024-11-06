package ie.atu.labexam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class employeeInfo {
    private String employeeCode;
    private String name;
    private String email;
    private String position;
    private  double salary;
    private String date;

}
