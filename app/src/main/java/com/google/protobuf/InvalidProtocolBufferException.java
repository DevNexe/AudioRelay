package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidProtocolBufferException extends IOException {
    public static final /* synthetic */ int x = 0;
    public DzVS w;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.w = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    public static InvalidProtocolBufferException f() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void e(DzVS dzVS) {
        this.w = dzVS;
    }

    public final IOException g() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.w = null;
    }
}
