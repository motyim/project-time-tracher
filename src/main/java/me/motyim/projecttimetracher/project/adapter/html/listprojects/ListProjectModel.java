package me.motyim.projecttimetracher.project.adapter.html.listprojects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListProjectModel {
    private Long id ;
    private String name;
}
