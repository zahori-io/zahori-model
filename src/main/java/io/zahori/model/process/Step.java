package io.zahori.model.process;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Step {

    private String id;
    private List<String> attachments = new ArrayList<>();
    private Map<String, String> customFields = new HashMap<>();
    private String name;
    private String status;
    private String description;
    private String[] descriptionArgs;
    private String expected;
    private String actual;
    private String executionTime;
    private String runId;
    private Boolean passed;
    private String messageText;
    private List<Step> subSteps = new ArrayList<>();

    public Step() {
        super();
    }

    @Override
    public String toString() {
        return "Step [id=" + id + ", attachments=" + attachments + ", customFields=" + customFields + ", name=" + name + ", status=" + status + ", description="
                + description + ", descriptionArgs=" + Arrays.toString(descriptionArgs) + ", expected=" + expected + ", actual=" + actual + ", executionTime="
                + executionTime + ", runId=" + runId + ", passed=" + passed + ", messageText=" + messageText + ", subSteps=" + subSteps + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public Map<String, String> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map<String, String> customFields) {
        this.customFields = customFields;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getDescriptionArgs() {
        return descriptionArgs;
    }

    public void setDescriptionArgs(String[] descriptionArgs) {
        this.descriptionArgs = descriptionArgs;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    public Boolean getPassed() {
        return passed;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public List<Step> getSubSteps() {
        return subSteps;
    }

    public void setSubSteps(List<Step> subSteps) {
        this.subSteps = subSteps;
    }

    public void addSubStep(Step subStep) {
        subSteps.add(subStep);
    }

    public boolean hasSubSteps() {
        return !subSteps.isEmpty();
    }

    public void addAttachment(String attachment) {
        this.attachments.add(attachment);
    }
}
