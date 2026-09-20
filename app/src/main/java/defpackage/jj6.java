package defpackage;

import com.google.android.gms.internal.measurement.QX;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class jj6 {
    public final d7G a;
    public final ma5 b;
    public final ma5 c;
    public final rz6 d;

    public jj6() {
        d7G d7g = new d7G(17);
        this.a = d7g;
        ma5 ma5Var = new ma5((ma5) null, d7g);
        this.c = ma5Var;
        this.b = ma5Var.a();
        rz6 rz6Var = new rz6();
        this.d = rz6Var;
        ma5Var.h("require", new hc7(rz6Var));
        rz6Var.a.put("internal.platform", new Callable() { // from class: dg6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new dd7();
            }
        });
        ma5Var.h("runtime.counter", new gw5(Double.valueOf(0.0d)));
    }

    public final ez5 a(ma5 ma5Var, QX... qxArr) {
        ez5 ez5VarA = ez5.o;
        for (QX qx : qxArr) {
            ez5VarA = wx6.a(qx);
            nw6.c(this.c);
            if ((ez5VarA instanceof mz5) || (ez5VarA instanceof az5)) {
                ez5VarA = this.a.h(ma5Var, ez5VarA);
            }
        }
        return ez5VarA;
    }
}
