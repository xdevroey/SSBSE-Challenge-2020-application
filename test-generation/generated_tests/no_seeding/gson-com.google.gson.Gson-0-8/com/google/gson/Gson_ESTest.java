/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 15:46:12 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.URI;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Gson_ESTest extends Gson_ESTest_scaffolding {

  @Test(timeout = 100000)
  public void test00()  throws Throwable  {
      Gson gson0 = new Gson();
      Integer integer0 = new Integer(3870);
      Class<Short> class0 = Short.TYPE;
      MockPrintStream mockPrintStream0 = new MockPrintStream("-Infinity");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      gson0.toJson((Object) integer0, (Type) class0, (Appendable) mockPrintWriter0);
  }

  @Test(timeout = 100000)
  public void test01()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      TypeToken<String> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      JsonWriter jsonWriter0 = gson0.newJsonWriter(charArrayWriter0);
      gson0.toJson((Object) null, type0, jsonWriter0);
  }

  @Test(timeout = 100000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      StringWriter stringWriter0 = new StringWriter();
      gson0.toJson((JsonElement) jsonArray0, (Appendable) stringWriter0);
  }

  @Test(timeout = 100000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(filterOutputStream0, true);
      JsonWriter jsonWriter0 = new JsonWriter(mockPrintWriter0);
      gson0.toJson((JsonElement) jsonArray0, jsonWriter0);
  }

  @Test(timeout = 100000)
  public void test04()  throws Throwable  {
      Gson.FutureTypeAdapter<BigInteger> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<BigInteger>();
      // Undeclared exception!
      try { 
        gson_FutureTypeAdapter0.read((JsonReader) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson$FutureTypeAdapter", e);
      }
  }

  @Test(timeout = 100000)
  public void test05()  throws Throwable  {
      Gson.checkValidFloatingPoint(3231.0873119964);
  }

  @Test(timeout = 100000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader(" behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      TypeToken<AtomicLongArray> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      try { 
        gson0.fromJson((Reader) stringReader0, type0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was STRING at line 1 column 2 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      gson0.fromJson("78", class0);
  }

  @Test(timeout = 100000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(42);
      StringWriter stringWriter0 = new StringWriter();
      gson0.toJson((Object) atomicLongArray0, (Appendable) stringWriter0);
  }

  @Test(timeout = 100000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      try { 
        gson0.fromJson("|/(~Nnh\"Zj#Kht[z", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 3 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      BigInteger bigInteger0 = BigInteger.ZERO;
      Class<Double> class0 = Double.TYPE;
      gson0.toJsonTree((Object) bigInteger0, (Type) class0);
  }

  @Test(timeout = 100000)
  public void test11()  throws Throwable  {
      Class<Excluder> class0 = Excluder.class;
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      gson0.toJsonTree((Object) excluder0, (Type) class0);
  }

  @Test(timeout = 100000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      Class<? super Integer> class1 = typeToken0.getRawType();
      gson0.toJson((Object) null, (Type) class1);
  }

  @Test(timeout = 100000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("");
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      gson0.fromJson((Reader) stringReader0, (Type) class0);
  }

  @Test(timeout = 100000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("");
      Class<Byte> class0 = Byte.class;
      gson0.fromJson((Reader) stringReader0, class0);
  }

  @Test(timeout = 100000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      LongSerializationPolicy longSerializationPolicy0 = LongSerializationPolicy.STRING;
      JsonElement jsonElement0 = longSerializationPolicy0.serialize((Long) null);
      Class<Object> class0 = Object.class;
      TypeToken<Object> typeToken0 = TypeToken.get(class0);
      Class<? super Object> class1 = typeToken0.getRawType();
      gson0.fromJson(jsonElement0, (Type) class1);
  }

  @Test(timeout = 100000)
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<Object> class0 = Object.class;
      gson0.fromJson((JsonElement) jsonObject0, class0);
  }

  @Test(timeout = 100000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLong atomicLong0 = new AtomicLong(4383L);
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) atomicLong0, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 100000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0, (Type) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 100000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      String string0 = gson0.toString();
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) string0, (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.concurrent.atomic.AtomicLongArray
         //
         verifyException("com.google.gson.Gson$5", e);
      }
  }

  @Test(timeout = 100000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: com.google.gson.internal.Excluder. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      TypeToken<AtomicLongArray> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) "iO^", type0, (Appendable) charArrayWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.concurrent.atomic.AtomicLongArray
         //
         verifyException("com.google.gson.Gson$5", e);
      }
  }

  @Test(timeout = 100000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      Byte byte0 = new Byte((byte)120);
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = gson0.newJsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) byte0, (Type) null, jsonWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 100000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      Excluder excluder0 = Excluder.DEFAULT;
      StringWriter stringWriter0 = new StringWriter();
      BufferedWriter bufferedWriter0 = new BufferedWriter(stringWriter0);
      JsonWriter jsonWriter0 = new JsonWriter(bufferedWriter0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) excluder0, (Type) class0, jsonWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.Excluder cannot be cast to java.lang.String
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$16", e);
      }
  }

  @Test(timeout = 100000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      Double double0 = new Double((-436.73));
      // Undeclared exception!
      try { 
        gson0.toJson((Object) double0, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 100000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Type) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 100000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      PipedWriter pipedWriter0 = new PipedWriter();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Appendable) pipedWriter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.Double. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      // Undeclared exception!
      gson0.toJson((Object) mockPrintWriter0);
  }

  @Test(timeout = 100000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: byte. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 100000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        gson0.toJson((JsonElement) jsonObject0, (Appendable) pipedWriter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson("Yf9z+ ", (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 100000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson("com.google.gson.TypeAdapter$1", (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 100000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("UPPER_CAMEL_CASE", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for interface java.lang.annotation.Annotation. Registering an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 100000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson("", (Class<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      StringReader stringReader0 = new StringReader("xp0oK#_o=8=YnpZUy");
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) stringReader0, (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 100000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      Class<Long> class0 = Long.TYPE;
      try { 
        gson0.fromJson((Reader) pipedReader0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("ijew.");
      Class<Double> class0 = Double.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) stringReader0, class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 100000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader(23);
      Class<BigInteger> class0 = BigInteger.class;
      try { 
        gson0.fromJson((Reader) pipedReader0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      StringReader stringReader0 = new StringReader("GSON cannot serialize ");
      JsonReader jsonReader0 = gson0.newJsonReader(stringReader0);
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonReader0, (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 100000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonReader) null, (Type) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<Short> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Short>();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson_FutureTypeAdapter0);
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonElement0, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 100000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<Short> class0 = Short.TYPE;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<Short> class0 = Short.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.fromJson((JsonElement) null, (Type) null);
  }

  @Test(timeout = 100000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      StringReader stringReader0 = new StringReader("");
      JsonReader jsonReader0 = gson0.newJsonReader(stringReader0);
      gson0.fromJson(jsonReader0, (Type) class0);
  }

  @Test(timeout = 100000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      gson0.fromJson((String) null, (Type) class0);
  }

  @Test(timeout = 100000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      try { 
        gson0.fromJson("\\", (Type) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected value at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.newJsonWriter((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // out == null
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 100000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      TypeToken<Excluder> typeToken0 = TypeToken.get(class0);
      gson0.getAdapter(typeToken0);
  }

  @Test(timeout = 100000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$7", e);
      }
  }

  @Test(timeout = 100000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        gson0.toJson((JsonElement) jsonObject0, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 100000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.newJsonReader((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in == null
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 100000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<AtomicLongArray> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<AtomicLongArray>();
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) gson_FutureTypeAdapter0, (Type) class0, (JsonWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) null, (Type) class0, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 100000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = new Float((float) 2);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) float0);
      // Undeclared exception!
      try { 
        gson0.toJson(jsonElement0, (JsonWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) null, (Type) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in == null
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 100000)
  public void test56()  throws Throwable  {
      Gson.FutureTypeAdapter<AtomicLong> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<AtomicLong>();
      // Undeclared exception!
      try { 
        gson_FutureTypeAdapter0.toJsonTree((AtomicLong) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson$FutureTypeAdapter", e);
      }
  }

  @Test(timeout = 100000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<AtomicLong> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<AtomicLong>();
      Class<AtomicLong> class0 = AtomicLong.class;
      TypeToken<AtomicLong> typeToken0 = TypeToken.get(class0);
      TypeAdapter<AtomicLong> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) null, typeToken0);
      gson_FutureTypeAdapter0.setDelegate(typeAdapter0);
      gson_FutureTypeAdapter0.toJsonTree((AtomicLong) null);
  }

  @Test(timeout = 100000)
  public void test58()  throws Throwable  {
      Gson.FutureTypeAdapter<Byte> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Byte>();
      Gson.FutureTypeAdapter<Byte> gson_FutureTypeAdapter1 = new Gson.FutureTypeAdapter<Byte>();
      gson_FutureTypeAdapter0.setDelegate(gson_FutureTypeAdapter1);
      // Undeclared exception!
      try { 
        gson_FutureTypeAdapter0.fromJson("?CiekhrWI30l3");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson$FutureTypeAdapter", e);
      }
  }

  @Test(timeout = 100000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      gson0.fromJson("", class0);
  }

  @Test(timeout = 100000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      StringReader stringReader0 = new StringReader("{B");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      try { 
        gson0.fromJson(jsonReader0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.EOFException: End of input at line 1 column 3 path $.B
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(gson0);
      
      PipedWriter pipedWriter0 = new PipedWriter();
      assertNotNull(pipedWriter0);
      
      // Undeclared exception!
      gson0.toJson((Object) pipedWriter0, (Appendable) pipedWriter0);
  }

  @Test(timeout = 100000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(gson0);
      
      PipedWriter pipedWriter0 = new PipedWriter();
      assertNotNull(pipedWriter0);
      
      try { 
        gson0.toJson((Object) null, (Appendable) pipedWriter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertNotNull(gson0);
      
      String string0 = gson0.toJson((Object) null);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertNotNull(string0);
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(gson0);
      
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertFalse(jsonElement0.isJsonObject());
      assertFalse(jsonElement0.isJsonArray());
      assertFalse(jsonElement0.isJsonPrimitive());
      assertTrue(jsonElement0.isJsonNull());
      assertNotNull(jsonElement0);
  }

  @Test(timeout = 100000)
  public void test65()  throws Throwable  {
      Gson gson0 = new Gson();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(gson0);
      
      Excluder excluder0 = Excluder.DEFAULT;
      assertNotNull(excluder0);
      
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, (TypeToken<Double>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 100000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertNotNull(gson0);
      
      Class<Double> class0 = Double.TYPE;
      assertFalse(class0.isAnnotation());
      assertFalse(class0.isEnum());
      assertEquals(1041, class0.getModifiers());
      assertTrue(class0.isPrimitive());
      assertFalse(class0.isInterface());
      assertFalse(class0.isArray());
      assertEquals("double", class0.toString());
      assertFalse(class0.isSynthetic());
      assertNotNull(class0);
      
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      assertFalse(class0.isAnnotation());
      assertFalse(class0.isEnum());
      assertEquals(1041, class0.getModifiers());
      assertTrue(class0.isPrimitive());
      assertFalse(class0.isInterface());
      assertFalse(class0.isArray());
      assertEquals("double", class0.toString());
      assertFalse(class0.isSynthetic());
      assertNotNull(typeToken0);
      
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) null, typeToken0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // GSON cannot serialize double
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      gson0.toJsonTree((Object) pipedReader0);
  }

  @Test(timeout = 100000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.getAdapter((TypeToken<Excluder>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 100000)
  public void test69()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(45);
      gson0.toJsonTree((Object) atomicLongArray0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 100000)
  public void test70()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      gson0.fromJson("null", class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 100000)
  public void test71()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("|T}le?7Vb]gb|", class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 100000)
  public void test72()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null, (Type) class0);
      gson0.fromJson(jsonElement0, (Type) class0);
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 100000)
  public void test73()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLong atomicLong0 = new AtomicLong(0L);
      gson0.toJsonTree((Object) atomicLong0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 100000)
  public void test74()  throws Throwable  {
      Gson gson0 = new Gson();
      FieldNamingStrategy fieldNamingStrategy0 = gson0.fieldNamingStrategy();
      assertTrue(gson0.htmlSafe());
      assertNotNull(fieldNamingStrategy0);
  }

  @Test(timeout = 100000)
  public void test75()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.newBuilder();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 100000)
  public void test76()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      TypeAdapter<AtomicLongArray> typeAdapter0 = gson0.getAdapter(class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(typeAdapter0);
  }

  @Test(timeout = 100000)
  public void test77()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = gson0.excluder();
      Class<Double> class0 = Double.class;
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Double> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, typeToken0);
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        gson0.toJson((Object) typeAdapter0, (Appendable) pipedWriter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 100000)
  public void test78()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.htmlSafe();
      assertFalse(gson0.serializeNulls());
      assertTrue(boolean0);
  }

  @Test(timeout = 100000)
  public void test79()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      gson0.fromJson((JsonElement) null, class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 100000)
  public void test80()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in == null
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 100000)
  public void test81()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((JsonElement) null);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertEquals("null", string0);
  }

  @Test(timeout = 100000)
  public void test82()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.serializeNulls();
      assertFalse(boolean0);
      assertTrue(gson0.htmlSafe());
  }
}
