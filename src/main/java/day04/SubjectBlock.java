package day04;

import java.util.Objects;

public class SubjectBlock {

    private String name;
    private String subject;
    private String nameAndClass;
    private int lessonNumber;

    public SubjectBlock(String name, String subject, String nameAndClass, int lessonNumber) {
        this.name = name;
        this.subject = subject;
        this.nameAndClass = nameAndClass;
        this.lessonNumber = lessonNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectBlock that = (SubjectBlock) o;
        return lessonNumber == that.lessonNumber && name.equals(that.name) && subject.equals(that.subject) && nameAndClass.equals(that.nameAndClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subject, nameAndClass, lessonNumber);
    }

    @Override
    public String toString() {
        return "SubjectBlock{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", nameAndClass='" + nameAndClass + '\'' +
                ", lessonNumber=" + lessonNumber +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setNameAndClass(String nameAndClass) {
        this.nameAndClass = nameAndClass;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getNameAndClass() {
        return nameAndClass;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }
}
