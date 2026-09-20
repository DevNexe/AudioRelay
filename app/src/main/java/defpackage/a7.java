package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.debugger.BallastDebuggerClientConnection$processOutgoing$1", f = "BallastDebuggerClientConnection.kt", l = {269}, m = "invokeSuspend")
public final class a7 extends px4 implements x81<k6.QnHx, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ k6<hf1> C;
    public final /* synthetic */ ig0 D;

    public static final class QnHx extends cx1 implements j81<i6, i6> {
        public final /* synthetic */ b7 w;
        public final /* synthetic */ k6.QnHx x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(k6.QnHx qnHx, b7 b7Var) {
            super(1);
            this.w = b7Var;
            this.x = qnHx;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.j81
        public final i6 invoke(i6 i6Var) {
            i6 i6Var2 = i6Var;
            b7 b7Var = this.w;
            String strB = b7Var.b();
            z6 z6Var = new z6(this.x, b7Var);
            List<j8> list = i6Var2.c;
            Iterator<j8> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (ur1.a(it.next().b, strB)) {
                    break;
                }
                i++;
            }
            ArrayList arrayList = new ArrayList(list);
            if (strB != null) {
                if (i != -1) {
                    j8 j8Var = (j8) z6Var.invoke(arrayList.get(i));
                    s42.QnHx qnHx = s42.Companion;
                    arrayList.set(i, j8.a(j8Var, null, null, null, null, null, false, false, Th.q(), null, 7167));
                } else {
                    s42.QnHx qnHx2 = s42.Companion;
                    arrayList.add(0, z6Var.invoke(new j8(i6Var2.a, strB, null, Th.q(), null, false, 7676)));
                }
            }
            sd5 sd5Var = sd5.a;
            return i6.a(i6Var2, wu.e1(arrayList), null, 27);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(k6<hf1> k6Var, ig0 ig0Var, z80<? super a7> z80Var) {
        super(2, z80Var);
        this.C = k6Var;
        this.D = ig0Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        a7 a7Var = new a7(this.C, this.D, z80Var);
        a7Var.B = obj;
        return a7Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        int i = this.A;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
            return sd5.a;
        }
        C0239D.H(obj);
        k6.QnHx qnHx = (k6.QnHx) this.B;
        qnHx.getClass();
        qnHx.getClass();
        throw new IllegalStateException("Must provide a notification or a debugger event, not both".toString());
    }

    @Override // defpackage.x81
    public final Object invoke(k6.QnHx qnHx, z80<? super sd5> z80Var) {
        return ((a7) a(qnHx, z80Var)).i(sd5.a);
    }
}
