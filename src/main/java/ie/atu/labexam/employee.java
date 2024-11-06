package ie.atu.labexam;
import jdk.internal.icu.text.UnicodeSet;
import org.springframework.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@PostMapping
@RestController
@RequestBody
@PutMapping


public class employee {
    private List<employee> employeeList = new ArrayList<>();
    public employee(){
        employeeList.add(new employee(String"1","Bob","bob@gmail.com","Sales Rep","67.000","20/10/2020"));
        employeeList.add(new employee("1","Bob","bob@gmail.com","Sales Rep","67.000","20/10/2020"));
       // return employee;
    }
    @PostMapping
    public employee addemployee(@Valid @RequestBody employee newEmployee) {
        employeeList.add(new employee());
        return newEmployee;
    }
    @GetMapping
    public List <employee> getProductList(){
        return employeeList;
    }
    @PutMapping("/{employeeCode}")
    public ResponseEntity<List> update(@PathVariable String employeeCode, String name, @RequestBody employee update){
        for(employee existing : employeeList){
            if(existing.getemployeeCode().equals(employeeCode){
                employeeList.remove(existing);
            }
        }
        employeeList.add(update);
        return ResponseEntity.ok(employeeList);
    }

        private Object getemployeeCode() {
        return getemployeeCode();
        }
        @DeleteMapping("/{employeeCode}")
    public ResponseEntity<List> delete(@PathVariable String employeeCode) {
        for(employee delete : employeeList) {
            if(delete.getemployeeCode().equals(employeeCode)){
                employeeList.remove(delete);
            }
        employeeList.remove(delete);
        return ResponseEntity.ok(employeeList);
        }
    }


}
