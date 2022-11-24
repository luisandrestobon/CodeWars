# CodeWars Katas November 2022

---
## _Enough is enough!_

Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection. However, Charlie doesn't like these sessions, since the motif usually repeats. He isn't fond of seeing the Eiffel tower 40 times.
He tells them that he will only sit for the session if they show the same motif at most `N` times. Luckily, Alice and Bob are able to encode the motif as a number. Can you help them to remove numbers such that their list contains each number only up to `N` times, without changing the order?

### Task

Given a list and a number, create a new list that contains each number of `list` at most `N` times, without reordering.
For example if the input number is `2`, and the input list is `[1,2,3,1,2,1,2,3]`, you take `[1,2,3,1,2]`, drop the next `[1,2]` since this would lead to `1` and `2` being in the result `3` times, and then take `3`, which leads to `[1,2,3,1,2,3]`.
With list `[20,37,20,21]` and number `1`, the result would be `[20,37,21]`.

---

## _Reverse Words_

### Task

Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples:

```sh
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
```

---

## _Split Strings_

### Task

Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

```sh
* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']
```

---

## _String ends with?_

### Task

Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

```sh
solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
```

---