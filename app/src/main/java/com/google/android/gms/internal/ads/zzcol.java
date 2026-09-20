package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcol {
    public zzcgt a;
    public Context b;
    public WeakReference c;

    public final zzcol zzc(Context context) {
        this.c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.b = context;
        return this;
    }

    public final zzcol zzd(zzcgt zzcgtVar) {
        this.a = zzcgtVar;
        return this;
    }
}
