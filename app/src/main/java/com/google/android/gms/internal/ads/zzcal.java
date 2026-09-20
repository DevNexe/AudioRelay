package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcal extends com.google.android.gms.ads.internal.zzc {
    public zzcal(Context context, Looper looper, com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx interfaceC0075QnHx, com.google.android.gms.common.internal.QnHx.CQf cQf) {
        super(zzcbo.zza(context), looper, 8, interfaceC0075QnHx, cQf);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof zzcas ? (zzcas) iInterfaceQueryLocalInterface : new zzcaq(iBinder);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String h() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String i() {
        return "com.google.android.gms.ads.service.START";
    }

    public final zzcas zzp() {
        return (zzcas) super.getService();
    }
}
