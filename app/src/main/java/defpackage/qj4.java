package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class qj4 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final at3 b;
    public volatile v61 c;

    public qj4(at3 at3Var) {
        this.b = at3Var;
    }

    public final v61 a() {
        this.b.a();
        if (!this.a.compareAndSet(false, true)) {
            String strB = b();
            at3 at3Var = this.b;
            at3Var.a();
            at3Var.b();
            return new v61(((r61) at3Var.c.U()).w.compileStatement(strB));
        }
        if (this.c == null) {
            String strB2 = b();
            at3 at3Var2 = this.b;
            at3Var2.a();
            at3Var2.b();
            this.c = new v61(((r61) at3Var2.c.U()).w.compileStatement(strB2));
        }
        return this.c;
    }

    public abstract String b();

    public final void c(v61 v61Var) {
        if (v61Var == this.c) {
            this.a.set(false);
        }
    }
}
