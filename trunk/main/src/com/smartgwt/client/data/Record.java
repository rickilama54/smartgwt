package com.smartgwt.client.data;

import com.smartgwt.client.core.RefDataClass;
import com.smartgwt.client.util.JSOHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Record is an ordinary Java class with properties that are treated as data to be displayed and edited by a
 * {@link com.smartgwt.client.widgets.DataBoundComponent}.
 * <p/>
 * {@link com.smartgwt.client.widgets.DataBoundComponent}s have a concept of named fields, where values for each field
 * are found under the same-named property in a Record.
 * <p/>
 * A Record is always an ordinary Java object regardless of how the record is loaded (static data, java server, XML web service, etc).
 * <p/>
 * The concept of working with Records is common to all {@link com.smartgwt.client.widgets.DataBoundComponent}s, although individual
 * DataBoundComponents may work with singular records ({@link com.smartgwt.client.widgets.form.DynamicForm}) or may work with lists
 * ({@link com.smartgwt.client.widgets.grid.ListGrid}), trees ({@link com.smartgwt.client.widgets.tree.TreeGrid}), or cubes
 * (CubeGrid) of records.
 * <p/>
 * <p>Individual DataComponents may also look for special properties on Records which control styling or behavior for those records,
 * such as {@link com.smartgwt.client.widgets.grid.ListGrid#setRecordEditProperty(String)}
 */
public class Record extends RefDataClass {

    public Record() {
    }

    public Record(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public static Record getOrCreateRef(JavaScriptObject jsObj) {
        if (jsObj == null) return null;
        RefDataClass obj = RefDataClass.getRef(jsObj);
        if (obj != null) {
            obj.setJsObj(jsObj);
            return (Record) obj;
        } else {
            return new Record(jsObj);
        }
    }

    public static Record[] convertToRecordArray(JavaScriptObject nativeArray) {
        if (nativeArray == null) {
            return new Record[]{};
        }
        if (JSOHelper.isArray(nativeArray)) {
            JavaScriptObject[] componentsj = JSOHelper.toArray(nativeArray);
            Record[] objects = new Record[componentsj.length];
            for (int i = 0; i < componentsj.length; i++) {
                JavaScriptObject componentJS = componentsj[i];
                Record obj = (Record) RefDataClass.getRef(componentJS);
                if (obj == null) obj = new Record(componentJS);
                objects[i] = obj;
            }
            return objects;
        } else {
            Record[] ret = new Record[1];
            ret[0] = Record.getOrCreateRef(nativeArray);
            return ret;
        }
    }
}
