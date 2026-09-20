package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import defpackage.oa3;
import defpackage.wr5;
import defpackage.z50;

/* JADX INFO: loaded from: classes.dex */
public final class byN extends wr5 {
    public final IBinder g;
    public final /* synthetic */ QnHx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byN(QnHx qnHx, int i, IBinder iBinder, Bundle bundle) {
        super(qnHx, i, bundle);
        this.h = qnHx;
        this.g = iBinder;
    }

    @Override // defpackage.wr5
    public final void c(z50 z50Var) {
        QnHx qnHx = this.h;
        QnHx.CQf cQf = qnHx.v;
        if (cQf != null) {
            cQf.onConnectionFailed(z50Var);
        }
        qnHx.k(z50Var);
    }

    @Override // defpackage.wr5
    public final boolean d() {
        IBinder iBinder = this.g;
        try {
            oa3.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            QnHx qnHx = this.h;
            if (!qnHx.h().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + qnHx.h() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceD = qnHx.d(iBinder);
            if (iInterfaceD == null || !(QnHx.l(qnHx, 2, 4, iInterfaceD) || QnHx.l(qnHx, 3, 4, iInterfaceD))) {
                return false;
            }
            qnHx.z = null;
            Bundle connectionHint = qnHx.getConnectionHint();
            QnHx.InterfaceC0075QnHx interfaceC0075QnHx = qnHx.u;
            if (interfaceC0075QnHx == null) {
                return true;
            }
            interfaceC0075QnHx.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
