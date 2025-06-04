
# 🔁 배열 회전시키기

[🔗 문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120844)

---

## 📌 문제 설명

정수가 담긴 배열 `numbers`와 문자열 `direction`가 매개변수로 주어집니다.
배열 `numbers`를 `direction` 방향으로 한 칸 회전시킨 배열을 return 하도록 함수를 완성하세요.

### 📥 입력 형식

* 3 ≤ `numbers`의 길이 ≤ 20
* `direction`은 `"left"` 또는 `"right"`입니다.

### 📤 출력 형식

* 배열을 `direction` 방향으로 한 칸 회전시킨 결과를 담은 배열

---

## ✅ 해답 코드 (Java)

```java
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        int tmp = 0;
        
        if (direction.equals("right")) {
            tmp = numbers[len - 1];
            for (int i = len - 1; i > 0; i--) {
                answer[i] = numbers[i - 1];
            }
            answer[0] = tmp;
        } else {
            tmp = numbers[0];
            for (int i = 0; i < len - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[len - 1] = tmp;
        }
        
        return answer;
    }
}
```

---

## 🔍 풀이 요약

### ✅ 핵심 아이디어

* 배열의 한쪽 끝 요소를 임시로 저장한 후,
* 나머지 요소들을 `1칸씩 shift`하면서 새로운 배열을 구성
* `direction`이 `"right"`면 오른쪽으로 한 칸, `"left"`면 왼쪽으로 한 칸 이동

---

## ⚠️ 내가 틀렸던 이유

* ❌ 문자열 비교인데 `==`을 사용함

---

## 💡 주의할 점

* 배열 복사를 하지 않고 바로 수정하면 기존 배열 데이터가 손실될 수 있음
* `"right"`와 `"left"`를 구분하여 인덱스를 적절히 조정해야 함
* 인덱스 범위 초과에 유의할 것 (`IndexOutOfBoundsException`)

---

## ✅ 출력 예시

```java
int[] numbers = {1, 2, 3};
String direction = "right";
System.out.println(Arrays.toString(solution(numbers, direction)));
// 출력: [3, 1, 2]

direction = "left";
System.out.println(Arrays.toString(solution(numbers, direction)));
// 출력: [2, 3, 1]
```

---

## 🧠 코딩테스트 팁

* 배열을 한 칸 회전하는 로직은 자주 사용됨 → 함수로 만들어두면 재활용 가능
* 문제에서 제공하는 조건 외 입력이 들어올 경우를 대비해 예외 처리 습관화
* Java에서 문자열 비교는 `==`이 아닌 `.equals()` 사용!

---

## 🔁 기억하자

> 💡 `"right"`이면 마지막 값을 앞으로 보내고 나머지는 한 칸씩 뒤로
> 💡 `"left"`이면 첫 번째 값을 맨 뒤로 보내고 나머지는 한 칸씩 앞으로
> 💡 배열 복사보다는 새 배열에 담는 방식이 안전하고 효율적
