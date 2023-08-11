import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Student> studentList = new ArrayList<>();
        

        studentList.add(new Student(1, "Aarav", "Patel", "", "aarav.patel@example.com", "Male", new Date(), 85.5, new BigInteger("9123456780")));
        studentList.add(new Student(2, "Aanya", "Sharma", "B", "aanya.sharma@example.com", "Female", new Date(), 92.3, new BigInteger("9123456781")));
        studentList.add(new Student(3, "Advait", "Verma", "", "advait.verma@example.com", "Male", new Date(), 78.9, new BigInteger("9123456782")));
        studentList.add(new Student(4, "Ahana", "Gupta", "C", "ahana.gupta@example.com", "Female", new Date(), 91.2, new BigInteger("9123456783")));
        studentList.add(new Student(5, "Akhil", "Kumar", "", "akhil.kumar@example.com", "Male", new Date(), 80.0, new BigInteger("9123456784")));
        studentList.add(new Student(6, "Ananya", "Chopra", "D", "ananya.chopra@example.com", "Female", new Date(), 87.5, new BigInteger("9123456785")));
        studentList.add(new Student(7, "Aryan", "Singh", "", "aryan.singh@example.com", "Male", new Date(), 76.8, new BigInteger("9123456786")));
        studentList.add(new Student(8, "Avni", "Agarwal", "E", "avni.agarwal@example.com", "Female", new Date(), 89.1, new BigInteger("9123456787")));
        studentList.add(new Student(9, "Dev", "Tiwari", "", "dev.tiwari@example.com", "Male", new Date(), 83.7, new BigInteger("9123456788")));
        studentList.add(new Student(10, "Isha", "Pandey", "F", "isha.pandey@example.com", "Female", new Date(), 95.0, new BigInteger("9123456789")));
        studentList.add(new Student(11, "Kabir", "Rao", "", "kabir.rao@example.com", "Male", new Date(), 84.5, new BigInteger("9123456790")));
        studentList.add(new Student(12, "Kiara", "Malhotra", "G", "kiara.malhotra@example.com", "Female", new Date(), 90.3, new BigInteger("9123456791")));
        studentList.add(new Student(13, "Manan", "Gandhi", "", "manan.gandhi@example.com", "Male", new Date(), 81.9, new BigInteger("9123456792")));
        studentList.add(new Student(14, "Mira", "Saxena", "H", "mira.saxena@example.com", "Female", new Date(), 88.7, new BigInteger("9123456793")));
        studentList.add(new Student(15, "Mohit", "Shah", "", "mohit.shah@example.com", "Male", new Date(), 79.2, new BigInteger("9123456794")));
        studentList.add(new Student(16, "Navya", "Goyal", "I", "navya.goyal@example.com", "Female", new Date(), 93.5, new BigInteger("9123456795")));

        studentList.add(new Student(17, "Pranav", "Choudhury", "", "pranav.choudhury@example.com", "Male", new Date(), 82.1, new BigInteger("9123456796")));
        studentList.add(new Student(18, "Riya", "Mishra", "J", "riya.mishra@example.com", "Female", new Date(), 87.4, new BigInteger("9123456797")));
        studentList.add(new Student(19, "Rohan", "Joshi", "", "rohan.joshi@example.com", "Male", new Date(), 77.9, new BigInteger("9123456798")));
        studentList.add(new Student(20, "Sanvi", "Biswas", "K", "sanvi.biswas@example.com", "Female", new Date(), 94.2, new BigInteger("9123456799")));
        studentList.add(new Student(21, "Shaurya", "Chopra", "", "shaurya.chopra@example.com", "Male", new Date(), 85.8, new BigInteger("9123456700")));
        studentList.add(new Student(22, "Siya", "Agarwal", "L", "siya.agarwal@example.com", "Female", new Date(), 91.7, new BigInteger("9123456701")));
        studentList.add(new Student(23, "Vivaan", "Srivastava", "", "vivaan.srivastava@example.com", "Male", new Date(), 78.4, new BigInteger("9123456702")));
        studentList.add(new Student(24, "Zara", "Bhatia", "M", "zara.bhatia@example.com", "Female", new Date(), 92.8, new BigInteger("9123456703")));
        studentList.add(new Student(25, "Vihaan", "Mehta", "", "vihaan.mehta@example.com", "Male", new Date(), 83.2, new BigInteger("9123456704")));
//
        System.out.println(studentList.get(0));
        System.out.println("data added successfully");

//      Imparative approach
        //only female student all data display
        for (Student i : studentList) {

            if (i.getGender().equals("Female"))
                System.out.println(i);

        }
        System.out.println();
        System.out.println("All Female Candidate: ");

        List<Student> femaleList = studentList.stream().filter(student -> student.getGender().equals("Female"))
                .collect(Collectors.toList());
        System.out.println(femaleList);

        System.out.println();
        System.out.println("All Female Candidate print only firstName: ");
        List<String> fisrNameFemaleList = studentList.stream().filter(student -> student.getGender().equalsIgnoreCase("female"))
                .map(Student::getFirstName)
                .collect(Collectors.toList());
        System.out.println(fisrNameFemaleList);

        System.out.println();
        System.out.println("All Female Candidate is present in the List: ");
        Long  femalecounter = studentList.stream().filter(s -> s.getGender().equalsIgnoreCase("female")).count();
        System.out.println(femalecounter);

        System.out.println();
        Long count = studentList.stream().filter(s -> s.getPercentage() >= 90).count();
        System.out.println("Total number of student who get above 90%  : " + count);

        System.out.println();
        System.out.println("List of EmailIds of all Students (this does not use stream)");
        studentList.forEach(s -> System.out.println(s.getEmailId()));
        studentList.stream().forEach(student -> System.out.println(student.getEmailId()));

        System.out.println();
        System.out.println("List of Mobile Numbers of first 15 Students");
        System.out.println(studentList.stream().limit(15).map(Student::getMobileNumber).collect(Collectors.toList()));

        System.out.println();
        System.out.println("List of Marks of Students other than first 5 students");
        studentList.stream().skip(5).map(Student::getPercentage).forEach(System.out::println);

        System.out.println();
        System.out.println("Lets change rollNumbers from 1-25 to 101-125");
        studentList.forEach(student -> student.setRollNumber(student.getRollNumber()+100));
        System.out.println("these are updated rollNumbers ");
        studentList.forEach(student -> System.out.print(student.getRollNumber() + " "));


    }
}