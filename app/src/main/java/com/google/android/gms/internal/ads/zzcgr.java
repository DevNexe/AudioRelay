package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcgr {
    public static Context zza(Context context) throws zzcgq {
        try {
            return DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).a;
        } catch (Exception e) {
            throw new zzcgq(e);
        }
    }

    public static Object zzb(Context context, String str, zzcgp zzcgpVar) throws zzcgq {
        try {
            try {
                return zzcgpVar.zza(DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).b(str));
            } catch (Exception e) {
                throw new zzcgq(e);
            }
        } catch (Exception e2) {
            throw new zzcgq(e2);
        }
    }
}
