package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Process;
import androidx.activity.ComponentActivity;
import com.google.protobuf.QnHx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class FWT implements h75, uw4, ku0, ch3, i91, qf6 {
    public static ej1 A;
    public static ej1 w;
    public static ej1 x;
    public static final py4 y = new py4("NONE");
    public static final py4 z = new py4("PENDING");
    public static final /* synthetic */ FWT B = new FWT();

    public static final long A(double d) {
        return G(4294967296L, (float) d);
    }

    public static final long B(int i) {
        return G(4294967296L, i);
    }

    public static final ua0 C(jj5 jj5Var) {
        Object obj;
        Object obj2;
        HashMap map = jj5Var.a;
        if (map == null) {
            obj2 = null;
        } else {
            synchronized (map) {
                obj = jj5Var.a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj2 = obj;
        }
        ua0 ua0Var = (ua0) obj2;
        if (ua0Var != null) {
            return ua0Var;
        }
        xw4 xw4VarD = ddf.d();
        qh0 qh0Var = rl0.a;
        return (ua0) jj5Var.d(new mt(la0.QnHx.a(xw4VarD, n72.a.I())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static final boolean D(long j) {
        a65[] a65VarArr = z55.b;
        return (j & 1095216660480L) == 0;
    }

    public static final void E(Throwable th) throws Throwable {
        if (!(!(th instanceof VirtualMachineError ? true : th instanceof ThreadDeath ? true : th instanceof InterruptedException ? true : th instanceof LinkageError ? true : th instanceof CancellationException))) {
            throw th;
        }
    }

    public static final long F(int i, int i2, long j) {
        int iJ = g70.j(j) + i;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = g70.h(j);
        if (iH != Integer.MAX_VALUE && (iH = iH + i) < 0) {
            iH = 0;
        }
        int i3 = g70.i(j) + i2;
        if (i3 < 0) {
            i3 = 0;
        }
        int iG = g70.g(j);
        return m(iJ, iH, i3, (iG == Integer.MAX_VALUE || (iG = iG + i2) >= 0) ? iG : 0);
    }

    public static final long G(long j, float f) {
        long jFloatToIntBits = j | (((long) Float.floatToIntBits(f)) & 4294967295L);
        a65[] a65VarArr = z55.b;
        return jFloatToIntBits;
    }

    public static final wf3 H(h04 h04Var) {
        wf3.CQf cQfT = wf3.C.c();
        String str = h04Var.a;
        str.getClass();
        cQfT.A = str;
        cQfT.M();
        cQfT.B = h04Var.b;
        cQfT.M();
        wf3 wf3VarQ = cQfT.f();
        if (wf3VarQ.isInitialized()) {
            return wf3VarQ;
        }
        throw QnHx.AbstractC0099QnHx.C(wf3VarQ);
    }

    public static final vq2 I(ln2 ln2Var, c54 c54Var) {
        ds2 ds2VarF = ln2Var.f(c54Var);
        tt0 tt0Var = tt0.x;
        ds2VarF.getClass();
        return new pr2(ds2VarF, tt0Var).B(new e83(ln2Var, c54Var));
    }

    public static final void l(int i, int i2, g30 g30Var, pg2 pg2Var, j81 j81Var) {
        int i3;
        j30 j30VarQ = g30Var.q(-1229501222);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            e40.CQf cQf = e40.a;
            sz szVar = k00.a;
            sz szVar2 = k00.b;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new sb(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            h81 h81Var = (h81) objB0;
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(j81Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new tb(j81Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            p03.c(pg2Var, "android.permission.BLUETOOTH_CONNECT", szVar, szVar2, h81Var, (j81) objB1, j30VarQ, (i3 & 14) | 3456, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new wb(i, i2, pg2Var, j81Var);
    }

    public static final long m(int i, int i2, int i3, int i4) {
        boolean z2 = false;
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (i4 >= i3) {
            if (i >= 0 && i3 >= 0) {
                z2 = true;
            }
            if (z2) {
                return g70.QnHx.b(i, i2, i3, i4);
            }
            throw new IllegalArgumentException(bj0.a("minWidth(", i, ") and minHeight(", i3, ") must be >= 0").toString());
        }
        throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
    }

    public static /* synthetic */ long n(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return m(0, i, 0, i2);
    }

    public static final kotlinx.coroutines.flow.QnHx o(Object obj) {
        if (obj == null) {
            obj = v3A.x;
        }
        return new kotlinx.coroutines.flow.QnHx(obj);
    }

    public static final ge3 p(String str, ee3.byN byn) {
        if (!(!iv4.s(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        Iterator<fv1<? extends Object>> it = he3.a.keySet().iterator();
        while (it.hasNext()) {
            String strA = he3.a(it.next().a());
            if (iv4.r(str, "kotlin." + strA) || iv4.r(str, strA)) {
                StringBuilder sbA = N.a("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exist ");
                sbA.append(he3.a(strA));
                sbA.append("Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(ev4.l(sbA.toString()));
            }
        }
        return new ge3(str, byn);
    }

    public static final ra4 q(String str, pa4[] pa4VarArr, j81 j81Var) {
        if (!(!iv4.s(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        br brVar = new br();
        j81Var.invoke(brVar);
        return new ra4(str, uv4.QnHx.a, brVar.b.size(), oV9.j0(pa4VarArr), brVar);
    }

    public static final ra4 r(String str, xa4 xa4Var, pa4[] pa4VarArr, j81 j81Var) {
        if (!(!iv4.s(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!ur1.a(xa4Var, uv4.QnHx.a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        br brVar = new br();
        j81Var.invoke(brVar);
        return new ra4(str, xa4Var, brVar.b.size(), oV9.j0(pa4VarArr), brVar);
    }

    public static final long t(long j, long j2) {
        return C0239D.e(AY.o((int) (j2 >> 32), g70.j(j), g70.h(j)), AY.o(sp1.b(j2), g70.i(j), g70.g(j)));
    }

    public static final long u(long j, long j2) {
        return m(AY.o(g70.j(j2), g70.j(j), g70.h(j)), AY.o(g70.h(j2), g70.j(j), g70.h(j)), AY.o(g70.i(j2), g70.i(j), g70.g(j)), AY.o(g70.g(j2), g70.i(j), g70.g(j)));
    }

    public static final int v(int i, long j) {
        return AY.o(i, g70.i(j), g70.g(j));
    }

    public static final int w(int i, long j) {
        return AY.o(i, g70.j(j), g70.h(j));
    }

    public static final ComponentActivity x(Context context) {
        if (context instanceof ComponentActivity) {
            return (ComponentActivity) context;
        }
        if (context instanceof ContextWrapper) {
            return x(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final ej1 y() {
        ej1 ej1Var = w;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.GraphicEq");
        int i = sg5.a;
        jq4 jq4Var = new jq4(yu.b);
        le3 le3Var = new le3();
        le3Var.i(7.0f, 18.0f);
        le3Var.f(2.0f);
        le3Var.g(9.0f, 6.0f);
        le3Var.g(7.0f, 6.0f);
        le3Var.n(12.0f);
        le3Var.b();
        le3Var.i(11.0f, 22.0f);
        le3Var.f(2.0f);
        le3Var.g(13.0f, 2.0f);
        le3Var.f(-2.0f);
        le3Var.n(20.0f);
        le3Var.b();
        le3Var.i(3.0f, 14.0f);
        le3Var.f(2.0f);
        le3Var.n(-4.0f);
        le3Var.g(3.0f, 10.0f);
        le3Var.n(4.0f);
        le3Var.b();
        le3Var.i(15.0f, 18.0f);
        le3Var.f(2.0f);
        le3Var.g(17.0f, 6.0f);
        le3Var.f(-2.0f);
        le3Var.n(12.0f);
        le3Var.b();
        le3Var.i(19.0f, 10.0f);
        le3Var.n(4.0f);
        le3Var.f(2.0f);
        le3Var.n(-4.0f);
        le3Var.f(-2.0f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
        ej1 ej1VarD = qnHx.d();
        w = ej1VarD;
        return ej1VarD;
    }

    @Override // defpackage.ku0
    public void a(String str, String str2) {
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        List<it1> list = ((jt1) obj).a;
        int iA = C0239D.A(mu.w0(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (it1 it1Var : list) {
            mg mgVarG = kK.g(it1Var.a);
            nt1 nt1Var = it1Var.b;
            linkedHashMap.put(mgVarG, new ad0((int) nt1Var.a, (int) nt1Var.b));
        }
        return new og(linkedHashMap);
    }

    @Override // defpackage.ku0
    public void b(String str, String str2) {
    }

    @Override // defpackage.h75
    public void c(int i, xno xnoVar) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iZ = z();
        try {
            j(i);
            threadCurrentThread.setName("Server:AudioCapture");
            xnoVar.invoke();
        } finally {
            j(iZ);
            threadCurrentThread.setName(name);
        }
    }

    @Override // defpackage.h75
    public void d() {
    }

    @Override // defpackage.uw4
    public w05 e(Object obj) {
        return k15.e(Boolean.TRUE);
    }

    @Override // defpackage.ku0
    public void f(String str) {
    }

    @Override // defpackage.ku0
    public void g(String str, n52 n52Var) {
    }

    @Override // defpackage.ku0
    public void h(int i, String str, String str2) {
    }

    @Override // defpackage.h75
    public void i() {
    }

    @Override // defpackage.h75
    public void j(int i) {
        Process.setThreadPriority(Process.myTid(), i);
    }

    @Override // defpackage.h75
    public void k() {
    }

    public int z() {
        return Process.getThreadPriority(Process.myTid());
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Boolean.valueOf(c87.x.zza().zzk());
    }
}
