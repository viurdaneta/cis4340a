BigInteger x = new BigInteger("530500452766");
String s = x.toString(); // Valid character data conversion
byte[] byteArray = s.getBytes();
String ns = new String(byteArray);
x = new BigInteger(ns);