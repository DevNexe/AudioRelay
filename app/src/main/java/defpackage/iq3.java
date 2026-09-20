package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iq3<T> extends rs1 {
    public final xm<T> A;

    public iq3(ss1.QnHx qnHx) {
        this.A = qnHx;
    }

    @Override // defpackage.j81
    public final /* bridge */ /* synthetic */ sd5 invoke(Throwable th) {
        s(th);
        return sd5.a;
    }

    @Override // defpackage.ly
    public final void s(Throwable th) {
        Object objB0 = t().B0();
        boolean z = objB0 instanceof iy;
        xm<T> xmVar = this.A;
        if (z) {
            xmVar.x(new fq3.QnHx(((iy) objB0).a));
        } else {
            xmVar.x(ym.g(objB0));
        }
    }
}
