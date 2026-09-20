package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfgx {
    public final Object a;
    public final List b;
    public final /* synthetic */ zzfhh c;

    public /* synthetic */ zzfgx(zzfhh zzfhhVar, Object obj, List list) {
        this.c = zzfhhVar;
        this.a = obj;
        this.b = list;
    }

    public final zzfhg zza(Callable callable) {
        zzfyn zzfynVarZzc = zzfyo.zzc(this.b);
        zzfyx zzfyxVarZza = zzfynVarZzc.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfgv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcha.zzf);
        Object obj = this.a;
        List list = this.b;
        zzfhh zzfhhVar = this.c;
        return new zzfhg(zzfhhVar, obj, zzfyxVarZza, list, zzfynVarZzc.zza(callable, zzfhhVar.a));
    }
}
