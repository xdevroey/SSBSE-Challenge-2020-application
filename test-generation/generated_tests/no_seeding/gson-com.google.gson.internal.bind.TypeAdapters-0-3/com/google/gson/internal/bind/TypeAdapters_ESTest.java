/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 15:24:22 GMT 2020
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.ParameterizedTypeFixtures;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TypeAdapters_ESTest extends TypeAdapters_ESTest_scaffolding {

  @Test(timeout = 100000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Integer> class1 = Integer.class;
      ObjectConstructor<Object> objectConstructor0 = (ObjectConstructor<Object>) mock(ObjectConstructor.class, new ViolatedAssumptionAnswer());
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>(objectConstructor0, hashMap0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class0, (Class<?>) class1, (TypeAdapter<? super Object>) reflectiveTypeAdapterFactory_Adapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test01()  throws Throwable  {
      Class<InetAddress> class0 = InetAddress.class;
      TypeToken<InetAddress> typeToken0 = TypeToken.get(class0);
      TypeAdapter<InetAddress> typeAdapter0 = TypeAdapters.INET_ADDRESS;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(typeToken0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URI> class0 = URI.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("l`|?o'~", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in path at index 1: l`|?o'~
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$22", e);
      }
  }

  @Test(timeout = 100000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BitSet> class0 = BitSet.class;
      try { 
        gson0.fromJson("[", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.EOFException: End of input at line 1 column 2 path $[0]
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("Leitch");
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      try { 
        gson0.fromJson((Reader) stringReader0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was STRING at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test05()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super Locale>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test06()  throws Throwable  {
      Class<JsonObject> class0 = JsonObject.class;
      Gson gson0 = new Gson();
      TypeAdapter<JsonObject> typeAdapter0 = gson0.getAdapter(class0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, (TypeAdapter<Object>) null, class0);
      URL uRL0 = MockURL.getHttpExample();
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) uRL0);
      assertEquals("\"http://www.someFakeButWellFormedURL.org/fooExample\"", string0);
  }

  @Test(timeout = 100000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      TypeToken<GregorianCalendar> typeToken0 = TypeToken.get(class0);
      TypeAdapter<GregorianCalendar> typeAdapter0 = gson0.getAdapter(typeToken0);
      assertNotNull(typeAdapter0);
  }

  @Test(timeout = 100000)
  public void test09()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      Class<Object> class1 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class1);
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(typeToken0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, typeAdapter0, class0);
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) gson0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test10()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.valueOf(false);
      jsonArray0.add(boolean0);
      String string0 = jsonArray0.toString();
      assertEquals("[false]", string0);
  }

  @Test(timeout = 100000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(class0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, typeAdapter0, class0);
      JsonArray jsonArray0 = new JsonArray();
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) jsonArray0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 100000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, objectTypeAdapter0, class0);
      Boolean boolean0 = Boolean.valueOf(false);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) jsonPrimitive0);
      assertEquals("false", string0);
  }

  @Test(timeout = 100000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(typeToken0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, typeAdapter0, class0);
      Double double0 = new Double((-0.2733177231045001));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) jsonPrimitive0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test14()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      ParameterizedTypeFixtures.MyParameterizedTypeAdapter<Float> parameterizedTypeFixtures_MyParameterizedTypeAdapter0 = new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<Float>();
      Float float0 = new Float((-4393.656762601));
      ParameterizedTypeFixtures.MyParameterizedType<Float> parameterizedTypeFixtures_MyParameterizedType0 = new ParameterizedTypeFixtures.MyParameterizedType<Float>(float0);
      JsonSerializationContext jsonSerializationContext0 = mock(JsonSerializationContext.class, new ViolatedAssumptionAnswer());
      doReturn((JsonElement) null).when(jsonSerializationContext0).serialize(any());
      JsonElement jsonElement0 = parameterizedTypeFixtures_MyParameterizedTypeAdapter0.serialize(parameterizedTypeFixtures_MyParameterizedType0, (Type) class0, jsonSerializationContext0);
      String string0 = gson0.toJson(jsonElement0);
      assertEquals("{}", string0);
  }

  @Test(timeout = 100000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      StringBuilder stringBuilder0 = new StringBuilder("com.google.gson.internal.bind.TypeAdapters$4");
      gson0.toJson((JsonElement) jsonNull0, (Appendable) stringBuilder0);
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 100000)
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((JsonElement) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<JsonObject> class0 = JsonObject.class;
      try { 
        gson0.fromJson("'abc'", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonObject but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<JsonArray> class0 = JsonArray.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonObject
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<JsonObject> class0 = JsonObject.class;
      try { 
        gson0.fromJson("5", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonObject but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test20()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test21()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, objectTypeAdapter0, class0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) locale0);
      assertEquals("\"zh_CN\"", string0);
  }

  @Test(timeout = 100000)
  public void test22()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson("_", (Type) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 100000)
  public void test23()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      InetAddress inetAddress0 = gson0.fromJson("null", (Type) class0);
      assertNull(inetAddress0);
  }

  @Test(timeout = 100000)
  public void test24()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson(" is not Comparable", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 6 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Calendar> class0 = Calendar.class;
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test26()  throws Throwable  {
      Class<Calendar> class0 = Calendar.class;
      Gson gson0 = new Gson();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1312, 61, 1312, 112, 1196, (-1335));
      gson0.toJsonTree((Object) mockGregorianCalendar0, (Type) class0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-20489545575000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1320,MONTH=8,WEEK_OF_YEAR=37,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=253,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=33,SECOND=45,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 100000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Calendar> class0 = Calendar.class;
      try { 
        gson0.fromJson("com.google.gson.stream.JsonReader", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      UUID uUID0 = MockUUID.randomUUID();
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, (TypeAdapter<Object>) null, class0);
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) uUID0);
      assertEquals("\"00000000-0100-4000-8200-000003000000\"", string0);
  }

  @Test(timeout = 100000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<UUID> class0 = UUID.class;
      UUID uUID0 = gson0.fromJson("null", class0);
      assertNull(uUID0);
  }

  @Test(timeout = 100000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<UUID> class0 = UUID.class;
      UUID uUID0 = gson0.fromJson("O", class0);
      assertEquals((-9079256848728588288L), uUID0.getLeastSignificantBits());
  }

  @Test(timeout = 100000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, objectTypeAdapter0, class0);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) inetAddress0);
      assertEquals("\"192.168.1.42\"", string0);
  }

  @Test(timeout = 100000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<InetAddress> class0 = InetAddress.class;
      InetAddress inetAddress0 = gson0.fromJson("null", class0);
      assertNull(inetAddress0);
  }

  @Test(timeout = 100000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<InetAddress> class0 = InetAddress.class;
      try { 
        gson0.fromJson("sLT`7%v$/xKx6", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 10 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      URI uRI0 = MockURI.aFileURI;
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, (TypeAdapter<Object>) null, class0);
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) uRI0);
      assertEquals("\"file:///tmp/foo.bar\"", string0);
  }

  @Test(timeout = 100000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URL> class0 = URL.class;
      try { 
        gson0.fromJson("5}", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: 5
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, (TypeAdapter<Object>) null, class0);
      StringBuffer stringBuffer0 = new StringBuffer();
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) stringBuffer0);
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 100000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<StringBuffer> class0 = StringBuffer.class;
      StringBuffer stringBuffer0 = gson0.fromJson("null", class0);
      assertNull(stringBuffer0);
  }

  @Test(timeout = 100000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<StringBuffer> class0 = StringBuffer.class;
      try { 
        gson0.fromJson("$C.p1)RZG]MGm\"", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 11 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, objectTypeAdapter0, class0);
      StringBuilder stringBuilder0 = new StringBuilder();
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) stringBuilder0);
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 100000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      try { 
        gson0.fromJson("Qj'%6bNbZ8c/M", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 13 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test41()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      Class<Object> class1 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class1);
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(typeToken0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, typeAdapter0, class0);
      Character character0 = new Character('1');
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) character0);
      assertEquals("\"1\"", string0);
  }

  @Test(timeout = 100000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      Class<Character> class1 = Character.class;
      Character character0 = gson0.fromJson(jsonElement0, class1);
      assertNull(character0);
  }

  @Test(timeout = 100000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      try { 
        gson0.fromJson(")gPrVVi?", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting character, got: )gPrVVi?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 100000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.TYPE;
      try { 
        gson0.fromJson("G>2", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"G>2\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 100000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(class0);
      AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(2775);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, typeAdapter0, class0);
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) atomicIntegerArray0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test46()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson("I?#&^CVATw2", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"I?\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$7", e);
      }
  }

  @Test(timeout = 100000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.class;
      try { 
        gson0.fromJson("T4zm!g5_Elf^iG#", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"T4zm!g5_Elf^iG\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 100000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Byte> class0 = Byte.class;
      Byte byte0 = gson0.fromJson((JsonElement) jsonNull0, class0);
      assertNull(byte0);
  }

  @Test(timeout = 100000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.TYPE;
      try { 
        gson0.fromJson("com.google.gson.stream.JsonReader", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"com.google.gson.stream.JsonReader\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$5", e);
      }
  }

  @Test(timeout = 100000)
  public void test50()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      Class<Object> class1 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class1);
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(typeToken0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, typeAdapter0, class0);
      long[] longArray0 = new long[2];
      longArray0[0] = (long) 5;
      BitSet bitSet0 = BitSet.valueOf(longArray0);
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) bitSet0);
      assertEquals("[1,0,1]", string0);
  }

  @Test(timeout = 100000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(class0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, typeAdapter0, class0);
      Byte byte0 = new Byte((byte) (-21));
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) byte0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(class0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, typeAdapter0, class0);
      Short short0 = Short.valueOf((short)2759);
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) short0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('s');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was STRING at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, (TypeAdapter<Object>) null, class0);
      AtomicBoolean atomicBoolean0 = new AtomicBoolean(true);
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) atomicBoolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 100000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicInteger> class0 = AtomicInteger.class;
      try { 
        gson0.fromJson("com.google.gson.internal.bind.TypeAdapters$27", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"com.google.gson.internal.bind.TypeAdapters$27\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$8", e);
      }
  }

  @Test(timeout = 100000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicInteger atomicInteger0 = new AtomicInteger((-1092));
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicInteger0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 100000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, (TypeAdapter<Object>) null, class0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("zU2<:J0~H8xCIo");
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) jsonPrimitive0);
      assertEquals("\"zU2<:J0~H8xCIo\"", string0);
  }

  @Test(timeout = 100000)
  public void test58()  throws Throwable  {
      Class<JsonNull> class0 = JsonNull.class;
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Appendable) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: com.google.gson.JsonNull. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test59()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      Class<Object> class1 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class1);
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(typeToken0);
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, typeAdapter0, class0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) mockGregorianCalendar0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Calendar> class0 = Calendar.class;
      TypeToken<Calendar> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Calendar> typeAdapter0 = gson0.getAdapter(class0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(typeToken0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test61()  throws Throwable  {
      Class<JsonPrimitive> class0 = JsonPrimitive.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newTypeHierarchyFactory(class0, (TypeAdapter<JsonPrimitive>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Currency> class0 = Currency.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("U{5wOf[lz=hL|xih", class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Currency", e);
      }
  }

  @Test(timeout = 100000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      Locale locale0 = Locale.CANADA_FRENCH;
      TypeAdapterRuntimeTypeWrapper<Object> typeAdapterRuntimeTypeWrapper0 = new TypeAdapterRuntimeTypeWrapper<Object>(gson0, (TypeAdapter<Object>) null, class0);
      Currency currency0 = Currency.getInstance(locale0);
      String string0 = typeAdapterRuntimeTypeWrapper0.toJson((Object) currency0);
      assertEquals("\"CAD\"", string0);
  }
}
