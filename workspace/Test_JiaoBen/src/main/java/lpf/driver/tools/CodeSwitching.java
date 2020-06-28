package lpf.driver.tools;

import java.io.UnsupportedEncodingException;

public class CodeSwitching {

	/*##############################################################################################################
	 * 功能：将汉字转化为unicode编码形式
	 * 输入：待转化的汉字
	 * 输出：unicode编码形式
	 */
	public static String gbEncoding(final String gbString) {
		char[] utfBytes = gbString.toCharArray();
		String unicodeBytes = "";
		for (int byteIndex = 0; byteIndex < utfBytes.length; byteIndex++) {
			String hexB = Integer.toHexString(utfBytes[byteIndex]);   //转换为16进制整型字符串
			if (hexB.length() <= 2) {
				hexB = "00" + hexB;
			}
			unicodeBytes = unicodeBytes + "\\u" + hexB;
		}
		//System.out.println("unicodeBytes is: " + unicodeBytes);
		return unicodeBytes;
	}



	/*##############################################################################################################
	 * 功能：将unicode编码转为汉字
	 * 输入：待转化的unicode编码
	 * 输出：汉字
	 */
	public static String decodeUnicode(final String dataStr) {
		int start = 0;
		int end = 0;
		final StringBuffer buffer = new StringBuffer();
		while (start > -1) {
			end = dataStr.indexOf("\\u", start + 2);
			String charStr = "";
			if (end == -1) {
				charStr = dataStr.substring(start + 2, dataStr.length());
			}
			else {
				charStr = dataStr.substring(start + 2, end);
			}
			char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
			buffer.append(new Character(letter).toString());
			start = end;
		}
		//System.out.println("text is: " + buffer.toString());
		return buffer.toString();
	}
}
