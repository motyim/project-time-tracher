package me.motyim.projecttimetracher.project.adapter.persistence;

import lombok.AllArgsConstructor;
import me.motyim.projecttimetracher.project.domain.entity.Project;
import me.motyim.projecttimetracher.project.domain.usecase.createproject.CreateProjectPort;
import me.motyim.projecttimetracher.project.domain.usecase.listprojects.ListProjectsPort;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProjectPersistence implements CreateProjectPort, ListProjectsPort {

    private final ProjectRepository projectRepository;

    private final ProjectEntityMapper projectEntityMapper;

    @Override
    public Project createProject(Project project) {
        ProjectEntity projectEntity = projectEntityMapper.toEntity(project);
        ProjectEntity savedEntity = projectRepository.save(projectEntity);
        return projectEntityMapper.toDomainObject(savedEntity);
    }

    @Override
    public List<Project> listProjects() {
        List<ProjectEntity> entities = projectRepository.findAll();
        return projectEntityMapper.toDomainOProjects(entities);
    }

}
