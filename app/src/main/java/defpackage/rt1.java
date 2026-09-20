package defpackage;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class rt1 {
    public final /* synthetic */ st1 a;

    public rt1(st1 st1Var) {
        this.a = st1Var;
    }

    public final void a(Object obj, Writer writer) {
        st1 st1Var = this.a;
        cv1 cv1Var = new cv1(writer, st1Var.a, st1Var.b, st1Var.c, st1Var.d);
        cv1Var.g(obj);
        cv1Var.i();
        cv1Var.b.flush();
    }
}
