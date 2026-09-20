package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f34 implements d34<Object, Object> {
    public final /* synthetic */ x81<g34, Object, Object> a;
    public final /* synthetic */ j81<Object, Object> b;

    /* JADX WARN: Multi-variable type inference failed */
    public f34(x81<? super g34, Object, Object> x81Var, j81<Object, Object> j81Var) {
        this.a = x81Var;
        this.b = j81Var;
    }

    @Override // defpackage.d34
    public final Object a(Object obj) {
        return this.b.invoke(obj);
    }

    @Override // defpackage.d34
    public final Object b(g34 g34Var, Object obj) {
        return this.a.invoke(g34Var, obj);
    }
}
