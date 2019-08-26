package org.omg.IOP;


/**
* org/omg/IOP/MultipleComponentProfileHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Friday, April 10, 2015 11:48:12 AM PDT
*/


/** An array of tagged components, forming a multiple component profile. */
abstract public class MultipleComponentProfileHelper
{
  private static String  _id = "IDL:omg.org/IOP/MultipleComponentProfile:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.IOP.TaggedComponent[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.IOP.TaggedComponent[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.IOP.TaggedComponentHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.IOP.MultipleComponentProfileHelper.id (), "MultipleComponentProfile", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.IOP.TaggedComponent[] read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.IOP.TaggedComponent value[] = null;
    int _len0 = istream.read_long ();
    value = new org.omg.IOP.TaggedComponent[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = org.omg.IOP.TaggedComponentHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.IOP.TaggedComponent[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      org.omg.IOP.TaggedComponentHelper.write (ostream, value[_i0]);
  }

}
