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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Configuration implements Serializable {

    public static final String LOG = "Log";
    public static final String SCREENSHOT = "Screenshot";
    public static final String VIDEO = "Video";
    public static final String DOC = "Doc";
    public static final String HAR = "Har";

    private String name;
    private String environmentName;
    private String environmentUrl;
    private int retries;
    private long timeout;
    private Tms tms = new Tms();
    private String generateEvidences;
    private List<String> generateEvidencesTypes = new ArrayList<>();

    public Configuration() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public String getEnvironmentUrl() {
        return environmentUrl;
    }

    public void setEnvironmentUrl(String environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public Tms getTms() {
        return tms;
    }

    public void setTms(Tms tms) {
        this.tms = tms;
    }

    public String getGenerateEvidences() {
        return generateEvidences;
    }

    public void setGenerateEvidences(String generateEvidences) {
        this.generateEvidences = generateEvidences;
    }

    public List<String> getGenerateEvidencesTypes() {
        return generateEvidencesTypes;
    }

    public void setGenerateEvidencesTypes(List<String> generateEvidencesTypes) {
        this.generateEvidencesTypes = generateEvidencesTypes;
    }

}
