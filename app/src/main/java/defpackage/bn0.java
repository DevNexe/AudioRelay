package defpackage;

import java.util.List;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class bn0 {
    public static final float a = ((float) 0.125d) / 18;

    @if0(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {163}, m = "drag-jO51t88")
    public static final class CQf extends b90 {
        public j81 A;
        public /* synthetic */ Object B;
        public int C;
        public a5 z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.C |= Integer.MIN_VALUE;
            return bn0.f(null, 0L, null, this);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {823}, m = "awaitDragOrCancellation-rnUCldI")
    public static final class QnHx extends b90 {
        public il3 A;
        public /* synthetic */ Object B;
        public int C;
        public a5 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.C |= Integer.MIN_VALUE;
            return bn0.b(null, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(l93 l93Var, d93 d93Var, z80 z80Var) throws Throwable {
        dn0 dn0Var;
        jl3 jl3Var;
        Object obj;
        d93 d93Var2;
        if (z80Var instanceof dn0) {
            dn0Var = (dn0) z80Var;
            int i = dn0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                dn0Var.C = i - Integer.MIN_VALUE;
            } else {
                dn0Var = new dn0(z80Var);
            }
        } else {
            dn0Var = new dn0(z80Var);
        }
        Object obj2 = dn0Var.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = dn0Var.C;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jl3Var = dn0Var.A;
            Object obj3 = dn0Var.z;
            try {
                C0239D.H(obj2);
                return null;
            } catch (TimeoutCancellationException unused) {
                obj = obj3;
                d93Var2 = (d93) jl3Var.w;
                if (d93Var2 == null) {
                    return obj;
                }
                return d93Var2;
            }
        }
        C0239D.H(obj2);
        jl3 jl3Var2 = new jl3();
        jl3 jl3Var3 = new jl3();
        jl3Var3.w = d93Var;
        long jC = l93Var.getViewConfiguration().c();
        try {
            en0 en0Var = new en0(l93Var, jl3Var3, jl3Var2, null);
            dn0Var.z = d93Var;
            dn0Var.A = jl3Var2;
            dn0Var.C = 1;
            if (jC <= 0) {
                throw new TimeoutCancellationException("Timed out immediately", null);
            }
            if (b85.a(new a85(jC, dn0Var), en0Var) == va0Var) {
                return va0Var;
            }
            return null;
        } catch (TimeoutCancellationException unused2) {
            jl3Var = jl3Var2;
            obj = d93Var;
            d93Var2 = (d93) jl3Var.w;
            if (d93Var2 == null) {
                return obj;
            }
            return d93Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084 A[LOOP:0: B:23:0x0070->B:27:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0088 A[EDGE_INSN: B:57:0x0088->B:29:0x0088 BREAK  A[LOOP:0: B:23:0x0070->B:27:0x0084], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0061 -> B:22:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.a5 r17, long r18, defpackage.z80<? super defpackage.d93> r20) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn0.b(a5, long, z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc A[LOOP:0: B:25:0x00a6->B:29:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[EDGE_INSN: B:67:0x00c3->B:31:0x00c3 BREAK  A[LOOP:0: B:25:0x00a6->B:29:0x00bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f5 -> B:58:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0124 -> B:55:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x014d -> B:59:0x0132). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.a5 r18, long r19, int r21, defpackage.sn0 r22, defpackage.z80 r23) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn0.c(a5, long, int, sn0, z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2 A[LOOP:0: B:25:0x009c->B:29:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba A[EDGE_INSN: B:71:0x00ba->B:31:0x00ba BREAK  A[LOOP:0: B:25:0x009c->B:29:0x00b2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ef -> B:69:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x014c -> B:64:0x014f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.a5 r17, long r18, int r20, hn0.QnHx.C0140QnHx r21, defpackage.z80 r22) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn0.d(a5, long, int, hn0$QnHx$QnHx, z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc A[LOOP:0: B:25:0x00a6->B:29:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[EDGE_INSN: B:67:0x00c3->B:31:0x00c3 BREAK  A[LOOP:0: B:25:0x00a6->B:29:0x00bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f5 -> B:58:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0124 -> B:55:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x014d -> B:59:0x0132). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(defpackage.a5 r18, long r19, int r21, defpackage.sn0 r22, defpackage.z80 r23) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn0.e(a5, long, int, sn0, z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(defpackage.a5 r4, long r5, defpackage.j81<? super defpackage.d93, defpackage.sd5> r7, defpackage.z80<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof bn0.CQf
            if (r0 == 0) goto L13
            r0 = r8
            bn0$CQf r0 = (bn0.CQf) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            bn0$CQf r0 = new bn0$CQf
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.B
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            j81 r4 = r0.A
            a5 r5 = r0.z
            defpackage.C0239D.H(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.C0239D.H(r8)
        L38:
            r0.z = r4
            r0.A = r7
            r0.C = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            d93 r8 = (defpackage.d93) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = defpackage.Cz.g(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn0.f(a5, long, j81, z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[LOOP:0: B:24:0x0084->B:28:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:23:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(defpackage.a5 r17, long r18, defpackage.tn0 r20, defpackage.z80 r21) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn0.g(a5, long, tn0, z80):java.lang.Object");
    }

    public static final boolean h(y83 y83Var, long j) {
        d93 d93Var;
        List<d93> list = y83Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                d93Var = null;
                break;
            }
            d93Var = list.get(i);
            if (c93.a(d93Var.a, j)) {
                break;
            }
            i++;
        }
        d93 d93Var2 = d93Var;
        if (d93Var2 != null && d93Var2.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float i(ti5 ti5Var, int i) {
        return i == 2 ? ti5Var.e() * a : ti5Var.e();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[LOOP:0: B:24:0x0084->B:28:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:23:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object j(defpackage.a5 r17, long r18, defpackage.tn0 r20, defpackage.z80 r21) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn0.j(a5, long, tn0, z80):java.lang.Object");
    }
}
