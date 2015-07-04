package cnlab;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;
import javax.xml.bind.DatatypeConverter;
import java.nio.ByteBuffer;
import java.util.List;
import java.math.BigInteger;
import java.util.ArrayList;

public class Ipv6Implementation implements Ipv6cidr {
	private String ipHexFormat;
	private String ipv6CompleteAddress; //This is to be displayed.
	private double numberOfHosts; //This is to be displayed.
	private int hostIdBits;//This is to be displayed.
        private InetAddress startHostAddress;
        private InetAddress endHostAddress; 
        private String[] startHostAddressToDisplay;//This is to be displayed.
        private String[] endHostAddressToDisplay;//This is to be displayed.
        public String startHostAddressIP;
        public String lastHostAddressIP;

  	//no parameters Constructor to initialize instance variables.
	Ipv6Implementation(){		
		ipHexFormat="";
		ipv6CompleteAddress="";
	}
	@Override
	public boolean parse(String address) {
		// TODO Auto-generated method stub
		if (Pattern.matches("^" + ipv6AddressWithSubnetMask + "$", address)) {
			InetAddress ipAddress;
			try {
				System.out.println("It is a valid IP Address"); //This is just a debug statement.
				String[] stripIpv6Address = address.split("/");
				int preFixLength = Integer.parseInt(stripIpv6Address[1]);
				System.out.println("Prefix length is "+ preFixLength);
				if(preFixLength > 128){
					System.out.println("Invalid subnet mask");
					return false;
				}	
				else{
					System.out.println("Second part of the IP address is " + stripIpv6Address[1]);
					ipAddress = Inet6Address.getByName(stripIpv6Address[0]);
					ipHexFormat = DatatypeConverter.printHexBinary(ipAddress.getAddress());
					hostIdBits = prefixMask-preFixLength;
					processIpv6Address(ipHexFormat);
					
					//Calculate some more stuff before returning
					//i.e. calculate the start and end address of the IP given subnet mask.
					ByteBuffer bufferMask;
					int size=16;
					bufferMask = ByteBuffer.allocate(16).putLong(-1L).putLong(-1L); //allocate 16 bytes, i.e. length of IPv6
			        
					BigInteger mask = (new BigInteger(1, bufferMask.array())).not().shiftRight(preFixLength);

			        ByteBuffer buffer = ByteBuffer.wrap(ipAddress.getAddress());
			        BigInteger ipVal = new BigInteger(1, buffer.array());

			        BigInteger startIp = ipVal.and(mask);
			        BigInteger endIp = startIp.add(mask.not());

			        byte[] startIpArr = convertToBytes(startIp.toByteArray(), size);
			        byte[] endIpArr = convertToBytes(endIp.toByteArray(), size);

			        this.startHostAddress = InetAddress.getByAddress(startIpArr);
			        this.endHostAddress = InetAddress.getByAddress(endIpArr);					
					
			        startHostAddressToDisplay = (this.startHostAddress.toString()).split("/");
			        endHostAddressToDisplay = (this.endHostAddress.toString()).split("/");
					System.out.println("Start address is "+ startHostAddressToDisplay[1]);
					System.out.println("End host address is "+ endHostAddressToDisplay[1]);
                                        startHostAddressIP=startHostAddressToDisplay[1];
                                        lastHostAddressIP = endHostAddressToDisplay[1];
					return true;
				}
			}
			catch (UnknownHostException e) {
				e.printStackTrace();
				ipHexFormat = "Invalid";
			}
		}	
		return false;
	}
	@Override
	public void displayHostIpInfo() {
	// TODO Auto-generated method stub
	//System.out.println("Full IP address in Hex format is "+ ipHexFormat);	
	}

	
	//This function converts the IPv6 address in to Hex format
	//calculates the number of hosts in the sub net.
	public void processIpv6Address(String ipHexFormat) throws UnknownHostException{
		//System.out.println("I am here");
		String[] ipv6_Prefix={"","","","","","","",""};
		ipv6_Prefix[0] = ipHexFormat.substring(0,4);
		ipv6_Prefix[1] = ipHexFormat.substring(4,8);
		ipv6_Prefix[2] = ipHexFormat.substring(8,12);
		ipv6_Prefix[3] = ipHexFormat.substring(12,16);
		ipv6_Prefix[4] = ipHexFormat.substring(16,20);
		ipv6_Prefix[5] = ipHexFormat.substring(20,24);
		ipv6_Prefix[6] = ipHexFormat.substring(24,28);
		ipv6_Prefix[7] = ipHexFormat.substring(28,32);
		/*String ipv6_Prefix_8 = ipHexFormat.substring(112,128);*/
		ipv6CompleteAddress = ipv6_Prefix[0]+":"+ipv6_Prefix[1]+":"+ipv6_Prefix[2]+":"+
							  ipv6_Prefix[3]+":"+ipv6_Prefix[4]+":"+ipv6_Prefix[5]+":"
				              +ipv6_Prefix[6]+":"+ipv6_Prefix[7];
		numberOfHosts = Math.pow(2,hostIdBits);
                
		System.out.println("Expanded IP address is"+ ipv6CompleteAddress + "\n Number of Hosts:"+ numberOfHosts);//this is for debugging only.
	}
	
    private byte[] convertToBytes(byte[] array, int size) {
        int counter = 0;
        List<Byte> newArray = new ArrayList<Byte>();
        while (counter < size && (array.length - 1 - counter >= 0)) {
            newArray.add(0, array[array.length - 1 - counter]);
            counter++;
        }

        int newarraysize = newArray.size();
        for (int i = 0; i < (size - newarraysize); i++) {

            newArray.add(0, (byte) 0);
        }

        byte[] res = new byte[newArray.size()];
        for (int i = 0; i < newArray.size(); i++) {
            res[i] = newArray.get(i);
        }
        return res;
    }
    
    //Use these Getter methods to get the results.
	public String getIpHexFormat() {
		return ipHexFormat;
	}
	
	public String getIpv6CompleteAddress() {
		return ipv6CompleteAddress;
	}
	
	public double getNumberOfHosts() {
		return numberOfHosts;
	}
	
	public int getHostIdBits() {
		return hostIdBits;
	}
	
	public String[] getStartHostAddressToDisplay() {
		return startHostAddressToDisplay;
	}
	
	public String[] getEndHostAddressToDisplay() {
		return endHostAddressToDisplay;
	}    
}
