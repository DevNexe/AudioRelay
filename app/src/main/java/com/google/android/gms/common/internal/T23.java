package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class T23 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ QnHx b;

    public T23(QnHx qnHx, int i) {
        this.b = qnHx;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        QnHx qnHx = this.b;
        if (iBinder == null) {
            synchronized (qnHx.m) {
                i = qnHx.t;
            }
            if (i == 3) {
                qnHx.A = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            auxFixed auxVar = qnHx.l;
            auxVar.sendMessage(auxVar.obtainMessage(i2, qnHx.C.get(), 16));
            return;
        }
        synchronized (qnHx.n) {
            QnHx qnHx2 = this.b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            qnHx2.o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new zzac(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface;
        }
        QnHx qnHx3 = this.b;
        int i3 = this.a;
        qnHx3.getClass();
        EQ eq = new EQ(qnHx3, 0);
        auxFixed auxVar2 = qnHx3.l;
        auxVar2.sendMessage(auxVar2.obtainMessage(7, i3, -1, eq));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        QnHx qnHx;
        synchronized (this.b.n) {
            qnHx = this.b;
            qnHx.o = null;
        }
        auxFixed auxVar = qnHx.l;
        auxVar.sendMessage(auxVar.obtainMessage(6, this.a, 1));
    }
}
