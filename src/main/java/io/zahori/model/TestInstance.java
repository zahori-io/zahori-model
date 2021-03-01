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

import java.util.ArrayList;
import java.util.List;

public class TestInstance extends TestEntity {

	private List<Run> runs = new ArrayList<Run>();

	public TestInstance(String id) {
		super(id);
	}

	public TestInstance(String id, List<Run> runs) {
		super(id);
		this.runs = runs;
	}

	@Override
	public String toString() {
		return "TestInstance [runs=" + runs + ", getId()=" + getId() + ", getAttachments()=" + getAttachments()
				+ ", getCustomFields()=" + getCustomFields() + "]";
	}

	public List<Run> getRuns() {
		return runs;
	}

	public void setRuns(List<Run> runs) {
		this.runs = runs;
	}

	public void addRun(Run run) {
		runs.add(run);
	}

	public boolean hasRuns() {
		return !runs.isEmpty();
	}
}
