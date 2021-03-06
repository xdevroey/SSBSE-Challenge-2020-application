/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 11:51:41 GMT 2020
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
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
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
      Class<Integer> class0 = Integer.class;
      Class<Object> class1 = Object.class;
      Gson gson0 = new Gson();
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(class1);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class1, (Class<?>) class0, (TypeAdapter<? super Object>) typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test01()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("second");
      Class<AtomicInteger> class0 = AtomicInteger.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"second\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$8", e);
      }
  }

  @Test(timeout = 100000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("D/+0F");
      Class<Integer> class0 = Integer.TYPE;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"D/+0F\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$7", e);
      }
  }

  @Test(timeout = 100000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(" Es'?+9,Y[U=aJLdye'");
      Class<Byte> class0 = Byte.TYPE;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \" Es'?+9,Y[U=aJLdye'\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$5", e);
      }
  }

  @Test(timeout = 100000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("duplicate key: ");
      Class<URI> class0 = URI.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in scheme name at index 9: duplicate key: 
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$22", e);
      }
  }

  @Test(timeout = 100000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.valueOf(true);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<BitSet> class0 = BitSet.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was BOOLEAN at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.valueOf("");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was BOOLEAN at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.INTEGER_FACTORY;
      Class<Calendar> class0 = Calendar.class;
      TypeToken<Calendar> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Calendar> typeAdapter0 = gson0.getDelegateAdapter(typeAdapterFactory0, typeToken0);
      TypeAdapterFactory typeAdapterFactory1 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super Calendar>) typeAdapter0);
      assertFalse(typeAdapterFactory1.equals((Object)typeAdapterFactory0));
  }

  @Test(timeout = 100000)
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, (TypeAdapter<Integer>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) jsonNull0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 100000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicInteger atomicInteger0 = new AtomicInteger((-699));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(atomicInteger0);
      Class<JsonObject> class0 = JsonObject.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonObject but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<JsonNull> class0 = JsonNull.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonNull but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<JsonArray> class0 = JsonArray.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonNull
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<JsonPrimitive> class0 = JsonPrimitive.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonPrimitive but was com.google.gson.JsonArray
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(" E>s'?+9,Y[=aJLdye'");
      Class<Short> class0 = Short.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \" E>s'?+9,Y[=aJLdye'\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 100000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<JsonObject> class0 = JsonObject.class;
      Object object0 = gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
      assertNotSame(jsonObject0, object0);
  }

  @Test(timeout = 100000)
  public void test16()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = new JsonArray();
      jsonArray1.add((JsonElement) jsonArray0);
      // Undeclared exception!
      try { 
        jsonArray1.getAsJsonNull();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Null: [[]]
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 100000)
  public void test17()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("mon");
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive1 = (JsonPrimitive)gson0.toJsonTree((Object) jsonPrimitive0);
      assertTrue(jsonPrimitive1.isString());
  }

  @Test(timeout = 100000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      String string0 = gson0.toJson((JsonElement) jsonPrimitive0);
      assertEquals("false", string0);
  }

  @Test(timeout = 100000)
  public void test19()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ParameterizedTypeFixtures.MyParameterizedTypeAdapter<StringBuffer> parameterizedTypeFixtures_MyParameterizedTypeAdapter0 = new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<StringBuffer>();
      StringBuffer stringBuffer0 = new StringBuffer();
      ParameterizedTypeFixtures.MyParameterizedType<StringBuffer> parameterizedTypeFixtures_MyParameterizedType0 = new ParameterizedTypeFixtures.MyParameterizedType<StringBuffer>(stringBuffer0);
      JsonSerializationContext jsonSerializationContext0 = mock(JsonSerializationContext.class, new ViolatedAssumptionAnswer());
      doReturn((JsonElement) null).when(jsonSerializationContext0).serialize(any());
      JsonElement jsonElement0 = parameterizedTypeFixtures_MyParameterizedTypeAdapter0.serialize(parameterizedTypeFixtures_MyParameterizedType0, (Type) class0, jsonSerializationContext0);
      // Undeclared exception!
      try { 
        jsonElement0.getAsJsonNull();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Null: {\"StringBuffer\":null}
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 100000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      Class<JsonNull> class0 = JsonNull.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonNull but was com.google.gson.JsonObject
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test21()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      assertTrue(jsonElement0.isJsonNull());
  }

  @Test(timeout = 100000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.UK;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) locale0);
      Class<Locale> class0 = Locale.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNotNull(object0);
      assertEquals("en_GB", object0.toString());
  }

  @Test(timeout = 100000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
      Class<Locale> class0 = Locale.class;
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 100000)
  public void test24()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Float float0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertNull(float0);
  }

  @Test(timeout = 100000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<Calendar> class0 = Calendar.class;
      Object object0 = gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", object0.toString());
  }

  @Test(timeout = 100000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Calendar> class0 = Calendar.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      UUID uUID0 = MockUUID.randomUUID();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) uUID0);
      Class<Locale> class0 = Locale.class;
      Locale locale0 = (Locale)gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertEquals("", locale0.getVariant());
  }

  @Test(timeout = 100000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) inetAddress0);
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 100000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<InetAddress> class0 = InetAddress.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<InetAddress> class0 = InetAddress.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      URI uRI0 = MockURI.aHttpURI;
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) uRI0);
      assertTrue(jsonPrimitive0.isString());
  }

  @Test(timeout = 100000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      URL uRL0 = MockURL.getHttpExample();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) uRL0);
      Class<JsonNull> class0 = JsonNull.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonNull but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = new Float(0.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      Class<URL> class0 = URL.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: java.lang.Float@0000000029
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<StringBuffer> class0 = StringBuffer.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BOOLEAN at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test35()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) stringBuilder0);
      assertTrue(jsonPrimitive0.isString());
  }

  @Test(timeout = 100000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<StringBuilder> class0 = StringBuilder.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("true", object0);
  }

  @Test(timeout = 100000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<String> class0 = String.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('\\');
      JsonElement jsonElement0 = gson0.toJsonTree((Object) character0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 100000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(" Es'?+9,YOU=aJLdye'");
      Class<Character> class0 = Character.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting character, got:  Es'?+9,YOU=aJLdye'
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 100000)
  public void test43()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("W");
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals('W', object0);
  }

  @Test(timeout = 100000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Character> class0 = Character.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Long> class0 = Long.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("Th$K");
      Class<Long> class0 = Long.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"Th$K\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 100000)
  public void test47()  throws Throwable  {
      AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(2264);
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicIntegerArray0);
      Class<StringBuilder> class0 = StringBuilder.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Integer> class0 = Integer.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.TYPE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Byte> class0 = Byte.TYPE;
      Double double0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      Byte byte0 = new Byte((byte)8);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      Class<Byte> class0 = Byte.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals((byte)8, object0);
  }

  @Test(timeout = 100000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.TYPE;
      try { 
        gson0.fromJson("6Bv=W~AbK", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 6 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Boolean> class0 = Boolean.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      Class<Boolean> class0 = Boolean.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      long[] longArray0 = new long[4];
      longArray0[0] = 434L;
      BitSet bitSet0 = BitSet.valueOf(longArray0);
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) bitSet0);
      assertEquals(9, jsonArray0.size());
  }

  @Test(timeout = 100000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short)3760);
      Class<Byte> class0 = Byte.TYPE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) short0, (Type) class0);
      String string0 = gson0.toJson(jsonElement0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short)19);
      String string0 = gson0.toJson((Object) short0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test58()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Gson gson0 = new Gson();
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicBoolean atomicBoolean0 = new AtomicBoolean();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicBoolean0);
      Class<UUID> class0 = UUID.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BOOLEAN at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicInteger atomicInteger0 = new AtomicInteger(21);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) atomicInteger0);
      assertTrue(jsonPrimitive0.isNumber());
  }

  @Test(timeout = 100000)
  public void test61()  throws Throwable  {
      Class<JsonArray> class0 = JsonArray.class;
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test62()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) typeToken0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.Object. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2692), (-2692), (-157512746), (-157512746), (-2692));
      JsonElement jsonElement0 = gson0.toJsonTree((Object) mockGregorianCalendar0);
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BOOLEAN at path $.lenient
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test64()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(typeToken0, (TypeAdapter<Integer>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test65()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ObjectConstructor<Locale> objectConstructor0 = (ObjectConstructor<Locale>) mock(ObjectConstructor.class, new ViolatedAssumptionAnswer());
      ReflectiveTypeAdapterFactory.Adapter<Locale> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Locale>(objectConstructor0, hashMap0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newTypeHierarchyFactory(class0, (TypeAdapter<Locale>) reflectiveTypeAdapterFactory_Adapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
      Class<Currency> class0 = Currency.class;
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Currency", e);
      }
  }

  @Test(timeout = 100000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.FRANCE;
      Currency currency0 = Currency.getInstance(locale0);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) currency0);
      assertFalse(jsonElement0.isJsonNull());
  }
}
