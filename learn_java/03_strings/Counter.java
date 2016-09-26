
import java.util.*;

public class Counter
{

    public int countLetters(char ch, String s)
    {
        Map histogram = getCharacterOccurenceMap(s);

        return (int)histogram.get(Character.toString(ch));
    }

    public int countLetters(String s) {
        char[] specialcharacters = {',','?','!',';',' ','.','\''};

        int numberOfSpecialCharacters = 0;
        char characters[] = s.toCharArray();

        for(int index = 0; index < characters.length; index++)
        {
            for(int scindex = 0; scindex < specialcharacters.length; scindex++) {
                if (characters[index] == specialcharacters[scindex])
                {
                    numberOfSpecialCharacters += 1;
                }
            }
        }
        return characters.length - numberOfSpecialCharacters;
    }


    public int countWords(String s)
    {
        char characters[] = s.toCharArray();
        int stringLength = s.length();
        int wordCount = (stringLength > 0)?1:0;
        for(int index = 0; index < stringLength; index++)
        {
            if(characters[index] == ' ')
            {
                wordCount += 1;
            }
        }
        return wordCount;
    }

    public int countPhrases(String s)
    {
        char[] specialcharacters = {',','?','!',';'};

        char characters[] = s.toCharArray();
        int stringLength = s.length();
        int phraseCount = (stringLength > 0)?1:0;

        for(int index = 0; index < stringLength; index++)
        {
            for(int scindex = 0; scindex < specialcharacters.length; scindex++) {
                if (characters[index] == specialcharacters[scindex])
                    phraseCount += 1;
            }
        }
        return phraseCount;
    }




    public Map histogram(String s)
    {
        return getCharacterOccurenceMap(s);
    }

    public Map getCharacterOccurenceMap(String s)
    {
        Map map = new HashMap();

        char[] alphabets = new char[26];
        for(int i=0; i<26; i++) {
            alphabets[i] = (char) (i + 65);
        }
        char characters[] = s.toCharArray();

        for(int index = 0; index < alphabets.length; index++) {
            int histogramcount = 0;

            for (int stringindex = 0; stringindex < characters.length; stringindex++) {
                if (Character.toUpperCase(alphabets[index]) == Character.toUpperCase(characters[stringindex])) {
                    histogramcount += 1;
                }
            }
            map.put(""+Character.toLowerCase(alphabets[index]),histogramcount);
        }
        return map;
    }
}
