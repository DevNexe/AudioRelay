package defpackage;

import j$.util.concurrent.ConcurrentMap$EL;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc4 implements Callable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ sc4(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        boolean z = false;
        switch (this.w) {
            case 0:
                uc4 uc4Var = (uc4) this.x;
                vb4 vb4Var = (vb4) this.y;
                jr2 jr2VarA = uc4Var.a.a(j54.b);
                jr2VarA.getClass();
                mq2.c(1, "bufferSize");
                ks2.YKK ykk = new ks2.YKK();
                AtomicReference atomicReference = new AtomicReference();
                dc4 dc4Var = new dc4(vb4Var, new ks2(new ks2.T23(atomicReference, ykk), jr2VarA, atomicReference, ykk).H());
                Set<if4> setA = uc4Var.c.a.a();
                ArrayList arrayList = new ArrayList(mu.w0(setA, 10));
                Iterator<T> it = setA.iterator();
                while (it.hasNext()) {
                    arrayList.add(((if4) it.next()).a(dc4Var));
                }
                return qw.e(arrayList).d(new nm3(5, uc4Var, vb4Var));
            case 1:
                yc ycVar = (yc) this.x;
                dc4 dc4Var2 = (dc4) this.y;
                ss3 ss3Var = ycVar.b;
                ss3Var.getClass();
                vb4 vb4Var2 = dc4Var2.a;
                if (!(vb4Var2 instanceof Qx0$)) {
                    throw new IllegalStateException("Expected a config of type ".concat(Qx0$.class.getSimpleName()).toString());
                }
                Qx0$ qx0$ = (Qx0$) vb4Var2;
                if (qx0$ instanceof Qx0$.QnHx) {
                    eg2 eg2Var = (eg2) ss3Var.x;
                    return new lfe((Wh) eg2Var.a, (sAn) ((j81) eg2Var.c).invoke(new fz4("AUDIO_CAPTURE")), (h75) eg2Var.b, (ig2) eg2Var.e, (jg2) eg2Var.f, (j81) eg2Var.d);
                }
                if (!(qx0$ instanceof Qx0$.CQf)) {
                    throw new NoWhenBranchMatchedException();
                }
                cc2 cc2Var = (cc2) ss3Var.y;
                return new lfe(cc2Var.a, cc2Var.c.invoke(new fz4("AUDIO_CAPTURE")), cc2Var.b, XTd3.x, cc2Var.e.invoke(((Qx0$.CQf) vb4Var2).a), cc2Var.d);
            case 2:
                re4 re4Var = (re4) this.x;
                ps psVar = (ps) this.y;
                as asVar = re4Var.e;
                String str = psVar.d;
                Long l = asVar.a.get(str);
                if (l != null) {
                    gq0.QnHx qnHx = gq0.x;
                    z = !(gq0.g(ps0.p0(zs.QnHx.a.c() - l.longValue(), kq0.MILLISECONDS)) >= 10000);
                    if (!z) {
                        asVar.a.remove(str);
                    }
                }
                if (!z) {
                    return vq2.s(psVar);
                }
                re4Var.i.a(me4.w);
                psVar.a.close();
                return or2.w;
            case 3:
                String str2 = (String) this.x;
                return new rz4(str2, (vz4) ConcurrentMap$EL.getOrDefault(((uz4) this.y).a, new fz4(str2), vz4.F1.a));
            default:
                f50 f50Var = (f50) this.x;
                g50 g50Var = (g50) this.y;
                k50 k50Var = f50Var.b;
                synchronized (k50Var) {
                    FileOutputStream fileOutputStreamOpenFileOutput = k50Var.a.openFileOutput(k50Var.b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(g50Var.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                }
                return null;
        }
    }
}
