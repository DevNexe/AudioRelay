package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcfy {

    @GuardedBy("this")
    public BigInteger a = BigInteger.ONE;

    @GuardedBy("this")
    public String b = "0";

    public final synchronized String zza() {
        String string;
        string = this.a.toString();
        this.a = this.a.add(BigInteger.ONE);
        this.b = string;
        return string;
    }

    public final synchronized String zzb() {
        return this.b;
    }
}
