package me.motyim.projecttimetracher.project.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
}
