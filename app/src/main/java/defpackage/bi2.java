package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bi2 extends nc0 {
    public /* synthetic */ bi2(int i) {
        this(nc0.QnHx.b);
    }

    public final <T> T a(nc0.CQf<T> cQf) {
        return (T) this.a.get(cQf);
    }

    public final <T> void b(nc0.CQf<T> cQf, T t) {
        this.a.put(cQf, t);
    }

    public bi2(nc0 nc0Var) {
        this.a.putAll(nc0Var.a);
    }
}
