package me.motyim.projecttimetracher.project.domain.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class TaskId {

    private final long value;

    public static TaskId of(Long id){
        return new TaskId(id);
    }
}
