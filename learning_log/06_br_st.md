## 📘 `BufferedReader`

### ✅ 정의

`BufferedReader`는 `Scanner`보다 **훨씬 빠르게 문자열을 입력받을 수 있는 클래스**입니다.

### ✅ 주요 특징

* **입력 속도가 매우 빠름** (특히 많은 양의 입력 처리 시 유리)
* 한 줄 전체를 문자열(String)로 읽음 → 파싱 필요
* `System.in`을 버퍼로 감싸서 읽기 때문에 성능이 좋음

### ✅ 사용 예시

```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine(); // 한 줄 전체 입력 받기
        int num = Integer.parseInt(br.readLine()); // 정수 입력 받기
    }
}
```

---

## 📗 `StringTokenizer`

### ✅ 정의

`StringTokenizer`는 문자열을 **특정 구분자를 기준으로 나누는 도구**입니다.

### ✅ 주요 특징

* `split()`보다 빠름
* 기본 구분자: 공백 `" "` (물론 다른 구분자도 지정 가능)

### ✅ 사용 예시

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine(); // 예: "10 20 30"
        StringTokenizer st = new StringTokenizer(line); // 공백 기준으로 나눔
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
    }
}
```

---

## ✅ `BufferedReader + StringTokenizer` 조합

이 조합은 코딩테스트에서 **가장 빠른 입력 처리 속도**를 보여줘요.

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());

int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());
```

---

## 💡 Scanner vs BufferedReader + StringTokenizer

| 항목                          | Scanner                    | BufferedReader + StringTokenizer |
| --------------------------- | -------------------------- | -------------------------------- |
| 입력 속도                       | 느림                         | 매우 빠름                            |
| 구분자 처리                      | 자동 (`nextInt()`, `next()`) | 수동 (문자열 파싱 필요)                   |
| 줄 단위 입력                     | 지원 안 함                     | `readLine()`으로 지원                |
| 주로 사용되는 경우                  | 단순 입력 문제                   | 대량 입력, 시간 제한이 빡빡한 문제             |
| 예외 처리 필요 여부 (`IOException`) | ❌ (필요 없음)                  | ✅ (`throws IOException` 필요)      |

---

## 📌 정리

* **BufferedReader**: 빠른 줄 단위 입력
* **StringTokenizer**: 빠른 문자열 분할
* **둘을 함께 사용**하면 **대용량 입력 처리에 최적**

---

작성해주신 내용은 전반적으로 **정확하고 유익한 팁**입니다! 다만, **조금 더 명확하게 표현할 수 있는 부분**, 그리고 **표현 개선이 가능한 부분**들을 아래와 같이 제안드립니다:

---

## ✍️ 추가 팁 (개선 정리)

* `split()`도 사용할 수 있지만, 내부적으로 정규식을 사용하므로 `StringTokenizer`보다 느릴 수 있습니다.
* **입력량이 많을수록** `BufferedReader + StringTokenizer` 조합이 훨씬 효율적입니다.
* 문자열로 받은 데이터를 **정수로 파싱 (`Integer.parseInt()`)** 하는 것도 필수입니다.
* 각 클래스에 어떤 메서드가 포함되어 있는지 미리 익혀두면 **입력 처리 속도가 훨씬 빨라집니다.**

### 예시 메서드

* `BufferedReader.readLine()` : 한 줄씩 입력 받기
* `StringTokenizer.nextToken()` : 공백 등을 기준으로 문자열을 잘라서 토큰 단위로 반환
* `Integer.parseInt()` : 문자열을 정수로 변환

---

### 🔁 요약해서 기억하자

* 💡 입력량이 많은 문제 → **`BufferedReader + StringTokenizer` 필수**
* 💡 정규식 기반의 `split()`은 편하지만 느릴 수 있음
* 💡 입력 문자열을 정수로 변환하는 로직도 빠르고 정확해야 함
