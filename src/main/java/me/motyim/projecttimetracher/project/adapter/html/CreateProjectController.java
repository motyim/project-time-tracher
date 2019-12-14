package me.motyim.projecttimetracher.project.adapter.html;

import lombok.AllArgsConstructor;
import me.motyim.projecttimetracher.project.domain.entity.Project;
import me.motyim.projecttimetracher.project.domain.usecase.createproject.CreateProjectUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class CreateProjectController {

    private final CreateProjectUseCase  createProjectUseCase;

    private final ProjectModelMapper projectModelMapper;

    @GetMapping("/projects/create")
    public String displayCreateProjectForm(Model model){
        model.addAttribute("project",new ProjectModel());
        return "createProject.html";
    }

    @PostMapping("/projects")
    public String createProject(@Valid @ModelAttribute("project") ProjectModel projectModel, Model model){
        Project project = projectModelMapper.toDomainObject(projectModel);
        createProjectUseCase.createProject(project);
        return "redirect:/projects/list";
    }
}
