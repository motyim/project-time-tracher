package me.motyim.projecttimetracher.project.adapter.html;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectModel {
    private Long id ;
    private String name;
}
