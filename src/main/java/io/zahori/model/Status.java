package io.zahori.model;

import java.io.Serializable;

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
public class Status implements Serializable {

    private Status() {
        throw new IllegalStateException("Utility class");
    }

    public static final String PASSED = "Passed";
    public static final String FAILED = "Failed";
    public static final String NO_RUN = "No Run";
    public static final String BLOCKED = "Blocked";
    public static final String NOT_COMPLETED = "Not Completed";

}
