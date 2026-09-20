package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class r11<T, R> extends a11<R> {
    public final T x;
    public final i91<? super T, ? extends sg3<? extends R>> y;

    /* JADX WARN: Multi-variable type inference failed */
    public r11(i91 i91Var, Object obj) {
        this.x = obj;
        this.y = i91Var;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super R> gw4Var) {
        js0 js0Var = js0.INSTANCE;
        try {
            sg3<? extends R> sg3VarApply = this.y.apply(this.x);
            mq2.b(sg3VarApply, "The mapper returned a null Publisher");
            sg3<? extends R> sg3Var = sg3VarApply;
            if (!(sg3Var instanceof Callable)) {
                sg3Var.a(gw4Var);
                return;
            }
            try {
                Object objCall = ((Callable) sg3Var).call();
                if (objCall != null) {
                    gw4Var.d(new t34(objCall, gw4Var));
                } else {
                    gw4Var.d(js0Var);
                    gw4Var.b();
                }
            } catch (Throwable th) {
                XTd3.w(th);
                gw4Var.d(js0Var);
                gw4Var.onError(th);
            }
        } catch (Throwable th2) {
            gw4Var.d(js0Var);
            gw4Var.onError(th2);
        }
    }
}
