/*
 * This file was automatically generated by EvoSuite
 * Mon May 31 18:02:02 GMT 2021
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.api.RectangleEdge;
import org.jfree.chart.axis.AxisSpace;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AxisSpace_ESTest extends AxisSpace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      axisSpace0.add((-1806.78365135), rectangleEdge0);
      axisSpace0.toString();
      assertEquals((-1806.78365135), axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setLeft((-604.495));
      axisSpace0.toString();
      assertEquals((-604.495), axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setBottom(3053.6);
      axisSpace0.hashCode();
      assertEquals(3053.6, axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setBottom((-1388));
      axisSpace0.toString();
      assertEquals((-1388.0), axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop((-766.349127965));
      axisSpace0.hashCode();
      assertEquals((-766.349127965), axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      AxisSpace axisSpace1 = new AxisSpace();
      axisSpace1.setRight((-456.759621800141));
      boolean boolean0 = axisSpace1.equals(axisSpace0);
      assertEquals((-456.759621800141), axisSpace1.getRight(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Object object0 = axisSpace0.clone();
      axisSpace0.setBottom(371.927598);
      boolean boolean0 = object0.equals(axisSpace0);
      assertEquals(371.927598, axisSpace0.getBottom(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop(2055.810115162202);
      AxisSpace axisSpace1 = new AxisSpace();
      boolean boolean0 = axisSpace1.equals(axisSpace0);
      assertEquals(2055.810115162202, axisSpace0.getTop(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      
      axisSpace0.setRight((-1.0));
      Point point0 = new Point();
      Rectangle rectangle0 = new Rectangle(point0);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      Rectangle2D rectangle2D0 = axisSpace0.reserved(rectangle0, rectangleEdge0);
      assertEquals(1.0, rectangle2D0.getMinX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      
      axisSpace0.setTop(1.0);
      Line2D.Double line2D_Double0 = new Line2D.Double((-766.39), (-766.39), 166.6349138, (-2493.0269426));
      Rectangle rectangle0 = line2D_Double0.getBounds();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      Rectangle2D rectangle2D0 = axisSpace0.reserved(rectangle0, rectangleEdge0);
      RectangleEdge rectangleEdge1 = RectangleEdge.BOTTOM;
      Rectangle2D rectangle2D1 = axisSpace0.reserved(rectangle2D0, rectangleEdge1);
      assertEquals((-2494.0), rectangle2D1.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setBottom((-604.495));
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      axisSpace0.expand(rectangle2D_Float0, rectangle2D_Float0);
      assertEquals((-604.495), axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setRight((-604.495));
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      axisSpace0.expand(rectangle2D_Float0, rectangle2D_Float0);
      assertEquals((-604.495), axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setLeft((-604.495));
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      axisSpace0.expand(rectangle2D_Float0, rectangle2D_Float0);
      assertEquals((-604.495), axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setRight((-604.495));
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      axisSpace0.shrink(rectangle2D_Float0, rectangle2D_Float0);
      assertEquals((-604.495), axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      axisSpace0.ensureAtLeast((double) 0.0F, rectangleEdge0);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      axisSpace0.ensureAtLeast((-1.0), rectangleEdge0);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      axisSpace0.ensureAtLeast(0.0, rectangleEdge0);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop(2055.810115162202);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      axisSpace0.ensureAtLeast((double) 0.0F, rectangleEdge0);
      assertEquals(2055.810115162202, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      AxisSpace axisSpace1 = new AxisSpace();
      axisSpace0.ensureAtLeast(axisSpace1);
      assertEquals(0.0, axisSpace1.getLeft(), 0.01);
      assertEquals(0.0, axisSpace1.getTop(), 0.01);
      assertEquals(0.0, axisSpace1.getRight(), 0.01);
      assertEquals(0.0, axisSpace1.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop((-1.0));
      Dimension dimension0 = new Dimension(2803, 2137);
      Rectangle rectangle0 = new Rectangle(dimension0);
      axisSpace0.shrink(rectangle0, rectangle0);
      assertEquals(2138, rectangle0.height);
      assertEquals(1068.0, rectangle0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setLeft(3404.540548080764);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(402.963410395, 1405.9989, 402.963410395, 0.0);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      axisSpace0.shrink(rectangle0, rectangle0);
      assertEquals(3404.540548080764, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(1.0F, 1.0F, 1123.545F, (-887.164F));
      Rectangle2D rectangle2D0 = axisSpace0.shrink(rectangle2D_Float0, rectangle2D_Float0);
      assertEquals(562.7725219726562, rectangle2D0.getCenterX(), 0.01);
      assertEquals((-442.5820007324219), rectangle2D0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)axisSpace0.reserved(rectangle2D0, rectangleEdge0);
      assertNotNull(rectangle2D_Double0);
      
      Rectangle rectangle0 = (Rectangle)axisSpace0.shrink(rectangle2D_Double0, rectangle2D0);
      assertEquals(0.0, rectangle2D_Double0.height, 0.01);
      assertEquals(0.0, rectangle2D_Double0.getCenterY(), 0.01);
      assertEquals(0, rectangle0.width);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-887.164F), 2561.9028F, 2561.9028F, (-1.0F));
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = (Rectangle)polygon0.getBounds2D();
      Rectangle2D.Float rectangle2D_Float1 = (Rectangle2D.Float)rectangle2D_Float0.createUnion(rectangle2D_Float0);
      axisSpace0.shrink(rectangle2D_Float1, rectangle0);
      assertEquals(2560, rectangle0.y);
      assertEquals(2562.0, rectangle0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop(876.25816);
      Rectangle rectangle0 = new Rectangle();
      axisSpace0.shrink(rectangle0, rectangle0);
      assertEquals(876.25816, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setBottom((-604.495));
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      axisSpace0.shrink(rectangle2D_Float0, rectangle2D_Float0);
      assertEquals(604.495F, rectangle2D_Float0.height, 0.01F);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(1.0F, 1.0F, 1123.545F, (-887.164F));
      Rectangle2D.Float rectangle2D_Float1 = new Rectangle2D.Float((-2202.7334F), (-887.164F), (-2202.7334F), 1087.6656F);
      axisSpace0.shrink(rectangle2D_Float1, rectangle2D_Float0);
      assertEquals((-887.164F), rectangle2D_Float0.y, 0.01F);
      assertTrue(rectangle2D_Float0.equals((Object)rectangle2D_Float1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-887.164F), 2561.9028F, 2561.9028F, (-1.0F));
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)axisSpace0.reserved(rectangle2D_Float0, rectangleEdge0);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertNotNull(rectangle2D_Double0);
      assertEquals(0.0, rectangle2D_Double0.width, 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop(1986.5876466);
      double double0 = axisSpace0.getTop();
      assertEquals(1986.5876466, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop((-2892.0052962552));
      double double0 = axisSpace0.getTop();
      assertEquals((-2892.0052962552), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setRight((-1178.373));
      double double0 = axisSpace0.getRight();
      assertEquals((-1178.373), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setLeft(2055.810115162202);
      double double0 = axisSpace0.getLeft();
      assertEquals(2055.810115162202, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setLeft((-3811.99576));
      double double0 = axisSpace0.getLeft();
      assertEquals((-3811.99576), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      axisSpace0.ensureAtLeast(10.1612, rectangleEdge0);
      double double0 = axisSpace0.getBottom();
      assertEquals(10.1612, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setBottom((-1105.67));
      double double0 = axisSpace0.getBottom();
      assertEquals((-1105.67), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(2389.0, 229.22029971, 229.22029971, 229.22029971);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      Rectangle2D rectangle2D0 = axisSpace0.expand(rectangle0, rectangle0);
      assertEquals(2504.0, rectangle2D0.getCenterX(), 0.01);
      assertEquals(344.0, rectangle2D0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-887.164F), 2561.9028F, 2561.9028F, (-1.0F));
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = (Rectangle)polygon0.getBounds2D();
      axisSpace0.expand(rectangle2D_Float0, rectangle0);
      assertEquals((-1), rectangle0.height);
      assertEquals(2560.5, rectangle0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      Rectangle rectangle1 = (Rectangle)axisSpace0.expand(rectangle0, rectangle0);
      assertEquals(0, rectangle1.width);
      assertEquals(0, rectangle1.height);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle rectangle0 = new Rectangle((-1), (-1));
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      axisSpace0.ensureAtLeast(508.42907991283977, rectangleEdge0);
      axisSpace0.expand(rectangle0, rectangle0);
      assertEquals(508, rectangle0.height);
      assertEquals(508.42907991283977, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      // Undeclared exception!
      try { 
        axisSpace0.reserved((Rectangle2D) null, rectangleEdge0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        axisSpace0.expand((Rectangle2D) null, (Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        axisSpace0.ensureAtLeast((AxisSpace) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        axisSpace0.add((-0.8697020791477756), (RectangleEdge) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'edge' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      AxisSpace axisSpace1 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      axisSpace1.add((-1.0), rectangleEdge0);
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals((-1.0), axisSpace1.getRight(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Object object0 = axisSpace0.clone();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      axisSpace0.add((-1.0), rectangleEdge0);
      boolean boolean0 = axisSpace0.equals(object0);
      assertEquals((-1.0), axisSpace0.getLeft(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      AxisSpace axisSpace1 = new AxisSpace();
      axisSpace1.setBottom((-3525.042809466828));
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals((-3525.042809466828), axisSpace1.getBottom(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setTop(4201.8381);
      AxisSpace axisSpace1 = new AxisSpace();
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals(4201.8381, axisSpace0.getTop(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Object object0 = new Object();
      boolean boolean0 = axisSpace0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      boolean boolean0 = axisSpace0.equals(axisSpace0);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      Rectangle2D rectangle2D0 = axisSpace0.reserved(rectangle2D_Float0, (RectangleEdge) null);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertNull(rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        axisSpace0.shrink((Rectangle2D) null, (Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      axisSpace0.ensureAtLeast((-1871.26612), rectangleEdge0);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      axisSpace0.ensureAtLeast((double) 1.0F, rectangleEdge0);
      double double0 = axisSpace0.getRight();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      axisSpace0.ensureAtLeast(460.76, rectangleEdge0);
      assertEquals(460.76, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        axisSpace0.ensureAtLeast(1.0, (RectangleEdge) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // AxisSpace.ensureAtLeast(): unrecognised AxisLocation.
         //
         verifyException("org.jfree.chart.axis.AxisSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      axisSpace0.ensureAtLeast((-1871.26612), rectangleEdge0);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      axisSpace0.ensureAtLeast((double) 0, rectangleEdge0);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      axisSpace0.ensureAtLeast((double) 0.0F, rectangleEdge0);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      axisSpace0.add(345.0, rectangleEdge0);
      assertEquals(345.0, axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      axisSpace0.add(2145150681, rectangleEdge0);
      assertEquals(2.145150681E9, axisSpace0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      double double0 = axisSpace0.getBottom();
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      axisSpace0.setLeft(1630.4509001);
      AxisSpace axisSpace1 = new AxisSpace();
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals(1630.4509001, axisSpace0.getLeft(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      double double0 = axisSpace0.getLeft();
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      double double0 = axisSpace0.getRight();
      assertEquals(0.0, axisSpace0.getTop(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      double double0 = axisSpace0.getTop();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, axisSpace0.getLeft(), 0.01);
      assertEquals(0.0, axisSpace0.getBottom(), 0.01);
      assertEquals(0.0, axisSpace0.getRight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      AxisSpace axisSpace0 = new AxisSpace();
      AxisSpace axisSpace1 = (AxisSpace)axisSpace0.clone();
      boolean boolean0 = axisSpace0.equals(axisSpace1);
      assertEquals(0.0, axisSpace1.getLeft(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, axisSpace1.getBottom(), 0.01);
      assertEquals(0.0, axisSpace1.getTop(), 0.01);
      assertEquals(0.0, axisSpace1.getRight(), 0.01);
  }
}