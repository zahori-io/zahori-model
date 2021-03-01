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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CaseExecution {

    private int caseExecutionId;
    private Object date;
    private Object log;
    private Object notes;
    private String status;
    private Object steps;
    private Object stepsJson;
    private Object video;
    private Object doc;
    private Object har;
    private Browser browser;
    private Case cas;

    public int getCaseExecutionId() {
        return caseExecutionId;
    }

    public void setCaseExecutionId(int caseExecutionId) {
        this.caseExecutionId = caseExecutionId;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Object getLog() {
        return log;
    }

    public void setLog(Object log) {
        this.log = log;
    }

    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getSteps() {
        return steps;
    }

    public void setSteps(Object steps) {
        this.steps = steps;
    }

    public Object getStepsJson() {
        return stepsJson;
    }

    public void setStepsJson(Object stepsJson) {
        this.stepsJson = stepsJson;
    }

    public Object getVideo() {
        return video;
    }

    public void setVideo(Object video) {
        this.video = video;
    }

    public Object getDoc() {
        return doc;
    }

    public void setDoc(Object doc) {
        this.doc = doc;
    }

    public Object getHar() {
        return har;
    }

    public void setHar(Object har) {
        this.har = har;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public Case getCas() {
        return cas;
    }

    public void setCas(Case cas) {
        this.cas = cas;
    }

}
