package me.motyim.projecttimetracher.project.domain.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ProjectId implements Serializable {
    private final Long value;

    public static ProjectId of(Long id) {
        return new ProjectId(id);
    }
}
