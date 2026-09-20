package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zv implements wv {
    public static final zv a = new zv();

    @Override // defpackage.wv
    public final pg2 a(da.QnHx qnHx) {
        wo1.QnHx qnHx2 = wo1.a;
        return new dd1(qnHx);
    }

    @Override // defpackage.wv
    public final pg2 b(boolean z) {
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        wo1.QnHx qnHx = wo1.a;
        return new mz1(1.0f, z);
    }
}
