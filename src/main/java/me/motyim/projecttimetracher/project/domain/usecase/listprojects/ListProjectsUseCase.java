package me.motyim.projecttimetracher.project.domain.usecase.listprojects;

import lombok.RequiredArgsConstructor;
import me.motyim.projecttimetracher.project.domain.entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListProjectsUseCase {

    private final ListProjectsPort listProjectsPort ;

    public List<Project> listProjects(){
        return this.listProjectsPort.listProjects();
    }
}
