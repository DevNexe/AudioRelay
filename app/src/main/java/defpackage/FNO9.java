package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FNO9 implements i91, o80, pa3, qf6 {
    public static ej1 x;
    public static final FNO9 w = new FNO9();
    public static final jj0 y = new jj0(1.0f, 1.0f);
    public static final FNO9 z = new FNO9();
    public static final FNO9 A = new FNO9();
    public static final /* synthetic */ FNO9 B = new FNO9();

    /* JADX WARN: Type inference failed for: r6v4, types: [T, am0] */
    public static final vl0 b(ua0 ua0Var, Runnable runnable, long j, j81 j81Var) {
        la0 la0VarG = ua0Var.g();
        jl3 jl3Var = new jl3();
        av3 av3Var = new av3(new ty(jl3Var, 10));
        m14.c(runnable);
        Runnable runnable2 = (Runnable) j81Var.invoke(new p14(av3Var, la0VarG, runnable));
        if (!fp1.e0(ua0Var)) {
            return yr0.INSTANCE;
        }
        if (j <= 0) {
            runnable2.run();
            return av3Var;
        }
        jl3Var.w = S12N.g(la0VarG).b(j, runnable2, la0VarG);
        return av3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(vl0 vl0Var, la0 la0Var, Runnable runnable, z80 z80Var) throws Throwable {
        n14 n14Var;
        if (z80Var instanceof n14) {
            n14Var = (n14) z80Var;
            int i = n14Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                n14Var.B = i - Integer.MIN_VALUE;
            } else {
                n14Var = new n14(z80Var);
            }
        } else {
            n14Var = new n14(z80Var);
        }
        Object obj = n14Var.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = n14Var.B;
        try {
            if (i2 == 0) {
                C0239D.H(obj);
                if (vl0Var.e()) {
                    return sd5.a;
                }
                o14 o14Var = new o14(runnable);
                n14Var.z = la0Var;
                n14Var.B = 1;
                if (fp1.D0(xr0.w, new dq1(o14Var, null), n14Var) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                la0Var = n14Var.z;
                C0239D.H(obj);
            }
        } catch (Throwable th) {
            ddf.j(la0Var, th);
        }
        return sd5.a;
    }

    @Override // defpackage.o80
    public boolean a(n80 n80Var) {
        if (n80Var.b(n80.QnHx.a)) {
            return true;
        }
        if (!n80Var.b.isEmpty()) {
            n80Var = new n80(n80Var.c, n80Var.d);
        }
        String string = n80Var.toString();
        return iv4.x(string, "application/", false) && string.endsWith("+json");
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(mu.w0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((xr4) it.next()).start());
        }
        return arrayList;
    }

    @Override // defpackage.pa3
    public boolean test(Object obj) {
        return ((y73) obj) instanceof y73.CQf;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Integer.valueOf((int) ((f67) e67.x.w.zza()).zza());
    }
}
