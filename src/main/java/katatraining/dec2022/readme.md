# CodeWars Katas December 2022

---
## _Valid Parentheses_

### Task

Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid. The function should return `true` if the string is valid, and `false` if it's invalid.

Examples:

```sh
"()"              =>  true
")(()))"          =>  false
"("               =>  false
"(())((()())())"  =>  true
```

Constraints:

`0 <= input.length <= 100`

Along with opening (`(`) and closing (`)`) parenthesis, input may contain any valid ASCII characters. Furthermore, the input string may be empty and/or not contain any parentheses at all. Do not treat other forms of brackets as parentheses (e.g. `[]`, `{}`, `<>`).

---
## _Which are in?_

### Task

Given two arrays of strings `a1` and `a2` return a sorted array `r` in lexicographical order of the strings of `a1` which are substrings of strings of `a2`.

Example 1:

`a1 = ["arp", "live", "strong"]`

`a2 = ["lively", "alive", "harp", "sharp", "armstrong"]`

returns `["arp", "live", "strong"]`

Example 2:

`a1 = ["tarp", "mice", "bull"]`

`a2 = ["lively", "alive", "harp", "sharp", "armstrong"]`

returns `[]`

Notes:

* Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
* In Shell bash `a1` and `a2` are strings. The return is a string where words are separated by commas.
* Beware: In some languages `r` must be without duplicates.

---