package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy0 implements Callable {
    public final /* synthetic */ int w;

    public /* synthetic */ dy0(int i) {
        this.w = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.w) {
            case 0:
                qx0 qx0VarB = qx0.b();
                qx0VarB.a();
                return ((lm3) qx0VarB.d.d(lm3.class)).c();
            default:
                int i = ek0.a;
                j81 j81Var = eu.y;
                return new dd3(Boolean.valueOf((j81Var == null || (str = (String) j81Var.invoke("ENABLE_PREMIUM")) == null) ? false : Boolean.parseBoolean(str)), null, 2);
        }
    }
}
