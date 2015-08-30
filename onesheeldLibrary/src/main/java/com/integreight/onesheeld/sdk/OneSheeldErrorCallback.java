/*
* This code is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License version 3 only, as
* published by the Free Software Foundation.
*
* This code is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
* version 3 for more details (a copy is included in the LICENSE file that
* accompanied this code).
*
* Please contact Integreight, Inc. at info@integreight.com or post on our
* support forums www.1sheeld.com/forum if you need additional information
* or have any questions.
*/

package com.integreight.onesheeld.sdk;

/**
 * Represents an error event.
 */
public abstract class OneSheeldErrorCallback {
    /**
     * This method gets called when an error occurs in either
     * {@link OneSheeldDevice} or {@link OneSheeldManager}.
     *
     * @param device the device if the error is device related or null it is not.
     * @param error the error
     */
    public void onError(OneSheeldDevice device, OneSheeldError error) {

    }
}
