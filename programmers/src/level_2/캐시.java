package level_2;

import java.util.*;

public class 캐시 {

    public static void main(String[] args) {
        int cacheSize = 5;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju"};
        
        System.out.println(solution(cacheSize, cities));
    }

    public static int solution(int cacheSize, String[] cities) {
        int result = 0;

        if(cacheSize == 0) {
            return cities.length * 5;
        }

        List<String> LRU = new ArrayList<>();
        for(int i = 0; i < cities.length; i++) {
            // 대소문자 구분 없이 비교
            String city = cities[i].toUpperCase();

            // 캐시가 다 찼을때
            if(LRU.size() == cacheSize) {
                // cache hit
                if(LRU.contains(city)) {
                    LRU.remove(LRU.indexOf(city));
                    LRU.add(city);
                    result++;
                } else { // cache miss
                    LRU.remove(0);
                    LRU.add(city);
                    result += 5;
                }
            } else {
                // cache hit
                if(LRU.contains(city)) {
                    LRU.remove(LRU.indexOf(city));
                    LRU.add(city);
                    result++;
                } else { // cahce miss
                    LRU.add(city);
                    result += 5;
                }
            }
        }

        return result;
    }
    
}

/* 제미나이 코드리뷰

import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        int result = 0;
        // LinkedList를 사용하여 양 끝단 처리를 명확하게 함
        LinkedList<String> cache = new LinkedList<>();

        for (String city : cities) {
            String upperCity = city.toUpperCase();

            // cache.remove()는 객체가 있으면 삭제 후 true 반환 (Cache Hit)
            if (cache.remove(upperCity)) {
                cache.addLast(upperCity);
                result += 1;
            } else { // Cache Miss
                if (cache.size() >= cacheSize) {
                    cache.removeFirst(); // 가장 오래된 노드 제거
                }
                cache.addLast(upperCity);
                result += 5;
            }
        }

        return result;
    }
}*/