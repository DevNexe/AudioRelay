package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xu1 extends lPt3Fixed {
    public final dt1 A;
    public final int B;
    public int C;

    public xu1(ws1 ws1Var, dt1 dt1Var) {
        super(ws1Var);
        this.A = dt1Var;
        this.B = dt1Var.size();
        this.C = -1;
    }

    @Override // defpackage.lPt3Fixed
    public final String B(pa4 pa4Var, int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.lPt3Fixed
    public final vt1 F() {
        return this.A;
    }

    @Override // defpackage.g40
    public final int p(pa4 pa4Var) {
        int i = this.C;
        if (i >= this.B - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.C = i2;
        return i2;
    }

    @Override // defpackage.lPt3Fixed
    public final vt1 w(String str) {
        return this.A.w.get(Integer.parseInt(str));
    }
}
