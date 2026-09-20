package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class op0 extends cx1 implements j81<ro0, sd5> {
    public final /* synthetic */ long w;
    public final /* synthetic */ h81<Float> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(long j, h81<Float> h81Var) {
        super(1);
        this.w = j;
        this.x = h81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(ro0 ro0Var) {
        qo0.i(ro0Var, this.w, 0L, 0L, this.x.invoke().floatValue(), null, 118);
        return sd5.a;
    }
}
