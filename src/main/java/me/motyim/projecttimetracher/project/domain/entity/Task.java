package me.motyim.projecttimetracher.project.domain.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {
    private TaskId id ;
    private String name;
    private boolean invoicable;
    private Project project;
}
