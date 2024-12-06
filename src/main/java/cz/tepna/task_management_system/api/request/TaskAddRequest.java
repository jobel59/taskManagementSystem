package cz.tepna.task_management_system.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskAddRequest {
    private long userId;
    private long projectId;
    private String name;
    private String description;
}
