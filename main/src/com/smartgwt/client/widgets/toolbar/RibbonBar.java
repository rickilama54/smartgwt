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
 
package com.smartgwt.client.widgets.toolbar;



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
import com.smartgwt.client.widgets.chart.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.layout.events.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
import com.smartgwt.logicalstructure.core.*;
import com.smartgwt.logicalstructure.widgets.*;
import com.smartgwt.logicalstructure.widgets.drawing.*;
import com.smartgwt.logicalstructure.widgets.plugins.*;
import com.smartgwt.logicalstructure.widgets.form.*;
import com.smartgwt.logicalstructure.widgets.tile.*;
import com.smartgwt.logicalstructure.widgets.grid.*;
import com.smartgwt.logicalstructure.widgets.chart.*;
import com.smartgwt.logicalstructure.widgets.layout.*;
import com.smartgwt.logicalstructure.widgets.menu.*;
import com.smartgwt.logicalstructure.widgets.tab.*;
import com.smartgwt.logicalstructure.widgets.tableview.*;
import com.smartgwt.logicalstructure.widgets.toolbar.*;
import com.smartgwt.logicalstructure.widgets.tree.*;
import com.smartgwt.logicalstructure.widgets.viewer.*;
import com.smartgwt.logicalstructure.widgets.calendar.*;
import com.smartgwt.logicalstructure.widgets.cube.*;

/**
 * A {@link com.smartgwt.client.widgets.toolbar.ToolStrip ToolStrip-based} class for showing  {@link
 * com.smartgwt.client.widgets.toolbar.RibbonGroup groups} of related buttons and other controls.
 */
public class RibbonBar extends ToolStrip {

    public native static RibbonBar getOrCreateRef(JavaScriptObject jsObj) /*-{

    	if(jsObj == null) return null;
    	
    	var instance = jsObj["__ref"];
    	
    	if(instance==undefined) {
            return @com.smartgwt.client.util.ObjectFactory::createCanvas(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)("RibbonBar",jsObj);
        } else if(instance != null) {
            return instance;
        //} else {
        //    return @com.smartgwt.client.widgets.toolbar.RibbonBar::new(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj);
        }
    }-*/;

    public void setJavaScriptObject(JavaScriptObject jsObj) {
        id = JSOHelper.getAttribute(jsObj, "ID");
    }


    public RibbonBar(){
        scClassName = "RibbonBar";
    }

    public RibbonBar(JavaScriptObject jsObj){
        scClassName = "RibbonBar";
        setJavaScriptObject(jsObj);
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var scClassName = this.@com.smartgwt.client.widgets.BaseWidget::scClassName;
        var widget = $wnd.isc[scClassName].create(config);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;
    // ********************* Properties / Attributes ***********************

    // ********************* Methods ***********************

    /**
     * Add a new group to this RibbonBar. You can either create your group externally and pass  it in, or you can pass a
     * properties block from which to automatically construct it.
     * @param group the new group to add to this ribbon
     */
    public native void addGroup(RibbonGroup group) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addGroup(group.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()());
    }-*/;

    /**
     * Add a new group to this RibbonBar. You can either create your group externally and pass  it in, or you can pass a
     * properties block from which to automatically construct it.
     * @param group the new group to add to this ribbon
     * @param position the index at which to insert the new group
     */
    public native void addGroup(RibbonGroup group, Integer position) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addGroup(group.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()(), position == null ? null : position.@java.lang.Integer::intValue()());
    }-*/;

    // ********************* Static Methods ***********************
    /**
     * Class level method to set the default properties of this class. If set, then all subsequent instances of this
     * class will automatically have the default properties that were set when this method was called. This is a powerful
     * feature that eliminates the need for users to create a separate hierarchy of subclasses that only alter the default
     * properties of this class. Can also be used for skinning / styling purposes.
     * <P>
     * <b>Note:</b> This method is intended for setting default attributes only and will effect all instances of the
     * underlying class (including those automatically generated in JavaScript). 
     * This method should not be used to apply standard EventHandlers or override methods for
     * a class - use a custom subclass instead.
     *
     * @param ribbonBarProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(RibbonBar ribbonBarProperties) /*-{
    	var properties = $wnd.isc.addProperties({},ribbonBarProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
    	delete properties.ID;
        $wnd.isc.RibbonBar.addProperties(properties);
    }-*/;
        
    // ***********************************************************        

    public LogicalStructureObject setLogicalStructure(RibbonBarLogicalStructure s) {
        super.setLogicalStructure(s);
        return s;
    }
    
    public LogicalStructureObject getLogicalStructure() {
        RibbonBarLogicalStructure s = new RibbonBarLogicalStructure();
        setLogicalStructure(s);
        return s;
    }
}

