# 📘 구간 합

[🔗 문제 링크](https://www.acmicpc.net/problem/11659)

---

## 📌 문제 설명

* 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 
* 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 
* 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.


* 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.


* 1 ≤ N ≤ 100,000
* 1 ≤ M ≤ 100,000
* 1 ≤ i ≤ j ≤ N
---

## ✅ 해답 코드 (Java)

```java
package math.prefix_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[N + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int k = 0; k < M; k++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(S[j] - S[i - 1]);
        }
    }
}
```

---

## 🔍 풀이 요약

### ✅ 핵심 아이디어: **누적 합(Prefix Sum)**

* 각 인덱스까지의 누적 합을 미리 구해두면,
  특정 구간 \[i \~ j]의 합을 `S[j] - S[i - 1]`로 빠르게 구할 수 있다.
* 시간 복잡도는 `O(N + M)`으로, 전체 수열과 질의 수를 한 번씩만 순회하면 된다.

### ✅ 구간 합 공식

> `S[i] = S[i - 1] + A[i]`
> `i ~ j 구간합 = S[j] - S[i - 1]`

---

## ⚠️ 내가 틀렸던 이유

* 구간합을 사용하려 했지만 `BufferedReader`와 `StringTokenizer`를 활용하지 않고 `Scanner`를 써서 **시간 초과**가 발생했음.

---

## 💡 주의할 점

* `S[0] = 0`으로 시작하므로, 실제 수열은 `S[1]`부터 시작
* 입력 인덱스는 **1-based**임을 고려해서 배열 크기를 `N + 1`로 선언해야 함
* `BufferedReader`는 예외처리(`throws IOException`)가 필요

---

## ✅ 출력 예시

### 입력

```
5 3
5 4 3 2 1
1 3
2 4
5 5
```

### 출력

```
12
9
1
```

---

## 🧠 코딩테스트 팁

| 도구                | 설명             | 속도   |
| ----------------- | -------------- | ---- |
| `Scanner`         | 간편하지만 느림       | ❌ 느림 |
| `BufferedReader`  | 한 줄 단위로 입력 처리  | ✅ 빠름 |
| `StringTokenizer` | 문자열 파싱 (공백 기준) | ✅ 빠름 |

📌 입력량이 많은 문제에서는 반드시 `BufferedReader + StringTokenizer` 조합을 사용하자!

---

## 🔁 기억하자

> 💡 **“입력 범위가 크고, 여러 번 합을 구해야 한다면 → 무조건 구간합을 써야 한다.”**
> 💡 `BufferedReader`와 `StringTokenizer`의 사용 방법 익히기
> 💡 구간합 배열은 입력 받는 동시에 만들어두자 (`S[i] = S[i-1] + A[i]`)

