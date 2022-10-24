import java.math.BigDecimal;

public class Deserializer {
  static String deserializeHOVI(String hovi) {
    String s="";
    s=s+("length-" + hovi.substring(0, 4)+"\n");
    s=s+("record identifier-" + hovi.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + hovi.substring(8, 11)+"\n");
    s=s+("delimiter-" + hovi.substring(11, 12)+"\n");
    s=s+("level ind-" + hovi.substring(12, 14)+"\n");
    s=s+("version-" + hovi.substring(14, 16)+"\n");
    s=s+("guarantee/deposit required-" + hovi.substring(16, 17)+"\n");
    s=s+("Rate Comment type Array:\n");
    for (int i = 17; i < hovi.length(); i = i + 24) {
      //System.out.println(hovi.substring(i,i+24));
      s=s+("* frequency=" + hovi.substring(i + 8, i + 9));
      s=s+(" date=" + hovi.substring(i, i + 4) + "-" + hovi.substring(i + 4, i + 6) + "-" + hovi.substring(i + 6, i + 8));
      s=s+(" currency=" + hovi.substring(i + 9, i + 12));
      int amountValue=Integer.parseInt(hovi.substring(i + 12, i + 21));
      int decimals=Integer.parseInt(hovi.substring(i + 21, i + 22));
      BigDecimal amount=new BigDecimal(amountValue).movePointLeft(decimals);
      s=s+(" amount=" + hovi.substring(i + 12, i + 21));
      s=s+(" decimals=" + hovi.substring(i + 21, i + 22));
      s=s+(" nights=" + hovi.substring(i + 22, i + 24));
      s=s+("   -> amount=" +amount);
      s=s+("\n");
    }
    return s;
  }

  static String deserializeHTST(String htst) {
    String s="";
    s=s+("length-" + htst.substring(0, 4)+"\n");
    s=s+("record identifier-" + htst.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + htst.substring(8, 11)+"\n");
    s=s+("delimiter-" + htst.substring(11, 12)+"\n");
    s=s+("level ind-" + htst.substring(12, 14)+"\n");
    s=s+("version-" + htst.substring(14, 16)+"\n");
    s=s+("index- "+ htst.substring(16,19)+"\n");
    s=s+("total taxes and surcharges- "+ htst.substring(19,28)+"\n");
    s=s+("total taxes - "+ htst.substring(28,37)+"\n");
    s=s+("total surcharges- "+ htst.substring(37,46)+"\n");
    s=s+"Tax break- out Amount Array";
    if(htst.length()>46){
      for(int i=46;i<htst.length();i=i+11){

        s=s+("\n  *tax break-out amount - "+ htst.substring(i,i+9)+"\n");
        s=s+("\n  *tax OTA code - "+ htst.substring(i+9,i+11)+"\n");
      }
    }

    return s;
  }
  static String deserializeHTVH(String htvh) {
    String s="";
    s=s+("length-" + htvh.substring(0, 4)+"\n");
    s=s+("record identifier-" + htvh.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + htvh.substring(8, 11)+"\n");
    s=s+("delimiter-" + htvh.substring(11, 12)+"\n");
    s=s+("level ind-" + htvh.substring(12, 14)+"\n");
    s=s+("version-" + htvh.substring(14, 16)+"\n");

    return s;
  }
  static String deserializeHTBR(String htbr) {
    String s="";
    s=s+("length-" + htbr.substring(0, 4)+"\n");
    s=s+("record identifier-" + htbr.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + htbr.substring(8, 11)+"\n");
    s=s+("delimiter-" + htbr.substring(11, 12)+"\n");
    s=s+("level ind-" + htbr.substring(12, 14)+"\n");
    s=s+("version-" + htbr.substring(14, 16)+"\n");

    return s;
  }
  static String deserializeHTRX(String htrx) {
    String s="";
    s=s+("length-" + htrx.substring(0, 4)+"\n");
    s=s+("record identifier-" + htrx.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + htrx.substring(8, 11)+"\n");
    s=s+("delimiter-" + htrx.substring(11, 12)+"\n");
    s=s+("level ind-" + htrx.substring(12, 14)+"\n");
    s=s+("version-" + htrx.substring(14, 16)+"\n");

    return s;
  }
  static String deserializeHTRI(String htri) {
    String s="";
    s=s+("length-" + htri.substring(0, 4)+"\n");
    s=s+("record identifier-" + htri.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + htri.substring(8, 11)+"\n");
    s=s+("delimiter-" + htri.substring(11, 12)+"\n");
    s=s+("level ind-" + htri.substring(12, 14)+"\n");
    s=s+("version-" + htri.substring(14, 16)+"\n");

    return s;
  }
  static String deserializeHTMQ(String htmq) {
    String s="";
    s=s+("length-" + htmq.substring(0, 4)+"\n");
    s=s+("record identifier-" + htmq.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + htmq.substring(8, 11)+"\n");
    s=s+("delimiter-" + htmq.substring(11, 12)+"\n");
    s=s+("level ind-" + htmq.substring(12, 14)+"\n");
    s=s+("version-" + htmq.substring(14, 16)+"\n");

    return s;
  }
  static String deserializeHTTR(String httr) {
    String s="";
    s=s+("length-" + httr.substring(0, 4)+"\n");
    s=s+("record identifier-" + httr.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + httr.substring(8, 11)+"\n");
    s=s+("delimiter-" + httr.substring(11, 12)+"\n");
    s=s+("level ind-" + httr.substring(12, 14)+"\n");
    s=s+("version-" + httr.substring(14, 16)+"\n");

    return s;
  }
  static String deserializeHTVR(String htvr) {
    String s="";
    s=s+("length-" + htvr.substring(0, 4)+"\n");
    s=s+("record identifier-" + htvr.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + htvr.substring(8, 11)+"\n");
    s=s+("delimiter-" + htvr.substring(11, 12)+"\n");
    s=s+("level ind-" + htvr.substring(12, 14)+"\n");
    s=s+("version-" + htvr.substring(14, 16)+"\n");

    return s;
  }
  static String deserializeHTCP(String htcp) {
    String s="";
    s=s+("length-" + htcp.substring(0, 4)+"\n");
    s=s+("record identifier-" + htcp.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + htcp.substring(8, 11)+"\n");
    s=s+("delimiter-" + htcp.substring(11, 12)+"\n");
    s=s+("level ind-" + htcp.substring(12, 14)+"\n");
    s=s+("version-" + htcp.substring(14, 16)+"\n");

    return s;
  }
  static String deserializeHTVS(String htvs) {
    String s="";
    s=s+("length-" + htvs.substring(0, 4)+"\n");
    s=s+("record identifier-" + htvs.substring(4, 8)+"\n");
    s=s+("number of arrays items-" + htvs.substring(8, 11)+"\n");
    s=s+("delimiter-" + htvs.substring(11, 12)+"\n");
    s=s+("level ind-" + htvs.substring(12, 14)+"\n");
    s=s+("version-" + htvs.substring(14, 16)+"\n");

    return s;
  }
}
