package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.network.info.AndroidNetworkInfoService$getEfficientQueryStream$2", f = "AndroidNetworkInfoService.kt", l = {}, m = "invokeSuspend")
public final class YZ extends px4 implements x81<sd5, z80<? super hn2>, Object> {
    public final /* synthetic */ qd A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YZ(qd qdVar, z80<? super YZ> z80Var) {
        super(2, z80Var);
        this.A = qdVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new YZ(this.A, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return qd.a(this.A);
    }

    @Override // defpackage.x81
    public final Object invoke(sd5 sd5Var, z80<? super hn2> z80Var) {
        return ((YZ) a(sd5Var, z80Var)).i(sd5.a);
    }
}
