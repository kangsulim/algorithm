# 💡 숫자의 합 구하기

## 📌 문제 링크

[백준 11720 - 숫자의 합](https://www.acmicpc.net/problem/11720)

## 📋 문제 설명

* 숫자 N개가 공백 없이 주어진다.
* 이 숫자들을 모두 더한 값을 출력하라.

---

## ✅ 문제 조건 요약

| 항목     | 제한 내용            |
| ------ | ---------------- |
| 숫자의 개수 | 최대 100개          |
| 입력 형태  | 문자열 형태로 연속된 숫자   |
| 출력     | 숫자의 합 (int 범위 내) |

---

## 🔍 접근 방법 (코딩테스트 관점)

### 🔹 수가 최대 100자리

* `int`, `long`으로 직접 받을 수 없음 → **문자열(String)** 으로 처리해야 함

### 🔹 문자 하나하나를 숫자로 변환

* \*\*`charAt(i) - '0'`\*\*을 사용하여 문자 → 숫자 변환
* 각 문자를 순회하며 누적 합계를 구함

---

## 🧠 핵심 메서드

### 📌 `charAt(index)`

문자열에서 특정 위치에 있는 문자를 반환하는 메서드

```java
String s = "12345";
char ch = s.charAt(2); // '3'
```

### 📌 문자 → 정수 변환

```java
char ch = '7';
int num = ch - '0'; // 7
```

> 유니코드(아스키코드)에서 `'0'` = 48이기 때문에 문자를 숫자로 변환할 수 있음

---

## 🧾 최종 코드

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        int length = scan.nextInt(); // 숫자의 개수 입력
        scan.nextLine(); // 개행 문자 처리

        String N = scan.nextLine(); // 공백 없는 숫자들 입력

        for (int i = 0; i < length; i++) {
            sum += N.charAt(i) - '0'; // 문자 → 숫자 변환 후 합산
        }

        System.out.println(sum);
    }
}
```

---

## 🧩 예시

### 입력

```
5
54321
```

### 출력

```
15
```

---

## 💡 코딩테스트 팁

* 숫자들이 **공백 없이 주어질 때**, 문자열로 처리하고 `charAt()` 사용은 필수
* `char - '0'`은 자주 쓰이는 **숫자 추출 패턴**으로 익숙해질 것
* 입력 후 남은 개행 문자를 제거하기 위해 `scan.nextLine()`을 한 번 더 사용하는 습관을 들이자

