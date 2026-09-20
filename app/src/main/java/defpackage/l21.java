package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1", f = "FocusInteraction.kt", l = {69}, m = "invokeSuspend")
public final class l21 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ wp1 B;
    public final /* synthetic */ ri2<Boolean> C;

    public static final class QnHx implements nz0<vp1> {
        public final /* synthetic */ List<j21> w;
        public final /* synthetic */ ri2<Boolean> x;

        public QnHx(ArrayList arrayList, ri2 ri2Var) {
            this.w = arrayList;
            this.x = ri2Var;
        }

        @Override // defpackage.nz0
        public final Object f(vp1 vp1Var, z80 z80Var) {
            vp1 vp1Var2 = vp1Var;
            boolean z = vp1Var2 instanceof j21;
            List<j21> list = this.w;
            if (z) {
                list.add((j21) vp1Var2);
            } else if (vp1Var2 instanceof k21) {
                list.remove(((k21) vp1Var2).a);
            }
            this.x.setValue(Boolean.valueOf(!list.isEmpty()));
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(wp1 wp1Var, ri2<Boolean> ri2Var, z80<? super l21> z80Var) {
        super(2, z80Var);
        this.B = wp1Var;
        this.C = ri2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new l21(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ArrayList arrayList = new ArrayList();
            nj4 nj4VarA = this.B.a();
            QnHx qnHx = new QnHx(arrayList, this.C);
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
        return ((l21) a(ua0Var, z80Var)).i(sd5.a);
    }
}
