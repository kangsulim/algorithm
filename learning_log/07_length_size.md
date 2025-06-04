
## 🔹 1. `*.length`

### ✅ 개요: \*\*배열(Array)\*\*의 **속성(property)**

* `length`는 배열의 **속성**이므로 **괄호 없이** 사용합니다.
* \*\*배열의 크기(요소 개수)\*\*를 나타냅니다.

### ✅ 사용 예:

```java
int[] arr = {10, 20, 30};
System.out.println(arr.length);  // 출력: 3
```

### 📌 요약:

* 대상: 배열 (`int[]`, `String[]`, etc.)
* 형태: `arr.length` (속성)
* 괄호 ❌

---

## 🔹 2. `.length()`

### ✅ 개요: **String 클래스**의 **메서드(method)**

* `length()`는 **문자열의 길이**를 반환하는 **메서드**입니다.
* 문자열 안의 문자 개수를 반환합니다.

### ✅ 사용 예:

```java
String name = "하림";
System.out.println(name.length());  // 출력: 2
```

### 📌 요약:

* 대상: 문자열 (String)
* 형태: `str.length()` (메서드)
* 괄호 ✅

---

## 🔹 3. `.size()`

### ✅ 개요: **컬렉션(Collection)** 클래스의 **메서드(method)**

* `size()`는 **ArrayList, HashMap, HashSet** 등 **컬렉션(Collection)** 객체의 요소 개수를 반환합니다.

### ✅ 사용 예:

```java
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
System.out.println(list.size());  // 출력: 2
```

### 📌 요약:

* 대상: 컬렉션 (List, Set, Map 등)
* 형태: `collection.size()` (메서드)
* 괄호 ✅

---

## 🔍 차이점 정리표

| 표현          | 대상                         | 반환값      | 괄호 | 예시 사용 대상           |
| ----------- | -------------------------- | -------- | -- | ------------------ |
| `.length`   | 배열 (`int[]`, `String[]`)   | 배열 요소 수  | ❌  | `arr.length`       |
| `.length()` | 문자열 (`String`)             | 문자열 문자 수 | ✅  | `"hello".length()` |
| `.size()`   | 컬렉션 (`List`, `Set`, `Map`) | 요소 수     | ✅  | `list.size()`      |

---

## ❗ 자주 하는 실수

* 배열에 `.length()` 사용 → ❌ 컴파일 에러

  ```java
  int[] arr = {1, 2, 3};
  arr.length();  // ❌ 에러: length는 메서드가 아님
  ```
* 문자열에 `.length` 사용 → ❌ 컴파일 에러

  ```java
  String s = "abc";
  s.length;  // ❌ 에러: length는 메서드임
  ```
