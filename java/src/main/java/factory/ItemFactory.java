package factory;

import java.util.HashMap;

public class ItemFactory extends Factory {
    private class ItemData { // 아이템의 최대 생성 개수 조절
        int maxCount;
        int currentCount;

        public ItemData(int maxCount) {
            this.maxCount = maxCount;
        }
    }

    private HashMap<String, ItemData> repository;

    public ItemFactory() {
        this.repository = new HashMap<>();

        repository.put("sword", new ItemData(3));
        repository.put("shield", new ItemData(2));
        repository.put("bow", new ItemData(1));
    }

    @Override
    public boolean isCreatable(String name) {
        var itemData = repository.get(name);

        if (itemData == null) {
            System.out.println(name + "은(는) 생성할 수 없는 아이템입니다.");
            return false;
        }

        if (itemData.currentCount >= itemData.maxCount) {
            System.out.println(name + "은(는) 품절 아이템입니다.");
            return false;
        }

        return true;
    }

    @Override
    public Item createItem(String name) {
        switch (name) {
            case "sword":
                return new Sword();
            case "shield":
                return new Shield();
            case "bow":
                return new Bow();
            default:
                System.out.println(name + "생성할 수 없는 아이템입니다.");
                return null;
        }
    }

    @Override
    public void postProcessItem(String name) {
        ItemData itemData = repository.get(name);
        if(itemData != null) itemData.currentCount++;
    }
}
