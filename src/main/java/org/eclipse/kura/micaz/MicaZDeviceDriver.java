package org.eclipse.kura.micaz;

import java.util.ArrayList;

public class MicaZDeviceDriver {
	
	public MicaZDeviceDriver(String serial_interface, int bo, int so, int pan_id){
		m_serial_interface_ = serial_interface;
		m_bo_ = bo;
		m_so_ = bo;
		m_pan_id_ = pan_id; 
		m_serial_protocol = new SerialProtocol(this, m_serial_interface_, m_bo_, m_so_, m_pan_id_);
		
	}
	
	public int getBo() {
		return m_bo_;
	}

	public ArrayList<GtsDTO> getGtsList() {
		return m_gts_list;
	}

	public ArrayList<Integer> getAssociedNodes() {
		return m_associed_nodes;
	}


	public void addGts(int gts_index, int node_id, boolean tx_direction, int gts_length) {
		GtsDTO temp = new GtsDTO(gts_index, node_id, tx_direction, gts_length);
		m_gts_list.add(temp);
	}
	
	public void addAssocietedNode(int node_id) {
		m_associed_nodes.add(node_id);
	}
	
	public void updateNetworkPanSettings() {
		m_serial_protocol.updateSettings(m_serial_interface_, m_bo_, m_so_ , m_pan_id_);
	}
	
	public void updateParametersFromSerial(int bo, int so, int pan_id) {
		m_bo_ = bo;
		m_so_ = bo;
		m_pan_id_ = pan_id; 		
	}

	String m_serial_interface_;
	int m_bo_;
	int m_so_;
	int m_pan_id_;
	ArrayList<GtsDTO> m_gts_list;
	ArrayList<Integer> m_associed_nodes;
	SerialProtocol m_serial_protocol;
	

}
