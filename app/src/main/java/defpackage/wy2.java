package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wy2<K, V> extends gw1<K, V, uy2<? extends K, ? extends V>> {
    public final ra4 c;

    public static final class QnHx extends cx1 implements j81<br, sd5> {
        public final /* synthetic */ rv1<K> w;
        public final /* synthetic */ rv1<V> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(rv1<K> rv1Var, rv1<V> rv1Var2) {
            super(1);
            this.w = rv1Var;
            this.x = rv1Var2;
        }

        @Override // defpackage.j81
        public final sd5 invoke(br brVar) {
            br brVar2 = brVar;
            br.a(brVar2, "first", this.w.a());
            br.a(brVar2, "second", this.x.a());
            return sd5.a;
        }
    }

    public wy2(rv1<K> rv1Var, rv1<V> rv1Var2) {
        super(rv1Var, rv1Var2);
        this.c = FWT.q("uy2", new pa4[0], new QnHx(rv1Var, rv1Var2));
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.c;
    }

    @Override // defpackage.gw1
    public final Object f(Object obj) {
        return ((uy2) obj).w;
    }

    @Override // defpackage.gw1
    public final Object g(Object obj) {
        return ((uy2) obj).x;
    }

    @Override // defpackage.gw1
    public final Object h(Object obj, Object obj2) {
        return new uy2(obj, obj2);
    }
}
