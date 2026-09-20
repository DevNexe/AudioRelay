package defpackage;

/* JADX INFO: renamed from: z€gQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class zgQ extends cx1 implements j81<Boolean, sd5> {
    public final /* synthetic */ j81<kv2, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zgQ(j81<? super kv2, sd5> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Boolean bool) {
        this.w.invoke(bool.booleanValue() ? kv2.LatencyWithEffects : kv2.Latency);
        return sd5.a;
    }
}
