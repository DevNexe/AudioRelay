package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import defpackage.z50;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzecf implements com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx, com.google.android.gms.common.internal.QnHx.CQf {
    public final zzchf a = new zzchf();
    public final Object b = new Object();
    public boolean c = false;
    public boolean d = false;
    public zzcba e;
    public zzcal f;

    public final void a() {
        synchronized (this.b) {
            this.d = true;
            if (this.f.isConnected() || this.f.isConnecting()) {
                this.f.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(z50 z50Var) {
        zzcgn.zze("Disconnected from remote ad request service.");
        this.a.zze(new zzecu(1));
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnectionSuspended(int i) {
        zzcgn.zze("Cannot connect to remote service, fallback to local instance.");
    }
}
