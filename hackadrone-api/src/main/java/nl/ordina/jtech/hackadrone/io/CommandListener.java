/*
 * Copyright (C) 2017 Ordina
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
 */

package nl.ordina.jtech.hackadrone.io;

import nl.ordina.jtech.hackadrone.models.Command;

/**
 * Interface representing a command listener.
 */
public interface CommandListener {

    /**
     * Handles the received command.
     *
     * @param command the command to handle
     */
    void onCommandReceived(Command command);

    /**
     * Gets the delay between commands in ms.
     *
     * @return the delay between commands in ms
     */
    int getDelay();

}
