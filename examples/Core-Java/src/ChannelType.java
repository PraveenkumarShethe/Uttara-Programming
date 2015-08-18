
/**
 * 
 * @author sampo
 *
 */
public enum ChannelType {

	SMS(false), 
	EMAIL(true), 
	FAX(true), 
	MMS(true), 
	SMS_BLIND(false), 
	SMS_MWI(false), 
	VOICEOUTCALL(true), 
	VIDEOOUTCALL(true),
	MWI(false);

	
	private boolean isForwardingType;

	private ChannelType(boolean isForwardingType) {
	    this.isForwardingType = isForwardingType;
    }
	
	
	public boolean isForwardingType() {
		return isForwardingType;
	}
	
	public static void main(String[] args) {
		System.out.println(Enum.valueOf(ChannelType.class, "nnn"));
	}
}
