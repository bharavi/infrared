/* 
 * Copyright 2005 Tavant Technologies and Contributors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 *
 *
 * Original Author:  kamal.govindraj (Tavant Technologies)
 * Contributor(s):   -;
 *
 */
package net.sf.infrared.agent.transport;

import net.sf.infrared.base.model.ApplicationStatistics;
import net.sf.infrared.base.model.OperationStatistics;

/**
 * Interface to implement the forwarding strategy
 * 
 * @author kamal.govindraj
 */
public interface Forwarder {
    /**
     * This is to inform the forwarder to perform initialization.
     * 
     * @param suspended - whether the forwarded needs to be initialized in a suspended state.
     */
    public void init(boolean suspended);

    /**
     * Forward the collected statistics to the central store
     * 
     * @param stats
     */
    public void forward(ApplicationStatistics stats);

    /**
     * Variant for handling collection of unmerged stats
     * 
     * @param stats
     */
    public void forward(OperationStatistics stats);

    /**
     * Inform the forwarder to suspend operation
     */
    public void suspend();

    /**
     * Inform the forwarder to resume operation
     */
    public void resume();

    /**
     * This is to inform the forwarder that it has been destroyed, all cleanup
     * activities need to be handled by this method.
     */
    public void destroy();
}
