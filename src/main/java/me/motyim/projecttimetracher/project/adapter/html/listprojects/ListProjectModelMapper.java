package me.motyim.projecttimetracher.project.adapter.html.listprojects;

import me.motyim.projecttimetracher.project.adapter.html.listprojects.ListProjectModel;
import me.motyim.projecttimetracher.project.domain.entity.Project;
import me.motyim.projecttimetracher.project.domain.entity.ProjectId;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListProjectModelMapper {

    public List<ListProjectModel> toModels(List<Project> projects) {
        return projects.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

    private ListProjectModel toModel(Project project) {
        return ListProjectModel.builder()
                .id(project.getId().getValue())
                .name(project.getName())
                .status(project.getStatus())
                .build();
    }
}
