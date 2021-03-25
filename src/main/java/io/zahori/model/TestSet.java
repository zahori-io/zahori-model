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

public class TestSet extends TestEntity {

	private List<TestInstance> testInstances = new ArrayList<>();

	public TestSet(String id) {
		super(id);
	}

	public TestSet(String id, List<TestInstance> testInstances) {
		super(id);
		this.testInstances = testInstances;
	}

	@Override
	public String toString() {
		return "TestSet [testInstances=" + testInstances + ", getId()=" + getId() + ", getAttachments()="
				+ getAttachments() + ", getCustomFields()=" + getCustomFields() + "]";
	}

	public List<TestInstance> getTestInstances() {
		return testInstances;
	}

	public void setTestInstances(List<TestInstance> testInstances) {
		this.testInstances = testInstances;
	}

	public void addTestInstance(TestInstance testInstance) {
		testInstances.add(testInstance);
	}

	public boolean hasTestInstances() {
		return !testInstances.isEmpty();
	}
}
