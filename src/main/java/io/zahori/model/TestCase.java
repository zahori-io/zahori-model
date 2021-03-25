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

public class TestCase extends TestEntity {

	private String name;
	private String description;
	private String status = Status.PASSED;
	private int duration = 0;
	private List<Step> steps = new ArrayList<>();

	public TestCase(String id, String name) {
		super(id);
		this.name = name;
	}

	public TestCase(String id, String name, List<Step> steps) {
		super(id);
		this.name = name;
		this.steps = steps;
	}

	public TestCase(String id, String name, List<Step> steps, List<File> attachments) {
		super(id, attachments);
		this.name = name;
		this.steps = steps;
	}

	@Override
	public String toString() {
		return "TestCase [name=" + name + ", description=" + description + ", status=" + status + ", duration="
				+ duration + ", steps=" + steps + ", getId()=" + getId() + ", getAttachments()=" + getAttachments()
				+ ", getCustomFields()=" + getCustomFields() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List<Step> getSteps() {
		return steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public boolean isPassed() {
		return Status.PASSED.equalsIgnoreCase(status);
	}

	public void addStep(Step step) {
		steps.add(step);
	}

	public boolean hasSteps() {
		return !steps.isEmpty();
	}

}
