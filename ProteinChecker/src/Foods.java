import java.util.HashMap;

public class Foods {//음식의 이름을 key로, 100g 당 단백질 g수를 value로 저장한 HashMap을 포함한 class
    private HashMap<String, Double> foods = new HashMap(25){{
        put("밥", 2.7); put("두부", 8); put("닭가슴살", 25); put("닭날개", 23); put("닭다리", 18); put("계란", 6); put("소안심", 26);
        put("소갈비", 22); put("소목살", 17); put("소앞다리", 21); put("돼지안심", 35); put("돼지목살", 18); put("돼지등심", 28);
        put("돼지갈비", 27); put("돼지앞다리", 18); put("돼지삼겹살", 22); put("삼겹살", 22); put("고등어", 22); put("오징어", 15);
        put("연어", 23); put("광어", 22); put("어묵", 13); put("버섯", 3); put("맛살", 16); put("멸치", 18);
    }};

    
}