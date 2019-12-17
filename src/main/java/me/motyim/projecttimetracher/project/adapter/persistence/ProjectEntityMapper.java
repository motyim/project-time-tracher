package me.motyim.projecttimetracher.project.adapter.persistence;

import me.motyim.projecttimetracher.project.domain.entity.Project;
import me.motyim.projecttimetracher.project.domain.entity.ProjectId;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
class ProjectEntityMapper {

    ProjectEntity toEntity(Project domainObject) {
        return ProjectEntity.builder()
                .id(Optional.ofNullable(domainObject.getId()).map(ProjectId::getValue).orElse(0L))
                .name(domainObject.getName())
                .status(domainObject.getStatus())
                .build();
    }

    List<ProjectEntity> toEntities(List<Project> domainObjects){
        return domainObjects.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    Project toDomainObject(ProjectEntity entity){
        return Project.builder()
                .id(ProjectId.of(entity.getId()))
                .name(entity.getName())
                .status(entity.getStatus())
                .build();
    }

    List<Project> toDomainOProjects(Iterable<ProjectEntity> entities){
        List<Project> projects = new ArrayList<>();
        entities.forEach(entity->projects.add(toDomainObject(entity)));
        return projects;
    }
}
