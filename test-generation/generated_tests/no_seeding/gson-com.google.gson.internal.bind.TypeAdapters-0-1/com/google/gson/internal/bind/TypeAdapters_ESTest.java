/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 15:15:35 GMT 2020
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
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
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class1, (Class<?>) class0, (TypeAdapter<? super Object>) objectTypeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test01()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.TYPE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("}");
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"}\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$7", e);
      }
  }

  @Test(timeout = 100000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('*');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      Class<Long> class0 = Long.TYPE;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"*\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 100000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      try { 
        gson0.fromJson("BEGIN_ARRAY", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was STRING at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<JsonPrimitive> class0 = JsonPrimitive.class;
      TypeAdapter<JsonPrimitive> typeAdapter0 = gson0.getAdapter(class0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test05()  throws Throwable  {
      Class<Calendar> class0 = Calendar.class;
      TypeToken<Calendar> typeToken0 = TypeToken.get(class0);
      JsonDeserializer<Calendar> jsonDeserializer0 = (JsonDeserializer<Calendar>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.google.gson.JsonElement.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonDeserializationContext.class));
      Gson gson0 = new Gson();
      TreeTypeAdapter<Calendar> treeTypeAdapter0 = new TreeTypeAdapter<Calendar>((JsonSerializer<Calendar>) null, jsonDeserializer0, gson0, typeToken0, (TypeAdapterFactory) null);
      JsonObject jsonObject0 = new JsonObject();
      Calendar calendar0 = treeTypeAdapter0.fromJsonTree(jsonObject0);
      assertNull(calendar0);
  }

  @Test(timeout = 100000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Short> class0 = Short.class;
      TypeToken<Short> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      Double double0 = gson0.fromJson((JsonElement) jsonNull0, type0);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<Boolean> class0 = Boolean.TYPE;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test08()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("jsonAdapter");
      // Undeclared exception!
      try { 
        jsonArray0.getAsJsonObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Object: [\"jsonAdapter\"]
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 100000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) jsonArray0);
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 100000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = new Boolean(false);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonPrimitive jsonPrimitive1 = (JsonPrimitive)gson0.toJsonTree((Object) jsonPrimitive0);
      assertFalse(jsonPrimitive1.isString());
  }

  @Test(timeout = 100000)
  public void test11()  throws Throwable  {
      Double double0 = new Double((-1469.72340410219));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      String string0 = jsonPrimitive0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = Character.valueOf('H');
      jsonObject0.addProperty("h9R4`EjdOGL665+'f", character0);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) jsonObject0);
      assertTrue(jsonElement0.equals((Object)jsonObject0));
  }

  @Test(timeout = 100000)
  public void test13()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      String string0 = jsonNull0.toString();
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test14()  throws Throwable  {
      JsonSerializer<Calendar> jsonSerializer0 = (JsonSerializer<Calendar>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      doReturn((JsonElement) null).when(jsonSerializer0).serialize(any(java.util.Calendar.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonSerializationContext.class));
      JsonDeserializer<Calendar> jsonDeserializer0 = (JsonDeserializer<Calendar>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      Gson gson0 = new Gson();
      Class<Calendar> class0 = Calendar.class;
      TypeToken<Calendar> typeToken0 = TypeToken.get(class0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.CALENDAR_FACTORY;
      TreeTypeAdapter<Calendar> treeTypeAdapter0 = new TreeTypeAdapter<Calendar>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, typeAdapterFactory0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(11, 11, 25, 25, 41, 41);
      String string0 = treeTypeAdapter0.toJson((Calendar) mockGregorianCalendar0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test15()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super Character>) null);
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<Calendar> class1 = Calendar.class;
      jsonArray0.add("");
      TypeToken<Calendar> typeToken0 = TypeToken.get(class1);
      JsonSerializer<Calendar> jsonSerializer0 = (JsonSerializer<Calendar>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Calendar> jsonDeserializer0 = (JsonDeserializer<Calendar>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.google.gson.JsonElement.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonDeserializationContext.class));
      TreeTypeAdapter<Calendar> treeTypeAdapter0 = new TreeTypeAdapter<Calendar>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, typeAdapterFactory0);
      Calendar calendar0 = treeTypeAdapter0.fromJsonTree(jsonArray0);
      assertNull(calendar0);
  }

  @Test(timeout = 100000)
  public void test16()  throws Throwable  {
      Class<Character> class0 = Character.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super Character>) null);
      Gson gson0 = new Gson();
      Class<Calendar> class1 = Calendar.class;
      TypeToken<Calendar> typeToken0 = TypeToken.get(class1);
      JsonSerializer<Calendar> jsonSerializer0 = (JsonSerializer<Calendar>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Calendar> jsonDeserializer0 = (JsonDeserializer<Calendar>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.google.gson.JsonElement.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonDeserializationContext.class));
      TreeTypeAdapter<Calendar> treeTypeAdapter0 = new TreeTypeAdapter<Calendar>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, typeAdapterFactory0);
      JsonArray jsonArray0 = new JsonArray(8);
      Calendar calendar0 = treeTypeAdapter0.fromJsonTree(jsonArray0);
      assertNull(calendar0);
  }

  @Test(timeout = 100000)
  public void test17()  throws Throwable  {
      Class<Calendar> class0 = Calendar.class;
      TypeToken<Calendar> typeToken0 = TypeToken.get(class0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(67, 183, 158);
      JsonDeserializer<Calendar> jsonDeserializer0 = (JsonDeserializer<Calendar>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn(mockGregorianCalendar0).when(jsonDeserializer0).deserialize(any(com.google.gson.JsonElement.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonDeserializationContext.class));
      Gson gson0 = new Gson();
      TreeTypeAdapter<Calendar> treeTypeAdapter0 = new TreeTypeAdapter<Calendar>((JsonSerializer<Calendar>) null, jsonDeserializer0, gson0, typeToken0, (TypeAdapterFactory) null);
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("?(", "?(");
      MockGregorianCalendar mockGregorianCalendar1 = (MockGregorianCalendar)treeTypeAdapter0.fromJsonTree(jsonObject0);
      assertEquals(1, mockGregorianCalendar1.getMinimalDaysInFirstWeek());
  }

  @Test(timeout = 100000)
  public void test18()  throws Throwable  {
      Class<Calendar> class0 = Calendar.class;
      Gson gson0 = new Gson();
      TypeToken<Calendar> typeToken0 = TypeToken.get(class0);
      Excluder excluder0 = Excluder.DEFAULT;
      JsonSerializer<Calendar> jsonSerializer0 = (JsonSerializer<Calendar>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Calendar> jsonDeserializer0 = (JsonDeserializer<Calendar>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.google.gson.JsonElement.class) , any(java.lang.reflect.Type.class) , any(com.google.gson.JsonDeserializationContext.class));
      TreeTypeAdapter<Calendar> treeTypeAdapter0 = new TreeTypeAdapter<Calendar>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, excluder0);
      Boolean boolean0 = Boolean.valueOf(false);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Calendar calendar0 = treeTypeAdapter0.fromJsonTree(jsonPrimitive0);
      assertNull(calendar0);
  }

  @Test(timeout = 100000)
  public void test19()  throws Throwable  {
      Excluder excluder0 = new Excluder();
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Calendar> class0 = Calendar.class;
      TypeToken<Calendar> typeToken0 = TypeToken.get(class0);
      JsonSerializer<Calendar> jsonSerializer0 = (JsonSerializer<Calendar>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Calendar> jsonDeserializer0 = (JsonDeserializer<Calendar>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      TreeTypeAdapter<Calendar> treeTypeAdapter0 = new TreeTypeAdapter<Calendar>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, excluder0);
      Calendar calendar0 = treeTypeAdapter0.fromJsonTree(jsonNull0);
      assertNull(calendar0);
  }

  @Test(timeout = 100000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<JsonNull> class0 = JsonNull.class;
      Double double0 = new Double(1348.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonNull but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.US;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) locale0);
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 100000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("BEGNN_AR+A6");
      Class<Locale> class0 = Locale.class;
      Locale locale0 = gson0.fromJson((Reader) stringReader0, class0);
      assertEquals("begnn_AR+A6", locale0.toString());
  }

  @Test(timeout = 100000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("123");
      Class<Locale> class0 = Locale.class;
      Gson gson0 = new Gson();
      Locale locale0 = gson0.fromJson((Reader) stringReader0, class0);
      assertEquals("", locale0.getCountry());
  }

  @Test(timeout = 100000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Locale> class0 = Locale.class;
      Locale locale0 = gson0.fromJson((JsonElement) jsonNull0, class0);
      assertNull(locale0);
  }

  @Test(timeout = 100000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Calendar> class0 = Calendar.class;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 100000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Calendar> class0 = Calendar.class;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-5343), "");
      Locale locale0 = Locale.GERMAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0, locale0);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) mockGregorianCalendar0, (Type) class0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 100000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Calendar> class0 = Calendar.class;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      try { 
        gson0.fromJson(jsonElement0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BOOLEAN at path $.complexMapKeySerialization
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test28()  throws Throwable  {
      Class<Calendar> class0 = Calendar.class;
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Double double0 = gson0.fromJson(jsonElement0, (Type) class0);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Calendar> class0 = Calendar.class;
      JsonObject jsonObject0 = new JsonObject();
  }

  @Test(timeout = 100000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      UUID uUID0 = MockUUID.randomUUID();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) uUID0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 100000)
  public void test31()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super Character>) null);
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) typeAdapterFactory0);
      Class<UUID> class1 = UUID.class;
      UUID uUID0 = gson0.fromJson(jsonElement0, class1);
      assertNull(uUID0);
  }

  @Test(timeout = 100000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray(886);
      Class<UUID> class0 = UUID.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<InetAddress> class0 = InetAddress.class;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      assertTrue(jsonElement0.isJsonNull());
  }

  @Test(timeout = 100000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<InetAddress> class0 = InetAddress.class;
      InetAddress inetAddress0 = gson0.fromJson("com.google.gson.internal.bind.TypeAdapters$36", class0);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) inetAddress0);
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 100000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<InetAddress> class0 = InetAddress.class;
      Double double0 = gson0.fromJson(jsonElement0, (Type) class0);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      URI uRI0 = MockURI.aHttpURI;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) uRI0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 100000)
  public void test37()  throws Throwable  {
      Class<URI> class0 = URI.class;
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Locale locale0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertNull(locale0);
  }

  @Test(timeout = 100000)
  public void test38()  throws Throwable  {
      Class<URI> class0 = URI.class;
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test39()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) uRL0);
      assertTrue(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 100000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URL> class0 = URL.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Double double0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URL> class0 = URL.class;
      try { 
        gson0.fromJson("+", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: +
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) stringBuffer0);
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 100000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<StringBuffer> class0 = StringBuffer.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test44()  throws Throwable  {
      Class<String> class0 = String.class;
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Double double0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      JsonArray jsonArray0 = new JsonArray();
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('w');
      JsonElement jsonElement0 = gson0.toJsonTree((Object) character0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 100000)
  public void test47()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuilder0);
      try { 
        gson0.fromJson(jsonElement0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting character, got: 
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 100000)
  public void test48()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Double double0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test49()  throws Throwable  {
      Class<Character> class0 = Character.class;
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson("E=,", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 3 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Long> class0 = Long.class;
      Double double0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(78);
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) atomicIntegerArray0);
      assertEquals(78, jsonArray0.size());
  }

  @Test(timeout = 100000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Integer> class0 = Integer.class;
      Double double0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.class;
      try { 
        gson0.fromJson(". Forgot to register a type adapter?", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \".\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 100000)
  public void test54()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Double double0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("hk5jkw^;vfjX1");
      Class<Byte> class0 = Byte.class;
      try { 
        gson0.fromJson((Reader) stringReader0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"hk5jkw^\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$5", e);
      }
  }

  @Test(timeout = 100000)
  public void test56()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Gson gson0 = new Gson();
      Class<Boolean> class1 = Boolean.TYPE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      Double double0 = gson0.fromJson(jsonElement0, (Type) class1);
      assertNull(double0);
  }

  @Test(timeout = 100000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.class;
      try { 
        gson0.fromJson("q]'GlzY(:Srh5In:LjV", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 3 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      long[] longArray0 = new long[3];
      longArray0[1] = (long) 9;
      BitSet bitSet0 = BitSet.valueOf(longArray0);
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) bitSet0);
      assertEquals(68, jsonArray0.size());
  }

  @Test(timeout = 100000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      Byte byte0 = new Byte((byte) (-78));
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) byte0);
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 100000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short)36);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) short0);
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 100000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      TypeToken<AtomicBoolean> typeToken0 = TypeToken.get(class0);
      Class<? super AtomicBoolean> class1 = typeToken0.getRawType();
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Type) class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicBoolean atomicBoolean0 = new AtomicBoolean();
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) atomicBoolean0);
      assertFalse(jsonPrimitive0.isString());
  }

  @Test(timeout = 100000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicInteger atomicInteger0 = new AtomicInteger();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicInteger0);
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 100000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonDeserializer<Calendar> jsonDeserializer0 = (JsonDeserializer<Calendar>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) jsonDeserializer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: com.google.gson.JsonDeserializer. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test65()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = new Long((-1963));
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) long0);
      assertFalse(jsonPrimitive0.isString());
  }

  @Test(timeout = 100000)
  public void test66()  throws Throwable  {
      Excluder excluder0 = new Excluder();
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      JsonSerializer<Integer> jsonSerializer0 = (JsonSerializer<Integer>) mock(JsonSerializer.class, new ViolatedAssumptionAnswer());
      JsonDeserializer<Integer> jsonDeserializer0 = (JsonDeserializer<Integer>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      Gson gson0 = new Gson();
      TreeTypeAdapter<Integer> treeTypeAdapter0 = new TreeTypeAdapter<Integer>(jsonSerializer0, jsonDeserializer0, gson0, typeToken0, excluder0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(typeToken0, (TypeAdapter<Integer>) treeTypeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test67()  throws Throwable  {
      Excluder excluder0 = new Excluder();
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Double> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, typeToken0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newTypeHierarchyFactory(class0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test69()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Gson gson0 = new Gson();
      Class<Currency> class0 = Currency.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test70()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.CHINA;
      Currency currency0 = Currency.getInstance(locale0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) currency0);
      assertTrue(jsonPrimitive0.isString());
  }
}
