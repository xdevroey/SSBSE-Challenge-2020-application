/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 11:35:30 GMT 2020
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TypeAdapters_ESTest extends TypeAdapters_ESTest_scaffolding {

  @Test(timeout = 100000)
  public void test00()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      TypeAdapter<Locale> typeAdapter0 = (TypeAdapter<Locale>) mock(TypeAdapter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(typeAdapter0).toString();
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newTypeHierarchyFactory(class0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test01()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Calendar> class0 = Calendar.class;
      Class<Object> class1 = Object.class;
      TypeAdapter<Object> typeAdapter0 = gson0.getAdapter(class1);
      Class<MockGregorianCalendar> class2 = MockGregorianCalendar.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class0, (Class<? extends Calendar>) class2, (TypeAdapter<? super Calendar>) typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      Locale locale0 = gson0.fromJson("com.google.gson.internal.bind.TypeAdapters$21", class0);
      assertEquals("com.google.gson.internal.bind.typeadapters$21", locale0.getLanguage());
  }

  @Test(timeout = 100000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("'pO");
      Class<Byte> class0 = Byte.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"'pO\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$5", e);
      }
  }

  @Test(timeout = 100000)
  public void test04()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Gson gson0 = new Gson();
      Float float0 = new Float((-1.0));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals((byte) (-1), object0);
  }

  @Test(timeout = 100000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("s{k-@}dK-JbX(C*");
      Class<URI> class0 = URI.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in path at index 1: s{k-@}dK-JbX(C*
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$22", e);
      }
  }

  @Test(timeout = 100000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(".4ZT33YQ:AuFd I*");
      Class<BitSet> class0 = BitSet.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was STRING at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.TRUE;
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
  public void test08()  throws Throwable  {
      Class<URL> class0 = URL.class;
      TypeAdapter<URL> typeAdapter0 = TypeAdapters.URL;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super URL>) typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test09()  throws Throwable  {
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      Gson gson0 = new Gson();
      TypeAdapter<MockGregorianCalendar> typeAdapter0 = gson0.getAdapter(class0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      Integer integer0 = new Integer(886);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) integer0);
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
  public void test11()  throws Throwable  {
      Class<JsonNull> class0 = JsonNull.class;
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.valueOf("*_mKKvZTQCU{");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
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
      Class<JsonNull> class0 = JsonNull.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonNull but was com.google.gson.JsonArray
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      Class<JsonArray> class0 = JsonArray.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      Class<Long> class0 = Long.TYPE;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 100000)
  public void test16()  throws Throwable  {
      ParameterizedTypeFixtures.MyParameterizedTypeAdapter<Locale> parameterizedTypeFixtures_MyParameterizedTypeAdapter0 = new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<Locale>();
      Locale locale0 = Locale.FRENCH;
      ParameterizedTypeFixtures.MyParameterizedType<Locale> parameterizedTypeFixtures_MyParameterizedType0 = new ParameterizedTypeFixtures.MyParameterizedType<Locale>(locale0);
      Class<Float> class0 = Float.TYPE;
      JsonSerializationContext jsonSerializationContext0 = mock(JsonSerializationContext.class, new ViolatedAssumptionAnswer());
      doReturn((JsonElement) null).when(jsonSerializationContext0).serialize(any());
      JsonElement jsonElement0 = parameterizedTypeFixtures_MyParameterizedTypeAdapter0.serialize(parameterizedTypeFixtures_MyParameterizedType0, (Type) class0, jsonSerializationContext0);
      // Undeclared exception!
      try { 
        jsonElement0.getAsJsonPrimitive();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Primitive: {\"Locale\":null}
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 100000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = mock(JsonElement.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonElement0).isJsonArray();
      doReturn(false).when(jsonElement0).isJsonNull();
      doReturn(false).when(jsonElement0).isJsonObject();
      doReturn(false).when(jsonElement0).isJsonPrimitive();
      // Undeclared exception!
      try { 
        gson0.toJson(jsonElement0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Couldn't write class com.google.gson.JsonElement$MockitoMock$924062000
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$29", e);
      }
  }

  @Test(timeout = 100000)
  public void test18()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = new Boolean("XiT vy`iF#II1JHI");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      jsonArray0.add((JsonElement) jsonPrimitive0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsJsonNull();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Null: [false]
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 100000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      String string0 = gson0.toJson((Object) jsonArray0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 100000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonPrimitive jsonPrimitive1 = (JsonPrimitive)gson0.toJsonTree((Object) jsonPrimitive0);
      assertTrue(jsonPrimitive1.isBoolean());
  }

  @Test(timeout = 100000)
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      Byte byte0 = new Byte((byte)59);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      String string0 = gson0.toJson((Object) jsonPrimitive0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("'");
      JsonPrimitive jsonPrimitive1 = (JsonPrimitive)gson0.toJsonTree((Object) jsonPrimitive0);
      assertTrue(jsonPrimitive1.isString());
  }

  @Test(timeout = 100000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((JsonElement) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      Class<JsonArray> class0 = JsonArray.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonObject
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("\"\"", class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 100000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Locale> class0 = Locale.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      Locale locale0 = gson0.fromJson("fr_FR", class0);
      assertEquals("fr_FR", locale0.toString());
  }

  @Test(timeout = 100000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty(" but was ", " but was ");
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \" but was \"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 100000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Calendar> class0 = Calendar.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      Object object0 = gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", object0.toString());
  }

  @Test(timeout = 100000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      UUID uUID0 = MockUUID.randomUUID();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) uUID0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 100000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<UUID> class0 = UUID.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      URL uRL0 = MockURL.getHttpExample();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) uRL0);
      Class<UUID> class0 = UUID.class;
      UUID uUID0 = (UUID)gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertEquals((-9079256848728588288L), uUID0.getLeastSignificantBits());
  }

  @Test(timeout = 100000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<InetAddress> class0 = InetAddress.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test36()  throws Throwable  {
      Class<InetAddress> class0 = InetAddress.class;
      Gson gson0 = new Gson();
      Character character0 = Character.valueOf('3');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      Inet4Address inet4Address0 = (Inet4Address)gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertFalse(inet4Address0.isMCNodeLocal());
  }

  @Test(timeout = 100000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      URI uRI0 = MockURI.aFTPURI;
      String string0 = gson0.toJson((Object) uRI0);
      assertEquals("\"ftp://foo.bar\"", string0);
  }

  @Test(timeout = 100000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("null");
      Class<URI> class0 = URI.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<URI> class0 = URI.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.CANADA_FRENCH;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) locale0);
      Class<URI> class0 = URI.class;
      URI uRI0 = (URI)gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(uRI0.getRawQuery());
  }

  @Test(timeout = 100000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("null");
      Class<URL> class0 = URL.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<URL> class0 = URL.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.FRANCE;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) locale0);
      Class<URL> class0 = URL.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: fr_FR
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      gson0.toJson((Object) stringBuffer0, (Appendable) stringWriter0);
      assertEquals(2, stringBuffer0.length());
      assertEquals("\"\"", stringWriter0.toString());
  }

  @Test(timeout = 100000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<StringBuffer> class0 = StringBuffer.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("Invalid bitset value type: ");
      Class<StringBuffer> class0 = StringBuffer.class;
      StringBuffer stringBuffer0 = (StringBuffer)gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals(27, stringBuffer0.length());
  }

  @Test(timeout = 100000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder();
      String string0 = gson0.toJson((Object) stringBuilder0);
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 100000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<StringBuilder> class0 = StringBuilder.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<StringBuilder> class0 = StringBuilder.class;
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
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("true", object0);
  }

  @Test(timeout = 100000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(".4ZT33YQ:AuFd I*");
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals(".4ZT33YQ:AuFd I*", object0);
  }

  @Test(timeout = 100000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = Character.valueOf('a');
      String string0 = gson0.toJson((Object) character0);
      assertEquals("\"a\"", string0);
  }

  @Test(timeout = 100000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("M");
      Class<Character> class0 = Character.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals('M', object0);
  }

  @Test(timeout = 100000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.class;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      Character character0 = gson0.fromJson(jsonElement0, class0);
      assertNull(character0);
  }

  @Test(timeout = 100000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.CANADA_FRENCH;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) locale0);
      Class<Character> class0 = Character.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting character, got: fr_CA
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 100000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Long> class0 = Long.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      int[] intArray0 = new int[1];
      AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(intArray0);
      String string0 = gson0.toJson((Object) atomicIntegerArray0);
      assertEquals("[0]", string0);
  }

  @Test(timeout = 100000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Integer> class0 = Integer.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("M");
      Class<Integer> class0 = Integer.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"M\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$7", e);
      }
  }

  @Test(timeout = 100000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<Short> class0 = Short.TYPE;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.CANADA_FRENCH;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) locale0);
      Class<Short> class0 = Short.TYPE;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"fr_CA\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 100000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Byte> class0 = Byte.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test64()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      Boolean boolean0 = Boolean.valueOf("");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Gson gson0 = new Gson();
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals(false, object0);
  }

  @Test(timeout = 100000)
  public void test65()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 100000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('4');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      Class<Boolean> class0 = Boolean.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals(false, object0);
  }

  @Test(timeout = 100000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      BitSet bitSet0 = new BitSet();
      bitSet0.set(8);
      String string0 = gson0.toJson((Object) bitSet0);
      assertEquals("[0,0,0,0,0,0,0,0,1]", string0);
  }

  @Test(timeout = 100000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      Byte byte0 = new Byte((byte)20);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) byte0);
      assertFalse(jsonPrimitive0.isString());
  }

  @Test(timeout = 100000)
  public void test69()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short)140);
      String string0 = gson0.toJson((Object) short0);
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test70()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("w-H`OJQ{NRtYhnh");
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was STRING at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test71()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicBoolean atomicBoolean0 = new AtomicBoolean();
      String string0 = gson0.toJson((Object) atomicBoolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 100000)
  public void test72()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(".4ZT33YQ:AuFd I*");
      Class<AtomicInteger> class0 = AtomicInteger.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \".4ZT33YQ:AuFd I*\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$8", e);
      }
  }

  @Test(timeout = 100000)
  public void test73()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicInteger atomicInteger0 = new AtomicInteger((-3269));
      String string0 = gson0.toJson((Object) atomicInteger0);
      assertEquals("-3269", string0);
  }

  @Test(timeout = 100000)
  public void test74()  throws Throwable  {
      Gson gson0 = new Gson();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) inetAddress0);
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 100000)
  public void test75()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Locale> class0 = Locale.class;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.util.Locale. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test76()  throws Throwable  {
      Gson gson0 = new Gson();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(39, 1996, 1996, (-6154), 39);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) mockGregorianCalendar0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 100000)
  public void test77()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      TypeToken<MockGregorianCalendar> typeToken0 = TypeToken.get(class0);
      TypeAdapter<MockGregorianCalendar> typeAdapter0 = gson0.getAdapter(typeToken0);
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(typeToken0, typeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 100000)
  public void test78()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 100000)
  public void test79()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("'");
      Class<Currency> class0 = Currency.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Currency", e);
      }
  }

  @Test(timeout = 100000)
  public void test80()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.CANADA_FRENCH;
      Currency currency0 = Currency.getInstance(locale0);
      String string0 = gson0.toJson((Object) currency0);
      assertEquals("\"CAD\"", string0);
  }
}
