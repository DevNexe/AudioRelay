package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {291}, m = "invokeSuspend")
public final class tF extends px4 implements j81<z80<? super nSu<Object, z_Mm>>, Object> {
    public AOdm A;
    public fl3 B;
    public int C;
    public final /* synthetic */ OVbg<Object, z_Mm> D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ HZD4<Object, z_Mm> F;
    public final /* synthetic */ long G;
    public final /* synthetic */ j81<OVbg<Object, z_Mm>, sd5> H;

    public static final class QnHx extends cx1 implements j81<rjr<Object, z_Mm>, sd5> {
        public final /* synthetic */ OVbg<Object, z_Mm> w;
        public final /* synthetic */ AOdm<Object, z_Mm> x;
        public final /* synthetic */ j81<OVbg<Object, z_Mm>, sd5> y;
        public final /* synthetic */ fl3 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(OVbg<Object, z_Mm> oVbg, AOdm<Object, z_Mm> aOdm, j81<? super OVbg<Object, z_Mm>, sd5> j81Var, fl3 fl3Var) {
            super(1);
            this.w = oVbg;
            this.x = aOdm;
            this.y = j81Var;
            this.z = fl3Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(rjr<Object, z_Mm> rjrVar) {
            rjr<Object, z_Mm> rjrVar2 = rjrVar;
            OVbg<Object, z_Mm> oVbg = this.w;
            kx4.f(rjrVar2, oVbg.c);
            Object objA = OVbg.a(oVbg, rjrVar2.b());
            boolean zA = ur1.a(objA, rjrVar2.b());
            j81<OVbg<Object, z_Mm>, sd5> j81Var = this.y;
            if (!zA) {
                oVbg.c.x.setValue(objA);
                this.x.x.setValue(objA);
                if (j81Var != null) {
                    j81Var.invoke(oVbg);
                }
                rjrVar2.a();
                this.z.w = true;
            } else if (j81Var != null) {
                j81Var.invoke(oVbg);
            }
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tF(OVbg<Object, z_Mm> oVbg, Object obj, HZD4<Object, z_Mm> hzd4, long j, j81<? super OVbg<Object, z_Mm>, sd5> j81Var, z80<? super tF> z80Var) {
        super(1, z80Var);
        this.D = oVbg;
        this.E = obj;
        this.F = hzd4;
        this.G = j;
        this.H = j81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        fl3 fl3Var;
        AOdm aOdm;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.C;
        int i2 = 1;
        OVbg<Object, z_Mm> oVbg = this.D;
        try {
            if (i == 0) {
                C0239D.H(obj);
                oVbg.c.y = (V) oVbg.a.a().invoke(this.E);
                oVbg.e.setValue(this.F.g());
                oVbg.d.setValue(Boolean.TRUE);
                AOdm<Object, V> aOdm2 = oVbg.c;
                AOdm aOdm3 = new AOdm(aOdm2.w, aOdm2.getValue(), X.o(aOdm2.y), aOdm2.z, Long.MIN_VALUE, aOdm2.B);
                fl3 fl3Var2 = new fl3();
                HZD4<Object, z_Mm> hzd4 = this.F;
                long j = this.G;
                QnHx qnHx = new QnHx(oVbg, aOdm3, this.H, fl3Var2);
                this.A = aOdm3;
                this.B = fl3Var2;
                this.C = 1;
                if (kx4.a(aOdm3, hzd4, j, qnHx, this) == va0Var) {
                    return va0Var;
                }
                fl3Var = fl3Var2;
                aOdm = aOdm3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl3Var = this.B;
                aOdm = this.A;
                C0239D.H(obj);
            }
            if (!fl3Var.w) {
                i2 = 2;
            }
            AOdm<Object, V> aOdm4 = oVbg.c;
            aOdm4.y.d();
            aOdm4.z = Long.MIN_VALUE;
            oVbg.d.setValue(Boolean.FALSE);
            return new nSu(aOdm, i2);
        } catch (CancellationException e) {
            AOdm<Object, V> aOdm5 = oVbg.c;
            aOdm5.y.d();
            aOdm5.z = Long.MIN_VALUE;
            oVbg.d.setValue(Boolean.FALSE);
            throw e;
        }
    }

    @Override // defpackage.j81
    public final Object invoke(z80<? super nSu<Object, z_Mm>> z80Var) {
        return new tF(this.D, this.E, this.F, this.G, this.H, z80Var).i(sd5.a);
    }
}
