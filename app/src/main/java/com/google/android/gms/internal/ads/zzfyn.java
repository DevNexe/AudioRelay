package com.google.android.gms.internal.ads;

import defpackage.eq6;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfyn {
    public final boolean a;
    public final zzfuv b;

    public /* synthetic */ zzfyn(boolean z, zzfuv zzfuvVar) {
        this.a = z;
        this.b = zzfuvVar;
    }

    public final zzfyx zza(Callable callable, Executor executor) {
        return new eq6(this.b, this.a, executor, callable);
    }
}
