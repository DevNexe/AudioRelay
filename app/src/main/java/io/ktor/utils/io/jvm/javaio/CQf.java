package io.ktor.utils.io.jvm.javaio;

import defpackage.b90;
import defpackage.if0;
import defpackage.ms1;
import defpackage.rn1;
import defpackage.z80;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf extends io.ktor.utils.io.jvm.javaio.QnHx {
    public final /* synthetic */ rn1 g;

    @if0(c = "io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1", f = "Blocking.kt", l = {319, 38}, m = "loop")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public CQf z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return CQf.this.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CQf(ms1 ms1Var, rn1 rn1Var) {
        super(ms1Var);
        this.g = rn1Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:51:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[LOOP:1: B:25:0x006b->B:52:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00a5 -> B:42:0x00a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.ktor.utils.io.jvm.javaio.QnHx
    public final java.lang.Object a(defpackage.z80<? super defpackage.sd5> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof io.ktor.utils.io.jvm.javaio.CQf.QnHx
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.jvm.javaio.CQf$QnHx r0 = (io.ktor.utils.io.jvm.javaio.CQf.QnHx) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            io.ktor.utils.io.jvm.javaio.CQf$QnHx r0 = new io.ktor.utils.io.jvm.javaio.CQf$QnHx
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.A
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            io.ktor.utils.io.jvm.javaio.CQf r2 = r0.z
            defpackage.C0239D.H(r13)
            r6 = r2
            r2 = r1
            goto La8
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            io.ktor.utils.io.jvm.javaio.CQf r2 = r0.z
            defpackage.C0239D.H(r13)
            r6 = r2
            r2 = r1
            goto L8d
        L40:
            defpackage.C0239D.H(r13)
            r13 = 0
            r6 = r12
            r2 = r1
        L46:
            r6.result = r13
            r0.z = r6
            r0.getClass()
            r0.C = r5
            r13 = r3
        L50:
            java.lang.Object r7 = r6.state
            boolean r8 = r7 instanceof java.lang.Thread
            if (r8 == 0) goto L5c
            z80 r13 = defpackage.ps0.L(r0)
            r8 = r7
            goto L69
        L5c:
            boolean r8 = defpackage.ur1.a(r7, r6)
            if (r8 == 0) goto Lbd
            z80 r8 = defpackage.ps0.L(r0)
            r11 = r8
            r8 = r13
            r13 = r11
        L69:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = io.ktor.utils.io.jvm.javaio.QnHx.f
        L6b:
            boolean r10 = r9.compareAndSet(r6, r7, r13)
            if (r10 == 0) goto L73
            r13 = 1
            goto L7a
        L73:
            java.lang.Object r10 = r9.get(r6)
            if (r10 == r7) goto L6b
            r13 = 0
        L7a:
            if (r13 != 0) goto L7e
            r13 = r8
            goto L50
        L7e:
            if (r8 == 0) goto L87
            nz2 r13 = defpackage.o93.a()
            r13.b(r8)
        L87:
            if (r1 != r2) goto L8a
            return r2
        L8a:
            r13 = r1
            r1 = r2
            r2 = r13
        L8d:
            byte[] r13 = (byte[]) r13
            rn1 r7 = r6.g
            fk r7 = r7.w
            int r8 = r6.d
            int r9 = r6.e
            r0.z = r6
            r0.getClass()
            r0.C = r4
            java.lang.Object r13 = r7.q(r13, r8, r9, r0)
            if (r13 != r1) goto La5
            return r1
        La5:
            r11 = r2
            r2 = r1
            r1 = r11
        La8:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r7 = -1
            if (r13 != r7) goto L46
            rn1 r0 = r6.g
            os1 r0 = r0.x
            r0.h()
            r6.result = r13
            sd5 r13 = defpackage.sd5.a
            return r13
        Lbd:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already suspended or in finished state"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.CQf.a(z80):java.lang.Object");
    }
}
