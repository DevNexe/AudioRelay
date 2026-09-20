package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xUY0 extends g92<Object, Object> {
    public final /* synthetic */ Bt7j d;

    public xUY0(Bt7j bt7j) {
        this.d = bt7j;
    }

    @Override // defpackage.g92
    public final void a() {
        this.d.clear();
    }

    @Override // defpackage.g92
    public final Object b(int i, int i2) {
        return this.d.x[(i << 1) + i2];
    }

    @Override // defpackage.g92
    public final Map<Object, Object> c() {
        return this.d;
    }

    @Override // defpackage.g92
    public final int d() {
        return this.d.y;
    }

    @Override // defpackage.g92
    public final int e(Object obj) {
        return this.d.f(obj);
    }

    @Override // defpackage.g92
    public final int f(Object obj) {
        return this.d.h(obj);
    }

    @Override // defpackage.g92
    public final void g(Object obj, Object obj2) {
        this.d.put(obj, obj2);
    }

    @Override // defpackage.g92
    public final void h(int i) {
        this.d.j(i);
    }

    @Override // defpackage.g92
    public final Object i(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.d.x;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
