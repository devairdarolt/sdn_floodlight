/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.sdnplatform.sync.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-06-16")
public class SyncValueMessage implements org.apache.thrift.TBase<SyncValueMessage, SyncValueMessage._Fields>, java.io.Serializable, Cloneable, Comparable<SyncValueMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SyncValueMessage");

  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STORE_FIELD_DESC = new org.apache.thrift.protocol.TField("store", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField RESPONSE_TO_FIELD_DESC = new org.apache.thrift.protocol.TField("responseTo", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SyncValueMessageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SyncValueMessageTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable AsyncMessageHeader header; // required
  public @org.apache.thrift.annotation.Nullable Store store; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<KeyedValues> values; // required
  public int responseTo; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    STORE((short)2, "store"),
    VALUES((short)3, "values"),
    RESPONSE_TO((short)4, "responseTo");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HEADER
          return HEADER;
        case 2: // STORE
          return STORE;
        case 3: // VALUES
          return VALUES;
        case 4: // RESPONSE_TO
          return RESPONSE_TO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RESPONSETO_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RESPONSE_TO};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AsyncMessageHeader.class)));
    tmpMap.put(_Fields.STORE, new org.apache.thrift.meta_data.FieldMetaData("store", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Store.class)));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, KeyedValues.class))));
    tmpMap.put(_Fields.RESPONSE_TO, new org.apache.thrift.meta_data.FieldMetaData("responseTo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SyncValueMessage.class, metaDataMap);
  }

  public SyncValueMessage() {
  }

  public SyncValueMessage(
    AsyncMessageHeader header,
    Store store,
    java.util.List<KeyedValues> values)
  {
    this();
    this.header = header;
    this.store = store;
    this.values = values;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SyncValueMessage(SyncValueMessage other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHeader()) {
      this.header = new AsyncMessageHeader(other.header);
    }
    if (other.isSetStore()) {
      this.store = new Store(other.store);
    }
    if (other.isSetValues()) {
      java.util.List<KeyedValues> __this__values = new java.util.ArrayList<KeyedValues>(other.values.size());
      for (KeyedValues other_element : other.values) {
        __this__values.add(new KeyedValues(other_element));
      }
      this.values = __this__values;
    }
    this.responseTo = other.responseTo;
  }

  public SyncValueMessage deepCopy() {
    return new SyncValueMessage(this);
  }

  @Override
  public void clear() {
    this.header = null;
    this.store = null;
    this.values = null;
    setResponseToIsSet(false);
    this.responseTo = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public AsyncMessageHeader getHeader() {
    return this.header;
  }

  public SyncValueMessage setHeader(@org.apache.thrift.annotation.Nullable AsyncMessageHeader header) {
    this.header = header;
    return this;
  }

  public void unsetHeader() {
    this.header = null;
  }

  /** Returns true if field header is set (has been assigned a value) and false otherwise */
  public boolean isSetHeader() {
    return this.header != null;
  }

  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public Store getStore() {
    return this.store;
  }

  public SyncValueMessage setStore(@org.apache.thrift.annotation.Nullable Store store) {
    this.store = store;
    return this;
  }

  public void unsetStore() {
    this.store = null;
  }

  /** Returns true if field store is set (has been assigned a value) and false otherwise */
  public boolean isSetStore() {
    return this.store != null;
  }

  public void setStoreIsSet(boolean value) {
    if (!value) {
      this.store = null;
    }
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<KeyedValues> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }

  public void addToValues(KeyedValues elem) {
    if (this.values == null) {
      this.values = new java.util.ArrayList<KeyedValues>();
    }
    this.values.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<KeyedValues> getValues() {
    return this.values;
  }

  public SyncValueMessage setValues(@org.apache.thrift.annotation.Nullable java.util.List<KeyedValues> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public int getResponseTo() {
    return this.responseTo;
  }

  public SyncValueMessage setResponseTo(int responseTo) {
    this.responseTo = responseTo;
    setResponseToIsSet(true);
    return this;
  }

  public void unsetResponseTo() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RESPONSETO_ISSET_ID);
  }

  /** Returns true if field responseTo is set (has been assigned a value) and false otherwise */
  public boolean isSetResponseTo() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RESPONSETO_ISSET_ID);
  }

  public void setResponseToIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RESPONSETO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((AsyncMessageHeader)value);
      }
      break;

    case STORE:
      if (value == null) {
        unsetStore();
      } else {
        setStore((Store)value);
      }
      break;

    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((java.util.List<KeyedValues>)value);
      }
      break;

    case RESPONSE_TO:
      if (value == null) {
        unsetResponseTo();
      } else {
        setResponseTo((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();

    case STORE:
      return getStore();

    case VALUES:
      return getValues();

    case RESPONSE_TO:
      return getResponseTo();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HEADER:
      return isSetHeader();
    case STORE:
      return isSetStore();
    case VALUES:
      return isSetValues();
    case RESPONSE_TO:
      return isSetResponseTo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SyncValueMessage)
      return this.equals((SyncValueMessage)that);
    return false;
  }

  public boolean equals(SyncValueMessage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }

    boolean this_present_store = true && this.isSetStore();
    boolean that_present_store = true && that.isSetStore();
    if (this_present_store || that_present_store) {
      if (!(this_present_store && that_present_store))
        return false;
      if (!this.store.equals(that.store))
        return false;
    }

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    boolean this_present_responseTo = true && this.isSetResponseTo();
    boolean that_present_responseTo = true && that.isSetResponseTo();
    if (this_present_responseTo || that_present_responseTo) {
      if (!(this_present_responseTo && that_present_responseTo))
        return false;
      if (this.responseTo != that.responseTo)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHeader()) ? 131071 : 524287);
    if (isSetHeader())
      hashCode = hashCode * 8191 + header.hashCode();

    hashCode = hashCode * 8191 + ((isSetStore()) ? 131071 : 524287);
    if (isSetStore())
      hashCode = hashCode * 8191 + store.hashCode();

    hashCode = hashCode * 8191 + ((isSetValues()) ? 131071 : 524287);
    if (isSetValues())
      hashCode = hashCode * 8191 + values.hashCode();

    hashCode = hashCode * 8191 + ((isSetResponseTo()) ? 131071 : 524287);
    if (isSetResponseTo())
      hashCode = hashCode * 8191 + responseTo;

    return hashCode;
  }

  @Override
  public int compareTo(SyncValueMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHeader()).compareTo(other.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, other.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStore()).compareTo(other.isSetStore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.store, other.store);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetResponseTo()).compareTo(other.isSetResponseTo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponseTo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.responseTo, other.responseTo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SyncValueMessage(");
    boolean first = true;

    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("store:");
    if (this.store == null) {
      sb.append("null");
    } else {
      sb.append(this.store);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
    }
    first = false;
    if (isSetResponseTo()) {
      if (!first) sb.append(", ");
      sb.append("responseTo:");
      sb.append(this.responseTo);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (header == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'header' was not present! Struct: " + toString());
    }
    if (store == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'store' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (header != null) {
      header.validate();
    }
    if (store != null) {
      store.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SyncValueMessageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SyncValueMessageStandardScheme getScheme() {
      return new SyncValueMessageStandardScheme();
    }
  }

  private static class SyncValueMessageStandardScheme extends org.apache.thrift.scheme.StandardScheme<SyncValueMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SyncValueMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.header = new AsyncMessageHeader();
              struct.header.read(iprot);
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STORE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.store = new Store();
              struct.store.read(iprot);
              struct.setStoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.values = new java.util.ArrayList<KeyedValues>(_list32.size);
                @org.apache.thrift.annotation.Nullable KeyedValues _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = new KeyedValues();
                  _elem33.read(iprot);
                  struct.values.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RESPONSE_TO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.responseTo = iprot.readI32();
              struct.setResponseToIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SyncValueMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.store != null) {
        oprot.writeFieldBegin(STORE_FIELD_DESC);
        struct.store.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.values.size()));
          for (KeyedValues _iter35 : struct.values)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetResponseTo()) {
        oprot.writeFieldBegin(RESPONSE_TO_FIELD_DESC);
        oprot.writeI32(struct.responseTo);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SyncValueMessageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SyncValueMessageTupleScheme getScheme() {
      return new SyncValueMessageTupleScheme();
    }
  }

  private static class SyncValueMessageTupleScheme extends org.apache.thrift.scheme.TupleScheme<SyncValueMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SyncValueMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.header.write(oprot);
      struct.store.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetValues()) {
        optionals.set(0);
      }
      if (struct.isSetResponseTo()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (KeyedValues _iter36 : struct.values)
          {
            _iter36.write(oprot);
          }
        }
      }
      if (struct.isSetResponseTo()) {
        oprot.writeI32(struct.responseTo);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SyncValueMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.header = new AsyncMessageHeader();
      struct.header.read(iprot);
      struct.setHeaderIsSet(true);
      struct.store = new Store();
      struct.store.read(iprot);
      struct.setStoreIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.values = new java.util.ArrayList<KeyedValues>(_list37.size);
          @org.apache.thrift.annotation.Nullable KeyedValues _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = new KeyedValues();
            _elem38.read(iprot);
            struct.values.add(_elem38);
          }
        }
        struct.setValuesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.responseTo = iprot.readI32();
        struct.setResponseToIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

