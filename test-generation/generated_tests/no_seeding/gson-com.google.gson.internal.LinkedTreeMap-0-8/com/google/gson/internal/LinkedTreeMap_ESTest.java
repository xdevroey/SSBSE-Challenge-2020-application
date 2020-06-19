/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 15:46:59 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 100000)
  public void test00()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>(linkedTreeMap_Node0, (Integer) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      linkedTreeMap_Node1.right = linkedTreeMap_Node2;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<String, Integer>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<String, Integer>, Object>();
      Object object0 = linkedTreeMap_Node0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 100000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>((Comparator<? super Object>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 100000)
  public void test04()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 100000)
  public void test05()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      Integer integer0 = new Integer(2939);
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>((Comparator<? super String>) null);
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap1 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      linkedTreeMap1.putIfAbsent(integer0, linkedTreeMap0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap1.new KeySet();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_KeySet0.remove(abstractMap_SimpleEntry0);
      assertEquals(1, linkedTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<String, Integer>>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 100000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      Integer integer0 = new Integer((-991));
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      int int0 = linkedTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 100000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer((-660));
      LinkedTreeMap<String, Object> linkedTreeMap1 = linkedTreeMap0.putIfAbsent(integer0, (LinkedTreeMap<String, Object>) null);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Integer>> linkedTreeMap2 = new LinkedTreeMap<Object, Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Integer>>(comparator0);
      linkedTreeMap2.removeInternalByKey(linkedTreeMap1);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer(913);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.putIfAbsent(integer0, linkedTreeMap1);
      linkedTreeMap0.put(integer0, (LinkedTreeMap<String, Object>) null);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Integer>>();
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>(integer0, integer0);
      linkedTreeMap0.putIfAbsent(integer0, abstractMap_SimpleEntry0);
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      linkedTreeMap0.keySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test12()  throws Throwable  {
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      linkedTreeMap0.get(biConsumer0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test13()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test14()  throws Throwable  {
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, Object>>(comparator0);
      linkedTreeMap0.find(linkedTreeMap_Node0, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.size = 1;
      Set<Map.Entry<String, String>> set0 = (Set<Map.Entry<String, String>>)linkedTreeMap0.entrySet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 100000)
  public void test16()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.size = (-34);
      Set<Map.Entry<String, String>> set0 = (Set<Map.Entry<String, String>>)linkedTreeMap0.entrySet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 100000)
  public void test17()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Integer>>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Integer>>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test18()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Map.Entry<Object, String>, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Map.Entry<Object, String>, String>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap<Map.Entry<Object, String>, String> linkedTreeMap1 = new LinkedTreeMap<Map.Entry<Object, String>, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(linkedTreeMap1, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test20()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, Comparable<String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, Comparable<String>>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap.Node<Comparable<Object>, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Object>, Comparable<String>>(linkedTreeMap_Node0, comparable0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      LinkedTreeMap.Node<Comparable<Object>, Comparable<String>> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 100000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<Integer, Object>>();
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>();
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 100000)
  public void test22()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Integer>, Object>(comparator0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      LinkedTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Integer>, Object> linkedTreeMap_Node1 = linkedTreeMap0.find(linkedTreeMap_Node0, true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test24()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 100000)
  public void test25()  throws Throwable  {
      Integer integer0 = new Integer(3270);
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(integer0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 100000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 100000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer((-660));
      LinkedTreeMap.Node<Integer, LinkedTreeMap<String, Object>> linkedTreeMap_Node0 = linkedTreeMap0.find(integer0, true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test28()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 100000)
  public void test29()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>(linkedTreeMap_Node0, (Integer) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node2 = linkedTreeMap_Node1.last();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 100000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      linkedTreeMap_Node0.right = linkedTreeMap_Node0.left;
      // Undeclared exception!
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0.left, true);
  }

  @Test(timeout = 100000)
  public void test31()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      linkedTreeMap_Node0.setValue("/T|:fYTH'Zrn");
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>();
      String string0 = linkedTreeMap_Node1.setValue("/T|:fYTH'Zrn");
      assertNull(string0);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>();
      String string0 = linkedTreeMap_Node1.setValue("");
      assertNull(string0);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test33()  throws Throwable  {
      Integer integer0 = Integer.getInteger((String) null, 1);
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, String>(integer0, (String) null);
      AbstractMap.SimpleEntry<Integer, Object> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Integer, Object>(abstractMap_SimpleEntry0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, Integer>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, Integer>(linkedTreeMap_Node0, abstractMap_SimpleEntry1, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(abstractMap_SimpleEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test34()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      Integer integer0 = new Integer(1969);
      AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<Object, Object>, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<Object, Object>, Integer>(abstractMap_SimpleEntry0, integer0);
      boolean boolean0 = linkedTreeMap_Node1.equals(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test35()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>("", "811l98_U_q]vy|]");
      AbstractMap.SimpleImmutableEntry<Object, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, String>(abstractMap_SimpleEntry0);
      boolean boolean0 = linkedTreeMap_Node1.equals(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test37()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Map.Entry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Map.Entry<Object, String>>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test38()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Integer>>();
      linkedTreeMap0.keySet();
      Set<Integer> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 100000)
  public void test39()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.entrySet();
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer((-660));
      linkedTreeMap0.putIfAbsent(integer0, (LinkedTreeMap<String, Object>) null);
      Integer integer1 = new Integer(2);
      linkedTreeMap0.putIfAbsent(integer1, (LinkedTreeMap<String, Object>) null);
      Integer integer2 = Integer.valueOf((-3216));
      linkedTreeMap0.put(integer2, (LinkedTreeMap<String, Object>) null);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test41()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer(913);
      linkedTreeMap0.putIfAbsent(integer0, (LinkedTreeMap<String, Object>) null);
      Integer integer1 = new Integer(2);
      linkedTreeMap0.putIfAbsent(integer1, (LinkedTreeMap<String, Object>) null);
      Integer integer2 = new Integer((-332));
      LinkedTreeMap<String, Object> linkedTreeMap1 = linkedTreeMap0.put(integer2, (LinkedTreeMap<String, Object>) null);
      assertNull(linkedTreeMap1);
  }

  @Test(timeout = 100000)
  public void test42()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer(1840);
      linkedTreeMap0.putIfAbsent(integer0, (LinkedTreeMap<String, Object>) null);
      Integer integer1 = new Integer(929);
      Integer integer2 = new Integer((-2161));
      linkedTreeMap0.putIfAbsent(integer2, (LinkedTreeMap<String, Object>) null);
      LinkedTreeMap<String, Object> linkedTreeMap1 = linkedTreeMap0.put(integer1, (LinkedTreeMap<String, Object>) null);
      assertNull(linkedTreeMap1);
  }

  @Test(timeout = 100000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer((-660));
      LinkedTreeMap<String, Object> linkedTreeMap1 = linkedTreeMap0.putIfAbsent(integer0, (LinkedTreeMap<String, Object>) null);
      Integer integer1 = new Integer(2);
      Integer integer2 = new Integer((-1));
      linkedTreeMap0.putIfAbsent(integer2, (LinkedTreeMap<String, Object>) null);
      linkedTreeMap0.put(integer1, linkedTreeMap1);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>(linkedTreeMap_Node0, (Integer) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 100000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer((-660));
      linkedTreeMap0.putIfAbsent(integer0, (LinkedTreeMap<String, Object>) null);
      Integer integer1 = new Integer(913);
      linkedTreeMap0.putIfAbsent(integer1, (LinkedTreeMap<String, Object>) null);
      Integer integer2 = new Integer(2);
      linkedTreeMap0.put(integer2, (LinkedTreeMap<String, Object>) null);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test46()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node2, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test47()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>();
      linkedTreeMap_Node0.parent = linkedTreeMap_Node1;
      linkedTreeMap_Node1.left = linkedTreeMap_Node1;
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test49()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, Object>, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, LinkedTreeMap<String, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap<String, Object> linkedTreeMap2 = new LinkedTreeMap<String, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(linkedTreeMap1, linkedTreeMap2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test50()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>(comparator0);
      linkedTreeMap0.find((Integer) null, true);
      Integer integer0 = new Integer(17);
      linkedTreeMap0.remove((Object) integer0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test51()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>(comparator0);
      linkedTreeMap0.remove((Object) "<wQu:U QLQ");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test52()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, Object>(comparator0);
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((AbstractMap.SimpleEntry<String, Object>) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test53()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      Integer integer0 = Integer.getInteger("$OtFdb|rWpuGK", 921);
      linkedTreeMap0.put(integer0, (Integer) null);
      linkedTreeMap0.getOrDefault(integer0, integer0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test54()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>(comparator0);
      linkedTreeMap0.find((Integer) null, true);
      BiConsumer<Integer, Object> biConsumer0 = (BiConsumer<Integer, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test55()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer((-660));
      linkedTreeMap0.putIfAbsent(integer0, (LinkedTreeMap<String, Object>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      String string0 = linkedTreeMap_KeySet0.toString();
      assertEquals(1, linkedTreeMap0.size());
      assertEquals("[-660]", string0);
  }

  @Test(timeout = 100000)
  public void test56()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer(3270);
      LinkedTreeMap.Node<Integer, LinkedTreeMap<String, Object>> linkedTreeMap_Node0 = linkedTreeMap0.find(integer0, true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      assertEquals(1, linkedTreeMap0.size());
      
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test57()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 100000)
  public void test58()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      LinkedTreeMap.Node<Object, Map.Entry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Map.Entry<Object, String>>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test59()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test60()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 100000)
  public void test61()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer(913);
      linkedTreeMap0.putIfAbsent(integer0, (LinkedTreeMap<String, Object>) null);
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((Integer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test62()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 100000)
  public void test63()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
