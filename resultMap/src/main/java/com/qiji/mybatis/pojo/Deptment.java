package com.qiji.mybatis.pojo;

import java.util.List;

public class Deptment {
    private Integer deptId;
    private String deptName;

    private List<Employ> employs;

    public Deptment() {
    }

    public Deptment(Integer deptId, String deptName, List<Employ> employs) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employs = employs;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employ> getEmploys() {
        return employs;
    }

    public void setEmploys(List<Employ> employs) {
        this.employs = employs;
    }

    @Override
    public String toString() {
        return "Deptment{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", employs=" + employs +
                '}';
    }
}
