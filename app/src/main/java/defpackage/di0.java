package defpackage;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class di0 extends dw2.F1 {
    public final Long a;
    public final n80 b;
    public final /* synthetic */ Object c;

    public di0(ig1 ig1Var, n80 n80Var, Object obj) {
        this.c = obj;
        oc1 oc1Var = ig1Var.c;
        List<String> list = rf1.a;
        String strG = oc1Var.g("Content-Length");
        this.a = strG != null ? Long.valueOf(Long.parseLong(strG)) : null;
        if (n80Var == null) {
            n80 n80Var2 = n80.QnHx.a;
            n80Var = n80.QnHx.b;
        }
        this.b = n80Var;
    }

    @Override // defpackage.dw2
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.dw2
    public final n80 b() {
        return this.b;
    }

    @Override // dw2.F1
    public final fk d() {
        InputStream inputStream = (InputStream) this.c;
        return xnX3.c(ha1.w, rl0.c, true, new fi3(gj.a, inputStream, null)).x;
    }
}
