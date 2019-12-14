package me.motyim.projecttimetracher.project.adapter.html;

import lombok.AllArgsConstructor;
import me.motyim.projecttimetracher.project.domain.entity.Project;
import me.motyim.projecttimetracher.project.domain.usecase.listprojects.ListProjectsUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ListProjectsController {

    private final ListProjectsUseCase listProjectsUseCase;

    private final ProjectModelMapper projectModelMapper;

    @GetMapping("/projects/list")
    public String displayProjectsList(Model model){
        List<Project> projects = listProjectsUseCase.listProjects();
        List<ProjectModel> projectModels = projectModelMapper.toModels(projects);
        model.addAttribute("projects",projectModels);
        return "listProjects.html";
    }

}
