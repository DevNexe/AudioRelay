package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzgoz extends IOException {
    public zzgpx w;
    public boolean x;

    public zzgoz(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzgoy a() {
        return new zzgoy("Protocol message tag had invalid wire type.");
    }

    public static zzgoz b() {
        return new zzgoz("Protocol message had invalid UTF-8.");
    }

    public static zzgoz c() {
        return new zzgoz("CodedInputStream encountered a malformed varint.");
    }

    public static zzgoz d() {
        return new zzgoz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzgoz e() {
        return new zzgoz("Failed to parse the message.");
    }

    public static zzgoz f() {
        return new zzgoz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgoz zzh(zzgpx zzgpxVar) {
        this.w = zzgpxVar;
        return this;
    }

    public zzgoz(String str) {
        super(str);
    }
}
