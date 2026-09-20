package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a40 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
    public final /* synthetic */ Object[] w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(Object[] objArr) {
        super(3);
        this.w = objArr;
    }

    @Override // defpackage.y81
    public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
        jE<?> jEVar2 = jEVar;
        for (Object obj : this.w) {
            jEVar2.c(obj);
        }
        return sd5.a;
    }
}
