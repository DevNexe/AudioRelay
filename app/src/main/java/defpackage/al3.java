package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {436, 454}, m = "invokeSuspend")
public final class al3 extends px4 implements y81<ua0, yg2, z80<? super sd5>, Object> {
    public List A;
    public List B;
    public List C;
    public Set D;
    public Set E;
    public int F;
    public /* synthetic */ yg2 G;
    public final /* synthetic */ uk3 H;

    public static final class QnHx extends cx1 implements j81<Long, wm<? super sd5>> {
        public final /* synthetic */ List<d90> A;
        public final /* synthetic */ Set<d90> B;
        public final /* synthetic */ uk3 w;
        public final /* synthetic */ List<d90> x;
        public final /* synthetic */ List<ih2> y;
        public final /* synthetic */ Set<d90> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(uk3 uk3Var, List<d90> list, List<ih2> list2, Set<d90> set, List<d90> list3, Set<d90> set2) {
            super(1);
            this.w = uk3Var;
            this.x = list;
            this.y = list2;
            this.z = set;
            this.A = list3;
            this.B = set2;
        }

        @Override // defpackage.j81
        public final wm<? super sd5> invoke(Long l) {
            wm<sd5> wmVarU;
            boolean z;
            long jLongValue = l.longValue();
            if (this.w.a.a()) {
                uk3 uk3Var = this.w;
                Trace.beginSection("Recomposer:animation");
                try {
                    uk3Var.a.b(jLongValue);
                    synchronized (ip4.c) {
                        Set<ws4> set = ip4.i.get().g;
                        z = set != null && (set.isEmpty() ^ true);
                    }
                    if (z) {
                        ip4.a();
                    }
                    sd5 sd5Var = sd5.a;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            uk3 uk3Var2 = this.w;
            List<d90> list = this.x;
            List<ih2> list2 = this.y;
            Set<d90> set2 = this.z;
            List<d90> list3 = this.A;
            Set<d90> set3 = this.B;
            Trace.beginSection("Recomposer:recompose");
            try {
                synchronized (uk3Var2.d) {
                    uk3.r(uk3Var2);
                    ArrayList arrayList = uk3Var2.i;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        list.add((d90) arrayList.get(i));
                    }
                    uk3Var2.i.clear();
                    sd5 sd5Var2 = sd5.a;
                }
                wh1<Object> wh1Var = new wh1<>();
                wh1 wh1Var2 = new wh1();
                while (true) {
                    if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                        break;
                    }
                    try {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            d90 d90Var = list.get(i2);
                            wh1Var2.add(d90Var);
                            d90 d90VarQ = uk3.q(uk3Var2, d90Var, wh1Var);
                            if (d90VarQ != null) {
                                list3.add(d90VarQ);
                            }
                        }
                        list.clear();
                        if (wh1Var.w > 0) {
                            synchronized (uk3Var2.d) {
                                ArrayList arrayList2 = uk3Var2.g;
                                int size3 = arrayList2.size();
                                for (int i3 = 0; i3 < size3; i3++) {
                                    d90 d90Var2 = (d90) arrayList2.get(i3);
                                    if (!wh1Var2.contains(d90Var2) && d90Var2.g(wh1Var)) {
                                        list.add(d90Var2);
                                    }
                                }
                                sd5 sd5Var3 = sd5.a;
                            }
                        }
                        if (list.isEmpty()) {
                            al3.m(list2, uk3Var2);
                            while (!list2.isEmpty()) {
                                su.x0(uk3Var2.x(list2, wh1Var), set2);
                                al3.m(list2, uk3Var2);
                            }
                        }
                    } catch (Throwable th2) {
                        list.clear();
                        throw th2;
                    }
                    Trace.endSection();
                    throw th;
                }
                if (!list3.isEmpty()) {
                    try {
                        su.x0(list3, set3);
                        int size4 = list3.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            list3.get(i4).k();
                        }
                        list3.clear();
                    } catch (Throwable th3) {
                        list3.clear();
                        throw th3;
                    }
                }
                if (!set2.isEmpty()) {
                    try {
                        su.x0(set2, set3);
                        Iterator<T> it = set2.iterator();
                        while (it.hasNext()) {
                            ((d90) it.next()).d();
                        }
                        set2.clear();
                    } catch (Throwable th4) {
                        set2.clear();
                        throw th4;
                    }
                }
                if (!set3.isEmpty()) {
                    try {
                        Iterator<T> it2 = set3.iterator();
                        while (it2.hasNext()) {
                            ((d90) it2.next()).q();
                        }
                        set3.clear();
                    } catch (Throwable th5) {
                        set3.clear();
                        throw th5;
                    }
                }
                uk3.p(uk3Var2);
                synchronized (uk3Var2.d) {
                    wmVarU = uk3Var2.u();
                }
                Trace.endSection();
                return wmVarU;
            } catch (Throwable th6) {
                Trace.endSection();
                throw th6;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al3(uk3 uk3Var, z80<? super al3> z80Var) {
        super(3, z80Var);
        this.H = uk3Var;
    }

    public static final void m(List list, uk3 uk3Var) {
        list.clear();
        synchronized (uk3Var.d) {
            ArrayList arrayList = uk3Var.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                list.add((ih2) arrayList.get(i));
            }
            uk3Var.k.clear();
            sd5 sd5Var = sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0085 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c0 A[Catch: all -> 0x00d7, TryCatch #0 {, blocks: (B:18:0x00ba, B:20:0x00c0, B:22:0x00c8, B:21:0x00c6), top: B:66:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00c6 A[Catch: all -> 0x00d7, TryCatch #0 {, blocks: (B:18:0x00ba, B:20:0x00c0, B:22:0x00c8, B:21:0x00c6), top: B:66:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00df  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5 A[Catch: all -> 0x011f, TryCatch #1 {, blocks: (B:37:0x00eb, B:39:0x00f5, B:45:0x0103, B:47:0x010f), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103 A[Catch: all -> 0x011f, TryCatch #1 {, blocks: (B:37:0x00eb, B:39:0x00f5, B:45:0x0103, B:47:0x010f), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010f A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #1 {, blocks: (B:37:0x00eb, B:39:0x00f5, B:45:0x0103, B:47:0x010f), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0124 -> B:11:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0163 -> B:63:0x0169). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al3.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.y81
    public final Object invoke(ua0 ua0Var, yg2 yg2Var, z80<? super sd5> z80Var) {
        al3 al3Var = new al3(this.H, z80Var);
        al3Var.G = yg2Var;
        return al3Var.i(sd5.a);
    }
}
