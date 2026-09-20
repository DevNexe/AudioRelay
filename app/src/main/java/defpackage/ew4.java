package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
public final class ew4 extends b90 {
    public z14 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ fw4<Object> C;
    public int D;
    public fw4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew4(fw4<Object> fw4Var, z80<? super ew4> z80Var) {
        super(z80Var);
        this.C = fw4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(this);
    }
}
