package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tq3 implements qx2.QnHx {
    public final sd2 a;
    public final c2 b;

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ List<Long> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(List<Long> list) {
            super(0);
            this.w = list;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            a62.a.i(this.w.size(), "send_retransmit_request");
            return sd5.a;
        }
    }

    public tq3(sd2 sd2Var) {
        this.a = sd2Var;
        gq0.QnHx qnHx = gq0.x;
        this.b = new c2(ps0.o0(20, kq0.MINUTES));
    }

    @Override // qx2.QnHx
    public final void a(List<Long> list) {
        this.b.a(new QnHx(list));
        ad2.CQf cQfW0 = ad2.w0();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long jLongValue = list.get(i).longValue();
            rq3.CQf cQfC = rq3.B.c();
            cQfC.A = jLongValue;
            cQfC.M();
            rq3 rq3VarF = cQfC.f();
            if (!rq3VarF.isInitialized()) {
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(rq3VarF);
            }
            cQfW0.I = rq3VarF;
            cQfW0.M();
            this.a.a(cQfW0.build());
        }
    }
}
