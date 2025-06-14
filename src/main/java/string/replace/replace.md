# ➕ 숨어있는 숫자의 덧셈 (2)

[🔗 문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120864)

---

## 📌 문제 설명

문자열 `my_string`이 주어집니다.
`my_string` 속에서 연속된 숫자(예: "123")들을 찾아 **숫자로 변환한 후 모두 더한 값**을 리턴하는 `solution` 함수를 작성하세요.

---

### 📥 입력 형식

* 1 ≤ `my_string`의 길이 ≤ 1,000
* `my_string`은 영어 소문자, 대문자, 숫자로 구성되어 있습니다.

### 📤 출력 형식

* `my_string`에 숨어있는 **모든 수의 합**을 반환

---

## ✅ 해답 코드 (Java)

```java
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 숫자가 아닌 문자를 "-"로 치환 후, "-"를 기준으로 split
        String[] str = my_string.replaceAll("[^0-9]", "-").split("-");
        
        // 빈 문자열이 아닌 경우 숫자로 변환해 합산
        for (String s : str) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}
```

---

## 🔍 풀이 요약

### ✅ 핵심 아이디어

* 숫자가 아닌 문자를 모두 `-`로 대체하여 **숫자 사이의 경계를 만들어줌**
* `split("-")`을 통해 숫자 문자열만 추출
* 빈 문자열을 제외하고 정수로 변환하여 합산

---

## ⚠️ 내가 틀렸던 이유

* ❌ 연속된 숫자를 하나의 정수로 처리하지 못하고, 개별 숫자만 더했음

---

## 💡 주의할 점

* 연속된 숫자(ex. "123")는 **하나의 숫자**로 처리되어야 함 → 단순 문자 단위 처리 금지
* `replaceAll("[^0-9]", "-")`는 숫자가 아닌 문자들을 모두 `-`로 치환하는 핵심 로직
* `split()`으로 분리한 후 빈 문자열은 필터링 필수

---

## ✅ 출력 예시

```java
solution("aAb1B2cC34oOp"); 
// 출력: 37 (1 + 2 + 34)

solution("1a2b3c4d123Z"); 
// 출력: 133 (1 + 2 + 3 + 4 + 123)
```

---

## 🧠 코딩테스트 팁

* 정규표현식 `[^0-9]` = 숫자가 아닌 문자 전부
* `replaceAll()` + `split()` 조합으로 연속된 숫자 추출
* 문자열 배열 → int 합산 시 빈 문자열 처리를 꼭 해줄 것

---

## 🔁 기억하자

> 💡 `"abc123de45"` → `"---123--45"` → `["", "", "", "123", "", "45"]`
>
> 💡 `replaceAll("[^0-9]", "-")`로 숫자 이외 구분자 생성
>
> 💡 빈 문자열은 제외하고 `Integer.parseInt()`로 더하기!

