/*
Name: Joshua Robinson
Date: 25 Jan 2022
 */
package student_win22;

/**
 *
 * @author joshs
 */
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
    

