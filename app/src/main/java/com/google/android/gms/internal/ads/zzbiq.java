package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import defpackage.l46;
import defpackage.m46;
import defpackage.n46;
import defpackage.o46;
import defpackage.p46;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbiq {
    public final int a;
    public final String b;
    public final Object c;

    public /* synthetic */ zzbiq(int i, String str, Object obj) {
        this.a = i;
        this.b = str;
        this.c = obj;
        com.google.android.gms.ads.internal.client.zzay.zza().zzd(this);
    }

    public static zzbiq zzf(int i, String str, float f) {
        return new o46(str, Float.valueOf(f));
    }

    public static zzbiq zzg(int i, String str, int i2) {
        return new m46(str, Integer.valueOf(i2));
    }

    public static zzbiq zzh(int i, String str, long j) {
        return new n46(str, Long.valueOf(j));
    }

    public static zzbiq zzi(int i, String str, Boolean bool) {
        return new l46(i, str, bool);
    }

    public static zzbiq zzj(int i, String str, String str2) {
        return new p46(str, str2);
    }

    public static zzbiq zzk(int i, String str) {
        zzbiq zzbiqVarZzj = zzj(1, "gads:sdk_core_constants:experiment_id", null);
        com.google.android.gms.ads.internal.client.zzay.zza().zzc(zzbiqVarZzj);
        return zzbiqVarZzj;
    }

    public abstract Object a(JSONObject jSONObject);

    public abstract Object b(SharedPreferences sharedPreferences);

    public abstract Object zzb(Bundle bundle);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.a;
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzay.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.c;
    }

    public final String zzn() {
        return this.b;
    }
}
