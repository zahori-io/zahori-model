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
import java.util.ArrayList;
import java.util.List;

public class Run extends TestEntity {

	private String testId;
	private String testSetId;
	private String testInstanceId;
	private String name;
	private String status = Status.PASSED;
	private int duration = 0;
	private String owner;
	private List<Step> steps = new ArrayList<>();

	public Run(String id, String name, String status, int duration) {
		super(id);
		this.name = name;
		this.status = status;
		this.duration = duration;
	}

	public Run(String id, String name, String status, int duration, List<File> attachments) {
		super(id, attachments);
		this.name = name;
		this.status = status;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Run [testSetId=" + testSetId + ", testId=" + testId + ", testInstanceId=" + testInstanceId + ", name="
				+ name + ", status=" + status + ", duration=" + duration + ", owner=" + owner + ", steps=" + steps
				+ ", getId()=" + getId() + ", getAttachments()=" + getAttachments() + ", getCustomFields()="
				+ getCustomFields() + "]";
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestSetId() {
		return testSetId;
	}

	public void setTestSetId(String testSetId) {
		this.testSetId = testSetId;
	}

	public String getTestInstanceId() {
		return testInstanceId;
	}

	public void setTestInstanceId(String testInstanceId) {
		this.testInstanceId = testInstanceId;
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<Step> getSteps() {
		return steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public void addStep(Step step) {
		steps.add(step);
	}

	public boolean hasSteps() {
		return steps.isEmpty();
	}

}
