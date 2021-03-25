package io.zahori.model;

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

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Step extends TestEntity {

	private String name;
	private String status = Status.PASSED;
	private String description;
	private String[] descriptionArgs;
	private String expected;
	private String actual;
	private String executionTime;
	private String runId;
	private List<Step> subSteps = new ArrayList<>();

	public Step(String id, String name, String status, String description) {
		super(id);
		this.name = name;
		this.status = status;
		this.description = description;
		this.executionTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
	}

	public Step(String id, String name, String status, String description, List<File> attachments) {
		super(id, attachments);
		this.name = name;
		this.status = status;
		this.description = description;
		this.executionTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
	}

	@Override
	public String toString() {
		return "Step [name=" + name + ", status=" + status + ", description=" + description + ", expected=" + expected
				+ ", actual=" + actual + ", executionTime=" + executionTime + ", runId=" + runId + ", getId()="
				+ getId() + ", getAttachments()=" + getAttachments() + ", getCustomFields()=" + getCustomFields() + "]";
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

	public boolean isPassed() {
		return Status.PASSED.equalsIgnoreCase(status);
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
}
