package backEnd;

import java.util.HashMap;

public enum Language {
    CSHARP,
    CPP,
    C,
    JAVA,
    JAVASCRIPT,
    PYTHON,
    HTML,
    CSS;

    public static HashMap<String, Language> getLanguageMap() {
        HashMap<String, Language> langaugeMap = new HashMap<String, Language>();
        langaugeMap.put("C#", Language.CSHARP);
        langaugeMap.put("C++", Language.CPP);
        langaugeMap.put("C", Language.C);
        langaugeMap.put("Java", Language.JAVA);
        langaugeMap.put("JavaScript", Language.JAVASCRIPT);
        langaugeMap.put("Python", Language.PYTHON);
        langaugeMap.put("HTML", Language.HTML);
        langaugeMap.put("CSS", Language.CSS);

        return langaugeMap;
    }
}
