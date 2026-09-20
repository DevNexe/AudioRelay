package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jx4 extends cx1 implements j81<rjr<Object, Object>, sd5> {
    public final /* synthetic */ x81<Object, Object, sd5> w;
    public final /* synthetic */ pb5<Object, Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx4(a64.CQf.QnHx qnHx) {
        super(1);
        qb5 qb5Var = mg5.a;
        this.w = qnHx;
        this.x = qb5Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(rjr<Object, Object> rjrVar) {
        rjr<Object, Object> rjrVar2 = rjrVar;
        this.w.invoke(rjrVar2.b(), this.x.b().invoke(rjrVar2.f));
        return sd5.a;
    }
}
