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

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CaseExecution {

    private int caseExecutionId;
    private String date;
    private String log;
    private String notes;
    private String status;
    private String steps;
    private Object stepsJson;
    private String video;
    private String doc;
    private String har;
    private List<Attachment> attachments = new ArrayList<>();
    private Integer durationSeconds;
    private Browser browser;
    private String screenResolution;
    private Case cas;
    private Configuration configuration;

    public CaseExecution() {
        super();
    }

    public int getCaseExecutionId() {
        return caseExecutionId;
    }

    public void setCaseExecutionId(int caseExecutionId) {
        this.caseExecutionId = caseExecutionId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public Object getStepsJson() {
        return stepsJson;
    }

    public void setStepsJson(Object stepsJson) {
        this.stepsJson = stepsJson;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getHar() {
        return har;
    }

    public void setHar(String har) {
        this.har = har;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void addAttachment(String filepath) {
        if (attachments == null) {
            attachments = new ArrayList<>();
        }

        Attachment attachment = new Attachment();
        attachment.setPath(filepath);
        this.attachments.add(attachment);
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public Case getCas() {
        return cas;
    }

    public void setCas(Case cas) {
        this.cas = cas;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

}
