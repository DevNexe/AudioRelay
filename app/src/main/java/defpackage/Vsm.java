package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Vsm extends g92<Object, Object> {
    public final /* synthetic */ Q6g d;

    public Vsm(Q6g q6g) {
        this.d = q6g;
    }

    @Override // defpackage.g92
    public final void a() {
        this.d.clear();
    }

    @Override // defpackage.g92
    public final Object b(int i, int i2) {
        return this.d.x[i];
    }

    @Override // defpackage.g92
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // defpackage.g92
    public final int d() {
        return this.d.y;
    }

    @Override // defpackage.g92
    public final int e(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // defpackage.g92
    public final int f(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // defpackage.g92
    public final void g(Object obj, Object obj2) {
        this.d.add(obj);
    }

    @Override // defpackage.g92
    public final void h(int i) {
        this.d.e(i);
    }

    @Override // defpackage.g92
    public final Object i(int i, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
