# Code Kata: Leap Years

[![LoC](https://tokei.rs/b1/github/xapn/leap-years-kata?category=code)](https://github.com/xapn/leap-years-kata)
[![Files](https://tokei.rs/b1/github/xapn/leap-years-kata?category=files)](https://github.com/xapn/leap-years-kata)
[![Total lines](https://tokei.rs/b1/github/xapn/leap-years-kata?category=lines)](https://github.com/xapn/leap-years-kata)
[![Comments](https://tokei.rs/b1/github/xapn/leap-years-kata?category=comments)](https://github.com/xapn/leap-years-kata)
[![Blank lines](https://tokei.rs/b1/github/xapn/leap-years-kata?category=blanks)](https://github.com/xapn/leap-years-kata)
[![TestAsYouThink badge](https://img.shields.io/badge/Tests%20as%20first--class%20citizens%20with-TestAsYouThink-brightgreen.svg)](https://testasyouthink.org)

## A little history

Prior to 1582, the [Julian Calendar](https://en.wikipedia.org/wiki/Julian_calendar) was in wide use and defined leap years as every year divisible by 4. However, it was found in the late 16th century that the calendar year had drifted from the solar year by approximately 10 days. The [Gregorian Calendar](https://en.wikipedia.org/wiki/Gregorian_calendar) was defined in order to thin out the number of leap years and to more closely align the calendar year with the solar year. It was adopted in Papal countries on October 15, 1582, skipping 10 days from the Julian Calendar date. Protestant countries adopted the Gregorian Calendar after some time.

The Gregorian Calendar is quite accurate, but could be made more accurate by adding an additional rule that eliminates years divisible by 4000 as leap years.

Source: [CodingDojo.org](http://codingdojo.org)

## Topic

Write a function that returns true or false depending on whether its input integer is a leap year or not. A leap year is defined as one that is divisible by 4, but is not otherwise divisible by 100 unless it is also divisible by 400. For example, 2019 is a typical common year and 1996 is a typical leap year, whereas 1900 is an atypical common year and 2000 is an atypical leap year.

# Code Kata Boilerplate for Java 8

[![LoC](https://tokei.rs/b1/github/chrysocode/java-code-kata-boilerplate?category=code)](https://github.com/chrysocode/java-code-kata-boilerplate)
[![Files](https://tokei.rs/b1/github/chrysocode/java-code-kata-boilerplate?category=files)](https://github.com/chrysocode/java-code-kata-boilerplate)
[![Total lines](https://tokei.rs/b1/github/chrysocode/java-code-kata-boilerplate?category=lines)](https://github.com/chrysocode/java-code-kata-boilerplate)
[![Comments](https://tokei.rs/b1/github/chrysocode/java-code-kata-boilerplate?category=comments)](https://github.com/chrysocode/java-code-kata-boilerplate)
[![Blank lines](https://tokei.rs/b1/github/chrysocode/java-code-kata-boilerplate?category=blanks)](https://github.com/chrysocode/java-code-kata-boilerplate)

Use the below badge if you use TestAsYouThink Core to write high-quality tests.
[![TestAsYouThink badge](https://img.shields.io/badge/Tests%20as%20first--class%20citizens%20with-TestAsYouThink-brightgreen.svg)](https://testasyouthink.org)

## Getting started

Firstly, either you fork this [repository](https://github.com/chrysocode/java-code-kata-boilerplate) to put all your katas in the same repository, either you create a new repository per kata and push the kata boilerplate into it. Then replace the artifact coordinates used by the build system. Name the code kata too.  
Make changes only in the "kata" branch.  
You can use this shortened link if needed: [tinyurl.com/yyekn5rf](https://tinyurl.com/yyekn5rf).

### Tips

You may want to commit with another identifier to publish your code later. Nothing's easier:  
```
git config user.email "public@example.com"
git config user.name "Your Pseudo" # if needed
```

Take advantage of your IDE shortcuts while resolving any code kata. Download and print the [keymap](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf) of IntelliJ IDEA.
The table below should be very useful to learn, or to learn again, the most important shortcuts.

<table>
    <tr>
        <th>Theme</th>
        <th>Must Know</th>
        <th>Should Know</th>
        <th>Could Know</th>
    </tr>
    <tr>
        <td>General</td>
        <td></td>
        <td>
            <b>Ctrl + Alt + S</b> to open settings<br/>
        </td>
        <td>
            <b>Ctrl + Shift + A</b> to find action<br/>
        </td>
    </tr>
    <tr>
        <td>Editing</td>
        <td>
            <b>Ctrl + Space</b> to call basic code completion<br/>
            <b>Shift + Enter</b> to start new line</br>
            <b>Ctrl + Alt + L</b> to auto-indent lines</br>
            <b>Ctrl + Y</b> to delete line at caret<br/>
            <b>Ctrl + Numpad +/-</b> to expand/collapse code block<br/>
        </td>
        <td>
            <b>Ctrl + X</b> to cut current line to clipboard<br/>
            <b>Ctrl + Q</b> to call quick documentation lookup<br/>
            <b>Alt + Inser</b> to generate code...<br/>
        </td>
        <td></td>
    </tr>
    <tr>
        <td>Refactoring</td>
        <td>
            <b>Shift + F6</b> to rename<br/>
        </td>
        <td>
            <b>Ctrl + Alt + M</b> to extract method<br/>
            <b>Ctrl + Alt + V</b> to extract variable<br/>
            <b>Ctrl + Alt + F</b> to extract field<br/>
            <b>Ctrl + Alt + C</b> to extract constant<br/>
            <b>Ctrl + Alt + P</b> to extract parameter<br/>
        </td>
        <td></td>
    </tr>
    <tr>
        <td>Navigation</td>
        <td>
            <b>Ctrl + N</b> to go to class<br/>
            <b>Ctrl + Shift + N</b> to go to file<br/>
            <b>Alt + PageUp/PageDown</b>* to navigate back / forward<br/>
            <b>Ctrl + B</b> to go to declaration<br/>
            <b>Ctrl + Alt + B</b> to go to implementation(s)<br/>
        </td>
        <td>
            <b>Ctrl + G</b> to go to line<br/>
        </td>
        <td></td>
    </tr>
    <tr>
        <td>Compile and Run</td>
        <td></td>
        <td>
            <b>Shift + F10 / F9</b> to run / debug<br/>
            <b>Ctrl + Shift + F10</b> to run contexte configuration from editor<br/>
        </td>
        <td></td>
    </tr>
    <tr>
        <td>Usage Search</td>
        <td>
            <b>Alt + F7</b> to find usages<br/>
            <b>Ctrl + Alt + F7</b> to show usages<br/>
        </td>
        <td></td>
        <td></td>
    </tr>
</table>

If a shortcut is marked with a '*', it is to configure in the keymap settings of the IDE.

### Command Line Interface as a GUI

You can invoke a standalone JAR after building it with the "standalone" Maven profile.
```
mvn package -Pstandalone # to build it
java -jar target/kata-standalone.jar # to use it
```

### Updating your fork

Update your fork as follows. It is assumed you did not commit in the "master" branch. Otherwise please send me a pull request.
```
git fetch origin master && git rebase -p --onto origin/master master develop && git branch -f master origin/master
```

## Definition of Done (DoD)

What should be a DoD for the code katas?
- The kata is done by applying [Test-Driven Development (TDD)](https://en.wikipedia.org/wiki/Test-driven_development).
- The code is versioned by applying [TDDflow](https://gearsoftesting.org/tddflow.html).
- The path to the solution is discovered according to the [Transformation Priority Premise](https://en.wikipedia.org/wiki/Transformation_Priority_Premise).
- The path of successive transformations is as simple as possible.
- The code coverage is greater than 95%.
- The problem to solve is described in the kata documentation.

## License

This code kata boilerplate is distributed under the GNU GPLv3 license. The GPLv3 license is included in the LICENSE.txt file. More information about this license is available at [GNU.org](http://www.gnu.org).
