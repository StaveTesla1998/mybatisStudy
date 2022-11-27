package com.qiji.mybatis.pojo;

public class Employ {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
    private Integer deptId;

   private Deptment deptment;

    public Employ() {
    }

    public Employ(Integer empId, String empName, Integer age, String gender, Integer deptId, Deptment deptment) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.deptId = deptId;
        this.deptment = deptment;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Deptment getDeptment() {
        return deptment;
    }

    public void setDeptment(Deptment deptment) {
        this.deptment = deptment;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", deptId=" + deptId +
                ", deptment=" + deptment +
                '}';
    }
}
