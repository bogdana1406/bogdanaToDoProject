package com.bogdanatodo.ppmtool.exeptions;

public class ProjectIdExeptionResponce {

    private String projectIdentifier;

    public ProjectIdExeptionResponce(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
