package me.motyim.projecttimetracher.project.adapter.html.listprojects;

import lombok.AllArgsConstructor;
import me.motyim.projecttimetracher.project.domain.entity.Project;
import me.motyim.projecttimetracher.project.domain.usecase.listprojects.ListProjectsUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
class ListProjectsController {

    private final ListProjectsUseCase listProjectsUseCase;

    private final ListProjectModelMapper listProjectModelMapper;

    @GetMapping("/projects/list")
    String displayProjectsList(Model model){
        List<Project> projects = listProjectsUseCase.listProjects();
        List<ListProjectModel> listProjectModels = listProjectModelMapper.toModels(projects);
        model.addAttribute("projects", listProjectModels);
        return "listProjects.html";
    }

}
