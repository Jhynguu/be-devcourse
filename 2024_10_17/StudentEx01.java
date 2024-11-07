class Student {
    String hakbun;
    String name;
    String phoneNumber;
    int age;
    String address;

    Student(String hakbun, String name, String phoneNumber, int age, String address) {
        this.hakbun = hakbun;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = address;
    }
}

public class StudentEx01 {
    public static void main(String[] args) {
        Student student1 = new Student("1001", "홍길동", "010-111-1111", 20, "서울시");
        Student student2 = new Student("1002", "박문수", "010-222-2222", 22, "경기도");
        Student student3 = new Student("1003", "임꺽정", "010-333-3333", 25, "강원도");

        Student[] studentArray = new Student[3];
        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;

        System.out.println("학생");
        System.out.println("학번" + '\t' + "이름" + '\t' + "전화번호" + '\t' + "나이" + '\t' + "주소");
        for (Student student : studentArray) {
            System.out.print(student.hakbun + '\t' + student.name + '\t' + student.phoneNumber + '\t' + student.age + '\t' + student.address);
            System.out.println();
        }
    }
}