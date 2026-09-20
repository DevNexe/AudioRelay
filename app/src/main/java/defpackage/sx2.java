package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sx2 implements c73 {
    public final i60 a;
    public final XRK b;
    public final qx2 c;
    public final pq2 d;

    public static final class QnHx extends cx1 implements h81<qw> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final qw invoke() {
            c54 c54Var = j54.b;
            sx2 sx2Var = sx2.this;
            us2 us2Var = sx2Var.b.a;
            us2Var.getClass();
            vq2<R> vq2VarN = new zs2(us2Var).n(new HqGb(3, sx2Var, c54Var));
            vq2VarN.getClass();
            return new zr2(vq2VarN);
        }
    }

    public sx2(i60 i60Var, XRK xrk, qx2 qx2Var, pq2 pq2Var) {
        this.a = i60Var;
        this.b = xrk;
        this.c = qx2Var;
        this.d = pq2Var;
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        QnHx qnHx = new QnHx();
        this.d.getClass();
        return pq2.i("Player:PacketControllerConfiguration", qnHx);
    }
}
