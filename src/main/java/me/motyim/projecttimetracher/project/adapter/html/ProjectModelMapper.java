package me.motyim.projecttimetracher.project.adapter.html;

import me.motyim.projecttimetracher.project.domain.entity.Project;
import me.motyim.projecttimetracher.project.domain.entity.ProjectId;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProjectModelMapper {
    public Project toDomainObject(ProjectModel projectModel) {
        return Project.builder()
                .id(ProjectId.of(projectModel.getId()))
                .name(projectModel.getName())
                .build();
    }

    public List<ProjectModel> toModels(List<Project> projects) {
        return projects.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

    private ProjectModel toModel(Project project) {
        return ProjectModel.builder()
                .id(project.getId().getValue())
                .name(project.getName())
                .build();
    }
}
