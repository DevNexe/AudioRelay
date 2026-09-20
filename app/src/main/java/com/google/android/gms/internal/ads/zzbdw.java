package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.zzg;
import defpackage.tq2;
import defpackage.tw0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdw extends com.google.android.gms.ads.internal.zzc {
    public zzbdw(Context context, Looper looper, com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx interfaceC0075QnHx, com.google.android.gms.common.internal.QnHx.CQf cQf) {
        super(zzcbo.zza(context), looper, 123, interfaceC0075QnHx, cQf);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof zzbdz ? (zzbdz) iInterfaceQueryLocalInterface : new zzbdz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final tw0[] getApiFeatures() {
        return zzg.zzb;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String h() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String i() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[RETURN] */
    public final boolean zzp() {
        boolean z;
        tw0[] availableFeatures = getAvailableFeatures();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue()) {
            tw0 tw0Var = zzg.zza;
            int length = availableFeatures != null ? availableFeatures.length : 0;
            int i = 0;
            while (i < length) {
                if (tq2.a(availableFeatures[i], tw0Var)) {
                    z = i >= 0;
                    if (z) {
                        return true;
                    }
                } else {
                    i++;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final zzbdz zzq() {
        return (zzbdz) super.getService();
    }
}
