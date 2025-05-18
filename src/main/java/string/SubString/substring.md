# 🔁 문자열 밀기

[🔗 문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120921?language=java)

---

## 📌 문제 설명

두 문자열 `A`와 `B`가 주어집니다. 문자열 `A`를 오른쪽으로 밀어서 `B`를 만들 수 있다면, 최소 몇 번 밀어야 하는지 구하는 문제입니다. 만들 수 없다면 `-1`을 반환합니다.

예시:

* A: `"hello"`
* B: `"ohell"`
  → A를 오른쪽으로 한 칸 밀면 B가 됩니다. → 정답: `1`

---

## ✅ 해답 코드 (Java)

```java
package string;

public class SubString {
    public int subString(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            if ((A.substring(A.length() - i) + A.substring(0, A.length() - i)).equals(B)) {
                return i;
            }
        }
        return -1;
    }
}
```

---

## 🔍 풀이 요약

### ✅ 핵심 아이디어: `substring(start, end)` 메서드 활용

문자열을 오른쪽으로 i칸 민다는 것은:

```
A = "hello"
1칸 밀기 → "o" + "hell" → "ohell"
```

즉, `A.substring(A.length() - i)`는 맨 뒤의 i글자,
`A.substring(0, A.length() - i)`는 나머지 앞부분을 의미합니다.

두 부분을 이어 붙여서 B와 같은지 비교하면 됩니다.

---

## ⚠️ 내가 틀렸던 이유

* 문자열 슬라이싱(slicing)에 익숙하지 않아 **substring 구간 설정을 잘못했음**
* `for`문 반복 조건을 `i < A.length() - 1`로 설정해 한 번 덜 반복되었음

    * 모든 밀기 횟수(0\~A.length()-1)를 검사해야 하므로 `i < A.length()`가 맞음

---

## 💡 주의할 점

* `substring(start)`는 시작 위치부터 끝까지 자름
* `substring(start, end)`는 **start 이상, end 미만**의 인덱스를 포함
* String은 불변(immutable)이므로 매 회전마다 새로운 문자열을 생성한다는 점도 고려
* `==` 대신 \*\*`equals()`\*\*로 문자열 내용을 비교해야 함

---

## ✅ 출력 예시

```java
A = "hello"
B = "ohell"
→ 출력: 1

A = "apple"
B = "elppa"
→ 출력: -1
```

---

## 🧠 코딩테스트 팁

* \*\*문자열 회전 문제는 "슬라이싱"과 "부분 문자열 연결"\*\*을 통해 해결
* `substring()` 메서드를 능숙하게 사용하면 문자열 문제에서 큰 도움이 됨
* Java에서 문자열 비교는 항상 `.equals()`를 사용해야 함 (`==`는 주소 비교)

---

## 🔁 기억하자

> 💡 문자열을 오른쪽으로 i번 밀었을 때 →
> `A.substring(A.length() - i) + A.substring(0, A.length() - i)`
>
> 💡 문자열 비교는 `==` 말고 `.equals()`!
>
> 💡 실수하기 쉬운 substring 구간: **start 이상, end 미만**
