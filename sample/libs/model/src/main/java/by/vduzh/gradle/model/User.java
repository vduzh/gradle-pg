package by.vduzh.gradle.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class User {
    private Integer id;
    private String name;
}
