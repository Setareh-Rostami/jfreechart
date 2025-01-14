/*
 * This file was automatically generated by EvoSuite
 * Mon May 31 19:29:21 GMT 2021
 */

package org.jfree.chart.encoders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.encoders.EncoderUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncoderUtil_ESTest extends EncoderUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        EncoderUtil.writeBufferedImage((BufferedImage) null, "cK", (OutputStream) pipedOutputStream0, (-0.15975964F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.encoders.ImageEncoderFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncoderUtil.encode((BufferedImage) null, "png", 0.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'bufferedImage' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncoderUtil.encode((BufferedImage) null, "png");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'bufferedImage' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncoderUtil.encode((BufferedImage) null, "}", 0.0F, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.encoders.ImageEncoderFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 232);
      // Undeclared exception!
      try { 
        EncoderUtil.writeBufferedImage((BufferedImage) null, "png", (OutputStream) bufferedOutputStream0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'bufferedImage' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncoderUtil.encode((BufferedImage) null, "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.encoders.ImageEncoderFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        EncoderUtil.writeBufferedImage((BufferedImage) null, "c$K", (OutputStream) pipedOutputStream0, 0.0F, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.encoders.ImageEncoderFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EncoderUtil encoderUtil0 = new EncoderUtil();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        EncoderUtil.writeBufferedImage((BufferedImage) null, "B#^8 ", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.encoders.ImageEncoderFactory", e);
      }
  }
}
