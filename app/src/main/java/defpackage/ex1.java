package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class ex1 extends BroadcastReceiver {
    public final x81<Context, Intent, sd5> a;

    public ex1(zo2 zo2Var) {
        this.a = new dx1(zo2Var);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.invoke(context, intent);
    }

    public ex1(sp2 sp2Var) {
        this.a = sp2Var;
    }
}
