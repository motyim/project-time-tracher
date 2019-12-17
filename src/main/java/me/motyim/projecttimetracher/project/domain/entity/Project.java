package me.motyim.projecttimetracher.project.domain.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Project {

    private ProjectId id;
    private String name;
    private ProjectStatus status;
}
