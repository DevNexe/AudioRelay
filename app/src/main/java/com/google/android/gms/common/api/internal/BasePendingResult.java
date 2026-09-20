package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.gq3;
import defpackage.hq3;
import defpackage.j03;
import defpackage.mr5;
import defpackage.nr5;
import defpackage.oa3;
import defpackage.or5;
import defpackage.ul3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends gq3> extends j03<R> {
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList<j03.QnHx> c = new ArrayList<>();
    public R d;
    public boolean e;

    @KeepName
    private or5 mResultGuardian;

    public static class QnHx<R extends gq3> extends mr5 {
        public QnHx(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                hq3 hq3Var = (hq3) pair.first;
                gq3 gq3Var = (gq3) pair.second;
                try {
                    hq3Var.a();
                    return;
                } catch (RuntimeException e) {
                    BasePendingResult.e(gq3Var);
                    throw e;
                }
            }
            if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            BasePendingResult basePendingResult = (BasePendingResult) message.obj;
            Status status = Status.B;
            synchronized (basePendingResult.a) {
                if (!basePendingResult.b()) {
                    basePendingResult.c(basePendingResult.a());
                    basePendingResult.e = true;
                }
            }
        }
    }

    static {
        new nr5(0);
    }

    @Deprecated
    public BasePendingResult() {
        new AtomicReference();
        new QnHx(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void e(gq3 gq3Var) {
        if (gq3Var instanceof ul3) {
            try {
                ((ul3) gq3Var).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(gq3Var)), e);
            }
        }
    }

    public abstract gq3 a();

    public final boolean b() {
        return this.b.getCount() == 0;
    }

    public final void c(R r) {
        synchronized (this.a) {
            if (this.e) {
                e(r);
                return;
            }
            b();
            oa3.j("Results have already been set", !b());
            oa3.j("Result has already been consumed", !false);
            d(r);
        }
    }

    public final void d(R r) {
        this.d = r;
        r.a();
        this.b.countDown();
        if (this.d instanceof ul3) {
            this.mResultGuardian = new or5(this);
        }
        ArrayList<j03.QnHx> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).b();
        }
        this.c.clear();
    }
}
