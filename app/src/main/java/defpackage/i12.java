package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i12 implements h12 {
    public final ei2<j02> a;
    public final ei2 b;

    public i12() {
        ei2<j02> ei2Var = new ei2<>();
        this.a = ei2Var;
        this.b = ei2Var;
    }

    @Override // defpackage.h12
    public final void a(int i, j81 j81Var, j81 j81Var2, sz szVar) {
        j02 j02Var = new j02(j81Var, j81Var2, szVar);
        ei2<j02> ei2Var = this.a;
        ei2Var.getClass();
        if (!(i >= 0)) {
            throw new IllegalArgumentException(GM.a("size should be >=0, but was ", i).toString());
        }
        if (i == 0) {
            return;
        }
        yq1.QnHx qnHx = new yq1.QnHx(ei2Var.b, i, j02Var);
        ei2Var.b += i;
        ei2Var.a.b(qnHx);
    }
}
