package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public abstract class xf<T> extends c70<T> {
    public static final String h = s52.e("BrdcstRcvrCnstrntTrckr");
    public final QnHx g;

    public class QnHx extends BroadcastReceiver {
        public QnHx() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                xf.this.f(intent);
            }
        }
    }

    public xf(Context context, c15 c15Var) {
        super(context, c15Var);
        this.g = new QnHx();
    }

    @Override // defpackage.c70
    public final void c() {
        s52.c().a(h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.registerReceiver(this.g, e());
    }

    @Override // defpackage.c70
    public final void d() {
        s52.c().a(h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
