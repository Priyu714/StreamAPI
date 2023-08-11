import java.math.BigInteger;
import java.util.Date;

public class Student {

//region Fields
    private Integer rollNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private String emailId;

    private String gender;
    private Date birthDate;
    private Double percentage;
    private BigInteger mobileNumber;
//endregion

//region Constuctors
    public Student() {
    }

    public Student(Integer rollNumber, String firstName, String lastName, String middleName, String emailId, String gender, Date birthDate, Double percentage, BigInteger mobileNumber) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.emailId = emailId;
        this.gender = gender;
        this.birthDate = birthDate;
        this.percentage = percentage;
        this.mobileNumber = mobileNumber;
    }

    //endregion

    //region All Getter & Setter
    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public BigInteger getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(BigInteger mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    //endregion

//region toString Method

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", percentage=" + percentage +
                ", mobileNumber=" + mobileNumber +
                '}';
    }


//endregion
}
