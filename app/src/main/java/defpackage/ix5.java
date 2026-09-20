package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class ix5 extends gd6 {
    public final ix5 b = this;
    public final y96<m17> c;

    public ix5(Application application) {
        if (application == null) {
            throw new NullPointerException("instance cannot be null");
        }
        a96 a96Var = new a96(application);
        y96 y96VarA = l86.a(new qy5(a96Var, 0));
        y96 y96VarA2 = l86.a(kK.y);
        y96 y96VarA3 = l86.a(new qy5(new pq2(this), 1));
        m87 m87Var = new m87(a96Var, new j76(a96Var), y96VarA);
        y96 y96VarA4 = l86.a(new qy5(Cz.B, 2));
        this.c = l86.a(new v27(y96VarA, new gc7(a96Var, y96VarA2, y96VarA, y96VarA3, m87Var, new ls5(y96VarA4, new dy5(a96Var, y96VarA), y96VarA), y96VarA4), y96VarA3));
    }
}
