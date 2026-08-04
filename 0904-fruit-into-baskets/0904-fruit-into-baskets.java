import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> fruitType = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {

            fruitType.put(fruits[right],
                    fruitType.getOrDefault(fruits[right], 0) + 1);

            while (fruitType.size() > 2) {

                fruitType.put(fruits[left],
                        fruitType.get(fruits[left]) - 1);

                if (fruitType.get(fruits[left]) == 0) {
                    fruitType.remove(fruits[left]);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}