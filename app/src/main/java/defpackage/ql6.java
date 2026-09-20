package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.internal.ads.zzfng;
import com.google.android.gms.internal.ads.zzfnk;
import com.google.android.gms.internal.ads.zzfnm;

/* JADX INFO: loaded from: classes3.dex */
public final class ql6 implements QnHx.InterfaceC0075QnHx, QnHx.CQf {
    public final zzfnm a;
    public final zzfng b;
    public final Object c = new Object();
    public boolean d = false;
    public boolean e = false;

    public ql6(Context context, Looper looper, zzfng zzfngVar) {
        this.b = zzfngVar;
        this.a = new zzfnm(context, looper, this, this, 12800000);
    }

    public final void a() {
        synchronized (this.c) {
            if (this.a.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        synchronized (this.c) {
            if (this.e) {
                return;
            }
            this.e = true;
            try {
                this.a.zzp().zzg(new zzfnk(this.b.zzaw()));
            } catch (Exception unused) {
            } finally {
                a();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.CQf
    public final void onConnectionFailed(z50 z50Var) {
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnectionSuspended(int i) {
    }
}
