package defpackage;

import j$.util.Optional;
import j$.util.function.Function;
import j$.util.function.Supplier;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements Callable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ h1 x;
    public final /* synthetic */ e61 y;
    public final /* synthetic */ c54 z;

    public /* synthetic */ c1(e61 e61Var, h1 h1Var, c54 c54Var, Optional optional) {
        this.A = optional;
        this.x = h1Var;
        this.y = e61Var;
        this.z = c54Var;
    }

    public /* synthetic */ c1(e61 e61Var, ve.QnHx qnHx, h1 h1Var, c54 c54Var) {
        this.x = h1Var;
        this.A = qnHx;
        this.y = e61Var;
        this.z = c54Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.w;
        final c54 c54Var = this.z;
        final e61 e61Var = this.y;
        final h1 h1Var = this.x;
        Object obj = this.A;
        switch (i) {
            case 0:
                return (tx) ((Optional) obj).map(new Function() { // from class: d1
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj2) {
                        h1 h1Var2 = h1Var;
                        c54 c54Var2 = c54Var;
                        return new ww(new c1(e61Var, (ve.QnHx) obj2, h1Var2, c54Var2));
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                }).orElseGet(new Supplier() { // from class: e1
                    @Override // j$.util.function.Supplier
                    public final Object get() {
                        return cx.w;
                    }
                });
            default:
                ve.QnHx qnHx = (ve.QnHx) obj;
                a62 a62Var = a62.a;
                Rm rm = h1Var.d;
                Bk bk = qnHx.b;
                rm.a = bk;
                h1Var.e.a = qnHx.a;
                xn2 xn2Var = h1Var.h;
                synchronized (xn2Var) {
                    xn2Var.d = 2;
                    xn2Var.c(e61Var, null);
                    sd5 sd5Var = sd5.a;
                }
                lx lxVarH = bk.H(c54Var);
                z0 z0Var = new z0(0, qnHx, h1Var);
                lxVarH.getClass();
                return new ax(lxVarH, z0Var);
        }
    }
}
