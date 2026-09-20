package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cx1<R> implements j91<R>, Serializable {
    private final int arity;

    public cx1(int i) {
        this.arity = i;
    }

    @Override // defpackage.j91
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        nl3.a.getClass();
        return ol3.a(this);
    }
}
