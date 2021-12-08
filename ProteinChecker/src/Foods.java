import java.util.HashMap;

public class Foods {//음식의 이름을 key로, 100g 당 단백질 g수를 value로 저장한 HashMap을 포함한 class
    private HashMap<String, Double> foods = new HashMap(25){{//HashMap foods 생성 및 초기화
        put("밥", 2.7); put("두부", 8.0); put("닭가슴살", 25.0); put("닭날개", 23.0); put("닭다리", 18.0); put("계란", 6.0); put("소안심", 26.0);
        put("소갈비", 22.0); put("소목살", 17.0); put("소앞다리", 21.0); put("돼지안심", 35.0); put("돼지목살", 18.0); put("돼지등심", 28.0);
        put("돼지갈비", 27.0); put("돼지앞다리", 18.0); put("돼지삼겹살", 22.0); put("삼겹살", 22.0); put("고등어", 22.0); put("오징어", 15.0);
        put("연어", 23.0); put("광어", 22.0); put("어묵", 13.0); put("버섯", 3.0); put("맛살", 16.0); put("멸치", 18.0);
    }};

    public Double getprotein(String key) { //key에 따른 단백질 값을 가져오는 함수
        return foods.get(key);
    }

    public void printall() {//전체 값들을 출력해주는 함수
        for(HashMap.Entry<String, Double> entry : foods.entrySet()) {
            System.out.printf("%s : %.2fg (100g 당)\n", entry.getKey(), entry.getValue());
        }
    }
}