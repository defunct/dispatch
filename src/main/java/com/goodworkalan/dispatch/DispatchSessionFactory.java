package com.goodworkalan.dispatch;

import java.net.InetAddress;

import com.goodworkalan.manifold.Session;
import com.goodworkalan.manifold.SessionFactory;

public class DispatchSessionFactory implements SessionFactory
{
    public Session accept(InetAddress remote)
    {
        return new DispatchSession();
    }
}
