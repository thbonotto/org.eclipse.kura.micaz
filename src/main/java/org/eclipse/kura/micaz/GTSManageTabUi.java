package org.eclipse.kura.micaz;

import org.eclipse.kura.web.client.messages.Messages;
import org.eclipse.kura.web.client.messages.ValidationMessages;
import org.eclipse.kura.web.shared.model.GwtGroupedNVPair;
import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.ListBox;
import org.gwtbootstrap3.client.ui.TextBox;
import org.gwtbootstrap3.client.ui.gwt.CellTable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.RowStyles;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.cellview.client.TextHeader;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.view.client.ListDataProvider;

public class GTSManageTabUi extends Composite {
	
	@UiField
    ListBox nodeId;

	@UiField
    ListBox gtsSlot;
	
	@UiField
    ListBox gtsCharacteristic;
	
	@UiField
    ListBox gtsDirection;
	
	@UiField
	Button gtsAllocate;
	
	@UiField
	Button gtsRefresh;
	
	@UiField
	Button gtsUnallocate;
	

	@UiField
    CellTable<GwtGroupedNVPair> gtsSlotGrid = new CellTable<GwtGroupedNVPair>();
	private final ListDataProvider<GwtGroupedNVPair> gtsDataProvider = new ListDataProvider<GwtGroupedNVPair>();
	
    private static final ValidationMessages msgs = GWT.create(ValidationMessages.class);
    
    private static final Messages MSGS = GWT.create(Messages.class);
	   
   
	 private void updateGTSTable(CellTable<GwtGroupedNVPair> grid,
	            ListDataProvider<GwtGroupedNVPair> dataProvider) {
		 

	        TextColumn<GwtGroupedNVPair> col1 = new TextColumn<GwtGroupedNVPair>() {

	            @Override
	            public String getValue(GwtGroupedNVPair object) {
	                return object.getId();
	            }
	        };
	        col1.setCellStyleNames("status-table-row");
	        TextHeader id = new TextHeader(MSGS.deviceBndId());
	        id.setHeaderStyleNames("rowHeader");
	        grid.addColumn(col1, id);

	        TextColumn<GwtGroupedNVPair> col2 = new TextColumn<GwtGroupedNVPair>() {

	            @Override
	            public String getValue(GwtGroupedNVPair object) {
	                return object.getName();
	            }
	        };
	        col2.setCellStyleNames("status-table-row");
	        TextHeader name = new TextHeader(MSGS.deviceBndName());
	        name.setHeaderStyleNames("rowHeader");
	        grid.addColumn(col2, name);

	        TextColumn<GwtGroupedNVPair> col3 = new TextColumn<GwtGroupedNVPair>() {

	            @Override
	            public String getValue(GwtGroupedNVPair object) {
	                return msgs.getString(object.getStatus());
	            }
	        };
	        col3.setCellStyleNames("status-table-row");
	        TextHeader state = new TextHeader(MSGS.deviceBndState());
	        state.setHeaderStyleNames("rowHeader");
	        grid.addColumn(col3, state);

	        TextColumn<GwtGroupedNVPair> col4 = new TextColumn<GwtGroupedNVPair>() {

	            @Override
	            public String getValue(GwtGroupedNVPair object) {
	                return object.getVersion();
	            }
	        };
	        col4.setCellStyleNames("status-table-row");
	        TextHeader version = new TextHeader(MSGS.deviceBndVersion());
	        version.setHeaderStyleNames("rowHeader");
	        grid.addColumn(col4, version);

	        dataProvider.addDataDisplay(grid);

	 }
}

