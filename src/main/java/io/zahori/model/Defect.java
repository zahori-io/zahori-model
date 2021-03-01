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
import java.util.List;

public class Defect extends TestEntity {

	//Value
	public static final String LOW_VALUE = "Baja";
	public static final String MEDIUM_VALUE = "Media";
	public static final String HIGH_VALUE = "Alta";

	// Status
	public static final String STATUS_NEW = "New";
	public static final String STATUS_OPEN = "Open";
	public static final String STATUS_REOPEN = "Reopen";
	public static final String STATUS_REJECTED = "Rejected";
	public static final String STATUS_FIXED = "Fixed";
	public static final String STATUS_CLOSED = "Closed";
	public static final String STATUS_IN_TEST = "In Test";

	// Severity
	public static final String SEVERITY_LOW = LOW_VALUE;
	public static final String SEVERITY_MEDIA = MEDIUM_VALUE;
	public static final String SEVERITY_ALTA = HIGH_VALUE;
	public static final String SEVERITY_URGENTE = "Urgente";

	// Priority
	public static final String PRIORITY_LOW = LOW_VALUE;
	public static final String PRIORITY_MEDIA = MEDIUM_VALUE;
	public static final String PRIORITY_ALTA = HIGH_VALUE;
	public static final String PRIORITY_URGENTE = "Muy Alta";


	private String title;
	private String description;
	private String detectedBy;
	private String assignedTo;
	private String status;
	private String severity;
	private String priority;

	public Defect(String id, String title, String description, String detectedBy, String assignedTo, String status,
			String severity, String priority, List<File> attachments) {
		super(id, attachments);
		this.title = title;
		this.description = description;
		this.detectedBy = detectedBy;
		this.assignedTo = assignedTo;
		this.status = status;
		this.severity = severity;
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Defect [title=" + title + ", description=" + description + ", detectedBy=" + detectedBy
				+ ", assignedTo=" + assignedTo + ", status=" + status + ", severity=" + severity + ", priority="
				+ priority + ", getId()=" + getId() + ", getAttachments()=" + getAttachments() + ", getCustomFields()="
				+ getCustomFields() + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetectedBy() {
		return detectedBy;
	}

	public void setDetectedBy(String detectedBy) {
		this.detectedBy = detectedBy;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

}
