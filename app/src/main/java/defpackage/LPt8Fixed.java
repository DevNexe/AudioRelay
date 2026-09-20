package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class LPt8Fixed<T> implements jE<T> {
    public final T a;
    public final ArrayList b = new ArrayList();
    public T c;

    public LPt8Fixed(T t) {
        this.a = t;
        this.c = t;
    }

    @Override // defpackage.jE
    public final T a() {
        return this.c;
    }

    @Override // defpackage.jE
    public final void c(T t) {
        this.b.add(this.c);
        this.c = t;
    }

    @Override // defpackage.jE
    public final void clear() {
        this.b.clear();
        this.c = this.a;
        j();
    }

    @Override // defpackage.jE
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.jE
    public final void g() {
        ArrayList arrayList = this.b;
        if (!(!arrayList.isEmpty())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.c = (T) arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.jE
    public /* synthetic */ void i() {
    }

    public abstract void j();
}
