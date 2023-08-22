package aditi;
class Stu_dent{
    String name;
    static String school;

    public static void changeSchool(){
        school = "newSchool";
    }
}
public class Static_keyword {
    public static void main(String[] args) {
        Stu_dent.school = "DAV";
        Stu_dent s1 = new Stu_dent();
        s1.name = "Aditi";
        System.out.println(s1.school);

    }
}