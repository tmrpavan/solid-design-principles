package bad;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private String name;
    private String authorName;
    private Integer published;
    private long price;
}
