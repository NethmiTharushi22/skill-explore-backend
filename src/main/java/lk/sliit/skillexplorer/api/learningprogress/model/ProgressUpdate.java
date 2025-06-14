package lk.sliit.skillexplorer.api.learningprogress.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "progress_updates")
public class ProgressUpdate {
    @Id
    private String id;
    private String userId;
    private String title;
    private int rating;
    private String description;
    private LocalDate date;
}
