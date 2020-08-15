package Solutions.Maps;

import Solutions.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrefixMapSum extends Question {

  @Override
  public void solve(int i) throws Exception {
    switch(i) {
      case 0:
        solution();
      case 1:
        solution1();
      default:
        throw new Exception("Unexpected solution");
    }
  }

  @Override
  public void solution() {
    meat(new HashSumMap());
  }

  public void solution1() {
    meat(new Map26());
  }

  private void meat(SumMap map) {
    //TODO build some kind of test
  }

  public static class HashSumMap implements SumMap {
    private Map<String, Integer> sumMap;

    HashSumMap() {
        sumMap = new HashMap<>();
    }

    public void insert(String key, Integer value) {
      sumMap.put(key.toLowerCase(), value);
    }

    public int sum(String key) {
      int sum = 0;
      for(String mapKey : sumMap.keySet()) {
        //TODO not a true prefix search
        if(mapKey.contains(key.toLowerCase())) {
          sum += sumMap.get(mapKey);
        }
      }
      return sum;
    }
  }

  public static class Map26 implements SumMap {
    List<Node26> map;

    Map26() {
      map = new ArrayList<>();
    }

    private void extend(int amount) {
      for(int i = 0; i < amount; i++) {
        map.add(new Node26());
      }
    }

    @Override
    public void insert(String key, Integer value) {
      if(map.size() < key.length()) {
        extend(key.length()-map.size());
      }

      for(int i = 0; i < key.length(); i++) {
        map.get(i).add(key.indexOf(i)-'a');
      }
    }

    @Override
    public int sum(String key) {
      return map.get(key.length()).alphabet[key.indexOf(key.length())-'a'];
    }

    static class Node26 {
      private final static int length = 26;

      int[] alphabet;

      Node26() {
        alphabet = new int[length];

        for(int i = 0; i < length; i++) {
          alphabet[i] = 0;
        }
      }

      void add(int index) {
        alphabet[index]++;
      }
    }
  }
}
