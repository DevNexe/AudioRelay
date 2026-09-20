package defpackage;

import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumEventHandler$makePurchase$1", f = "PremiumEventHandler.kt", l = {62, 67, 71}, m = "invokeSuspend")
public final class gb3 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ ya3.CQf B;
    public final /* synthetic */ hb3 C;

    @if0(c = "com.azefsw.audioconnect.premium.ui.PremiumEventHandler$makePurchase$1$activity$1", f = "PremiumEventHandler.kt", l = {}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super ComponentActivity>, Object> {
        public final /* synthetic */ hb3 A;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(hb3 hb3Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.A = hb3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.A, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            return FWT.x(this.A.b);
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super ComponentActivity> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb3(ya3.CQf cQf, hb3 hb3Var, z80<? super gb3> z80Var) {
        super(2, z80Var);
        this.B = cQf;
        this.C = hb3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new gb3(this.B, this.C, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        qa qaVar;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        hb3 hb3Var = this.C;
        if (i == 0) {
            C0239D.H(obj);
            qh0 qh0Var = rl0.a;
            j72 j72Var = n72.a;
            QnHx qnHx = new QnHx(hb3Var, null);
            this.A = 1;
            obj = fp1.D0(j72Var, qnHx, this);
            if (obj == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C0239D.H(obj);
                    qaVar = (qa) obj;
                    if (ur1.a(qaVar, qa.QnHx.a)) {
                        hb3Var.d.g(za3.T23.a);
                    } else if (qaVar instanceof qa.CQf) {
                        hb3Var.d.g(new za3.byN(((qa.CQf) qaVar).a));
                    } else if (ur1.a(qaVar, qa.F1.a)) {
                        hb3Var.d.g(za3.EQ.a);
                    }
                    return sd5.a;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
                qaVar = (qa) obj;
                if (ur1.a(qaVar, qa.QnHx.a)) {
                    hb3Var.d.g(za3.T23.a);
                } else if (qaVar instanceof qa.CQf) {
                    hb3Var.d.g(new za3.byN(((qa.CQf) qaVar).a));
                } else if (ur1.a(qaVar, qa.F1.a)) {
                    hb3Var.d.g(za3.EQ.a);
                }
                return sd5.a;
            }
            C0239D.H(obj);
        }
        ComponentActivity componentActivity = (ComponentActivity) obj;
        ya3.CQf cQf = this.B;
        o43 o43Var = cQf.b;
        ab3 ab3Var = cQf.a;
        if (o43Var == null) {
            vk4 vk4VarE = hb3Var.a.e(componentActivity, ab3Var.a());
            this.A = 3;
            obj = JUCk.c(vk4VarE, this);
            if (obj == va0Var) {
                return va0Var;
            }
            qaVar = (qa) obj;
            if (ur1.a(qaVar, qa.QnHx.a)) {
                hb3Var.d.g(za3.T23.a);
            } else if (qaVar instanceof qa.CQf) {
                hb3Var.d.g(new za3.byN(((qa.CQf) qaVar).a));
            } else if (ur1.a(qaVar, qa.F1.a)) {
                hb3Var.d.g(za3.EQ.a);
            }
            return sd5.a;
        }
        vk4 vk4VarD = hb3Var.a.d(componentActivity, cQf.b, ab3Var.a());
        this.A = 2;
        obj = JUCk.c(vk4VarD, this);
        if (obj == va0Var) {
            return va0Var;
        }
        qaVar = (qa) obj;
        if (ur1.a(qaVar, qa.QnHx.a)) {
            hb3Var.d.g(za3.T23.a);
        } else if (qaVar instanceof qa.CQf) {
            hb3Var.d.g(new za3.byN(((qa.CQf) qaVar).a));
        } else if (ur1.a(qaVar, qa.F1.a)) {
            hb3Var.d.g(za3.EQ.a);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((gb3) a(ua0Var, z80Var)).i(sd5.a);
    }
}
