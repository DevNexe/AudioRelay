package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c9<T, R> implements v11<T>, oh3<R> {
    public int A;
    public final gw4<? super R> w;
    public mw4 x;
    public oh3<T> y;
    public boolean z;

    public c9(gw4<? super R> gw4Var) {
        this.w = gw4Var;
    }

    @Override // defpackage.mw4
    public final void a(long j) {
        this.x.a(j);
    }

    @Override // defpackage.gw4
    public final void b() {
        if (this.z) {
            return;
        }
        this.z = true;
        this.w.b();
    }

    @Override // defpackage.mw4
    public final void cancel() {
        this.x.cancel();
    }

    @Override // defpackage.uk4
    public final void clear() {
        this.y.clear();
    }

    @Override // defpackage.v11, defpackage.gw4
    public final void d(mw4 mw4Var) {
        if (qw4.m(this.x, mw4Var)) {
            this.x = mw4Var;
            if (mw4Var instanceof oh3) {
                this.y = (oh3) mw4Var;
            }
            this.w.d(this);
        }
    }

    @Override // defpackage.uk4
    public final boolean isEmpty() {
        return this.y.isEmpty();
    }

    @Override // defpackage.uk4
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.gw4
    public final void onError(Throwable th) {
        if (this.z) {
            m14.b(th);
        } else {
            this.z = true;
            this.w.onError(th);
        }
    }
}
