package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class li2 extends ni2 implements nv1 {
    public li2(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    @Override // defpackage.pv1
    public final void A() {
        ev1 ev1VarA = a();
        if (ev1VarA == this) {
            throw new tw1();
        }
        ((nv1) ((qv1) ev1VarA)).A();
    }

    @Override // defpackage.xl
    public final ev1 b() {
        nl3.a.getClass();
        return this;
    }

    @Override // defpackage.j81
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
