package com.google.android.gms.internal.ads;

import defpackage.dr6;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgba {
    public final ConcurrentMap a;
    public final zzgau b;
    public final Class c;

    public /* synthetic */ zzgba(ConcurrentMap concurrentMap, zzgau zzgauVar, Class cls) {
        this.a = concurrentMap;
        this.b = zzgauVar;
        this.c = cls;
    }

    @Nullable
    public final zzgau zza() {
        return this.b;
    }

    public final Class zzb() {
        return this.c;
    }

    public final List zzc(byte[] bArr) {
        List list = (List) this.a.get(new dr6(bArr));
        return list != null ? list : Collections.emptyList();
    }
}
