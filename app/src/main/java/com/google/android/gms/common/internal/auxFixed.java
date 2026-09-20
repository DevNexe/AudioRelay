package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import defpackage.e76;
import defpackage.yx6;
import defpackage.z50;

/* JADX INFO: loaded from: classes.dex */
public final class auxFixed extends yx6 {
    public final /* synthetic */ QnHx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auxFixed(QnHx qnHx, Looper looper) {
        super(looper);
        this.a = qnHx;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x01af  */
    /* JADX WARN: Code duplicated, block: B:170:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        e76 e76Var;
        Object obj;
        boolean z = false;
        if (this.a.C.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                e76 e76Var2 = (e76) message.obj;
                e76Var2.b();
                synchronized (e76Var2) {
                    e76Var2.a = null;
                }
                synchronized (e76Var2.c.r) {
                    e76Var2.c.r.remove(e76Var2);
                }
                return;
            }
            return;
        }
        int i2 = message.what;
        if (i2 != 1 && i2 != 7) {
            if (i2 == 4) {
                this.a.getClass();
            } else if (i2 == 5) {
            }
            if (!this.a.isConnecting()) {
                e76Var = (e76) message.obj;
                e76Var.b();
                synchronized (e76Var) {
                    e76Var.a = null;
                    synchronized (e76Var.c.r) {
                        e76Var.c.r.remove(e76Var);
                        return;
                    }
                }
            }
        } else if (!this.a.isConnecting()) {
            e76Var = (e76) message.obj;
            e76Var.b();
            synchronized (e76Var) {
                e76Var.a = null;
            }
            synchronized (e76Var.c.r) {
                e76Var.c.r.remove(e76Var);
            }
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            this.a.z = new z50(message.arg2);
            QnHx qnHx = this.a;
            if (!qnHx.A && !TextUtils.isEmpty(qnHx.h()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(qnHx.h());
                    z = true;
                } catch (ClassNotFoundException unused) {
                }
            }
            if (z) {
                QnHx qnHx2 = this.a;
                if (!qnHx2.A) {
                    qnHx2.m(3, null);
                    return;
                }
            }
            z50 z50Var = this.a.z;
            if (z50Var == null) {
                z50Var = new z50(8);
            }
            this.a.p.a(z50Var);
            this.a.k(z50Var);
            return;
        }
        if (i3 == 5) {
            z50 z50Var2 = this.a.z;
            if (z50Var2 == null) {
                z50Var2 = new z50(8);
            }
            this.a.p.a(z50Var2);
            this.a.k(z50Var2);
            return;
        }
        if (i3 == 3) {
            Object obj2 = message.obj;
            z50 z50Var3 = new z50(message.arg2, obj2 instanceof PendingIntent ? (PendingIntent) obj2 : null);
            this.a.p.a(z50Var3);
            this.a.k(z50Var3);
            return;
        }
        if (i3 == 6) {
            this.a.m(5, null);
            QnHx.InterfaceC0075QnHx interfaceC0075QnHx = this.a.u;
            if (interfaceC0075QnHx != null) {
                interfaceC0075QnHx.onConnectionSuspended(message.arg2);
            }
            QnHx qnHx3 = this.a;
            qnHx3.a = message.arg2;
            qnHx3.b = System.currentTimeMillis();
            QnHx.l(this.a, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.a.isConnected()) {
            e76 e76Var3 = (e76) message.obj;
            e76Var3.b();
            synchronized (e76Var3) {
                e76Var3.a = null;
            }
            synchronized (e76Var3.c.r) {
                e76Var3.c.r.remove(e76Var3);
            }
            return;
        }
        int i4 = message.what;
        if (!(i4 == 2 || i4 == 1 || i4 == 7)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + i4, new Exception());
            return;
        }
        e76 e76Var4 = (e76) message.obj;
        synchronized (e76Var4) {
            obj = e76Var4.a;
            if (e76Var4.b) {
                Log.w("GmsClient", "Callback proxy " + e76Var4.toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                e76Var4.a();
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (e76Var4) {
            e76Var4.b = true;
        }
        synchronized (e76Var4) {
            e76Var4.a = null;
        }
        synchronized (e76Var4.c.r) {
            e76Var4.c.r.remove(e76Var4);
        }
    }
}
