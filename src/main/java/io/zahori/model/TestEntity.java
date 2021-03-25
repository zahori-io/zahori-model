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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestEntity {

	private String id;
	private List<File> attachments = new ArrayList<>();
	private Map<String, String> customFields = new HashMap<>();

	public TestEntity(String id) {
		this.id = id;
	}

	public TestEntity(String id, List<File> attachments) {
		this.id = id;
		this.attachments = attachments;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<File> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<File> attachments) {
		this.attachments = attachments;
	}

	public void addAttachment(File attachment) {
		attachments.add(attachment);
	}

	public boolean hasAttachments() {
		return !attachments.isEmpty();
	}

	public Map<String, String> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(Map<String, String> customFields) {
		this.customFields = customFields;
	}

	public void setCustomField(String name, String value) {
		customFields.put(name, value);
	}

	public String getCustomField(String name) {
		return customFields.get(name);
	}

	public boolean hasCustomFields() {
		return !customFields.isEmpty();
	}
}
