/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
/* sgwtgen */
 
package com.smartgwt.client.widgets.calendar.events;

import com.google.gwt.event.shared.EventHandler;

/**
 * @deprecated Please use addEventReposition[Move/Stop]Handler instead, this will be removed in a future release.
 */
public interface TimelineEventMovedHandler extends EventHandler {
    /**
     * Called when a Timeline event is moved via dragging by a user.  Call {@link com.smartgwt.client.widgets.calendar.events.TimelineEventMoved#cancel()} from within {@link com.smartgwt.client.widgets.calendar.events.TimelineEventMovedHandler#onTimelineEventMoved} to disallow the  move.
     *
     * @param event the event
     * @deprecated Please use addEventReposition[Move/Stop]Handler instead, this will be removed in a future release.
     */
    void onTimelineEventMoved(com.smartgwt.client.widgets.calendar.events.TimelineEventMoved event);
}
