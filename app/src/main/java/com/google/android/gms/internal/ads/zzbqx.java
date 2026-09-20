package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.p56;
import defpackage.q56;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqx extends com.google.android.gms.ads.internal.zzc {
    public zzbqx(Context context, Looper looper, p56 p56Var, q56 q56Var) {
        super(zzcbo.zza(context), looper, 166, p56Var, q56Var);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof zzbre ? (zzbre) iInterfaceQueryLocalInterface : new zzbre(iBinder);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String h() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String i() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final zzbre zzp() {
        return (zzbre) super.getService();
    }
}
