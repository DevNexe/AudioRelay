package defpackage;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class rh1 {
    public static final lm4 a;

    public static final class CQf extends cx1 implements j81<o94, sd5> {
        public final /* synthetic */ String w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(String str) {
            super(1);
            this.w = str;
        }

        @Override // defpackage.j81
        public final sd5 invoke(o94 o94Var) {
            o94 o94Var2 = o94Var;
            qv1<Object>[] qv1VarArr = l94.a;
            o94Var2.a(i94.a, Collections.singletonList(this.w));
            l94.a(o94Var2, 5);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ sy2 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ long z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(sy2 sy2Var, String str, pg2 pg2Var, long j, int i, int i2) {
            super(2);
            this.w = sy2Var;
            this.x = str;
            this.y = pg2Var;
            this.z = j;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            rh1.b(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    static {
        float f = 24;
        wo1.QnHx qnHx = wo1.a;
        a = new lm4(f, f, f, f, true);
    }

    public static final void a(ej1 ej1Var, String str, pg2 pg2Var, long j, g30 g30Var, int i, int i2) {
        g30Var.e(-800853103);
        if ((i2 & 4) != 0) {
            pg2Var = pg2.QnHx.w;
        }
        pg2 pg2Var2 = pg2Var;
        if ((i2 & 8) != 0) {
            j = yu.b(((yu) g30Var.E(r70.a)).a, ((Number) g30Var.E(p70.a)).floatValue());
        }
        b(xg5.b(ej1Var, g30Var), str, pg2Var2, j, g30Var, (i & 112) | 8 | (i & 896) | (i & 7168), 0);
        g30Var.G();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    public static final void b(sy2 sy2Var, String str, pg2 pg2Var, long j, g30 g30Var, int i, int i2) {
        av avVar;
        pg2 pg2VarA;
        j30 j30VarQ = g30Var.q(-1142959010);
        int i3 = i2 & 4;
        pg2 pg2Var2 = pg2.QnHx.w;
        pg2 pg2Var3 = i3 != 0 ? pg2Var2 : pg2Var;
        long jB = (i2 & 8) != 0 ? yu.b(((yu) j30VarQ.E(r70.a)).a, ((Number) j30VarQ.E(p70.a)).floatValue()) : j;
        if (yu.c(jB, yu.h)) {
            avVar = null;
        } else {
            avVar = new av(Build.VERSION.SDK_INT >= 29 ? bb.a.a(jB, 5) : new PorterDuffColorFilter(hH.A(jB), fp1.z0(5)));
        }
        j30VarQ.e(1547385429);
        if (str != null) {
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(str);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new CQf(str);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pg2VarA = c94.a(pg2Var2, false, (j81) objB0);
        } else {
            pg2VarA = pg2Var2;
        }
        j30VarQ.R(false);
        wo1.QnHx qnHx = wo1.a;
        if (cm4.b(sy2Var.g(), cm4.c)) {
            pg2Var2 = a;
        } else {
            long jG = sy2Var.g();
            if (Float.isInfinite(cm4.e(jG)) && Float.isInfinite(cm4.c(jG))) {
                pg2Var2 = a;
            }
        }
        fe.a(ps0.Y(pg2Var3.y(pg2Var2), sy2Var, null, m80.QnHx.a, 0.0f, avVar, 22).y(pg2VarA), j30VarQ, 0);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(sy2Var, str, pg2Var3, jB, i, i2);
    }
}
