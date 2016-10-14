package org.web3j.abi.datatypes;

/**
 * Dynamically allocated sequence of bytes.
 */
public class DynamicBytes extends BytesType {

    public static final String TYPE_NAME = "bytes";

    public DynamicBytes(byte[] value) {
        super(value, TYPE_NAME);
    }
}