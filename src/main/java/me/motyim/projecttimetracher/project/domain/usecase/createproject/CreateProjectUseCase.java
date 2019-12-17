package me.motyim.projecttimetracher.project.domain.usecase.createproject;

import lombok.RequiredArgsConstructor;
import me.motyim.projecttimetracher.project.domain.entity.Project;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateProjectUseCase {

    private final CreateProjectPort createProjectPort;

    public Project createProject(String name){
        Project project = Project.builder()
                .name(name)
                .build();
        return this.createProjectPort.createProject(project);
    }

}
