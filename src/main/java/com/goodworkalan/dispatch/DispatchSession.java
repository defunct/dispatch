package com.goodworkalan.dispatch;

import java.nio.ByteBuffer;

import com.goodworkalan.manifold.Sender;
import com.goodworkalan.manifold.Session;

public class DispatchSession implements Session
{
    private Interpreter interpreter;
    
    public void accepted(Sender sender)
    {
    }
    
    public void read(ByteBuffer data, Sender sender)
    {
        Response response = new Response(sender);
        try
        {
            while (interpreter.read(data))
            {
                interpreter.execute(this, response);
                interpreter = interpreter.nextInterpreter();
            }
        }
        catch (InterpreterException e)
        {
            response.send(e.getMessage());
            interpreter = newCommandInterpreter();
        }
    }
    
    
    private Interpreter newCommandInterpreter()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void terminate(Sender sender)
    {
    }
    
    public void close()
    {
    }
}
