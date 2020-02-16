package com.github.kana112233.codelinecountplugin.counter

interface CountLine {
    String getMyName()
    int countLine(File file);
}