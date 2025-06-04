# 🔢 문자열 정렬하기 (1)

[🔗 문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120850)

---

## 📌 문제 설명

문자열 `my_string`이 매개변수로 주어집니다.
`my_string` 안에 있는 모든 숫자를 골라 **오름차순으로 정렬한 배열**을 return 하도록 `solution` 함수를 완성하세요.

---

### 📥 입력 형식

* 1 ≤ `my_string`의 길이 ≤ 100
* `my_string`은 영어 소문자, 대문자, 숫자로만 구성되어 있습니다.

### 📤 출력 형식

* `my_string`에 포함되어 있는 숫자를 오름차순 정렬한 정수 배열

---

## ✅ 해답 코드 (Java)

```java
import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        my_string = my_string.replaceAll("[^0-9]", "");
        
        for (int i = 0; i < my_string.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
        }
        
        Collections.sort(list);
        // 내림차순 정렬을 원할 경우 아래 주석 해제
        // Collections.sort(list, Collections.reverseOrder());
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
```

---

## 🔍 풀이 요약

### ✅ 핵심 아이디어

1. 정규표현식 `[^0-9]`을 사용해 숫자 이외의 문자는 모두 제거
2. 문자열에서 각 문자(char)를 숫자(int)로 변환해 리스트에 저장
3. `Collections.sort()`로 오름차순 정렬
4. `List<Integer>`를 `int[]` 배열로 변환해 리턴

---

## ⚠️ 내가 틀렸던 이유

* ❌ 리스트를 배열로 변환하는 과정에서 오류
* ❌ 정규표현식을 사용할 줄 몰라 숫자만 추출하는 부분에서 막힘

---

## 💡 주의할 점

* `replaceAll("[^0-9]", "")`는 숫자가 아닌 모든 문자를 제거하는 핵심 로직
* 문자열에서 숫자로 변환할 때는 `String.valueOf()`로 안전하게 캐스팅 후 `Integer.parseInt()`
* `List<Integer>`를 `int[]`로 변환 시 `stream()`과 `mapToInt()` 활용 가능

---

## ✅ 출력 예시

```java
solution("hi12392"); 
// 출력: [1, 2, 2, 3, 9]

solution("p2o4i8gj2"); 
// 출력: [2, 2, 4, 8]
```

---

## 🧠 코딩테스트 팁

* 숫자 추출 문제에서는 정규표현식이 자주 사용됨 → 익숙해지기!
* `List<Integer>`를 `int[]`로 변환할 수 있는 `stream()` 문법 숙지
* 정렬 방향에 따라 `Collections.sort()` 또는 `Collections.sort(..., reverseOrder())` 사용

---

## 🔁 기억하자

> 💡 문자열에서 숫자만 추출하고 정렬하고 싶을 때:
> `"문자열".replaceAll("[^0-9]", "")`
>
> 💡 `List<Integer>` → `int[]`:
> `list.stream().mapToInt(Integer::intValue).toArray();`
>
> 💡 정렬할 때는 `Collections.sort()`!
