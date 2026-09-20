package defpackage;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1", f = "Swipeable.kt", l = {AdRequest.MAX_CONTENT_URL_LENGTH}, m = "invokeSuspend")
public final class ay4 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ iy4<Object> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay4(Object obj, iy4<Object> iy4Var, z80<? super ay4> z80Var) {
        super(2, z80Var);
        this.B = obj;
        this.C = iy4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new ay4(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            iy4<Object> iy4Var = this.C;
            Object objB = iy4Var.b();
            Object obj2 = this.B;
            if (!ur1.a(obj2, objB)) {
                this.A = 1;
                Object objA = iy4Var.j.a(new jy4(obj2, iy4Var, iy4Var.a), this);
                if (objA != va0Var) {
                    objA = sd5.a;
                }
                if (objA == va0Var) {
                    return va0Var;
                }
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
        return ((ay4) a(ua0Var, z80Var)).i(sd5.a);
    }
}
