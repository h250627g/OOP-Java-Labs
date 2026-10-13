
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Learner(String name, double marks) {
    public String gradeBand() {
        if (marks >= 80) return "A";
        if (marks >= 60) return "B";
        return "C";
    }
}

public class LearnerReportDemo {
    public static void main(String[] args) {
        try {
            List<Learner> learners = Files.readAllLines(
                    Path.of("learners.csv"))
                .stream()
                .skip(1)
                .filter(line -> !line.isBlank())
                .map(line -> line.split(","))
                .map(data -> new Learner(
                    data[0].trim(),
                    Double.parseDouble(data[1].trim())
                ))
                .collect(Collectors.toList());

            Map<String, List<Learner>> groups = learners.stream()
                .collect(Collectors.groupingBy(
                    Learner::gradeBand
                ));

            for (String band : List.of("A", "B", "C")) {
                List<Learner> group = groups.getOrDefault(
                    band, List.of()
                );

                List<String> report = group.stream()
                    .map(learner -> learner.name()
                        + " - " + learner.marks())
                    .collect(Collectors.toList());

                Files.write(
                    Path.of("report_" + band + ".txt"),
                    report
                );

                System.out.println(
                    "Created report_" + band + ".txt"
                );
            }
        } catch (IOException e) {
            System.out.println(
                "File error: " + e.getMessage()
            );
        }
    }
}
