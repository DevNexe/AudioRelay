package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler$loadPlans$2", f = "PremiumInputHandler.kt", l = {260, 261}, m = "invokeSuspend")
public final class hc3 extends px4 implements x81<ua0, z80<? super q43>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ uc3 C;
    public final /* synthetic */ boolean D;

    @if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler$loadPlans$2$purchasedAsync$1", f = "PremiumInputHandler.kt", l = {256}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<ua0, z80<? super List<? extends zg3>>, Object> {
        public int A;
        public final /* synthetic */ uc3 B;
        public final /* synthetic */ boolean C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(uc3 uc3Var, boolean z, z80<? super CQf> z80Var) {
            super(2, z80Var);
            this.B = uc3Var;
            this.C = z;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new CQf(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                vk4<List<zg3>> vk4VarG = this.B.a.g(this.C);
                this.A = 1;
                obj = JUCk.c(vk4VarG, this);
                if (obj == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return obj;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super List<? extends zg3>> z80Var) {
            return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler$loadPlans$2$currentOfferingAsync$1", f = "PremiumInputHandler.kt", l = {257}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super List<? extends n43>>, Object> {
        public int A;
        public final /* synthetic */ uc3 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(uc3 uc3Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = uc3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                vk4<List<n43>> vk4VarC = this.B.a.c();
                this.A = 1;
                obj = JUCk.c(vk4VarC, this);
                if (obj == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return obj;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super List<? extends n43>> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc3(uc3 uc3Var, boolean z, z80<? super hc3> z80Var) {
        super(2, z80Var);
        this.C = uc3Var;
        this.D = z;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        hc3 hc3Var = new hc3(this.C, this.D, z80Var);
        hc3Var.B = obj;
        return hc3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        ni0 ni0Var;
        List list;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                ni0Var = (ni0) this.B;
                C0239D.H(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.B;
                C0239D.H(obj);
            }
            return new q43(list, (List) obj);
        }
        C0239D.H(obj);
        ua0 ua0Var = (ua0) this.B;
        uc3 uc3Var = this.C;
        oi0 oi0VarD = fp1.D(ua0Var, null, new CQf(uc3Var, this.D, null), 3);
        oi0 oi0VarD2 = fp1.D(ua0Var, null, new QnHx(uc3Var, null), 3);
        this.B = oi0VarD2;
        this.A = 1;
        Object objU = oi0VarD.U(this);
        if (objU == va0Var) {
            return va0Var;
        }
        ni0Var = oi0VarD2;
        obj = objU;
        List list2 = (List) obj;
        this.B = list2;
        this.A = 2;
        Object objO0 = ni0Var.o0(this);
        if (objO0 == va0Var) {
            return va0Var;
        }
        list = list2;
        obj = objO0;
        return new q43(list, (List) obj);
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super q43> z80Var) {
        return ((hc3) a(ua0Var, z80Var)).i(sd5.a);
    }
}
