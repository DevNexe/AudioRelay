package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public enum zzgpb {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(zzgnf.class, zzgnf.zzb),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class w;
    public final Object x;

    zzgpb(Class cls, Serializable serializable) {
        this.w = cls;
        this.x = serializable;
    }

    public final Class zza() {
        return this.w;
    }
}
