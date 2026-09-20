package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q40 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ng3<?>[] w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(ng3<?>[] ng3VarArr, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = ng3VarArr;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ng3<?>[] ng3VarArr = this.w;
            ng3[] ng3VarArr2 = (ng3[]) Arrays.copyOf(ng3VarArr, ng3VarArr.length);
            int i = this.y | 1;
            q40.a(ng3VarArr2, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(ng3<?>[] ng3VarArr, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-1390796515);
        j30VarQ.w0(ng3VarArr);
        x81Var.invoke(j30VarQ, Integer.valueOf((i >> 3) & 14));
        j30VarQ.T();
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(ng3VarArr, x81Var, i);
    }

    public static lq0 b(h81 h81Var) {
        return new lq0(tv4.a, h81Var);
    }
}
