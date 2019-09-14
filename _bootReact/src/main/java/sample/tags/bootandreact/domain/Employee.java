package sample.tags.bootandreact.domain;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
   private String firstName;
   private String lastName;
   private String description;
   private Integer id;
}
