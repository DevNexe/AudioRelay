package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class zzct {
    public int a;
    public int b;
    public boolean c;
    public final zzfuv d;
    public final zzfuv e;
    public final zzfuv f;
    public zzfuv g;
    public int h;
    public final HashMap i;
    public final HashSet j;

    @Deprecated
    public zzct() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = true;
        this.d = zzfuv.zzo();
        this.e = zzfuv.zzo();
        this.f = zzfuv.zzo();
        this.g = zzfuv.zzo();
        this.h = 0;
        this.i = new HashMap();
        this.j = new HashSet();
    }

    public final zzct zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzel.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.h = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.g = zzfuv.zzp(zzel.zzN(locale));
            }
        }
        return this;
    }

    public zzct zze(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = true;
        return this;
    }

    public zzct(zzcu zzcuVar) {
        this.a = zzcuVar.zzl;
        this.b = zzcuVar.zzm;
        this.c = zzcuVar.zzn;
        this.d = zzcuVar.zzo;
        this.e = zzcuVar.zzq;
        this.f = zzcuVar.zzu;
        this.g = zzcuVar.zzv;
        this.h = zzcuVar.zzw;
        this.j = new HashSet(zzcuVar.zzC);
        this.i = new HashMap(zzcuVar.zzB);
    }
}
