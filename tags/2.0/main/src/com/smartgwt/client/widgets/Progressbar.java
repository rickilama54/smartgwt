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
 
package com.smartgwt.client.widgets;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;

/**
 * The Progressbar widget class extends the StretchImg class to implement image-based progress bars (graphical bars whose
 * lengths represent percentages, typically of task completion).
 */
public class Progressbar extends StretchImg  implements com.smartgwt.client.widgets.events.HasPercentChangedHandlers {

    public static Progressbar getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        BaseWidget obj = BaseWidget.getRef(jsObj);
        if(obj != null) {
            return (Progressbar) obj;
        } else {
            return new Progressbar(jsObj);
        }
    }

    public Progressbar(){
        scClassName = "Progressbar";
    }

    public Progressbar(JavaScriptObject jsObj){
        super(jsObj);
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var widget = $wnd.isc.Progressbar.create(config);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;
    // ********************* Properties / Attributes ***********************

    /**
     * Number from 0 to 100, inclusive, for the percentage to be displayed graphically in this progressbar.
     * Sets percentDone to newPercent.
     *
     * @param percentDone percent to show as done (0-100). Default value is 0
     */
    public void setPercentDone(int percentDone) {
        setAttribute("percentDone", percentDone, true);
    }

    /**
     * Number from 0 to 100, inclusive, for the percentage to be displayed graphically in this progressbar.
     *
     *
     * @return int
     */
    public int getPercentDone()  {
        return getAttributeAsInt("percentDone");
    }

    /**
     * Length of the progressbar in pixels. This is effectively height for a vertical progressbar, or width for a horizontal
     * progressbar. <P> This property must be set instead of setting <code>width</code> or <code>height</code>.
     * Sets the length of the progressbar to newLength. This is the width of a horizontal progressbar, or the height of a vertical progressbar.
     *
     * @param length the new length of the progressbar. Default value is 100
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setLength(int length)  throws IllegalStateException {
        setAttribute("length", length, false);
    }

    /**
     * Length of the progressbar in pixels. This is effectively height for a vertical progressbar, or width for a horizontal
     * progressbar. <P> This property must be set instead of setting <code>width</code> or <code>height</code>.
     *
     *
     * @return Returns the current width of a horizontal progressbar, or height of a vertical progressbar.
     */
    public int getLength()  {
        return getAttributeAsInt("length");
    }

    /**
     * Thickness of the progressbar in pixels. This is effectively width for a vertical progressbar, or height for a horizontal
     * progressbar. <P> This property must be set instead of setting <code>width</code> or <code>height</code>.
     * Sets the breadth of the progressbar to newLength. This is the height of a horizontal progressbar, or the width of a vertical progressbar.
     *
     * @param breadth the new breadth of the progressbar. Default value is 20
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setBreadth(int breadth)  throws IllegalStateException {
        setAttribute("breadth", breadth, false);
    }

    /**
     * Thickness of the progressbar in pixels. This is effectively width for a vertical progressbar, or height for a horizontal
     * progressbar. <P> This property must be set instead of setting <code>width</code> or <code>height</code>.
     *
     *
     * @return Returns the current height of a horizontal progressbar, or width of a vertical progressbar.
     */
    public int getBreadth()  {
        return getAttributeAsInt("breadth");
    }

    /**
     * Indicates whether this is a vertical or horizontal progressbar.
     *
     * @param vertical vertical Default value is false
     */
    public void setVertical(Boolean vertical) {
        setAttribute("vertical", vertical, true);
    }

    /**
     * Indicates whether this is a vertical or horizontal progressbar.
     *
     *
     * @return Boolean
     */
    public Boolean getVertical()  {
        return getAttributeAsBoolean("vertical");
    }

    /**
     * The base file name for the progressbar image.
     *
     * @param src src Default value is "[SKIN]progressbar.gif"
     */
    public void setSrc(String src) {
        setAttribute("src", src, true);
    }

    /**
     * The base file name for the progressbar image.
     *
     *
     * @return String
     */
    public String getSrc()  {
        return getAttributeAsString("src");
    }

    // ********************* Methods ***********************


    /**
     * Add a percentChanged handler.
     * <p>
     * This method is called when the percentDone value changes. Observe this method to be notified upon a change to the
     * percentDone value.
     *
     * @param handler the percentChanged handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addPercentChangedHandler(com.smartgwt.client.widgets.events.PercentChangedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.events.PercentChangedEvent.getType()) == 0) setupPercentChangedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.events.PercentChangedEvent.getType());
    }

    private native void setupPercentChangedEvent() /*-{
        var obj = null;
        var selfJ = this;
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({percentChanged:function(){
                        var param = {};
                        var event = @com.smartgwt.client.widgets.events.PercentChangedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                        selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                    }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.percentChanged = function(){
                   var param = {};
                   var event = @com.smartgwt.client.widgets.events.PercentChangedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                   selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
               };
        }
   }-*/;





    // ********************* Static Methods ***********************

}


