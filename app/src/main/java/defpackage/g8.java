package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$startInternal$3", f = "BallastViewModelImpl.kt", l = {}, m = "invokeSuspend")
public final class g8 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ v7<Object, Object, Object> B;

    @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$startInternal$3$1", f = "BallastViewModelImpl.kt", l = {244}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<fk4<Object, Object, Object>, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ v7<Object, Object, Object> C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(v7<Object, Object, Object> v7Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = v7Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                fk4 fk4Var = (fk4) this.B;
                String str = fk4Var.a;
                this.A = 1;
                v7<Object, Object, Object> v7Var = this.C;
                LinkedHashMap linkedHashMap = v7Var.l;
                gk4.QnHx qnHx = linkedHashMap.containsKey(str) ? gk4.QnHx.Restarted : gk4.QnHx.Initial;
                g04 g04Var = (g04) linkedHashMap.get(str);
                if (g04Var != null) {
                    ms1 ms1Var = g04Var.b;
                    if (ms1Var != null) {
                        ms1Var.m(null);
                    }
                    g04Var.b = null;
                }
                Set setEntrySet = linkedHashMap.entrySet();
                ArrayList arrayList = new ArrayList();
                Iterator it = setEntrySet.iterator();
                while (true) {
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ms1 ms1Var2 = ((g04) ((Map.Entry) next).getValue()).b;
                    if (ms1Var2 != null && ms1Var2.c()) {
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(mu.w0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    linkedHashMap.remove((String) it3.next());
                }
                g04 g04Var2 = new g04(fk4Var.b);
                linkedHashMap.put(str, g04Var2);
                g04Var2.b = fp1.k0(fp1.q0(fp1.q0(v7Var.n(), new xw4((ms1) v7Var.n().g().j(ms1.CQf.w))), v7Var.e()), null, 0, new b8(v7Var, str, qnHx, g04Var2, null), 3);
                if (sd5.a == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(fk4<Object, Object, Object> fk4Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(fk4Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(v7<Object, Object, Object> v7Var, z80<? super g8> z80Var) {
        super(2, z80Var);
        this.B = v7Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        g8 g8Var = new g8(this.B, z80Var);
        g8Var.A = obj;
        return g8Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        ua0 ua0Var = (ua0) this.A;
        v7<Object, Object, Object> v7Var = this.B;
        kd.r(new r01(new QnHx(v7Var, null), kd.t(v7Var.j)), ua0Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((g8) a(ua0Var, z80Var)).i(sd5.a);
    }
}
