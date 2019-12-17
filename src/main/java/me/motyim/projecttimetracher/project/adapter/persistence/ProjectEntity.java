package me.motyim.projecttimetracher.project.adapter.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.motyim.projecttimetracher.project.domain.entity.ProjectStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
class ProjectEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;

    @Column
    private ProjectStatus status;
}
