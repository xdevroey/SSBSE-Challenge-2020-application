/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 13:16:36 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.ToDoubleFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 100000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      linkedHashTreeMap_AvlBuilder0.reset(0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 100000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>((Comparator<? super String>) null);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet1 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Object>((Comparator<? super Object>) null);
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap2 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap3 = new LinkedHashTreeMap<String, Object>((Comparator<? super String>) null);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet2 = linkedHashTreeMap2.new EntrySet();
      LinkedHashTreeMap.AvlBuilder<Integer, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet3 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, String> linkedHashTreeMap4 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, String>();
      linkedHashTreeMap4.get("o0>E6AaUuEG!urn1");
      assertEquals(0, linkedHashTreeMap4.size());
  }

  @Test(timeout = 100000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Integer, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, AbstractMap.SimpleEntry<Object, Integer>>();
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Integer>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlBuilder0.root();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 100000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      String string0 = linkedHashTreeMap_Node0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 100000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = linkedHashTreeMap_Node0.getKey();
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 100000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 100000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Comparable<String>, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<String>, AbstractMap.SimpleImmutableEntry<Integer, String>>(comparator0);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 100000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      Integer integer0 = Integer.valueOf(3406);
      linkedHashTreeMap0.put(integer0, "Abp.I");
      int int0 = linkedHashTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 100000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap1 = new LinkedHashTreeMap<String, String>(comparator1);
      String string0 = linkedHashTreeMap0.putIfAbsent(linkedHashTreeMap1, "+Sd*qjsMV\"");
      assertNull(string0);
      
      Set<Object> set0 = linkedHashTreeMap0.keySet();
      assertFalse(set0.contains("+Sd*qjsMV\""));
      assertNotNull(set0);
  }

  @Test(timeout = 100000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      linkedHashTreeMap0.findByObject(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Integer>();
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<Comparable<Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<Object>, String>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.find(comparable0, false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      linkedHashTreeMap0.find("", true);
      linkedHashTreeMap0.entrySet();
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<Comparable<Object>, Object>, Comparable<Object>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Map.Entry<Comparable<Object>, Object>, Comparable<Object>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<Map.Entry<Comparable<Object>, Object>, Comparable<Object>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Map.Entry<Comparable<Object>, Object>, Comparable<Object>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 100000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<Integer, Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>((Comparator<? super Object>) null);
      LinkedHashTreeMap.Node<Comparable<Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Object>, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(linkedHashTreeMap_Node0, (String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Comparable<Integer>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<Integer>, Integer>(comparator0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap<Object, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Comparable<Object>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find((Object) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Comparable<Integer>, Object>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test19()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer>(comparator0);
      linkedHashTreeMap0.table = null;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 100000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.AvlIterator<String, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, Object>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 100000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Comparable<String>, Comparable<String>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Comparable<String>, Comparable<String>>();
      LinkedHashTreeMap.Node<Comparable<String>, Comparable<String>> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 100000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer>(comparator0);
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      boolean boolean0 = linkedHashTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(linkedHashTreeMap_EntrySet0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Comparable<Object>>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains("-Bd9");
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 100000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, Comparable<String>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, Comparable<String>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 6);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, Comparable<String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, Comparable<String>>();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, Comparable<String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, Comparable<String>>();
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_NodeArray0[0];
      linkedHashTreeMap_NodeArray0[5] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, Comparable<String>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, Comparable<String>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(12, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 100000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      linkedHashTreeMap_AvlBuilder0.reset((-361));
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 100000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, Integer>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, Integer>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 2);
      LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, Integer>>();
      LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, Integer>>(linkedHashTreeMap_Node0, (Comparable<String>) null, (-886), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, Integer>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, Integer>>[]) linkedHashTreeMap_NodeArray0);
      LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, Integer>>[] linkedHashTreeMap_NodeArray2 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, Integer>>[]) linkedHashTreeMap_NodeArray1);
      assertEquals(8, linkedHashTreeMap_NodeArray2.length);
  }

  @Test(timeout = 100000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node0;
      // Undeclared exception!
      linkedHashTreeMap_Node0.right.last();
  }

  @Test(timeout = 100000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<String>, Map.Entry<Comparable<Object>, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<String>, Map.Entry<Comparable<Object>, Object>>();
      LinkedHashTreeMap.Node<Comparable<String>, Map.Entry<Comparable<Object>, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Comparable<String>, Map.Entry<Comparable<Object>, Object>>();
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Comparable<String>, Map.Entry<Comparable<Object>, Object>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 100000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>>(linkedHashTreeMap_Node0, "-kT", 16, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      LinkedHashTreeMap.Node<Comparable<Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Comparable<Object>, Object>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      LinkedHashTreeMap.Node<Comparable<Object>, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Comparable<Object>, Object>(linkedHashTreeMap_Node1, comparable0, 0, linkedHashTreeMap_Node1, linkedHashTreeMap_Node1);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node2);
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      Integer integer0 = Integer.valueOf((-1));
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, String>(linkedHashTreeMap_Node0, integer0, 12, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertFalse(linkedHashTreeMap_Node0.equals((Object)linkedHashTreeMap_Node1));
  }

  @Test(timeout = 100000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<String>, Map.Entry<Comparable<Object>, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<String>, Map.Entry<Comparable<Object>, Object>>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap0.keySet();
      Set<Object> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 100000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.forEach(biConsumer0);
      Set<Map.Entry<Object, Object>> set0 = (Set<Map.Entry<Object, Object>>)linkedHashTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 100000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>(comparator0);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      Integer integer0 = new Integer(2);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Object>(linkedHashTreeMap_Node0, integer0, 1045, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test41()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, String>(linkedHashTreeMap_Node0, linkedHashTreeMap0, (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 100000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test43()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>(comparator0);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      Integer integer0 = new Integer(2);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Object>(linkedHashTreeMap_Node0, integer0, 1045, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>((Comparator<? super String>) null);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      LinkedHashTreeMap<Object, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Comparable<Object>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(linkedHashTreeMap_Node0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test46()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(1);
      linkedHashTreeMap0.put(integer0, integer0);
      linkedHashTreeMap0.put(integer0, integer0);
      assertEquals(2, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test47()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-14)).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(923);
      linkedHashTreeMap0.put(integer0, integer0);
      linkedHashTreeMap0.removeInternalByKey(integer0);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      Integer integer0 = new Integer(886);
      linkedHashTreeMap0.put(integer0, integer0);
      linkedHashTreeMap0.removeInternalByKey(integer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap<Integer, LinkedHashTreeMap<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, LinkedHashTreeMap<Object, String>>();
      linkedHashTreeMap0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 100000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>((Comparator<? super String>) null);
      Integer integer0 = Integer.getInteger("", 1041);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((String) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 100000)
  public void test51()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      Integer integer0 = new Integer((-886));
      linkedHashTreeMap0.put(integer0, (String) null);
      assertEquals(1, linkedHashTreeMap0.size());
      
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<String, String> linkedHashTreeMap1 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node1 = linkedHashTreeMap1.header;
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(linkedHashTreeMap_Node1);
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap2 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, String>>(comparator0);
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 4);
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>>();
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node3 = linkedHashTreeMap_Node2.last();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node3;
      linkedHashTreeMap2.table = linkedHashTreeMap_NodeArray0;
      linkedHashTreeMap2.replace((Object) integer0, abstractMap_SimpleEntry0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 100000)
  public void test52()  throws Throwable  {
      ToDoubleFunction<Object> toDoubleFunction0 = (ToDoubleFunction<Object>) mock(ToDoubleFunction.class, new ViolatedAssumptionAnswer());
      Comparator<Integer> comparator0 = Comparator.comparingDouble((ToDoubleFunction<? super Integer>) toDoubleFunction0);
      LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Integer, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Integer, String>>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 100000)
  public void test53()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test54()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 100000)
  public void test55()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 100000)
  public void test56()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>((Comparator<? super String>) null);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 100000)
  public void test57()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      Integer integer0 = Integer.valueOf(3406);
      String string0 = linkedHashTreeMap0.put(integer0, "Abp.I");
      assertNull(string0);
      
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      String string1 = linkedHashTreeMap_KeySet0.toString();
      assertEquals("[3406]", string1);
  }

  @Test(timeout = 100000)
  public void test58()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      Integer integer0 = new Integer((-903));
      linkedHashTreeMap0.put(integer0, (String) null);
      boolean boolean0 = linkedHashTreeMap0.containsValue(integer0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 100000)
  public void test59()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      String string0 = linkedHashTreeMap_Node0.setValue("As*:#RsK2");
      assertNull(string0);
  }

  @Test(timeout = 100000)
  public void test60()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      String string0 = linkedHashTreeMap_Node0.prev.toString();
      assertEquals("null=null", string0);
  }
}
