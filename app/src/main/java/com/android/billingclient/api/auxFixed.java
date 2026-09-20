package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzd;
import com.google.android.gms.internal.play_billing.zze;
import defpackage.a36;
import defpackage.fa;
import defpackage.iw5;
import defpackage.wv5;

/* JADX INFO: loaded from: classes.dex */
public final class auxFixed implements ServiceConnection {
    public final Object a = new Object();
    public boolean b = false;
    public fa c;
    public final /* synthetic */ CQf d;

    public /* synthetic */ auxFixed(CQf cQf, fa faVar) {
        this.d = cQf;
        this.c = faVar;
    }

    public final void a(NUlFixed nUl) {
        synchronized (this.a) {
            fa faVar = this.c;
            if (faVar != null) {
                faVar.onBillingSetupFinished(nUl);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zze zzcVar;
        a36.e("BillingClient", "Billing service connected.");
        CQf cQf = this.d;
        int i = zzd.w;
        if (iBinder == null) {
            zzcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            zzcVar = iInterfaceQueryLocalInterface instanceof zze ? (zze) iInterfaceQueryLocalInterface : new zzc(iBinder);
        }
        cQf.f = zzcVar;
        CQf cQf2 = this.d;
        if (cQf2.o(new iw5(this, 0), 30000L, new wv5(this, 0), cQf2.k()) == null) {
            a(this.d.m());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a36.f("BillingClient", "Billing service disconnected.");
        this.d.f = null;
        this.d.a = 0;
        synchronized (this.a) {
            fa faVar = this.c;
            if (faVar != null) {
                faVar.onBillingServiceDisconnected();
            }
        }
    }
}
