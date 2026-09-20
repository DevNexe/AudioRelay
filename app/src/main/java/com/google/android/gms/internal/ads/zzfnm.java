package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnm extends com.google.android.gms.ads.internal.zzc {
    public final int E;

    public zzfnm(Context context, Looper looper, com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx interfaceC0075QnHx, com.google.android.gms.common.internal.QnHx.CQf cQf, int i) {
        super(context, looper, 116, interfaceC0075QnHx, cQf);
        this.E = i;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof zzfnr ? (zzfnr) iInterfaceQueryLocalInterface : new zzfnr(iBinder);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final int getMinApkVersion() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String h() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String i() {
        return "com.google.android.gms.gass.START";
    }

    public final zzfnr zzp() {
        return (zzfnr) super.getService();
    }
}
