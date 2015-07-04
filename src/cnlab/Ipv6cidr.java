/**
 * 
 */
package cnlab;

/**
 * @author shrikanth
 *
 */
public interface Ipv6cidr {
		public final String ipv4Octet="(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])";
		public final String ipv4Address="(" + ipv4Octet + "\\.){3,3}";
		public final String ipv6Octet= "[a-fA-F0-9]{1,4}";//This is to identify the IPV6 octets.
		public final int prefixMask =128;
		public final String ipv6Address = "(" +				
				"(" + ipv6Octet + ":){7,7}" + ipv6Octet + "|" + 
				"(" + ipv6Octet + ":){1,7}:|" + 				
				"(" + ipv6Octet + ":){1,6}:" + ipv6Octet + "|" + 
				"(" + ipv6Octet + ":){1,5}(:" + ipv6Octet + "){1,2}|" +
				"(" + ipv6Octet + ":){1,4}(:" + ipv6Octet + "){1,3}|" +
				"(" + ipv6Octet + ":){1,3}(:" + ipv6Octet + "){1,4}|" +
				"(" + ipv6Octet + ":){1,2}(:" + ipv6Octet + "){1,5}|" +
				ipv6Octet + ":((:" + ipv6Octet + "){1,6})|" +			
				":((:" + ipv6Octet + "){1,7}|:)|" +
				"fe80:(:" + ipv6Octet + "){0,4}%[0-9a-zA-Z]{1,}|" +

				"::(ffff(:0{1,4}){0,1}:){0,1}" + ipv4Address + "|" +
				 																													
				"(" + ipv6Octet + ":){1,4}:" + ipv4Address + ")";
		
		public final String ipv6AddressWithSubnetMask = ipv6Address+"([/\\\\/][0-9]{1,3})";
		public boolean parse(String ipaddress);
		public void displayHostIpInfo();

}
