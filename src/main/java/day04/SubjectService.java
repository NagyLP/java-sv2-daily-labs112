package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectService {

    private List<SubjectBlock> subjectBlocks = new ArrayList<>();

    public SubjectService() {
    }

    public SubjectService(List<SubjectBlock> subjectBlocks) {
        this.subjectBlocks = subjectBlocks;
    }

    public SubjectService(String filename) {
        readFrom(filename);
    }

    private void readFrom(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                subjectBlocks.add(new SubjectBlock(line, br.readLine(), br.readLine(), Integer.parseInt(br.readLine())));
            }
        } catch (
                IOException ioe) {
            throw new IllegalStateException("Can not rech file", ioe);
        }
    }

    public int sumOfLessonNumberByName(String name) {
        int sum = 0;
        for (SubjectBlock actual : subjectBlocks) {
            if (name.equals(actual.getName())) {
                sum += actual.getLessonNumber();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "SubjectService{" +
                "subjectBlocks=" + subjectBlocks +
                '}';
    }

    public List<SubjectBlock> getSubjectBlocks() {
        return subjectBlocks;
    }
}
