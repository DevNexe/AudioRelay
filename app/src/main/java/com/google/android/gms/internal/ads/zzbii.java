package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import defpackage.so5;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbii {
    public final Context a;

    public zzbii(Context context) {
        if (context == null) {
            throw new NullPointerException("Context can not be null");
        }
        this.a = context;
    }

    public final boolean zza(Intent intent) {
        if (intent != null) {
            return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        }
        throw new NullPointerException("Intent can not be null");
    }

    public final boolean zzb() {
        return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc() {
        zzbih zzbihVar = new Callable() { // from class: com.google.android.gms.internal.ads.zzbih
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        };
        Context context = this.a;
        return ((Boolean) com.google.android.gms.ads.internal.util.zzcb.zza(context, zzbihVar)).booleanValue() && so5.a(context).a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
