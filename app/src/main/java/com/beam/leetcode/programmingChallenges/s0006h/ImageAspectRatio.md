# Problem Statement

Calculate the aspect ratio of an image from a url
- Example url: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
- Example ratio: 16:9 of an image of 1920*1080px aspectRatio = width/height

## Example 1:

**Input:** url = https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
width = 1920 height = 1080
**Output:** aspectRatio = "16:9"
**Explanation:** The aspect ratio is calculated from the division of the width to the height
`Aspect Ratio = 1920 / 1080 = 1.7777777777777777`
Normally the aspect ratio is expressed in Integers, so we can obtain them by simplifying the fraction
`1920 / 1080 = 1920÷120 / 1080÷120 = 16/9`

## Example 2:

**Input:** url = https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
width = 800 height = 600
**Output:** aspectRatio = "4:3"

## Example 3:

**Input:** url = https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
width = 1440 height = 900
**Output:** aspectRatio = "8:5"