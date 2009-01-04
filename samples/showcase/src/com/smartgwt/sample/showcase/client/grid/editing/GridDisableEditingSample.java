package com.smartgwt.sample.showcase.client.grid.editing;

import com.google.gwt.i18n.client.NumberFormat;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.ListGridEditEvent;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.grid.CellFormatter;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.sample.showcase.client.PanelFactory;
import com.smartgwt.sample.showcase.client.ShowcasePanel;
import com.smartgwt.sample.showcase.client.data.CountryXmlDS;

public class GridDisableEditingSample extends ShowcasePanel {
    private static final String DESCRIPTION = "<b>Click</b> on any cell to start editing. Use Tab/Arrow keys to move between cells, Enter/Esc keys to " +
            "save or cancel. Editing is disabled for the \"Country\" and \"G8\" columns.";

    public static class Factory implements PanelFactory {
        private String id;

        public Canvas create() {
            GridDisableEditingSample panel = new GridDisableEditingSample();
            id = panel.getID();
            return panel;
        }

        public String getID() {
            return id;
        }

        public String getDescription() {
            return DESCRIPTION;
        }
    }

    public Canvas getViewPanel() {

        final ListGrid countryGrid = new ListGrid();
        countryGrid.setWidth(550);
        countryGrid.setHeight(224);
        countryGrid.setAlternateRecordStyles(true);
        countryGrid.setShowAllRecords(true);
        countryGrid.setCellHeight(22);
        countryGrid.setDataSource(CountryXmlDS.getInstance());

        ListGridField countryCodeField = new ListGridField("countryCode", "Flag", 40);
        countryCodeField.setAlign(Alignment.CENTER);
        countryCodeField.setType(ListGridFieldType.IMAGE);
        countryCodeField.setImageURLPrefix("flags/16/");
        countryCodeField.setImageURLSuffix(".png");
        countryCodeField.setCanEdit(false);

        ListGridField nameField = new ListGridField("countryName", "Country");
        nameField.setCanEdit(false);
        
        ListGridField continentField = new ListGridField("continent", "Continent");
        ListGridField memberG8Field = new ListGridField("member_g8", "Member G8");
        memberG8Field.setCanEdit(false);

        ListGridField populationField = new ListGridField("population", "Population");
        populationField.setType(ListGridFieldType.INTEGER);
        populationField.setCellFormatter(new CellFormatter() {
            public String format(Object value, ListGridRecord record, int rowNum, int colNum) {
                NumberFormat nf = NumberFormat.getFormat("0,000");
                return nf.format(((Number) value).longValue());
            }
        });
        ListGridField independenceField = new ListGridField("independence", "Independence");
        countryGrid.setFields(countryCodeField, nameField,continentField, memberG8Field, populationField, independenceField);

        countryGrid.setAutoFetchData(true);
        countryGrid.setCanEdit(true);
        countryGrid.setEditEvent(ListGridEditEvent.CLICK);

        return countryGrid;
    }


    public String getIntro() {
        return DESCRIPTION;
    }
}