package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class je2 extends cx1 implements j81<qk, sd5> {
    public final /* synthetic */ ke2 w;
    public final /* synthetic */ j81<qk, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je2(ke2 ke2Var, P4 p4) {
        super(1);
        this.w = ke2Var;
        this.x = p4;
    }

    @Override // defpackage.j81
    public final sd5 invoke(qk qkVar) {
        qk qkVar2 = qkVar;
        this.w.a.b.a(qkVar2);
        this.x.invoke(qkVar2);
        return sd5.a;
    }
}
