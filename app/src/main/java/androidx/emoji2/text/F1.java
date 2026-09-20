package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class F1 extends LPt8Fixed.T23 {
    public final /* synthetic */ LPt8Fixed.QnHx a;

    public F1(LPt8Fixed.QnHx qnHx) {
        this.a = qnHx;
    }

    @Override // androidx.emoji2.text.LPt8Fixed.T23
    public final void a(Throwable th) {
        this.a.a.d(th);
    }

    @Override // androidx.emoji2.text.LPt8Fixed.T23
    public final void b(T23 t23) {
        LPt8Fixed.QnHx qnHx = this.a;
        qnHx.c = t23;
        qnHx.b = new YKK(qnHx.c, new LPt8Fixed.byN(), qnHx.a.h);
        qnHx.a.e();
    }
}
