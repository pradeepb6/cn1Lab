package cnlab;


public class IPv4Implementation implements IPv4nterfaces {
    @Override
    public String convertIPIntDec2StringBinary(int ip_int) {
        String ip_string;
        ip_string = Integer.toBinaryString(ip_int);
        int length=ip_string.length();
        if (length<32) {
            int prependZeros=32-length;
            for (int i=0; i<prependZeros; i++) {
                ip_string="0"+ip_string;
            }
        }
        String oct1 = ip_string.substring(0,8);
        String oct2 = ip_string.substring(8,16);
        String oct3 = ip_string.substring(16,24);
        String oct4 = ip_string.substring(24,32);
        ip_string = oct1 +"."+oct2+"."+oct3+"."+oct4;
        return ip_string;
    }

    @Override
    public boolean StrIP2Dec(String input) {
        String decimalIP=input.trim();
//        String currentIP;

        int ipBit;
        try {
            ipBit = convertStrIP2IntIP(decimalIP);
        } catch (Exception e) {
            return false;
        }
//        currentIP=decimalIP;
        String ip=convertIPIntDec2StringBinary(ipBit);
//        String hexIP=convertIPIntDec2StringHex(ipBit);
       // System.out.println("ip = " +ip);
        return true;
    }

    @Override
    public int convertStrIP2IntIP(String ipAdd) throws Exception {
        String[] partialData = ipAdd.split("\\.", 4);
        String val="";
        if (partialData.length != 4)
        {
            throw new Exception();
        }
        int ipBit = 0;
        for (int i = 0; i < partialData.length; i++) {
            val = partialData[i];
             if (val.length() < 1) {
                throw new Exception();
            }
            int oct;
            try {
                oct = Integer.parseInt(val);
            } catch (NumberFormatException e) {
                throw new Exception();
            }

            if (oct > 255) {
                throw new Exception();
            }
            ipBit = ipBit << 8;
            ipBit = ipBit | oct;
            
        }
        
        return ipBit;
    }

    @Override
    public String convertIntIP2StrIP(int in) {
        int partialData1 = ((in & 0xFF000000) >> 24) & 0xFF;
        int partialData2 = (in & 0x00FF0000) >> 16;
        int partialData3 = (in & 0x0000FF00) >> 8;
        int partialData4 = (in & 0x000000FF);

        return String.format("%d.%d.%d.%d",partialData1,partialData2,partialData3,partialData4);
    }
}
