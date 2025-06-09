# 🔁 스택

[🔗 문제 링크](https://www.acmicpc.net/problem/10828)

---

## 📌 문제 설명

정수를 저장하는 스택을 구현하고, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하라.

명령 종류는 다음과 같다:

* `push X`: 정수 X를 스택에 넣는다.
* `pop`: 스택에서 가장 위에 있는 정수를 빼고 출력. 스택이 비어있으면 -1 출력
* `size`: 스택에 들어있는 정수의 개수를 출력
* `empty`: 스택이 비어있으면 1, 아니면 0 출력
* `top`: 스택의 가장 위에 있는 정수를 출력. 스택이 비어있으면 -1 출력

---

## ✅ 해답 코드 (Java)

```java
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sbuilder = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int N = scan.nextInt();
		scan.nextLine(); // 개행 처리

		for (int i = 0; i < N; i++) {
			String s = scan.nextLine();
			String[] parts = s.split(" ");
			String cmd = parts[0];

			switch (cmd) {
				case "push":
					stack.push(Integer.parseInt(parts[1]));
					break;
				case "pop":
					sbuilder.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
					break;
				case "size":
					sbuilder.append(stack.size()).append("\n");
					break;
				case "empty":
					sbuilder.append(stack.isEmpty() ? 1 : 0).append("\n");
					break;
				case "top":
					sbuilder.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
					break;
			}
		}

		System.out.println(sbuilder.toString());
	}
}
```

---

## 🔍 풀이 요약

### ✅ 핵심 아이디어:

* Java의 `Stack` 클래스를 사용해 후입선출(LIFO) 구조를 구현
* 명령어에 따라 `switch`문으로 분기 처리
* 입출력이 많은 문제이므로 `StringBuilder`를 사용하여 출력 시간을 줄임

---

## ⚠️ 내가 틀렸던 이유

* 일일히 `System.out.println()`으로 출력해서 기준 시간을 초과함
* `nextInt()` 다음 개행 문자를 처리하지 않아 `nextLine()`에서 입력 누락 발생 가능성
* 스택이 비었을 때의 예외 처리 조건을 제대로 확인하지 않음

---

## 💡 주의할 점

* `nextInt()`로 숫자를 받은 후 `nextLine()`으로 개행 문자 제거
* 스택이 비어있을 때 조건을 꼭 `isEmpty()`로 체크해서 `-1` 반환 처리
* 출력은 반드시 `StringBuilder`를 사용해서 마지막에 한 번에 출력할 것

---

## ✅ 입출력 예시

입력:

```
14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top
```

출력:

```
2
2
0
2
1
-1
0
1
-1
0
3
```

---

## 🧠 코딩테스트 팁

* 출력이 많은 문제는 `StringBuilder`로 한꺼번에 출력해야 시간 초과를 피할 수 있음
* Java의 `Stack` 클래스는 `.push()`, `.pop()`, `.peek()`, `.isEmpty()`, `.size()` 메서드를 기억해두면 좋음
* `switch-case` 구문을 깔끔하게 쓰면 명령 처리 로직이 보기 쉬움

---

## 🔁 기억하자

> 💡 출력은 `StringBuilder`로 모아서 한 번에!
> 💡 `nextInt()` 후 개행 문자 제거 필수 (→ `nextLine()` 호출)
> 💡 스택이 비어있는 경우 처리 꼭 해주기 (`isEmpty()` 체크)

