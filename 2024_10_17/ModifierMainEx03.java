class Modifier {
    private String data;

    // 입력용 메서드
    public void setterData(String data) {
        this.data = data;
    }

    // 출력용 메서드
    public String getterData() {
        return data;
    }
}

public class ModifierMainEx03 {
    public static void main(String[] args) {
        Modifier m = new Modifier();

        // m.data = "data";

        // 데이터의 입출력
        m.setterData("데이터");
        System.out.println(m.getterData());
    }
}