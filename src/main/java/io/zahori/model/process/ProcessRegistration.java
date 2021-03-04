package io.zahori.model.process;

public class ProcessRegistration {

    private Long processId;
    private String name;
    private Long clientId;
    private Long teamId;
    private Long procTypeId;

    public ProcessRegistration() {
        super();
    }

    public ProcessRegistration(String name, Long clientId, Long teamId, Long procTypeId) {
        super();
        this.name = name;
        this.clientId = clientId;
        this.teamId = teamId;
        this.procTypeId = procTypeId;
    }

    @Override
    public String toString() {
        return "ProcessRegistration [processId=" + processId + ", name=" + name + ", clientId=" + clientId + ", teamId=" + teamId + ", procTypeId=" + procTypeId
                + "]";
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getProcTypeId() {
        return procTypeId;
    }

    public void setProcTypeId(Long procTypeId) {
        this.procTypeId = procTypeId;
    }

}