package com.goodworkalan.dispatch;

import java.nio.ByteBuffer;

public class Interpreter {
    private Interpreter nextInterpreter;

    public boolean read(ByteBuffer data) throws InterpreterException {
        return false;
    }

    public void setNextInterpreter(Interpreter nextInterpreter) {
        this.nextInterpreter = nextInterpreter;
    }

    public Interpreter nextInterpreter() {
        return nextInterpreter;
    }
    
    public void execute(DispatchSession session, Response response) throws InterpreterException {
    }
}
