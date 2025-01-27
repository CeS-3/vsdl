package it.csec.xtext.generator

import java.io.PrintStream

class VsdlConsole {

    private PrintStream stream

    new(String name) {
        stream = findConsole(name)
    }

    /**
     * 原本在 Eclipse 里是找到命名Console，这里改为直接返回System.out
     */
    def private PrintStream findConsole(String name) {
        // 不再使用 Eclipse ConsolePlugin，直接返回标准输出
        return System.out
    }

    def getStream() {
        return stream
    }
}
