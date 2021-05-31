/*
 * This file was automatically generated by EvoSuite
 * Mon May 31 18:16:19 GMT 2021
 */

package org.jfree.chart.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.api.LengthAdjustmentType;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickMarkPosition;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.AxisEntity;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.data.RangeType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AxisEntity_ESTest extends AxisEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setVisible(false);
      AxisEntity axisEntity0 = new AxisEntity(line2D_Float0, dateAxis0, "DD|, Mj{c", "DD|, Mj{c");
      Axis axis0 = axisEntity0.getAxis();
      assertEquals(0.0F, axis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      DateAxis dateAxis0 = new DateAxis("}#K+svS");
      dateAxis0.setTickMarksVisible(false);
      AxisEntity axisEntity0 = new AxisEntity(rectangle2D_Double0, dateAxis0, "}#K+svS", "");
      Axis axis0 = axisEntity0.getAxis();
      assertEquals(2.0F, axis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0, 0.0, (String) null);
      cyclicNumberAxis0.setTickLabelsVisible(false);
      AxisEntity axisEntity0 = new AxisEntity(rectangle2D0, cyclicNumberAxis0, (String) null, "OUTSIDE8");
      CyclicNumberAxis cyclicNumberAxis1 = (CyclicNumberAxis)axisEntity0.getAxis();
      assertFalse(NumberAxis.DEFAULT_VERTICAL_TICK_LABELS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      DateAxis dateAxis0 = new DateAxis("A8z$VHzEyGx'baLhn$");
      dateAxis0.setMinorTickMarksVisible(true);
      AxisEntity axisEntity0 = new AxisEntity(rectangle0, dateAxis0, "A8z$VHzEyGx'baLhn$", "");
      Axis axis0 = axisEntity0.getAxis();
      assertEquals(0.0F, axis0.getMinorTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Shape shape0 = stackedAreaRenderer0.getDefaultShape();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      AxisEntity axisEntity0 = new AxisEntity(shape0, valueAxis0, "");
      NumberAxis numberAxis0 = (NumberAxis)axisEntity0.getAxis();
      assertEquals(0.0, numberAxis0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      LogAxis logAxis0 = new LogAxis();
      logAxis0.setTickMarkOutsideLength(0.0F);
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0);
      Axis axis0 = axisEntity0.getAxis();
      assertEquals(2.0F, axis0.getMinorTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      LogAxis logAxis0 = new LogAxis();
      logAxis0.setTickMarkOutsideLength((-1.1064345F));
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0);
      Axis axis0 = axisEntity0.getAxis();
      assertFalse(axis0.isMinorTickMarksVisible());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(9.0);
      Shape shape0 = cyclicNumberAxis0.getDownArrow();
      AxisEntity axisEntity0 = new AxisEntity(shape0, cyclicNumberAxis0, "OUTSIDE2", "d|Zd");
      cyclicNumberAxis0.setTickMarkInsideLength(2.0F);
      CyclicNumberAxis cyclicNumberAxis1 = (CyclicNumberAxis)axisEntity0.getAxis();
      assertEquals(1.0E-8, cyclicNumberAxis1.getAutoRangeMinimumSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      LogAxis logAxis0 = new LogAxis();
      logAxis0.setTickMarkInsideLength((-2458.351F));
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0);
      LogAxis logAxis1 = (LogAxis)axisEntity0.getAxis();
      assertFalse(ValueAxis.DEFAULT_INVERTED);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      LogAxis logAxis0 = new LogAxis();
      logAxis0.setMinorTickMarkOutsideLength(0.0F);
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0);
      LogAxis logAxis1 = (LogAxis)axisEntity0.getAxis();
      assertFalse(ValueAxis.DEFAULT_INVERTED);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      LogAxis logAxis0 = new LogAxis();
      logAxis0.setMinorTickMarkOutsideLength((-1.0F));
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0);
      Axis axis0 = axisEntity0.getAxis();
      assertTrue(axis0.isVisible());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.setMinorTickMarkInsideLength(704.61237F);
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, numberAxis0);
      NumberAxis numberAxis1 = (NumberAxis)axisEntity0.getAxis();
      assertTrue(numberAxis1.isAutoRange());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.setMinorTickMarkInsideLength((-1.0F));
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, numberAxis0);
      NumberAxis numberAxis1 = (NumberAxis)axisEntity0.getAxis();
      assertEquals(1.0E-8, numberAxis1.getAutoRangeMinimumSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0E-8, 500, "s(");
      Shape shape0 = cyclicNumberAxis0.getDownArrow();
      cyclicNumberAxis0.setLabelAngle(0.05);
      AxisEntity axisEntity0 = new AxisEntity(shape0, cyclicNumberAxis0, "s(", "M;:E!1[");
      CyclicNumberAxis cyclicNumberAxis1 = (CyclicNumberAxis)axisEntity0.getAxis();
      assertFalse(cyclicNumberAxis1.isInverted());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      NumberAxis numberAxis0 = new NumberAxis();
      AxisEntity axisEntity0 = new AxisEntity(rectangle2D_Double0, numberAxis0);
      numberAxis0.setFixedDimension(3513.26);
      NumberAxis numberAxis1 = (NumberAxis)axisEntity0.getAxis();
      assertEquals(RangeType.FULL, numberAxis1.getRangeType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      AxisEntity axisEntity0 = null;
      try {
        axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, (Axis) null, "gjCEzGB(To$;IZ", "gjCEzGB(To$;IZ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'axis' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      AxisEntity axisEntity0 = null;
      try {
        axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, (Axis) null, "gjCEzGB(To$;IZ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'axis' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      AxisEntity axisEntity0 = null;
      try {
        axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, (Axis) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'axis' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(9.0);
      Shape shape0 = cyclicNumberAxis0.getDownArrow();
      NumberAxis numberAxis0 = new NumberAxis();
      AxisEntity axisEntity0 = new AxisEntity(shape0, numberAxis0);
      AxisEntity axisEntity1 = new AxisEntity(shape0, cyclicNumberAxis0);
      boolean boolean0 = axisEntity0.equals(axisEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      LogAxis logAxis0 = new LogAxis();
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0, "dyPe@%b+_F");
      AxisEntity axisEntity1 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0, "dyPe@%b+_F", "dyPe@%b+_F");
      boolean boolean0 = axisEntity0.equals(axisEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      LogAxis logAxis0 = new LogAxis("GP~4RI=Zf\"");
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0, "GP~4RI=Zf\"", "GP~4RI=Zf\"");
      AxisEntity axisEntity1 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0);
      boolean boolean0 = axisEntity0.equals(axisEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      LogAxis logAxis0 = new LogAxis();
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.EXPAND;
      Rectangle2D rectangle2D0 = logAxis0.DEFAULT_TICK_LABEL_INSETS.createAdjustedRectangle(defaultCaret0, lengthAdjustmentType0, lengthAdjustmentType0);
      AxisEntity axisEntity1 = new AxisEntity(rectangle2D0, logAxis0, "axis");
      boolean boolean0 = axisEntity0.equals(axisEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(9.0);
      Shape shape0 = cyclicNumberAxis0.getDownArrow();
      AxisEntity axisEntity0 = new AxisEntity(shape0, cyclicNumberAxis0, "OUTSIDE2", "d|Zd");
      Object object0 = axisEntity0.clone();
      boolean boolean0 = axisEntity0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      DateAxis dateAxis0 = new DateAxis("");
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, dateAxis0, "");
      boolean boolean0 = axisEntity0.equals(axisEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      LogAxis logAxis0 = new LogAxis();
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0);
      DateTickMarkPosition dateTickMarkPosition0 = DateTickMarkPosition.END;
      boolean boolean0 = axisEntity0.equals(dateTickMarkPosition0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      NumberAxis numberAxis0 = new NumberAxis();
      AxisEntity axisEntity0 = new AxisEntity(rectangle2D_Double0, numberAxis0);
      String string0 = axisEntity0.toString();
      assertEquals("AxisEntity: tooltip = null", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      LogAxis logAxis0 = new LogAxis();
      AxisEntity axisEntity0 = new AxisEntity(defaultPolarItemRenderer0.DEFAULT_SHAPE, logAxis0);
      axisEntity0.hashCode();
  }
}
