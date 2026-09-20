package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b9<T, R> implements ht2<T>, kh3<R> {
    public int A;
    public final ht2<? super R> w;
    public vl0 x;
    public kh3<T> y;
    public boolean z;

    public b9(ht2<? super R> ht2Var) {
        this.w = ht2Var;
    }

    @Override // defpackage.vl0
    public final void a() {
        this.x.a();
    }

    @Override // defpackage.ht2
    public final void b() {
        if (this.z) {
            return;
        }
        this.z = true;
        this.w.b();
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
        if (bm0.p(this.x, vl0Var)) {
            this.x = vl0Var;
            if (vl0Var instanceof kh3) {
                this.y = (kh3) vl0Var;
            }
            this.w.c(this);
        }
    }

    @Override // defpackage.uk4
    public final void clear() {
        this.y.clear();
    }

    public final int d(int i) {
        kh3<T> kh3Var = this.y;
        if (kh3Var == null || (i & 4) != 0) {
            return 0;
        }
        int iL = kh3Var.l(i);
        if (iL != 0) {
            this.A = iL;
        }
        return iL;
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return this.x.e();
    }

    @Override // defpackage.uk4
    public final boolean isEmpty() {
        return this.y.isEmpty();
    }

    @Override // defpackage.uk4
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.ht2
    public final void onError(Throwable th) {
        if (this.z) {
            m14.b(th);
        } else {
            this.z = true;
            this.w.onError(th);
        }
    }
}
