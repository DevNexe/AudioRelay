package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.reactive.PublisherAsFlow", f = "ReactiveFlow.kt", l = {98, 100}, m = "collectImpl")
public final class ug3 extends b90 {
    public nz0 A;
    public ci3 B;
    public long C;
    public /* synthetic */ Object D;
    public final /* synthetic */ wg3<Object> E;
    public int F;
    public wg3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug3(wg3<Object> wg3Var, z80<? super ug3> z80Var) {
        super(z80Var);
        this.E = wg3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.l(this, null, null);
    }
}
