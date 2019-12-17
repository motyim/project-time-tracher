package me.motyim.projecttimetracher.project.adapter.html.createproject;

import lombok.AllArgsConstructor;
import me.motyim.projecttimetracher.project.domain.usecase.createproject.CreateProjectUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
class CreateProjectController {

    private final CreateProjectUseCase  createProjectUseCase;

    @GetMapping("/projects/create")
    String displayCreateProjectForm(Model model){
        model.addAttribute("project",new CreateProjectModel());
        return "createProject.html";
    }

    @PostMapping("/projects")
    public String createProject(@Valid @ModelAttribute("project") CreateProjectModel createProjectModel, Model model){
        createProjectUseCase.createProject(createProjectModel.getName());
        return "redirect:/projects/list";
    }
}
