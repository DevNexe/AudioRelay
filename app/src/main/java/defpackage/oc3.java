package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler$reload$3", f = "PremiumInputHandler.kt", l = {173, 178, 179}, m = "invokeSuspend")
public final class oc3 extends px4 implements x81<gk4<za3, ya3, fb3>, z80<? super sd5>, Object> {
    public Object A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ uc3 D;
    public final /* synthetic */ za3.FJCM E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc3(uc3 uc3Var, za3.FJCM fjcm, z80<? super oc3> z80Var) {
        super(2, z80Var);
        this.D = uc3Var;
        this.E = fjcm;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        oc3 oc3Var = new oc3(this.D, this.E, z80Var);
        oc3Var.C = obj;
        return oc3Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [gk4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [gk4] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        ?? r9;
        Object obj2;
        ?? r3;
        ?? r10;
        za3.F1 f1;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        ?? r1 = this.B;
        try {
            if (r1 != 0) {
                if (r1 == 1) {
                    gk4 gk4Var = (gk4) this.C;
                    C0239D.H(obj);
                    r1 = gk4Var;
                } else if (r1 == 2) {
                    obj2 = this.A;
                    gk4 gk4Var2 = (gk4) this.C;
                    C0239D.H(obj);
                    r3 = gk4Var2;
                    r10 = r3;
                    if (!(obj2 instanceof fq3.QnHx)) {
                        f1 = new za3.F1((q43) obj2);
                        this.C = obj2;
                        this.A = null;
                        this.B = 3;
                        if (r10.n(f1, this) == va0Var) {
                            return va0Var;
                        }
                    }
                } else {
                    if (r1 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                return sd5.a;
            }
            C0239D.H(obj);
            gk4 gk4Var3 = (gk4) this.C;
            uc3 uc3Var = this.D;
            boolean z = this.E.a;
            this.C = gk4Var3;
            this.B = 1;
            obj = uc3.b(uc3Var, z, true, this);
            r1 = gk4Var3;
            if (obj == va0Var) {
                return va0Var;
            }
            ?? r7 = r1;
            obj2 = (q43) obj;
            r9 = r7;
        } catch (Throwable th) {
            fq3.QnHx qnHx = new fq3.QnHx(th);
            r9 = r1;
            obj2 = qnHx;
        }
        Throwable thA = fq3.a(obj2);
        r10 = r9;
        if (thA != null) {
            za3.NUlFixed nUl = new za3.NUlFixed(thA);
            this.C = r9;
            this.A = obj2;
            this.B = 2;
            if (r9.n(nUl, this) == va0Var) {
                return va0Var;
            }
            r3 = r9;
            r10 = r3;
            if (!(obj2 instanceof fq3.QnHx)) {
                f1 = new za3.F1((q43) obj2);
                this.C = obj2;
                this.A = null;
                this.B = 3;
                if (r10.n(f1, this) == va0Var) {
                    return va0Var;
                }
            }
        } else if (!(obj2 instanceof fq3.QnHx)) {
            f1 = new za3.F1((q43) obj2);
            this.C = obj2;
            this.A = null;
            this.B = 3;
            if (r10.n(f1, this) == va0Var) {
                return va0Var;
            }
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<za3, ya3, fb3> gk4Var, z80<? super sd5> z80Var) {
        return ((oc3) a(gk4Var, z80Var)).i(sd5.a);
    }
}
