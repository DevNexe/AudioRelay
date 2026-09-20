package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {112}, m = "invokeSuspend")
public final class zu1 extends eq3 implements y81<zf0<sd5, vt1>, sd5, z80<? super vt1>, Object> {
    public final /* synthetic */ bv1 A;
    public int y;
    public /* synthetic */ zf0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu1(bv1 bv1Var, z80<? super zu1> z80Var) {
        super(3, z80Var);
        this.A = bv1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.y;
        if (i == 0) {
            C0239D.H(obj);
            zf0 zf0Var = this.z;
            bv1 bv1Var = this.A;
            byte bS = bv1Var.a.s();
            if (bS == 1) {
                return bv1Var.d(true);
            }
            if (bS == 0) {
                return bv1Var.d(false);
            }
            if (bS != 6) {
                if (bS == 8) {
                    return bv1Var.c();
                }
                LPt9Fixed.o(bv1Var.a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.y = 1;
            obj = bv1.a(bv1Var, zf0Var, this);
            if (obj == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return (vt1) obj;
    }

    @Override // defpackage.y81
    public final Object invoke(zf0<sd5, vt1> zf0Var, sd5 sd5Var, z80<? super vt1> z80Var) {
        zu1 zu1Var = new zu1(this.A, z80Var);
        zu1Var.z = zf0Var;
        return zu1Var.i(sd5.a);
    }
}
