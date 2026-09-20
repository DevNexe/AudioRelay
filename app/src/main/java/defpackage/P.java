package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class P implements bu0<x8W, GKz7, MW> {
    public final bm2 a;

    public final class W9 extends cx1 implements j81<qk, sd5> {
        public final /* synthetic */ MUpZ w;
        public final /* synthetic */ j81<qk, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public W9(MUpZ mUpZ, j81<? super qk, sd5> j81Var) {
            super(1);
            this.w = mUpZ;
            this.x = j81Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(qk qkVar) {
            P4 p4 = new P4(this.x);
            this.w.b(qkVar, p4);
            return sd5.a;
        }
    }

    public P(bm2 bm2Var) {
        this.a = bm2Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        if (!ur1.a((GKz7) obj, GKz7.QnHx.a)) {
            return sd5.a;
        }
        Object objB = this.a.b(ou3.FJCM.e, null, z80Var);
        return objB == va0.COROUTINE_SUSPENDED ? objB : sd5.a;
    }
}
