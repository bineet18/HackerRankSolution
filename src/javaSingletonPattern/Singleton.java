package javaSingletonPattern;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton
{
    static Singleton obj = new Singleton();
    public String str;
    
    private Singleton()
    {}
    
    public static Singleton getSingleInstance()
    {return obj;}

}