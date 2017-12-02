package org.eclipse.kura.micaz;

public class GtsDTO {
	
	public GtsDTO(int gts_index, int node_id,	boolean tx_direction, int gts_length) {
		
		m_gts_index_ = gts_index;
		m_node_id_ = node_id;
		m_tx_direction_ = tx_direction;
		m_gts_length_ = gts_length;
	}
	
	int getIndex() {
		return m_gts_index_;
	}
	
	int getNodeId() {
		return m_node_id_;
	}
	
	boolean isTxDirection() {
		return m_tx_direction_;
	}
	
	int getGtsLength() {
		return m_gts_length_;
	}
	
	void setIndex(int gts_index) {
		m_gts_index_ = gts_index;
	}
	
	void setNodeId(int node_id) {
		m_node_id_ = node_id;
	}
	
	void setTxDirection(boolean tx_direction) {
		m_tx_direction_ = tx_direction;
	}
	
	void setGtsLength(int gts_length) {
		m_gts_length_ = gts_length;
	}
	
	
	int m_gts_index_;
	int m_node_id_;
	boolean m_tx_direction_;
	int m_gts_length_;
	
	

}
