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

public class ProcessRegistration implements Serializable {

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
