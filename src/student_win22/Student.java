/*
Name: Joshua Robinson
Date: 25 Jan 2022
Author: Joshua R
Day: Tuesday 
 */
package student_win22;
//comments
//comment from github.com

public class Student {
    
    private String studentId;
    private String studentName;
    private String address;
    
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    

    }
    

