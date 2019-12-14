package me.motyim.projecttimetracher.project.domain.usecase.createproject;

import me.motyim.projecttimetracher.project.domain.entity.Project;

public interface CreateProjectPort {
    /* presists new project*/
    Project createProject(Project project);
}
