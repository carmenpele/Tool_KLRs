public class PropertyArrayTool {
  public static void main(String[] args){
    String s="A1471,B9422,B9423,D2645,D6970,E3276,E4565,E7956,E8334,E8406";
    String PC="CU";
    for (String st:s.split(",")) {
      System.out.println("{\n"
          + "    \"@type\": \"PropertyRequest\",\n"
          + "    \"PropertyKey\": {\n"
          + "    \"propertyCode\": \""+st+"\",\n"
          + "    \"chainCode\": \""+PC+"\",\n"
          + "    \"@type\": \"PropertyKey\"\n"
          + "    }},");
    }
  }
}
