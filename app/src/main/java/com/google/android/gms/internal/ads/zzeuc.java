package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.so5;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeuc implements zzeun {
    public final zzfyy a;
    public final Context b;
    public final zzcgt c;

    public zzeuc(zzfyy zzfyyVar, Context context, zzcgt zzcgtVar) {
        this.a = zzfyyVar;
        this.b = context;
        this.c = zzcgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeub
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeuc zzeucVar = this.zza;
                Context context = zzeucVar.b;
                boolean zC = so5.a(context).c();
                com.google.android.gms.ads.internal.zzt.zzq();
                boolean zZzA = com.google.android.gms.ads.internal.util.zzs.zzA(context);
                String str = zzeucVar.c.zza;
                com.google.android.gms.ads.internal.zzt.zzq();
                boolean zZzB = com.google.android.gms.ads.internal.util.zzs.zzB();
                com.google.android.gms.ads.internal.zzt.zzq();
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return new zzeud(zC, zZzA, str, zZzB, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID));
            }
        });
    }
}
