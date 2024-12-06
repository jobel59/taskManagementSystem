package cz.tepna.task_management_system.api;

import cz.tepna.task_management_system.api.request.ProjectAddRequest;
import cz.tepna.task_management_system.api.request.ProjectEditRequest;
import cz.tepna.task_management_system.domain.Project;

import java.util.List;

public interface ProjectService {
    Project getProject(int id);
    List<Project> getAll();
    List<Project> getProjectsByUser(long userId);
    void delete(long id);

long add(ProjectAddRequest request);

void edit(long id, ProjectEditRequest request);

}
