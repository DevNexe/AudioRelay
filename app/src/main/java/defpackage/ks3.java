package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {356}, m = "invokeSuspend")
public final class ks3 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ wp1 C;
    public final /* synthetic */ us3 D;

    public static final class QnHx implements nz0<vp1> {
        public final /* synthetic */ us3 w;
        public final /* synthetic */ ua0 x;

        public QnHx(us3 us3Var, ua0 ua0Var) {
            this.w = us3Var;
            this.x = ua0Var;
        }

        @Override // defpackage.nz0
        public final Object f(vp1 vp1Var, z80<? super sd5> z80Var) {
            float f;
            vp1 vp1Var2 = vp1Var;
            boolean z = vp1Var2 instanceof qd3;
            ua0 ua0Var = this.x;
            us3 us3Var = this.w;
            if (z) {
                us3Var.e((qd3) vp1Var2, ua0Var);
            } else if (vp1Var2 instanceof rd3) {
                us3Var.g(((rd3) vp1Var2).a);
            } else if (vp1Var2 instanceof pd3) {
                us3Var.g(((pd3) vp1Var2).a);
            } else {
                ms4 ms4Var = us3Var.w;
                ms4Var.getClass();
                boolean z2 = vp1Var2 instanceof hd1;
                ArrayList arrayList = ms4Var.d;
                if (z2) {
                    arrayList.add(vp1Var2);
                } else if (vp1Var2 instanceof id1) {
                    arrayList.remove(((id1) vp1Var2).a);
                } else if (vp1Var2 instanceof j21) {
                    arrayList.add(vp1Var2);
                } else if (vp1Var2 instanceof k21) {
                    arrayList.remove(((k21) vp1Var2).a);
                } else if (vp1Var2 instanceof nn0) {
                    arrayList.add(vp1Var2);
                } else if (vp1Var2 instanceof on0) {
                    arrayList.remove(((on0) vp1Var2).a);
                } else if (vp1Var2 instanceof mn0) {
                    arrayList.remove(((mn0) vp1Var2).a);
                }
                vp1 vp1Var3 = (vp1) wu.O0(arrayList);
                if (!ur1.a(ms4Var.e, vp1Var3)) {
                    nq0.QnHx qnHx = nq0.QnHx.a;
                    if (vp1Var3 != null) {
                        is4<ms3> is4Var = ms4Var.b;
                        if (z2) {
                            f = is4Var.getValue().c;
                        } else if (vp1Var2 instanceof j21) {
                            f = is4Var.getValue().b;
                        } else {
                            f = vp1Var2 instanceof nn0 ? is4Var.getValue().a : 0.0f;
                        }
                        nb5<Float> nb5Var = vs3.a;
                        nb5<Float> nb5Var2 = (!(vp1Var3 instanceof hd1) && ((vp1Var3 instanceof j21) || (vp1Var3 instanceof nn0))) ? new nb5<>(45, qnHx, 2) : vs3.a;
                        fp1.k0(ua0Var, null, 0, new ks4(ms4Var, f, nb5Var2, null), 3);
                    } else {
                        vp1 vp1Var4 = ms4Var.e;
                        nb5<Float> nb5Var3 = vs3.a;
                        fp1.k0(ua0Var, null, 0, new ls4(ms4Var, ((vp1Var4 instanceof hd1) || (vp1Var4 instanceof j21) || !(vp1Var4 instanceof nn0)) ? vs3.a : new nb5<>(150, qnHx, 2), null), 3);
                    }
                    ms4Var.e = vp1Var3;
                }
            }
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks3(wp1 wp1Var, us3 us3Var, z80<? super ks3> z80Var) {
        super(2, z80Var);
        this.C = wp1Var;
        this.D = us3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        ks3 ks3Var = new ks3(this.C, this.D, z80Var);
        ks3Var.B = obj;
        return ks3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ua0 ua0Var = (ua0) this.B;
            nj4 nj4VarA = this.C.a();
            QnHx qnHx = new QnHx(this.D, ua0Var);
            this.A = 1;
            nj4VarA.getClass();
            if (nj4.n(nj4VarA, qnHx, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((ks3) a(ua0Var, z80Var)).i(sd5.a);
    }
}
