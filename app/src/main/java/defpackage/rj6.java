package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class rj6 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ xj6 e;

    public /* synthetic */ rj6(xj6 xj6Var, long j) {
        this.e = xj6Var;
        oa3.e("health_monitor");
        oa3.b(j > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j;
    }

    public final void a() {
        xj6 xj6Var = this.e;
        xj6Var.e();
        xj6Var.a.n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = xj6Var.i().edit();
        editorEdit.remove(this.b);
        editorEdit.remove(this.c);
        editorEdit.putLong(this.a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
