package adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterApplication {
    /**
     * 어떤 상황에서도 사용할 수 있게 변환해주는 패턴?
     */
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("댕댕이"));
        animals.add(new Dog("뭉치"));
        animals.add(new Cat("야옹이"));
        animals.add(new Cat("나비"));

//        animals.add(new Tiger("타이온"));
        animals.add(new TigerAdapter("타이온"));

        animals.forEach(Animal::sound);
    }
}
