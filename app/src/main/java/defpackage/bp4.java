package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bp4 implements jt2 {
    public final /* synthetic */ x81<Set<? extends Object>, cp4, sd5> a;

    /* JADX WARN: Multi-variable type inference failed */
    public bp4(x81<? super Set<? extends Object>, ? super cp4, sd5> x81Var) {
        this.a = x81Var;
    }

    @Override // defpackage.jt2
    public final void a() {
        x81<Set<? extends Object>, cp4, sd5> x81Var = this.a;
        synchronized (ip4.c) {
            ip4.g.remove(x81Var);
            sd5 sd5Var = sd5.a;
        }
    }
}
