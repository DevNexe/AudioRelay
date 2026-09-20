package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class el6 implements Callable {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ el6(wl6 wl6Var, String str) {
        this.x = wl6Var;
        this.y = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.w;
        Object obj = this.y;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                return new n17(new cq4((wl6) obj2, (String) obj, 24));
            default:
                r27 r27Var = (r27) obj;
                p97 p97Var = (p97) obj2;
                String str = p97Var.w;
                oa3.h(str);
                ww5 ww5VarH = r27Var.H(str);
                hw5 hw5Var = hw5.ANALYTICS_STORAGE;
                if (ww5VarH.f(hw5Var) && ww5.b(p97Var.R).f(hw5Var)) {
                    return r27Var.F(p97Var).E();
                }
                r27Var.zzay().n.b("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public el6(r27 r27Var, p97 p97Var) {
        this.y = r27Var;
        this.x = p97Var;
    }
}
