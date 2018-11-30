package com.berkturan.androidbootcampweek2;

public class User {
    private String userName;
    private String fullName;
    private String email;
    private int birthYear;
    private String studentNumber;

    public User() {
        userName = "";
        fullName ="";
        email="";
        birthYear =0;
        studentNumber = "";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", birthYear=" + birthYear +
                ", studentNumber=" + studentNumber +
                '}';
    }
    public String[] stringArrayForListView(){
        String[] userDetails = new String[5];
        userDetails[0]=this.getUserName();
        userDetails[1]=this.getFullName();
        userDetails[2]=this.getEmail();
        userDetails[3]=String.valueOf(this.getBirthYear());
        userDetails[4]=this.getStudentNumber();
        return userDetails;
    }

}
