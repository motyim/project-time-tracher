package me.motyim.projecttimetracher.project.domain.usecase.listprojects;

import me.motyim.projecttimetracher.project.domain.entity.Project;

import java.util.List;

public interface ListProjectsPort {

    List<Project> listProjects();

}
