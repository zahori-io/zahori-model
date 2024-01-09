package io.zahori.model.process;

/*-
 * #%L
 * zahori-model
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2021 PANEL SISTEMAS INFORMATICOS,S.L
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Step implements Serializable {

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
    private int duration = 0;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
