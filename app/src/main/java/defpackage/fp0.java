package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {421}, m = "invokeSuspend")
public final class fp0 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ xp0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(xp0 xp0Var, z80<? super fp0> z80Var) {
        super(2, z80Var);
        this.B = xp0Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new fp0(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            this.A = 1;
            xp0 xp0Var = this.B;
            xp0Var.getClass();
            yp0 yp0Var = yp0.Closed;
            nb5<Float> nb5Var = np0.c;
            iy4<yp0> iy4Var = xp0Var.a;
            iy4Var.getClass();
            Object objA = iy4Var.j.a(new jy4(yp0Var, iy4Var, nb5Var), this);
            if (objA != va0Var) {
                objA = sd5.a;
            }
            if (objA != va0Var) {
                objA = sd5.a;
            }
            if (objA != va0Var) {
                objA = sd5.a;
            }
            if (objA == va0Var) {
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
        return ((fp0) a(ua0Var, z80Var)).i(sd5.a);
    }
}
