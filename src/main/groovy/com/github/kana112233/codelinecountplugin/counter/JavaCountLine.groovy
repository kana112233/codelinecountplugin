package com.github.kana112233.codelinecountplugin.counter

import com.github.kana112233.codelinecountplugin.counter.CountLine

class JavaCountLine implements CountLine {

    String getMyName() {
        "java"
    }

    @Override
    int countLine(File file) {
        int count = 0
        file.eachLine { line ->
            // skip invalid lines
            // 1. empty
            if (line.trim().isEmpty()) {
                return
            }
            // 2. //
            if (line.trim().startsWith("//")) {
                return
            }
            // 3. /*
            //     *
            //     */
            if (line.startsWith('/*') || line.startsWith('*')) {
                return
            }
            count++
        }
        count
    }
}
