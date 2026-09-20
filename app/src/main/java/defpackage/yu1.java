package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yu1 extends wu1 {
    public final pu1 F;
    public final List<String> G;
    public final int H;
    public int I;

    public yu1(ws1 ws1Var, pu1 pu1Var) {
        super(ws1Var, pu1Var, null, null);
        this.F = pu1Var;
        List<String> listE1 = wu.e1(pu1Var.keySet());
        this.G = listE1;
        this.H = listE1.size() * 2;
        this.I = -1;
    }

    @Override // defpackage.wu1, defpackage.lPt3Fixed
    public final String B(pa4 pa4Var, int i) {
        return this.G.get(i / 2);
    }

    @Override // defpackage.wu1, defpackage.lPt3Fixed
    public final vt1 F() {
        return this.F;
    }

    @Override // defpackage.wu1, defpackage.lPt3Fixed, defpackage.g40
    public final void G(pa4 pa4Var) {
    }

    @Override // defpackage.wu1
    /* JADX INFO: renamed from: I */
    public final pu1 F() {
        return this.F;
    }

    @Override // defpackage.wu1, defpackage.g40
    public final int p(pa4 pa4Var) {
        int i = this.I;
        if (i >= this.H - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.I = i2;
        return i2;
    }

    @Override // defpackage.wu1, defpackage.lPt3Fixed
    public final vt1 w(String str) {
        return this.I % 2 == 0 ? new ku1(str, true) : (vt1) t92.P(str, this.F);
    }
}
