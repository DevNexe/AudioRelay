package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ju4 implements yz2 {
    public final c03 w;
    public final yz2 x;
    public final pq3 y;

    public static final class QnHx extends cx1 implements j81<qk, sd5> {
        public final /* synthetic */ j81<qk, sd5> w;
        public final /* synthetic */ ju4 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(j81<? super qk, sd5> j81Var, ju4 ju4Var) {
            super(1);
            this.w = j81Var;
            this.x = ju4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(qk qkVar) {
            qk qkVar2 = qkVar;
            j81<qk, sd5> j81Var = this.w;
            ju4 ju4Var = this.x;
            c03 c03Var = ju4Var.w;
            long j = c03Var.a + 1;
            c03Var.a = j;
            hu4.CQf cQfC = hu4.G.c();
            cQfC.A = j;
            cQfC.M();
            cQfC.B = zs.QnHx.a.c();
            cQfC.M();
            byte[] bArr = qkVar2.a;
            int i = qkVar2.b;
            int i2 = qkVar2.c;
            lk.YKK ykk = lk.x;
            cQfC.C = new lk.F1(bArr, i, i2);
            cQfC.M();
            cQfC.D = qkVar2.c;
            cQfC.M();
            hu4 hu4VarBuild = cQfC.build();
            qk qkVarY = OW8.y(hu4VarBuild.x(), hu4VarBuild.j(), 1);
            pq3 pq3Var = ju4Var.y;
            int i3 = pq3Var.b;
            zk[] zkVarArr = pq3Var.a;
            if (i3 == zkVarArr.length - 1) {
                pq3Var.b = 0;
            }
            int i4 = pq3Var.b;
            pq3Var.b = i4 + 1;
            zkVarArr[i4] = new zk(j, qkVarY.a());
            j81Var.invoke(qkVarY);
            return sd5.a;
        }
    }

    public ju4(c03 c03Var, yz2 yz2Var, pq3 pq3Var) {
        this.w = c03Var;
        this.x = yz2Var;
        this.y = pq3Var;
    }

    @Override // defpackage.yz2
    public final void a(qk qkVar, j81<? super qk, sd5> j81Var) {
        this.x.a(qkVar, new QnHx(j81Var, this));
    }
}
