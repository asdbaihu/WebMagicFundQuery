package Util;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    /*
    * 通过唯一父标签寻找子标签的值
    * */
    public static String getMatcher(String source,String regex, String sonRegex) {
        String result = "";
        Pattern pattern = Pattern.compile(regex);
        if(StringUtils.isBlank(sonRegex)) {
            sonRegex="-[0-9]+(.[0-9]+)?|[0-9]+(.[0-9]+)?";
        }
        Pattern number = Pattern.compile(sonRegex);
        Matcher matcher = pattern.matcher(source);


        if (matcher.find()) {
            result = matcher.group();
        }

        Matcher numberMatcher = number.matcher(result);

        if(numberMatcher.find()) {
            return numberMatcher.group();
        }
        return result;

    }

    public static String replaceFundcode(String url,String fundcode)
    {
        return url.replace("[FUNDCODE]",fundcode);
    }


}
