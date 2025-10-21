package org.pluralsight.WeekFour.HotelOperations.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    private  int employeeId;
    private  String Name;
    private  String Department;
    private  float payRate;
    private HashMap<String, Double> punchInTime = new HashMap<>();
    private float CurrentPunchInTime;
    private float CurrentPunchOutTime;





    public  double getHoursWorked() {
        return hoursWorked;
    }
    public double getRegularHours() {
        if(hoursWorked < 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }
    public double getOvertimeHours() {
        if(hoursWorked - 40 > 0 ){
            return hoursWorked - 40;
        }  else {
            return 0;
        }
    }
    public  void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public  float getPayRate() {
        return payRate;
    }

    public  void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public  String getDepartment() {
        return Department;
    }

    public  void setDepartment(String department) {
        Department = department;
    }

    public  String getName() {
        return Name;
    }

    public  void setName(String name) {
        Name = name;
    }

    public  int getEmployeeId() {
        return employeeId;
    }

    public  void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    private  double hoursWorked;

    // regular methods
    public void punchIn(float time) {
        CurrentPunchInTime = time; // set current time
    }
    public void punchIn() {
        CurrentPunchInTime = (float) LocalDateTime.now().getHour();
    }

    public void punchOut(float time) {
        CurrentPunchOutTime = time;
        double TotalHrs = CurrentPunchOutTime - CurrentPunchInTime;
        System.out.println("Worked: " + TotalHrs);
    }
    public void punchOut() {
        CurrentPunchOutTime = (float) LocalDateTime.now().getHour();
        double TotalHrs = CurrentPunchOutTime - CurrentPunchInTime;
        System.out.println("Worked: " + TotalHrs);
    }


    public void punchTimeCard(double TimeStart, double TimeEnd) {
        double TotalHrs = TimeEnd - TimeStart;
        String Today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        punchInTime.put(Today, TotalHrs); // stores 2025-10-21 and the Time Double
        CurrentPunchInTime = (float) TimeStart;
    }

    public void punchTimeCard() {
        float TotalHrs = (float) LocalDateTime.now().getHour() - CurrentPunchInTime;
        String Today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        punchInTime.put(Today, (double) TotalHrs); // stores 2025-10-21 and the Time Double
    }

    public void punchTimeCardExport() {
        for (Map.Entry<String, Double> entry : punchInTime.entrySet()) {
            System.out.printf("Day: %s | Hours Worked: %s%n", entry.getKey(), entry.getValue());
        }
    }
    //

}
