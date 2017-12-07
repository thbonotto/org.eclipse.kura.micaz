package org.eclipse.kura.micaz;

import java.util.ArrayList;
import java.util.BitSet;

public class SerialProtocol {
	

	enum MessageType {
		Association,
		Configuration,
		GtsInformation,
		GtsRequest,
		Payload;
	}
	
	public void SendAssociationMessage(int node_id, boolean associating) {
		int messageType = 0b00010000;
		int payloadLength = 5;
		BitSet message = new BitSet(18);
		if(associating)
			message.set(8);
		message.get(6, 12);
		this.send(message);
		
	}
	
	private void send(BitSet message) {
		// TODO Auto-generated method stub
		
	}

	public void SendConfigurationMessage(int bo, int so, int pan_id) {
		
	}
	
	public void SendGtsRequestMessage(int node_id, GtsDTO request, boolean unallocate) {
		GTSRequest.buildGTSRequestMessage(node_id, request, unallocate);
	}
	
	public void SendPayloadMessage(Byte[] payload) {
		
	}
	
	public void SendGtsRequestAssociationMessage(MessageType message_type) {
		
	}

	public SerialProtocol(MicaZDeviceDriver micaZDeviceDriver, String m_serial_interface_, int m_bo_, int m_so_, int m_pan_id_) {
		// TODO Auto-generated constructor stub
	}

	public void updateSettings(String m_serial_interface_, int m_bo_, int m_so_, int m_pan_id_) {
		// TODO Auto-generated method stub
		
	}
	
	public void updateGTSInformation(ArrayList<GtsDTO> gts_information) {
		// TODO Auto-generated method stub
		
	}
	
	MicaZDeviceDriver micaZDeviceDriver;
	String m_serial_interface_; 
}
