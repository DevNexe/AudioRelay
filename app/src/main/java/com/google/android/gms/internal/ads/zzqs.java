package com.google.android.gms.internal.ads;

import defpackage.ka7;
import java.util.Comparator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzqs implements Comparator {
    public final /* synthetic */ ka7 zza;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ka7 ka7Var = this.zza;
        Pattern pattern = zzrd.a;
        return ka7Var.zza(obj2) - ka7Var.zza(obj);
    }
}
