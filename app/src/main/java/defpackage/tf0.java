package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class tf0 implements c73 {
    public final d7G a;
    public final ta2 b;
    public final qf0 c;
    public final uz4 d;
    public final h75 e;
    public final pq2 f;

    public static final class QnHx extends cx1 implements j81<c54, qw> {
        public final /* synthetic */ e61 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(e61 e61Var) {
            super(1);
            this.x = e61Var;
        }

        @Override // defpackage.j81
        public final qw invoke(c54 c54Var) {
            tf0 tf0Var = tf0.this;
            return new xs2(tf0Var.a.f(), new sf0(tf0Var, this.x, c54Var, 0));
        }
    }

    public tf0(d7G d7g, ta2 ta2Var, qf0 qf0Var, uz4 uz4Var, h75 h75Var, pq2 pq2Var) {
        this.a = d7g;
        this.b = ta2Var;
        this.c = qf0Var;
        this.d = uz4Var;
        this.e = h75Var;
        this.f = pq2Var;
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        this.e.k();
        rx rxVarC = this.f.j("Player:Decode", -16, new QnHx(e61Var)).c(new dc(this, 4));
        gq0.QnHx qnHx = gq0.x;
        long jO0 = ps0.o0(RCHTTPStatusCodes.ERROR, kq0.MILLISECONDS);
        kq0 kq0Var = kq0.SECONDS;
        return Th.h(rxVarC, jO0, ps0.o0(10, kq0Var), ps0.o0(5, kq0Var), j54.b);
    }
}
