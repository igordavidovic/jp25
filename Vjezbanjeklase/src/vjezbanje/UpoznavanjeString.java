package vjezbanje;

public class UpoznavanjeString {
	public static void main(String[] args) {
		String string = "Vukovar";
		String string2 = "Osijek";
		String string3 = "Vukovar";
		char[] ch = {'a','b','c','d','c'};
		System.out.println(string.charAt(3));
		System.out.println(string.codePointAt(3));
		System.out.println(string.codePointBefore(3));
		System.out.println(string.codePointCount(1, 4));
		System.out.println(string.compareTo(string2));
		System.out.println(string.compareToIgnoreCase(string2));
		System.out.println(string.concat("sko"));
		System.out.println(string.contains("a"));
		System.out.println(string.contentEquals(string3));
		System.out.println(string.contentEquals("Vukovar"));
		System.out.println(string.endsWith("ar"));
		System.out.println(string.equals(string3));
		System.out.println(string.equalsIgnoreCase("VukOVar"));
		System.out.println(string.hashCode());
		System.out.println(string.indent(0));
		System.out.println(string.indexOf("o"));
		System.out.println(string.indexOf("a", 4));
		System.out.println(string.intern());
		System.out.println(string.isBlank());
		System.out.println(string.isEmpty());
		System.out.println(string.lastIndexOf("var"));
		System.out.println(string.lastIndexOf("u", 5));
		System.out.println(string.length());
		System.out.println(string.matches("Vukova"));
		System.out.println(string.offsetByCodePoints(0, 3));
		System.out.println(string.regionMatches(1, string3, 1, 3));
		System.out.println(string.repeat(5));
		System.out.println(string.replace("a", "c"));
		System.out.println(string.replace("var", "vinkovci"));
		System.out.println(string.replaceAll("var", "VAR"));
		System.out.println(string.replaceFirst("V", string2));
		System.out.println(string.startsWith("A"));
		System.out.println(string.startsWith("k", 2));
		System.out.println(string.strip());
		System.out.println(string.stripIndent());
		System.out.println(string.substring(3));
		System.out.println(string.substring(2, 5));
		System.out.println(string.toCharArray());
		System.out.println(string.toLowerCase());
		System.out.println(string.toString());
		System.out.println(string.toUpperCase());
		System.out.println(string.trim());
		System.out.println(string.chars());
		System.out.println(string.codePoints());
		System.out.println(string.describeConstable());
		System.out.println(string.getBytes());
		System.out.println(string.getClass());
		System.out.println(string.lines());
		System.out.println(string.split("o"));
		System.out.println(string.subSequence(2, 4));
		System.out.println(string.copyValueOf(ch, 1, 4));
		System.out.println(string.valueOf(5.5));
		System.out.println(string.CASE_INSENSITIVE_ORDER);
		string.getChars(1, 4, ch, 0);
		System.out.println(ch);
		
	}
}
