package day04;

public class SubjectConroller {

    public static void main(String[] args) {
        SubjectService subjectService = new SubjectService("src/main/resources/beosztas.txt");

        System.out.println(subjectService.getSubjectBlocks());
        System.out.println(subjectService.sumOfLessonNumberByName("Albatrosz Aladin"));
    }
}
