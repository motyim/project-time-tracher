package me.motyim.projecttimetracher.project.adapter.persistence;

import me.motyim.projecttimetracher.project.domain.entity.Project;
import me.motyim.projecttimetracher.project.domain.entity.ProjectId;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProjectEntityMapper {

    public ProjectEntity toEntity(Project domainObject) {
        return ProjectEntity.builder()
                .id(domainObject.getId().getValue())
                .name(domainObject.getName())
                .build();
    }

    public List<ProjectEntity> toEntities(List<Project> domainObjects){
        return domainObjects.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    public Project toDomainObject(ProjectEntity entity){
        return Project.builder()
                .id(ProjectId.of(entity.getId()))
                .name(entity.getName())
                .build();
    }

    public List<Project> toDomainOProjects(Iterable<ProjectEntity> entities){
        List<Project> projects = new ArrayList<>();
        entities.forEach(entity->projects.add(toDomainObject(entity)));
        return projects;
    }
}