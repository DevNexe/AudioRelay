package defpackage;

import androidx.lifecycle.LPt6Fixed;
import androidx.lifecycle.LPt8Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class lk2 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ kk2 w;
        public final /* synthetic */ i24 x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(kk2 kk2Var, i24 i24Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = kk2Var;
            this.x = i24Var;
            this.y = x81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            i24 i24Var = this.x;
            x81<g30, Integer, sd5> x81Var = this.y;
            lk2.a(this.w, i24Var, x81Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ i24 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(i24 i24Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = i24Var;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                lk2.b(this.w, this.x, g30Var2, ((this.y >> 3) & 112) | 8);
            }
            return sd5.a;
        }
    }

    public static final void a(kk2 kk2Var, i24 i24Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-1579360880);
        q40.a(new ng3[]{x42.a.b(kk2Var), Ll.d.b(kk2Var), Ll.e.b(kk2Var)}, X.m(j30VarQ, -52928304, new QnHx(i24Var, x81Var, i)), j30VarQ, 56);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(kk2Var, i24Var, x81Var, i);
    }

    public static final void b(i24 i24Var, x81 x81Var, g30 g30Var, int i) {
        LPt6Fixed.CQf cQfA;
        LPt6Fixed lPt6;
        j30 j30VarQ = g30Var.q(1211832233);
        j30VarQ.e(1729797275);
        mj5 mj5VarA = x42.a(j30VarQ);
        if (mj5VarA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        boolean z = mj5VarA instanceof LPt8Fixed;
        nc0 nc0VarB = z ? ((LPt8Fixed) mj5VarA).b() : nc0.QnHx.b;
        j30VarQ.e(-1439476281);
        if (z) {
            lPt6 = new LPt6Fixed(mj5VarA.M(), ((LPt8Fixed) mj5VarA).a(), nc0VarB);
        } else {
            lj5 lj5VarM = mj5VarA.M();
            if (z) {
                cQfA = ((LPt8Fixed) mj5VarA).a();
            } else {
                if (LPt6Fixed.F1.a == null) {
                    LPt6Fixed.F1.a = new LPt6Fixed.F1();
                }
                cQfA = LPt6Fixed.F1.a;
            }
            lPt6 = new LPt6Fixed(lj5VarM, cQfA, z ? ((LPt8Fixed) mj5VarA).b() : nc0.QnHx.b);
        }
        jj5 jj5VarA = lPt6.a(e5.class);
        j30VarQ.R(false);
        j30VarQ.R(false);
        e5 e5Var = (e5) jj5VarA;
        e5Var.e = i24Var;
        i24Var.b(e5Var.d, x81Var, j30VarQ, (i & 112) | 520);
        wq0.a(e5Var, new nk2(e5Var), j30VarQ);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new ok2(i24Var, x81Var, i);
    }
}
