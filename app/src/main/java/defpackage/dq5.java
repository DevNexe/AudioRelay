package defpackage;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HandlerLeak"})
public final class dq5 extends mr5 {
    public final Context a;
    public final /* synthetic */ na1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq5(na1 na1Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = na1Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        boolean z = true;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        na1 na1Var = this.b;
        Context context = this.a;
        int iD = na1Var.d(context);
        AtomicBoolean atomicBoolean = ra1.a;
        if (iD != 1 && iD != 2 && iD != 3 && iD != 9) {
            z = false;
        }
        if (z) {
            Intent intentB = na1Var.b(context, "n", iD);
            na1Var.h(context, iD, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, fd6.a | 134217728));
        }
    }
}
