# Problem Statement

Convert from natural text `t` to morse code and vice-versa

## Constrains

- It must detect automatically which type it is and convert it.
- Morse code supports `—`, `.`, `" "` (between letters and marks), and `"  "` (between words) 
- The most alphabet supported is the following: https://es.wikipedia.org/wiki/Código_morse.

## Example 1:

**Input:** t = "HELLO WORLD"
**Output:** codeConverted = ".... . .-.. .-.. ---  .-- --- .-. .-.. -.."

## Example 2:

**Input:** t = ".... . .-.. .-.. ---  .-- --- .-. .-.. -.."
**Output:** codeConverted = "HELLO WORLD"

## Example 3:

**Input:** t = "HELLO 123!"
**Output:** codeConverted = ".... . .-.. .-.. ---  .---- ..--- ...-- -.-.--"

## Example 4:

**Input:** t = ""
**Output:** codeConverted = ""

## Example 5:

**Input:** t = "   "
**Output:** codeConverted = ""

## Example 6:

**Input:** t = "!, . ?"
**Output:** codeConverted = ""

## Example 7:

**Input:** t = ""
**Output:** codeConverted = "-.-.-- --..-- .-.-.- ..--.."

## Example 8:

**Input:** t = "-.-.-- --..-- .-.-.- ..--.."
**Output:** codeConverted = "!, . ?"

## Example 9:

**Input:** t = "1234567890"
**Output:** codeConverted = ".---- ..--- ...-- ....- ..... -.... --... ---.. ----. -----"

## Example 10:

**Input:** t = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
**Output:** codeConverted = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.."

## Example 11:

**Input:** t = "abcdefghijklmnopqrstuvwxyz"
**Output:** codeConverted = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.."